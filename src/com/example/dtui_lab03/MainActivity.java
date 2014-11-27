package com.example.dtui_lab03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button notification;
	Button schedule;
	Button register;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        notification = (Button) findViewById(R.id.notification);
        schedule = (Button) findViewById(R.id.schedule);
        register = (Button) findViewById(R.id.register);
        
        notification.setOnClickListener(notifi);
        schedule.setOnClickListener(sche);
        register.setOnClickListener(reg);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    private View.OnClickListener notifi = new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Notification = new Intent(getApplicationContext(), Notification.class);
			startActivity(Notification);
		}
	};
	private View.OnClickListener sche = new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Schedule = new Intent(getApplicationContext(), Schedule.class);
			startActivity(Schedule);
		}
	};
	private View.OnClickListener reg = new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Register = new Intent(getApplicationContext(), Register.class);
			startActivity(Register);
		}
	};
    
}
