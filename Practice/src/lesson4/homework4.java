package lesson4;
import java.util.Scanner;
import java.util.Date;

public class homework4 {
    static void whatToDo(){
        System.out.println("""
             Выберите действие:
             [1] - Отправить сообщение
             [2] - Просмотреть последнее входящее сообщение
             [3] - Вывести дату и время
             [4] - Вывести модель телефона
             [5] - Вывести баланс сим-карты
             [6] - Выбрать сим-карту заново
             [7] - Завершить работу
             """);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone samsung = new Phone();
        Phone.SimCard vodafone = new Phone.SimCard();
        Phone.SimCard life = new Phone.SimCard();
        samsung.setModel("S21");
        int ch = 0;
        while(ch != 7){
            System.out.println("""
        Выберите сим-карту:
        [1] - Vodafone
        [2] - Lifecell
        """);
            ch = input.nextInt();
            switch(ch){
                case 1:
                    vodafone.active = true;
                    life.active = false;
                    whatToDo();
                    ch = input.nextInt();
                    switch(ch){
                        case 1:
                            Scanner input1 = new Scanner(System.in);
                            String message = input1.nextLine();
                            vodafone.messageSend(life, message);
                            System.out.println("Ваш баланс: " + vodafone.getBalance());
                            break;
                        case 2:
                            vodafone.getIncoming();
                            break;
                        case 3:
                            samsung.getDate();
                            break;
                        case 4:
                            samsung.getModel();
                            break;
                        case 5:
                            System.out.println("Ваш баланс: " + vodafone.getBalance());
                            break;
                        case 6:
                            continue;
                        case 7:
                            continue;
                    }
                    break;
                case 2:
                    vodafone.active = false;
                    life.active = true;
                    whatToDo();
                    ch = input.nextInt();
                    switch(ch){
                        case 1:
                            Scanner input1 = new Scanner(System.in);
                            String message = input1.nextLine();
                            life.messageSend(vodafone, message);
                            System.out.println("Ваш баланс: " + life.getBalance());
                            break;
                        case 2:
                            life.getIncoming();
                            break;
                        case 3:
                            samsung.getDate();
                            break;
                        case 4:
                            samsung.getModel();
                            break;
                        case 5:
                            System.out.println("Ваш баланс: " + life.getBalance());
                            break;
                        case 6:
                            continue;
                        case 7:
                            continue;
                    }
                    break;
                default:
                    System.out.println("Вы ввели неверное число :(");
                    continue;
            }

        }

    }
}

class Phone{
    private String model;
    private Date date;
    public static class SimCard{
        private String number;
        private float balance = 100f;
        private String incomingMessage;
        boolean active;
        void messageSend(SimCard obj, String message){
            obj.setIncoming(message);
            balance = balance - 0.5f;
        }
        void setIncoming(String message){
            incomingMessage = message;
        }
        float getBalance(){
            return balance;
        }
        void getIncoming(){
            if(incomingMessage != null){
            System.out.println(incomingMessage);
            }
            else{
                System.out.println("Сообщений нет :(");
            }
        }
    }

    void setModel(String model){
        this.model = model;
    }

    void getModel(){
        System.out.println(model);
    }

    void getDate(){
        Date date1 = new Date();
        System.out.println(date1);
    }

    void gatModel(){
        System.out.println(model);
    }
};



