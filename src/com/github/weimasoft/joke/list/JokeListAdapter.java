package com.github.weimasoft.joke.list;

import java.util.List;

import com.github.weimasoft.joke.MainActivity;
import com.github.weimasoft.joke.R;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class JokeListAdapter extends BaseAdapter{

	private List<JokeItem> _allItems = null;
	private Activity _parentActivity = null;
	
	public JokeListAdapter(List<JokeItem> allItems, Activity parentActivity)
	{
		_allItems = allItems;
		_parentActivity = parentActivity;
	}
	
	@Override
	public int getCount() {
		return _allItems.size();
	}

	@Override
	public Object getItem(int index) {
		return _allItems.get(index);
	}

	@Override
	public long getItemId(int index) {
		return index;
	}

	@Override  
    public View getView(int position, View convertView, ViewGroup parent) {  
        ViewHolder viewHolder;  
        View view = convertView;  

        if(view == null) { 
        	view = _parentActivity.getLayoutInflater().inflate(R.layout.home_list_item, null);
            viewHolder = new ViewHolder();  
            viewHolder.jokeImageView = (ImageView) view.findViewById(R.id.imgItem);  
            viewHolder.jokeTextView = (TextView) view.findViewById(R.id.titleItem);  
            view.setTag(viewHolder);  
        } else {  
            viewHolder = (ViewHolder) view.getTag();  
        }  

        final JokeItem itemData = (JokeItem) getItem(position);  
        viewHolder.jokeImageView.setImageDrawable(itemData.getIcon());  
        viewHolder.jokeTextView.setText(itemData.getTitle());  

        return view;  
    }  

    class ViewHolder {  
        protected ImageView jokeImageView;  
        protected TextView jokeTextView;  
    }  

}
