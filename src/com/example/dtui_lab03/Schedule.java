package com.example.dtui_lab03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class Schedule extends Activity{
	ListView list2;
	String[] list_class;
	String[] list_time_class;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);
        
        
        list2 = (ListView)findViewById(R.id.listView2);
        

    	list_class = getResources().getStringArray(R.array.list_class);
    	list_time_class = getResources().getStringArray(R.array.list_time_class);
    	
    	
        ArrayList<Map<String, String>> list = buildData();
        String[] from = { "name", "time" };
        int[] to = { R.id.tv3, R.id.tv4 };

        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.classes2, from, to);
        list2.setAdapter(adapter);
      }

      private ArrayList<Map<String, String>> buildData() {
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        
        Integer n = list_class.length / 2;
        for (int i = 0; i<n; i++)
        	list.add(putData(list_class[i], list_time_class[i]));
        
        return list;
      }

      private HashMap<String, String> putData(String name, String time) {
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("name", name);
        item.put("time", time);
        return item;
      }
    }