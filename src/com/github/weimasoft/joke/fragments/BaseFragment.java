package com.github.weimasoft.joke.fragments;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BaseFragment extends Fragment {
	private int _fragmentIndex;
	private int _layoutId;
	private int _buttonId;
	private MainActivity _parentActivity = null;

	private BaseFragment() {
	}

	public BaseFragment(int fragmentIndex, int layoutId, int buttonId) {
		_fragmentIndex = fragmentIndex;
		_layoutId = layoutId;
		_buttonId = buttonId;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		initialize();
		
		View view = inflater.inflate(_layoutId, container, false);
		
		return view;
	}

	private void initialize() {
		_parentActivity = (MainActivity) getActivity();
		
		Button button = (Button) _parentActivity.findViewById(_buttonId);
		
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				_parentActivity.setCurrentItemIndex(_fragmentIndex);
			}
		});
	}
}
