package com.hook38.gettingmore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GettingMoreActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button quadrant1Button = (Button)findViewById(R.id.activity_button_1);
        final Button quadrant2Button = (Button)findViewById(R.id.activity_button_2);
        final Button quadrant3Button = (Button)findViewById(R.id.activity_button_3);
        final Button quadrant4Button = (Button)findViewById(R.id.activity_button_4);
        final Button aboutButton = (Button)findViewById(R.id.about_button);
        final Button exitButton = (Button)findViewById(R.id.exit_button);
        
        quadrant1Button.setOnClickListener(this);
        quadrant2Button.setOnClickListener(this);
        quadrant3Button.setOnClickListener(this);
        quadrant4Button.setOnClickListener(this);
        aboutButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
        
        this.initialize();
    }
    
    private void initialize(){
    	
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.activity_button_1:
			Intent i = new Intent(this, Quadrant1Activity.class);		
			startActivity(i);
			break;
		case R.id.activity_button_2:
			Intent i2 = new Intent(this, Quadrant2Activity.class);		
			startActivity(i2);
			break;
		case R.id.activity_button_3:
			Intent i3 = new Intent(this, Quadrant3Activity.class);		
			startActivity(i3);
			break;
		case R.id.activity_button_4:
			Intent i4 = new Intent(this, Quadrant4Activity.class);		
			startActivity(i4);
			break;
		case R.id.about_button:
			Intent iabout = new Intent(this, AboutActivity.class);		
			startActivity(iabout);
			break;
		case R.id.exit_button:
			finish();
			break;
		}
	}
}