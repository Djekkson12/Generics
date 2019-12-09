package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Leagues<T extends Teams> {

    private Set<T> teams = new TreeSet<>();

    public void addTeam(T team){
        teams.add(team);
    }



    public void printTeams(){
        System.out.println(teams);
    }

    public Set<T> getTeams(){
        return  teams;
    }

    public void setTeams(Set<T> teams){
        this.teams = teams;
    }

}
