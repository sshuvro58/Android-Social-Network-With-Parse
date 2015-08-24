package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"YOUR APPLICATION ID GOES HERE", 
	    	"YOUR CLIENT KEY GOES HERE");
	}
}
