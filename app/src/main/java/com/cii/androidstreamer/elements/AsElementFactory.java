package com.cii.androidstreamer.elements;
import com.cii.androidstreamer.sources.AsFileSource;
import java.util.HashMap;

public class AsElementFactory {
    static AsElementFactory factory;
    HashMap<String, AsElement> map;

    static AsElementFactory getInstance(){
        if (factory == null) {
            factory = new AsElementFactory();
        }
        return factory;
    }

    private AsElementFactory() {
    }

    public AsElement makeElement(String name, AsElement.Types  type) {
        AsElement retAsElement = null;
        switch (type)
        {
            case SOURCE:
                retAsElement = new AsFileSource(name);
                map.put("AsFileSource", retAsElement);
                break;
            case SINK:
                break;
            case FILTER:
                break;
            case BUS:
                break;
            case MSG:
                break;
            case PIPELINE:
                break;
        }
        return retAsElement;
    }
}
