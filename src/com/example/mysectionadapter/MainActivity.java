package com.example.mysectionadapter;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
public class MainActivity extends Activity {		
	
	ListView listView1;
	Context context;
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.homepage);
		
		context=this;
		
		listView1=(ListView)findViewById(R.id.listView1);
		
		ArrayList<String> S1 = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			
			S1.add("S1 item"+i);
		}
		
ArrayList<String> S2 = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			
			S2.add("S2 item"+i);
		}
		
ArrayList<String> S3 = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			
			S3.add("S3 item"+i);
		}
		
		
		
		
		// create our list and custom adapter
		SeparatedListAdapter adapter = new SeparatedListAdapter(this);
		adapter.addSection("Header 1 ", new ListAdapter(context,S1));		
		adapter.addSection("Header 2", new ListAdapter(context,S2));		
		adapter.addSection("Header 3 ", new ListAdapter(context,S3)); 		
		
		listView1.setAdapter(adapter);
		

	}

}
