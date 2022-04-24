package lesson2;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Human Player1 = new Human();
        Human Player2 = new Human();

        System.out.println("Enter 1st player name:");
        Player1.name = input.nextLine();
        System.out.println("Enter 2nd player name:");
        Player2.name = input.nextLine();

        int boosters = 10;

        System.out.print("What characteristics do you want to boost for " + Player1.name);
        System.out.print("""
                ?(you can boost it 10 times)
                [1] - Health
                [2] - Might
                [3] - Intellect
                ================================================
                """);

        for(;boosters > 0; boosters--) {

            int player1Choose = input.nextInt();

            switch (player1Choose) {
                case 1 -> {
                    Player1.health++;
                }
                case 2 -> {
                    Player1.might++;
                }
                case 3 -> {
                    Player1.intellect++;
                }
            }

            System.out.println(Player1.name + "'s characteristics:" +
                    "\nHealth - " + Player1.health +
                    "\nMight - " + Player1.might +
                    "\nIntellect - " + Player1.intellect +
                    "\n===============\n");

            if(boosters != 1) {
                System.out.println("Tap a number to choose");
            }
        }

        System.out.print("What characteristics do you want to boost for " + Player2.name);
        System.out.print("""
                ?(you can boost it 10 times)
                [1] - Health
                [2] - Might
                [3] - Intellect
                ================================================
                """);

        boosters = 10;

        for(;boosters > 0; boosters--) {

            int player2Choose = input.nextInt();

            switch (player2Choose) {
                case 1 -> {
                    Player2.health++;
                }
                case 2 -> {
                    Player2.might++;
                }
                case 3 -> {
                    Player2.intellect++;
                }
            }

            System.out.println(Player2.name + "'s characteristics:" +
                    "\nHealth - " + Player2.health +
                    "\nMight - " + Player2.might +
                    "\nIntellect - " + Player2.intellect +
                    "\n===============\n");

            if(boosters != 1) {
                System.out.println("Tap a number to choose");
            }
        }
        System.out.println("""
        ====================
        Preparations ended.
        FIGHT!!!
        ====================""");
        int move = (int) ( Math.random() * 2 );
        if(move == 0){
            System.out.println("====================\n" + Player1.name + " goes first!");
            while(Player1.health > 0 && Player2.health > 0)
            {
                Player2.health = Player2.health - Player1.might;
                Player1.health = Player1.health - Player2.might;
            }
        }
        if(move == 1) {
            System.out.println("====================\n" + Player2.name + " goes first!");
            while (Player1.health > 0 && Player2.health > 0) {
                Player1.health = Player1.health - Player2.might;
                Player2.health = Player2.health - Player1.might;
            }
        }

        System.out.println(Player1.name + "'s characteristics:" +
                "\nHealth - " + Player1.health +
                "\nMight - " + Player1.might +
                "\n===============\n");

        System.out.println(Player2.name + "'s characteristics:" +
                "\nHealth - " + Player2.health +
                "\nMight - " + Player2.might +
                "\n===============\n");

        if(Player1.health <= 0){
            System.out.println("========================\n" + Player2.name + " wins!\n========================");
        }
        if(Player2.health <= 0){
            System.out.println("========================\n" + Player1.name + " wins!\n========================");
        }
    }
}
class Human {
    int health = 10;
    int might = 1;
    int intellect = 10;
    String name;
}
