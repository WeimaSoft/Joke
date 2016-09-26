package com.github.weimasoft.joke.util;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	private List<ListFragment> _fFragments = null;
	
	public ViewPagerAdapter(FragmentManager fm, List<ListFragment> fragments) {
		super(fm);
		_fFragments = fragments;
	}

	@Override
	public ListFragment getItem(int index) {
		return _fFragments.get(index);
	}

	@Override
	public int getCount() {
		return _fFragments.size();
	}
}
