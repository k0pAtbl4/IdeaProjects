package hillel.lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker[] people = new Worker[5];
        for(int i = 0; i < 5; i++){
            people[i] = new Worker();
            people[i].scanWorker();
        }
        String[] surnameArray = new String[5];
        for(int i = 0; i < 5; i++) {
            surnameArray[i] = people[i].getSurname();
        }
        Arrays.sort(surnameArray);
        Worker[] newArray = new Worker[5];
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++) {
                if (surnameArray[i].equals(people[k].getSurname())) {
                    newArray[i] = new Worker();
                    newArray[i] = people[k];
                }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(newArray[i]);
        }
        System.out.println("Введите стаж работы:");
        int workExp = input.nextInt();
        System.out.println("Фамилии работников, стаж которых превышает указанный:");
        int iter = 0;
        for(int i = 0; i < 5; i++){
            if(2022 - newArray[i].getYear() > workExp) {
                System.out.println(newArray[i].getSurname());
                iter++;
            }
        }
        if(iter == 0) {
            System.out.println("Таких не найдено");
        }
    }
}
