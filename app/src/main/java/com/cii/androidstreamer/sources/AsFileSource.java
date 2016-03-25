package com.cii.androidstreamer.sources;
import com.cii.androidstreamer.elements.AsElement;

public class AsFileSource extends AsElement {
    private String mName;

    public AsFileSource(){
    }

    public AsFileSource(String name){
        mName = name;
    }
    public String getName(){
          return mName;
   }

}
