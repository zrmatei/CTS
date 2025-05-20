package Decorator.classes;

public class DecoratorCocktailCuGheata extends DecoratorCocktail{
    public DecoratorCocktailCuGheata(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Am pus si gheata");
    }
}
