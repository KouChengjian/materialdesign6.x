package com.android.mdui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.mdui.layout.LayoutActivity1;
import com.android.mdui.layout.LayoutActivity2;
import com.android.mdui.layout.LayoutActivity4;

public class LayoutActivity extends Activity implements OnItemClickListener{

private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, getData()));
		setContentView(listView);
		listView.setOnItemClickListener(this);
	}
	
	private List<String> getData(){
        List<String> data = new ArrayList<String>();
        data.add("layout1");
        data.add("layout2");
        data.add("layout4");
        return data;
    }
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		switch (arg2) {
		case 0:
			startAnimActivity(LayoutActivity1.class);
			break;
		case 1:
			startAnimActivity(LayoutActivity2.class);
			break;
		case 2:
			startAnimActivity(LayoutActivity4.class);
			break;
		case 3:
			break;
		default:
			break;
		}
	}

	public void startAnimActivity(Class<?> cla) {
		this.startActivity(new Intent(this, cla));
	}
}
