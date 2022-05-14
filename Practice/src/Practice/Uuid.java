package Practice;
import java.util.UUID;
import java.util.Arrays;

public class Uuid {
    public static void main(String[] args) {
        UUID id = UUID.randomUUID();
        System.out.println(id);
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;
        a = Arrays.copyOf(a, 3);
        System.out.println(Arrays.toString(a));
    }
}
