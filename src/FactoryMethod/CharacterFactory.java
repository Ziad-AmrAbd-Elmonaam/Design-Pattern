package FactoryMethod;

public abstract class CharacterFactory {

    public static final int BIRD = 1;
    public static final int TURTLE = 2;

    public static Character createEnemy(int id)
    {
        return switch (id) {
            case BIRD -> new Bird();
            case TURTLE -> new Turtle();
            default -> null;
        };
    }
}