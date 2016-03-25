package com.cii.androidstreamer.pipline;

import com.cii.androidstreamer.bins.AsBin;
import com.cii.androidstreamer.bus.AsBus;
import com.cii.androidstreamer.elements.AsElement;

public class AsPipeLine extends AsBin {
    AsBus mBus = null;
    enum States{ STOPPED, PLAYING, PAUSE, FLUSH};
    States mCurrStates;

    public AsPipeLine() {
        mCurrStates = States.STOPPED;
    }

    public AsBus getBus() {
        return mBus;
    }

    public void set_auto_flush_bus(boolean auto_flush) {
        if (auto_flush && mBus != null) {
            mBus.flush_messages();
        }
    }

}
