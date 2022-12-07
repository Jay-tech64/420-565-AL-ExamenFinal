package org.cal.strategyexercice;

import java.util.ArrayList;
import java.util.List;

public class StrategyMain {
    
    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne(new Heureuse()));
        personnes.add(new Personne(new Malheureuse()));
        personnes.add(new Personne(new Triste()));

        personnes.forEach(Personne::printHumeur);
    }
}
