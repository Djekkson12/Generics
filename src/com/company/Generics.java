package com.company;
import java.util.Comparator;
import java.util.TreeSet;


public class Generics<G extends Teams> {
    private Leagues<G> league;

    public Generics(Leagues league){
        this.league = league;

    }

    public void addTeam(G team){
        league.addTeam(team);
    }

    public void print(){
        league.printTeams();
    }

    public Leagues<G> getLeague() {
        return league;
    }
}







