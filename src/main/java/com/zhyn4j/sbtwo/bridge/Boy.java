package com.zhyn4j.sbtwo.bridge;

public class Boy {

    private  String name;


    public  void pursue(MM mm){
        Gift g = new Gift();
        give(g,mm);
    }

    private void give(Gift g, MM mm) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
