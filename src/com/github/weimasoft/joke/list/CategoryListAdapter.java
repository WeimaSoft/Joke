package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryListAdapter extends BaseAdapter {

	private List<Category> _allItems = null;
	private Activity _parentActivity = null;

	public CategoryListAdapter(List<Category> allItems, Activity parentActivity) {
		_allItems = allItems;
		_parentActivity = parentActivity;
	}

	@Override
	public int getCount() {
		int count = 0;

		if (null != _allItems) {
			for (Category category : _allItems) {
				count += category.getItemCount();
			}
		}

		return count;
	}

	@Override
	public Object getItem(int position) {
		if (null == _allItems || position < 0 || position > getCount()) {
			return null;
		}

		int categroyFirstIndex = 0;

		for (Category category : _allItems) {
			int size = category.getItemCount();
			int categoryIndex = position - categroyFirstIndex;
			if (categoryIndex < size) {
				return category.getItem(categoryIndex);
			}

			categroyFirstIndex += size;
		}

		return null;
	}

	public int getItemViewType(int position) {
		if (null == _allItems || position < 0 || position > getCount()) {
			return 1;
		}
		int categroyFirstIndex = 0;

		for (Category category : _allItems) {
			int size = category.getItemCount();
			int categoryIndex = position - categroyFirstIndex;
			if (categoryIndex == 0) {
				return 0; // Category
			}

			categroyFirstIndex += size;
		}

		return 1;
	}

	@Override
	public int getViewTypeCount() {
		return 2;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		int itemViewType = getItemViewType(position);
		View view = convertView;

		if (itemViewType == 0) {
			view = _parentActivity.getLayoutInflater().inflate(R.layout.home_list_category, null);
			TextView textView = (TextView) view.findViewById(R.id.categoryItem);
			textView.setText((String) getItem(position));
		} else {
			final CategoryItem item = (CategoryItem) getItem(position);
			if (convertView == null) {
				if (item.getType() == 0) {
					view = _parentActivity.getLayoutInflater().inflate(R.layout.category_list_item, null);
					TextView textView = (TextView) view.findViewById(R.id.categoryItemLabel);
					textView.setText(item.getTitle());
				} else {
					view = _parentActivity.getLayoutInflater().inflate(R.layout.category_list_item_text, null);
					TextView textView = (TextView) view.findViewById(R.id.categoryItemTextLabel);
					textView.setText(item.getTitle());
				}

			}
		}

		return view;
	}

	@Override
	public boolean areAllItemsEnabled() {
		return false;
	}

	@Override
	public boolean isEnabled(int position) {
		return getItemViewType(position) != 0;
	}

	class ViewHolder {
		protected ImageView jokeImageView;
		protected TextView jokeTextView;
	}

}
