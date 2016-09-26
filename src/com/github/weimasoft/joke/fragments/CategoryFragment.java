package com.github.weimasoft.joke.fragments;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;
import com.github.weimasoft.joke.list.CategoryListAdapter;
import com.github.weimasoft.joke.list.JokeListAdapter;
import com.github.weimasoft.joke.list.TestJokeData;

public class CategoryFragment extends BaseFragment {

	public CategoryFragment() {
		super(MainActivity.CATEGORY_FRAGMENT_INDEX, R.layout.fragment_category, R.id.rdoCategory);
	}

	@Override
	public void initializeListAdapter() {
		CategoryListAdapter _adapter = new CategoryListAdapter(TestJokeData.getCategoryTestData(), getActivity());
		setListAdapter(_adapter);
	}
}
