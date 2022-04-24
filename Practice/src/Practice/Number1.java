package Practice;
import java.util.Scanner;

public class Number1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level = input.nextInt();
        Ork rudolf = new Ork(level);
        System.out.println(rudolf.getHealth());
        System.out.println(rudolf.getMight());
        System.out.println(rudolf.getLevel());
    }
}

class Ork{
    private static String description;
    private final int health;
    private final int level;
    private final int might;

    public Ork(int level){
        this.level = level;
        health = level * 5;
        might = level * 3;
    }

    int getHealth(){
        return health;
    }
    int getLevel(){
        return level;
    }
    int getMight(){
        return might;
    }

    void setDescription(String description){
        Ork.description = description;
    }
}
