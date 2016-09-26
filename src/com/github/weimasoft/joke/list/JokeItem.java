package com.github.weimasoft.joke.list;

import android.graphics.drawable.Drawable;

public class JokeItem {
	private String _title;
	private Drawable _icon;

	public JokeItem(String title, Drawable icon) {
		this._title = title;
		this._icon = icon;
	}

	public String getTitle() {
		return _title;
	}

	public Drawable getIcon() {
		return _icon;
	}
}
