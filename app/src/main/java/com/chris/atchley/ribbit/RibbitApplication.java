package com.chris.atchley.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


/**
 * Created by Chris on 10/13/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "MqpI8YbCxg9wLbZMYaaPhPkW1JN4mYkkZDOf5LGp", "SNVwdBDorraRXWhYPmLzSVfF5YaLJe9vNpv9mv1E");


    }
}
