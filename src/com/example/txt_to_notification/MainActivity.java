package com.example.txt_to_notification;

import android.os.Bundle;
import android.app.Activity;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendNotification(View v){
    	
    	EditText title = (EditText)findViewById(R.id.editText1);
    	EditText message = (EditText)findViewById(R.id.editText2);
    	
    	NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
    	
    	mBuilder.setSmallIcon(R.drawable.ic_launcher);
    	mBuilder.setContentTitle(title.getText()); 
	    mBuilder.setContentText(message.getText());

	    int mNotificationId = 001;
	    NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

	    mNotifyMgr.notify(mNotificationId, mBuilder.build());
    	
    
    	
    }
    
    
}
