package com.iutblagnac.r303trace;

/**
 * Classe principale de l’application.
 * Fournit des méthodes pour afficher des messages de bienvenue.
 */
public class App {

    /**
     * Point d’entrée de l’application.
     * Affiche le message Hello World.
     * @param args Arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * Retourne le message "Hello World".
     * @return le message Hello World
     */
    public static String hello() {
        return "Hello World";
    }

    /**
     * Retourne le paramètre passé en argument.
     * @param param le message à retourner
     * @return le message passé en paramètre
     */
    public static String hello(String param) {
        return param;
    }

    /**
     * Affiche un message de bienvenue personnalisé.
     * @param name le nom à inclure dans le message
     */
    public static void helloname(String name) {
        System.out.println("Hello " + name + "!");
    }
}
