package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"8R6ZZETq50r5u1PRhW903ZCea8kwbIAEkImu2JRK",
	    	"8UQrlwhyg9ubArj6UgdVARArQZfdWanAiGDskAbU");
	}
}
