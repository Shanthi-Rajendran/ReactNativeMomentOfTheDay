package com.example.momentoftheday;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class ReactNativeMomentOfDay extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactApplicationContext;

    public ReactNativeMomentOfDay(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactApplicationContext = reactContext;
    }

    @Override
    public String getName() {
        return "ReactNativeMomentOfDay";
    }

    @ReactMethod
    public void getMomentOfDay(Promise promise){
        try {
            promise.resolve("hi");
        } catch (Exception exception){
            promise.reject(exception);
        }
    }
}
