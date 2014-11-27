package com.example.dtui_lab03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Notification extends Activity{
	
	String[] notifi;
	String[] notifi_detail;
	ListView list;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        
        list = (ListView)findViewById(R.id.listView1);
     

    	notifi = getResources().getStringArray(R.array.notifi);
    	notifi_detail = getResources().getStringArray(R.array.notifi_detail);
    	
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notifi);
        list.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        
        list.setOnItemClickListener(itemClick);
    }
    
    private AdapterView.OnItemClickListener itemClick = new AdapterView.OnItemClickListener() {

		public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
			// TODO Auto-generated method stub
			//Toast.makeText(getApplicationContext(), notifi_detail[position], Toast.LENGTH_SHORT).show();
			
			Bundle myBundle = new Bundle();
			myBundle.putString("title", notifi[position]);
			myBundle.putString("content", notifi_detail[position]);
			Intent Detail = new Intent(getApplicationContext(), notification_detail.class);
			Detail.putExtras(myBundle);
			startActivity(Detail);
			
		}
	};
}