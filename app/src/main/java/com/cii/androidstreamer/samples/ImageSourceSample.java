package com.cii.androidstreamer.samples;

import android.app.Activity;
import android.os.Bundle;

import com.cii.androidstreamer.bus.AsBus;
import com.cii.androidstreamer.pipline.AsPipeLine;

public class ImageSourceSample {

    public void setupPipeline(AsBus bus) {
        AsPipeLine pipeline = new AsPipeLine();
        pipeline.bin_add(bus);

    }

}
