package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new   Parse.Configuration.Builder(this)
                .applicationId("KEvo1rza8IFsyXlNkUYp15LxbphYYQBV3F7yolAL")
                .clientKey("xUWxABynifo2YIiotcXH9y1ZxC23Gj3o5jAeOwoy")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
