package additional.game;

public class HeroTeam {
    private IGameCharacter[] team;
    private int countOfHeroes = 0;
    private boolean isAlive = true;

    public HeroTeam(int numberOfHeroes) {
        team = new IGameCharacter[numberOfHeroes];
    }

    public void addHero(IGameCharacter hero) {
        if(countOfHeroes == team.length) {
            System.out.println("Team is already full.");
        }
        team[countOfHeroes] = hero;
        countOfHeroes++;
    }

    public int attack() {
        int attackSummary = 0;
        for(IGameCharacter hero : team) {
            attackSummary += hero.attack();
        }
        return attackSummary;
    }

    public void defence(int takenDamage) {
        int remainingDamage = takenDamage;
        for(IGameCharacter hero : team) {
            remainingDamage = hero.takeDamage(remainingDamage);
            if(remainingDamage < 1) {
                return;
            }
        }
        if(remainingDamage == takenDamage) {
            isAlive = false;
            System.out.println("All heroes are dead.");
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
}
