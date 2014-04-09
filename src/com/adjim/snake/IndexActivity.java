package com.adjim.snake;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.adjim.snake.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class IndexActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);	
		
		View start_btn = findViewById(R.id.start_button);
		start_btn.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.setClass(IndexActivity.this, StartActivity.class);
				startActivity(it);
			}
		});
		
		View tutorialPartI_btn = findViewById(R.id.tutorialparti_button);
		tutorialPartI_btn.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.setClass(IndexActivity.this, TutorialPartI.class);
				startActivity(it);
			}
		});
	}
}
