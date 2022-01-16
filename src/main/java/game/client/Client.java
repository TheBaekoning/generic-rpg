package game.client;

import model.entities.Player;

public class Client {
    private static Player player;

    public static void main(String[] args) {
        System.out.println("Welcome To The Most Generic RPG!");

        initialize();

        System.out.println(player.getStats());

    }

    public static Player initialize() {
        player = Player.getInstance();
        player.setName("John Doe");
        player.setHealth(100);
        player.setLevel(1);

        return Player.getInstance();
    }
}
