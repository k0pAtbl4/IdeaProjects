package hillel.lesson09.test;
import java.util.Scanner;

public class homework9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] feelings = {"anger", "awe", "joy", "love", "grief"};
        char[][] feelingsInChar = new char[5][];

        for(int i = 0; i < feelings.length; i++){
            feelingsInChar[i] = feelings[i].toCharArray();
        }

        String userInput;
        System.out.println("Enter your string:");
        userInput = input.nextLine();

        char[] userInputInChar = new char[userInput.length()];
        char[] checked = new char[userInputInChar.length];
        userInputInChar = userInput.toCharArray();

        int letterCount = 0;
        int wordCount = 0;
        boolean check = true;
            for(int givenFirst = 0; givenFirst < feelingsInChar.length; givenFirst++){
                for(int givenSecond = 0; givenSecond < feelingsInChar[givenFirst].length; givenSecond++){
                    for(int usInpArr = 0; usInpArr < userInputInChar.length; usInpArr++) {
                        for(int i = 0; i < userInputInChar.length; i++){
                            if(Character.compare(userInputInChar[usInpArr], checked[i]) == 0){
                                check = false;
                            }
                        }
                        if (Character.compare(userInputInChar[usInpArr], feelingsInChar[givenFirst][givenSecond]) == 0 && check) {
                            checked[givenSecond] = userInputInChar[usInpArr];
                            letterCount++;
                            usInpArr = 0;
                            if (letterCount == feelingsInChar[givenFirst].length) {
                                wordCount++;
                            }
                            break;
                        }
                        check = true;
                    }
                }
                letterCount = 0;
                for(int i = 0; i < checked.length; i++){
                    checked[i] = ' ';
                }
            }
        System.out.println("You can make " + wordCount + " word(s) with your combination of letters");
    }
}
