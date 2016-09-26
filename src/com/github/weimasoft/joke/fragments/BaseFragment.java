package com.github.weimasoft.joke.fragments;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;
import com.github.weimasoft.joke.list.JokeListAdapter;
import com.github.weimasoft.joke.list.TestJokeData;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

public class BaseFragment extends ListFragment {
	private int _fragmentIndex;
	private int _layoutId;
	private int _buttonId;
	private MainActivity _parentActivity = null;
	protected View view = null;
	protected JokeListAdapter _adapter = null;

	public BaseFragment(int fragmentIndex, int layoutId, int buttonId) {
		_fragmentIndex = fragmentIndex;
		_layoutId = layoutId;
		_buttonId = buttonId;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		_adapter = new JokeListAdapter(TestJokeData.getTestData(getActivity().getResources()), getActivity());
		setListAdapter(_adapter);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		initialize();
		
		if (view == null) {
			view = inflater.inflate(_layoutId, container, false);
		}
		
		return view;
	}

	private void initialize() {
		_parentActivity = (MainActivity) getActivity();
		
		RadioButton button = (RadioButton) _parentActivity.findViewById(_buttonId);
		
		button.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					_parentActivity.setCurrentItemIndex(_fragmentIndex);
				}
			}
		});
	}
}
