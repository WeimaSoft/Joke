package com.github.weimasoft.joke.fragments;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends BaseFragment {

	public SettingsFragment() {
		super(MainActivity.SETTINGS_FRAGMENT_INDEX, R.layout.fragment_settings, R.id.btn_settings);
	}
	
}
