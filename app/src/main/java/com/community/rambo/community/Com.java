package com.community.rambo.community;


import android.app.Application;


import com.firebase.client.Firebase;

public class Com extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
