package game.client;

import model.entities.Player;
import java.util.Scanner;

public class Client {
    private static Player player;

    public static void main(String[] args) {
        System.out.println("Welcome To The Most Generic RPG!");

        initialize();

        System.out.println(player.getStats());

        // 1. Looking For Trouble 2. Exit

        System.out.println("What do you want to do?" +
                "\n 1 = Looking For Trouble \n 2 = Exit Game");

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        if (in.equals("1")){
            System.out.println("Trouble");
        }

        scanner.close();

    }

    public static Player initialize() {
        player = Player.getInstance();
        player.setName("John Doe");
        player.setHealth(100);
        player.setLevel(1);

        return Player.getInstance();
    }
}
