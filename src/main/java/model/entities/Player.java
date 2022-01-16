package model.entities;

public class Player {
    private static Player INSTANCE;
    private String name;
    private int health;
    private int level;

    private Player() {

    }

    public static Player getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Player();
        }

        return INSTANCE;
    }

    public Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getStats() {
        return "Character Name: " + name + "\n" +
                "Character Health: " + health + "\n" +
                "Character Level: " + level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
