package com.github.weimasoft.joke.list;

public class JokeItem {
	private String _title;
	private int _icon;

	public JokeItem(String title, int drawable) {
		this._title = title;
		this._icon = drawable;
	}

	public String getTitle() {
		return _title;
	}

	public int getIcon() {
		return _icon;
	}
}