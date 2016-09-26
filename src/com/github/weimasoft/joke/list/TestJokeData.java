package com.github.weimasoft.joke.list;

import java.util.ArrayList;
import java.util.List;

import com.github.weimasoft.joke.R;
import android.content.res.Resources;

public class TestJokeData {

	public static List<JokeItem> getTestData(Resources res) {
		List<JokeItem> allItems = new ArrayList<JokeItem>();
		
		for (int i = 0; i < 12; i++) {
			JokeItem item  = null;
			if (i % 2 == 0) {
				item = new JokeItem("笑话1笑话1笑话1笑话1", res.getDrawable(R.drawable.itemodd));
			}else
			{
				item = new JokeItem("笑话2笑话2笑话2笑话2", res.getDrawable(R.drawable.itemnoodd));
			}
			allItems.add(item);
		}
		
		return allItems;
	}
}
