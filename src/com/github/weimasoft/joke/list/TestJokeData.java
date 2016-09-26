package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.R;
import android.content.res.Resources;

public class TestJokeData {

	public static List<JokeCategory> getTestData() {
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
				category2Item.addItem("Ц��" + i, R.drawable.itemnoodd);
			} else {
				category2Item.addItem("Ц��" + i, R.drawable.itemodd);
			}
		}

		JokeCategory category3Item = new JokeCategory("У԰ϵ��");

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				category3Item.addItem("Ц��" + i, R.drawable.itemnoodd);
			} else {
				category3Item.addItem("Ц��" + i, R.drawable.itemodd);
			}
		}

		allItems.add(categoryItem);
		allItems.add(category2Item);
		allItems.add(category3Item);

		return allItems;
	}

	public static List<Category> getCategoryTestData() {
		List<Category> allItems = new ArrayList<Category>();

		Category categoryItem = new Category("����Ц��");
		categoryItem.addItem("��ҳ��ʾ", -1, 0);
		categoryItem.addItem("��ʾ����", -1, 1);
		categoryItem.addItem("��WIFI�����¸���", -1, 0);

		Category category2Item = new Category("Сѧ��");

		category2Item.addItem("��ҳ��ʾ", -1, 0);
		category2Item.addItem("��ʾ����", -1, 1);
		category2Item.addItem("��WIFI�����¸���", -1, 0);

		Category category3Item = new Category("У԰ϵ��");
		category3Item.addItem("��ҳ��ʾ", -1, 0);
		category3Item.addItem("��ʾ����", -1, 1);
		category3Item.addItem("��WIFI�����¸���", -1, 0);

		allItems.add(categoryItem);
		allItems.add(category2Item);
		allItems.add(category3Item);

		return allItems;
	}

	public static List<Category> getSettingsTestData() {
		List<Category> allItems = new ArrayList<Category>();

		Category categoryItem = new Category("�Ķ�����");

		categoryItem.addItem("�����С", -1, 1);
		categoryItem.addItem("������ɫ", -1, 1);

		Category category2Item = new Category("����");

		category2Item.addItem("��ʾ��������Ȧ", -1, 0);
		category2Item.addItem("��ʾ����΢��", -1, 0);
		category2Item.addItem("��ʾ����QZone", -1, 0);

		allItems.add(categoryItem);
		allItems.add(category2Item);

		return allItems;
	}
}
