package hillel.lesson1;
//zxc ghoul 1000-7
public class Class8 {
    public static void main(String[] args) {
        int thousand = 1000;
        int seven = 7;
        int result = 666;
        result = thousand;
        while(result > 0)
        {
            result = result - seven;
            System.out.println((result+7) + " - 7 = " + result);
        }
        System.out.println("[Ghoul mission completed]");
    }
}
