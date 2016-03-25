package com.cii.androidstreamer.bus;
import android.app.Activity;

import android.app.Activity;

import com.cii.androidstreamer.elements.AsElement;

import org.greenrobot.eventbus.EventBus;

public class AsBus extends AsElement {
    public void flush_messages() {
    }

    public void register(Activity activity) {
        EventBus.getDefault().register(this);
    }

    public void unregister(Activity activity) {
        EventBus.getDefault().unregister(this);
    }

    public void postMessage() {

    }
}
