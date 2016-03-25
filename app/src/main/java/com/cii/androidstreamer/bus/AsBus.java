package com.cii.androidstreamer.bus;
import android.app.Activity;
import org.greenrobot.eventbus.EventBus;

public class AsBus {
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
