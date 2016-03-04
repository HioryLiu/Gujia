package com.gujia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.gujia.util.TitleBuilder;

public class MainActivity extends Activity {

	private Button scanButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        scanButton=(Button) findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
//				Intent startScan=new Intent(MainActivity.this,CaptureActivity.class);
//				startActivity(startScan);
				
				Intent startCreateInt=new Intent(MainActivity.this,UserCreateAty.class);
				startActivity(startCreateInt);
			}
		});
        init();
    }
    
    public void init(){
    	new TitleBuilder(this)
    	.setTitleText("µÇÂ½")
        .setLeftText("return");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
