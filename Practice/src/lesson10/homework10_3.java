package lesson10;

import java.util.Arrays;

public class homework10_3 {
    public static void main(String[] args) {
        Computer[] eMachine = new Computer[5];
        Computer first = new Computer(0, 1200, "intel i5", "geforce gtx1660");
        Computer second = new Computer(1, 1500, "intel i7", "geforce rtx2060");
        Computer third = new Computer(2, 700, "intel i3", "intel hd graphics");
        Computer fourth = new Computer(3, 2000, "inter xeon", "geforce rtx 3080");
        Computer fifth = new Computer(4, 1200, "amd", "radeon rx");
        eMachine[0] = first;
        eMachine[1] = second;
        eMachine[2] = third;
        eMachine[3] = fourth;
        eMachine[4] = fifth;
        for(int i = 0; i < eMachine.length; i++){
            System.out.println("\nComputer " + (i + 1) + ":");
            eMachine[i].show();
        }
    }
}

class Computer{
    private int id;
    private int price;
    private String processor;
    private String graphicCard;

    public Computer(int id, int price, String processor, String graphicCard) {
        this.id = id;
        this.price = price;
        this.processor = processor;
        this.graphicCard = graphicCard;
    }

    public Computer(){
        id = 0;
        price = 0;
        processor = "unknown";
        graphicCard = "unknown";
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    void show(){
        System.out.println("id:" + id + ";\nPrice: " + price + ";\nProcessor: " + processor + ";\nGraphic Card: " + graphicCard);
    }
}