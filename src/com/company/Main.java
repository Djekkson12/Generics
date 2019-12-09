package com.company;

public class Main {

    public static void main(String[] args) {

        Leagues<RugbyTeam> rugbyTeamLeagues = new Leagues<>();
        Leagues<FootballTeam> footballTeamLeagues = new Leagues<>();
        Generics<RugbyTeam> generics = new Generics<>(rugbyTeamLeagues);
        Generics<FootballTeam> generics1 = new Generics<>(footballTeamLeagues);

        RugbyTeam rugbyTeam1 = new RugbyTeam("South Africa Team");
        RugbyTeam rugbyTeam2 = new RugbyTeam("Australia Team");
        RugbyTeam rugbyTeam3 = new RugbyTeam("New Zealand Team");
        RugbyTeam rugbyTeam4 = new RugbyTeam("Ireland Team");


        FootballTeam footballTeam1 = new FootballTeam("England Team");
        FootballTeam footballTeam2 = new FootballTeam("Germany Team");
        FootballTeam footballTeam3 = new FootballTeam("Brazil Team");
        FootballTeam footballTeam4 = new FootballTeam("Austria Team");

        generics.addTeam(rugbyTeam1);
        generics.addTeam(rugbyTeam2);
        generics.addTeam(rugbyTeam3);
        generics.addTeam(rugbyTeam4);

        generics1.addTeam(footballTeam1);
        generics1.addTeam(footballTeam2);
        generics1.addTeam(footballTeam3);
        generics1.addTeam(footballTeam4);


        generics.print();
        generics1.print();

    }

}
