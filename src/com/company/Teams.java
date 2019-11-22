package com.company;

public abstract class Teams implements  Comparable<Teams>{

    private  String name;

    public Teams(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Teams o){
        return  this.name.compareTo((o.getName()));

    }
    @Override
    public  String toString(){
        return getName();
    }


}


