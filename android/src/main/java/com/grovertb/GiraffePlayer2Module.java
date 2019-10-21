package com.grovertb;

import android.net.Uri;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import tcking.github.com.giraffeplayer2.GiraffePlayer;
import tcking.github.com.giraffeplayer2.VideoInfo;

public class GiraffePlayer2Module extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private VideoInfo videoInfo;

    public GiraffePlayer2Module(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

        videoInfo = new VideoInfo();
    }

    @Override
    public String getName() {
        return "GiraffePlayer2";
    }

    @ReactMethod
    public void play(String url) {



        GiraffePlayer.play(reactContext, videoInfo.setUri(Uri.parse(url)));
    }


    @ReactMethod
    public void setTitle(String title) {
        videoInfo.setTitle(title);
    }


    @ReactMethod
    public void setFullScreenOnly(Boolean isFullScreen) {
        videoInfo.setFullScreenOnly(isFullScreen);
    }


    @ReactMethod
    public void setShowTopBar(Boolean isShowTopBar) {
        videoInfo.setShowTopBar(isShowTopBar);
    }

}
