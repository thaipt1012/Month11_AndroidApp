package com.example.dtui_lab03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class notification_detail extends Activity{
   
    String titleStr;
    String contentStr;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_detail);
        
        TextView title = (TextView)findViewById(R.id.title);
        TextView content = (TextView)findViewById(R.id.content);
        
        Intent myLocalIntent = getIntent();
        Bundle myBundle = myLocalIntent.getExtras();
        titleStr = myBundle.getString("title");
        contentStr = "\t" + myBundle.getString("content");
        
        title.setText(titleStr);
        content.setText(contentStr);
        

    }

}
