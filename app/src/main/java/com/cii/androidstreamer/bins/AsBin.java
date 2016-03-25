package com.cii.androidstreamer.bins;

import com.cii.androidstreamer.elements.AsElement;
import java.util.HashMap;

public class AsBin extends AsElement {
    HashMap<String, AsElement> map;
    public AsBin() {
    }
    public boolean bin_add(AsElement element) {
        map.put(element.getName(), element);
        return  (map.isEmpty()) ? true : false;
    }

    public boolean bin_remove(AsElement element) {
        int count = map.size();
        AsElement elem = map.remove(element.getName());
        elem = null;
        return (map.size() == (--count)) ? true : false;
    }


}
