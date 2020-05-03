package com.miam.letstrip.activities;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TripApplication extends Application {

    private static FirebaseUser currentUser;
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        // Check if user is signed in (non-null) and update UI accordingly.
         currentUser = mAuth.getCurrentUser();

    }

    public static FirebaseUser getCurrentUser(){
        return currentUser;
    }
}
