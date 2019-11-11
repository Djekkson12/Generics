package com.company;
import java.util.Comparator;
import java.util.TreeSet;


public class Generics {


    public class League< T > {
        public  TreeSet container;
        TreeSet addTeam(String teamName){
            return new TreeSet<String>(Comparator.comparing(String::length));
        }
        public void printLeague(League l){


        }
    }




}

