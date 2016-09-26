package com.github.weimasoft.joke.fragments;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;
import com.github.weimasoft.joke.list.JokeListAdapter;
import com.github.weimasoft.joke.list.TestJokeData;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class HomeFragment extends BaseFragment {

	public HomeFragment() {
		super(MainActivity.HOME_FRAGMENT_INDEX, R.layout.fragment_home, R.id.rdoHome);
	}
}
