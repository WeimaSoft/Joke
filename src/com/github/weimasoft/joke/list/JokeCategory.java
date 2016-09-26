package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.graphics.drawable.Drawable;

public class JokeCategory {
	private String _categoryName;
	private List<JokeItem> _items = new ArrayList<JokeItem>();

	public JokeCategory(List<JokeItem> items, String categoryName) {
		this._items = items;
		this._categoryName = categoryName;
	}

	public JokeCategory(String categoryName) {
		this._categoryName = categoryName;
	}

	public void addItem(String title, int drawable) {
		_items.add(new JokeItem(title, drawable));
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
