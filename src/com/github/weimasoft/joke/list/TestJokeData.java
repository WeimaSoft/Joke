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
}
