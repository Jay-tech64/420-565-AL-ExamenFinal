package org.cal.strategyexercice;

/**
 * 
 * Remanier le code ci-dessous de façon à ce qu'il utilise le 'State/Strategy Pattern'
 * Vous devrez nommer chacun des remaniements que vous faites ainsi que de faire un commit à chaque remaniement.
 *
 */
public class Personne {

    private final Emotion humeur;
    public Personne(Emotion humeur) {
        this.humeur = humeur;
    }
    public void printHumeur() {
        System.out.println(humeur.expressEmotion());
    }

}
