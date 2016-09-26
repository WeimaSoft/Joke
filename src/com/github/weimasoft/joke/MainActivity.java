package com.github.weimasoft.joke;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.fragments.CategoryFragment;
import com.github.weimasoft.joke.fragments.HomeFragment;
import com.github.weimasoft.joke.fragments.SettingsFragment;
import com.github.weimasoft.joke.util.ViewPagerAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends FragmentActivity {

	public final static int HOME_FRAGMENT_INDEX = 0;
	public final static int CATEGORY_FRAGMENT_INDEX = 1;
	public final static int SETTINGS_FRAGMENT_INDEX = 2;

	private ViewPager _viewPager;
	private ViewPagerAdapter _adapter;
	private List<ListFragment> _fragments = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();
	}

	public void setCurrentItemIndex(int index) {
		if (index > 2 || index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		_viewPager.setCurrentItem(index);
	}

	@SuppressWarnings("deprecation")
	private void initialize() {
		_fragments = new ArrayList<ListFragment>();
		_fragments.add(new HomeFragment());
		_fragments.add(new CategoryFragment());
		_fragments.add(new SettingsFragment());

		_viewPager = (ViewPager) findViewById(R.id.viewpager);

		_viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageScrollStateChanged(int arg0) {
				if (arg0 == 2) {
					int currentIndex = _viewPager.getCurrentItem();
					if (currentIndex == 0) {
						RadioButton rdoHome = (RadioButton) findViewById(R.id.rdoHome);
						rdoHome.setChecked(true);
					} else if (currentIndex == 1) {
						RadioButton rdoCategory = (RadioButton) findViewById(R.id.rdoCategory);
						rdoCategory.setChecked(true);
					} else {
						RadioButton rdoSetting = (RadioButton) findViewById(R.id.rdoSettings);
						rdoSetting.setChecked(true);
					}
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageSelected(int arg0) {
			}
		});

		_adapter = new ViewPagerAdapter(this.getSupportFragmentManager(), _fragments);
		_viewPager.setAdapter(_adapter);

		_viewPager.setCurrentItem(HOME_FRAGMENT_INDEX);
	}
}
