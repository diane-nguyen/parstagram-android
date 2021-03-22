package com.dianenguyen.parstagram_android;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3GkIGSn1Hp4qNfTD0TT6YKTMUe3yn7KhgQ7Xf4uo")
                .clientKey("6qwcEqlXYjoCZUoAJNmBhwKmEIZGWDbwxKZMjINg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
