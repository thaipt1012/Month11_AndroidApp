package com.example.dtui_lab03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Register extends Activity{
	
	ListView list3;
	String[] list_class;
	String[] list_time_class;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        
        
        list3 = (ListView)findViewById(R.id.listView3);
        

    	list_class = getResources().getStringArray(R.array.list_class);
    	list_time_class = getResources().getStringArray(R.array.list_time_class);
    	
    	
        ArrayList<Map<String, String>> list = buildData();
        String[] from = { "name", "time" };
        int[] to = { R.id.tv1, R.id.tv2 };

        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.classes, from, to);
        list3.setAdapter(adapter);
        list3.setOnItemClickListener(itemClick);
        
        
        Button commit = (Button)findViewById(R.id.commit);
        commit.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
        
     }
 

     private ArrayList<Map<String, String>> buildData() {
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        
        Integer n = list_class.length;
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
        
        

    
    
    private AdapterView.OnItemClickListener itemClick = new AdapterView.OnItemClickListener() {

		public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
			// TODO Auto-generated method stub
			//Toast.makeText(getApplicationContext(), notifi_detail[position], Toast.LENGTH_SHORT).show();
			
			
		}
	};
}
