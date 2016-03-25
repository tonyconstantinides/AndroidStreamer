package com.cii.androidstreamer.elements;

public class AsElement {
    private String mName;
    public static enum Types {BASE, SOURCE, SINK, FILTER, BUS, MSG, PIPELINE};
    public static enum States {STOPPED, STARTED, PLAYING, PAUSED, LINKED, UNLINLED};
    private States mCurrState;
    private Types  mCurrType;

    public AsElement() {
        mCurrState = States.STOPPED;
        mName      = "BaseElement";
        mCurrType  = Types.BASE;
    }

    public String getName() {
        return mName;
    }

    public  void setName(String name){
        mName = name;
    }

    public Types getType(){
        return mCurrType;
    }

    public void setStateChange(States newState){
        mCurrState = newState;
    }

    public Boolean isStopped(){
      return  (mCurrState == States.STOPPED)  ? true : false;
    }
    public Boolean isStarted() {
        return  (mCurrState == States.STARTED)  ? true : false;
    }
    public Boolean isPlaying(){
        return  (mCurrState == States.PLAYING)  ? true : false;
    }
    public Boolean isPaused(){
        return  (mCurrState == States.PAUSED)  ? true : false;
    }
    public Boolean isLinked(){
        return  (mCurrState == States.LINKED)  ? true : false;
    }
    public Boolean isUnlinked(){
        return  (mCurrState == States.UNLINLED)  ? true : false;
    }
    public Boolean isBaseType(){
       return (mCurrType == Types.BASE) ? true : false;
    }
    public Boolean isSourceType(){
        return (mCurrType == Types.SOURCE) ? true : false;
    }
    public Boolean isSinkType(){
        return (mCurrType == Types.SINK) ? true : false;
    }
    public Boolean isFilterType(){
        return (mCurrType == Types.FILTER) ? true : false;
    }
    public Boolean isBusType(){
        return (mCurrType == Types.BUS) ? true : false;
    }
    public Boolean isMsgType(){
        return (mCurrType == Types.MSG) ? true : false;
    }
    public Boolean isPipeLineType(){
        return (mCurrType == Types.PIPELINE) ? true : false;
    }

}
