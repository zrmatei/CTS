package Decorator.main;

import Decorator.classes.Cocktail;
import Decorator.classes.DecoratorCocktailCuGheata;
import Decorator.classes.DecoratorCocktail;

// Este folosit atunci cand adaug unei interfete functionalitati noi in mod dinamic
public class Main {
    public static void main(String[] args) {
        Cocktail cocktail = new Cocktail("Curacao");
        cocktail.sePrepara();
        System.out.println();
        DecoratorCocktail decoratorCocktail = new DecoratorCocktailCuGheata(cocktail);
        decoratorCocktail.seConsuma();
        decoratorCocktail.sePrepara();

    }
}
