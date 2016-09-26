package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.R;
import android.content.res.Resources;

public class TestJokeData {

	public static List<JokeCategory> getTestData() {
		List<JokeCategory> allItems = new ArrayList<JokeCategory>();

		JokeCategory categoryItem = new JokeCategory("经典笑话");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				categoryItem.addItem("笑话" + i, R.drawable.itemodd);
			} else {
				categoryItem.addItem("笑话" + i, R.drawable.itemnoodd);
			}
		}

		JokeCategory category2Item = new JokeCategory("小学生");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				category2Item.addItem("笑话" + i, R.drawable.itemnoodd);
			} else {
				category2Item.addItem("笑话" + i, R.drawable.itemodd);
			}
		}

		JokeCategory category3Item = new JokeCategory("校园系列");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				category3Item.addItem("笑话" + i, R.drawable.itemnoodd);
			} else {
				category3Item.addItem("笑话" + i, R.drawable.itemodd);
			}
		}

		allItems.add(categoryItem);
		allItems.add(category2Item);
		allItems.add(category3Item);

		return allItems;
	}

	public static List<Category> getCategoryTestData() {
		List<Category> allItems = new ArrayList<Category>();

		Category categoryItem = new Category("经典笑话");
		categoryItem.addItem("首页显示", -1, 0);
		categoryItem.addItem("显示条数", -1, 1);
		categoryItem.addItem("仅WIFI环境下更新", -1, 0);

		Category category2Item = new Category("小学生");

		category2Item.addItem("首页显示", -1, 0);
		category2Item.addItem("显示条数", -1, 1);
		category2Item.addItem("仅WIFI环境下更新", -1, 0);

		Category category3Item = new Category("校园系列");
		category3Item.addItem("首页显示", -1, 0);
		category3Item.addItem("显示条数", -1, 1);
		category3Item.addItem("仅WIFI环境下更新", -1, 0);

		allItems.add(categoryItem);
		allItems.add(category2Item);
		allItems.add(category3Item);

		return allItems;
	}

	public static List<Category> getSettingsTestData() {
		List<Category> allItems = new ArrayList<Category>();

		Category categoryItem = new Category("阅读设置");

		categoryItem.addItem("字体大小", -1, 1);
		categoryItem.addItem("字体颜色", -1, 1);

		Category category2Item = new Category("推送");

		category2Item.addItem("显示推送朋友圈", -1, 0);
		category2Item.addItem("显示推送微博", -1, 0);
		category2Item.addItem("显示推送QZone", -1, 0);

		allItems.add(categoryItem);
		allItems.add(category2Item);

		return allItems;
	}
}
