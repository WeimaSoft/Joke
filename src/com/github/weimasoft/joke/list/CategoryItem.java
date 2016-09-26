package com.github.weimasoft.joke.list;

public class CategoryItem {
	private String _title;
	private int _icon;
	private int _type;

	public CategoryItem(String title, int drawable, int type) {
		this._title = title;
		this._icon = drawable;
		this._type = type;
	}

	public String getTitle() {
		return _title;
	}

	public int getIcon() {
		return _icon;
	}
	
	public int getType() {
		return _type;
	}
}
