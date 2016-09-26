package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.R;
import android.content.res.Resources;

public class TestJokeData {

	public static List<JokeCategory> getTestData(Resources res) {
		List<JokeCategory> allItems = new ArrayList<JokeCategory>();

		JokeCategory categoryItem = new JokeCategory("����Ц��");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				categoryItem.addItem("Ц��" + i, R.drawable.itemodd);
			} else {
				categoryItem.addItem("Ц��" + i, R.drawable.itemnoodd);
			}
		}

		JokeCategory category2Item = new JokeCategory("Сѧ��");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				category2Item.addItem("Ц��" + i + 6, R.drawable.itemnoodd);
			} else {
				category2Item.addItem("Ц��" + i + 6, R.drawable.itemodd);
			}
		}
		allItems.add(categoryItem);
		allItems.add(category2Item);

		return allItems;
	}
}
