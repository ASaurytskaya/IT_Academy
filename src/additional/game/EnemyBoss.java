package additional.game;

public class EnemyBoss implements IGameCharacter {
    private int damage = 7;
    private int lives  = 50;
    private int defence = 10;
    private boolean isDead = false;

    @Override
    public int attack() {
        if(isDead) {
            return 0;
        }
        return damage;
    }

    @Override
    public int takeDamage(int damage) {
        if(isDead) return damage;
        int remainingDamage = damage - defence - lives;
        lives = lives - (damage - defence);
        if(lives < 1) {
            this.die();
        }
        return remainingDamage;
    }

    @Override
    public boolean isAlive() {
        return !isDead;
    }

    @Override
    public void die() {
        isDead = true;
        System.out.println("Enemy - BOSS - is dead.");
    }
}
