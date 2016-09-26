package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.graphics.drawable.Drawable;

public class Category {
	private String _categoryName;
	private List<CategoryItem> _items = new ArrayList<CategoryItem>();

	public Category(List<CategoryItem> items, String categoryName) {
		this._items = items;
		this._categoryName = categoryName;
	}

	public Category(String categoryName) {
		this._categoryName = categoryName;
	}

	public void addItem(String title, int drawable, int type) {
		_items.add(new CategoryItem(title, drawable, type));
	}

	public Object getItem(int position) {
		if (position == 0) {
			return _categoryName;
		} else {
			return _items.get(position - 1);
		}
	}

	public int getItemCount() {
		return _items.size() + 1;
	}

	public String getCategoryName() {
		return _categoryName;
	}

}
