package Decorator.classes;

public class DecoratorCocktail implements Bautura{
    Bautura cocktail;

    public DecoratorCocktail(Bautura cocktail) {
        this.cocktail = cocktail;
    }

    @Override
    public void seConsuma() {
        cocktail.seConsuma();
    }

    @Override
    public void sePrepara() {
        cocktail.sePrepara();
    }
}
