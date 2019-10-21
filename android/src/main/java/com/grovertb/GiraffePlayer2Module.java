package com.grovertb;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import tcking.github.com.giraffeplayer2.GiraffePlayer;
import tcking.github.com.giraffeplayer2.VideoInfo;

public class GiraffePlayer2Module extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public GiraffePlayer2Module(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "GiraffePlayer2";
    }

    @ReactMethod
    public void play(String url) {
        GiraffePlayer.play(reactContext, new VideoInfo(url));
    }
}
