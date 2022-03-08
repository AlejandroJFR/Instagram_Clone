package com.example.instagram_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("AZoVEI1pIUBNhKm9J6JqgECqAwyqPHLxzD05sp7H")
                .clientKey("OE3avesPiiHCah0UnzEc2ZeXkWqdYvLJPWxzPdxU")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
