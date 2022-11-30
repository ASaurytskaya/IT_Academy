package additional.game;

public class GameMain {
    public static void main(String[] args) {
        HeroTeam team1 = new HeroTeam(4);
        team1.addHero(new Dwarf());
        team1.addHero(new Elf());
        team1.addHero(new Human());
        team1.addHero(new Ork());

        IGameCharacter enemy1 = new EnemyGhoul();
        IGameCharacter enemy2 = new EnemyOgr();
        IGameCharacter enemy3 = new EnemyBoss();

        startBattle(team1, enemy1);
        startBattle(team1, enemy2);
        startBattle(team1, enemy3);


    }

    public static void startBattle(HeroTeam team, IGameCharacter enemy) {
        while(enemy.isAlive() && team.isAlive()) {
            enemy.takeDamage(team.attack());
            team.defence(enemy.attack());
        }
        if(enemy.isAlive()) {
            System.out.println("You loose...");
        } else {
            System.out.println("You win!");
        }
    }
}
