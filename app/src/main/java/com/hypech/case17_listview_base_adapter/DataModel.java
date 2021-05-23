package com.hypech.case17_listview_base_adapter;

public class DataModel {

    String aName, aSpeak;
    int aIcon;

    public DataModel() {
    }

    public DataModel(String aName, String aSpeak, int aIcon) {
        this.aName = aName;
        this.aSpeak = aSpeak;
        this.aIcon = aIcon;
    }

    public String getaName() {        return aName;    }
    public String getaSpeak() {        return aSpeak;    }
    public int getaIcon() {        return aIcon;    }

    public void setaName(String aName) {        this.aName = aName;    }
    public void setaSpeak(String aSpeak) {        this.aSpeak = aSpeak;    }
    public void setaIcon(int aIcon) {        this.aIcon = aIcon;    }
}