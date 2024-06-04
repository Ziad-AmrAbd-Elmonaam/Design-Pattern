package FactoryMethod;

public abstract class  Character {
  private  String enemyName ;
    private  int health ;
    private  int damage ;


    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showUp () {
        System.out.printf("[%s] is showing up. Damage: %d, Health: %d\n", getEnemyName(), getDamage(), getHealth());
    }
}
