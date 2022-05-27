package hillel.lesson10.homework3;

import hillel.lesson10.homework3.Computer;

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

