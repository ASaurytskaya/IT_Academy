package additional.game;

public interface IGameCharacter {
    int attack();

    int takeDamage(int damage);

    boolean isAlive();

    void die();
}
