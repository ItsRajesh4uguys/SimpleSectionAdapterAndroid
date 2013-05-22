package com.example.mysectionadapter;
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
	Context ctx;
	LayoutInflater lInflater;

	ArrayList<String> Datastring=new ArrayList<String>();
	
	public ListAdapter(Context context,ArrayList<String> Items) {
		ctx = context;		
		Datastring.addAll(Items); 
		lInflater = (LayoutInflater) ctx
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public int getCount() {
		return Datastring.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView == null) {
			convertView = (View) lInflater.inflate(R.layout.list, parent, false);			
		}
		TextView text=(TextView)convertView.findViewById(R.id.textView1);
		text.setText(Datastring.get(position));
		
		return convertView;
	}

	
	

}