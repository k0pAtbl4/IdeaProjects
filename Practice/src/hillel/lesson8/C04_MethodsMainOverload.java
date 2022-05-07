package hillel.lesson8;

public class C04_MethodsMainOverload {

    public static void main(String... args) {
        try {
            if (args.length > 0)  // если через консоль были введены аргументы
                System.out.println(args[0]);  //то вывести на консоль первый элемент из массива
            else {  //иначе —
                main(); // и использовать обычный метод с названием main()
            }
        }catch(Exception ex){
            System.out.println("[Error detected]");
        }finally {
            System.out.println("finally");
        }
    }

    public static void main() {  // это обычный метод с названием main()
        System.out.println("it's usual main method without String[] args!");
    }
}
