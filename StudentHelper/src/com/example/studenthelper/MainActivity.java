package com.example.studenthelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setLayoutSection(R.layout.activity_main);
    }


    private void setLayoutSection(int layout) {
             
        switch(layout)
        {
    
        case R.layout.activity_main:
        	setContentView(layout);
        	ImageButton bGrades = (ImageButton)findViewById(R.id.b_grades);
        	ImageButton bMaps = (ImageButton)findViewById(R.id.b_maps);
        	ImageButton bJacks = (ImageButton)findViewById(R.id.b_jacks);
            
            bGrades.setAlpha((float) .5);
            bMaps.setAlpha((float) .5);
            bJacks.setAlpha((float) .5);
            
            bGrades.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				setLayoutSection(R.layout.grade_background);
    			}
            	
            });
            
            bMaps.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				setLayoutSection(R.layout.maps_background);
    			}
            	
            });
            
            bJacks.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				setLayoutSection(R.layout.jacks_background);
    			}
            	
            });
            break;
            
        case R.layout.grade_background:
        	setContentView(layout);
        	ImageButton bGradeBack = (ImageButton)findViewById(R.id.b_gradeback);
        	bGradeBack.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					setLayoutSection(R.layout.activity_main);
				}
        		
        	});
        	break;
        case R.layout.maps_background:
        	setContentView(layout);
        	ImageButton bMapBack = (ImageButton)findViewById(R.id.b_mapback);
        	bMapBack.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					setLayoutSection(R.layout.activity_main);
				}
        		
        	});
        	break;
        case R.layout.jacks_background:
        	setContentView(layout);
        	ImageButton bJackBack = (ImageButton)findViewById(R.id.b_jacksback);
        	bJackBack.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					setLayoutSection(R.layout.activity_main);
				}
        		
        	});
        	break;
        }
                
		
	}
    
}






