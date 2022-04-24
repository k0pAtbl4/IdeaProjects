package Practice;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr1[] = arr;
        int arr2[] = arr;
        if(arr1 == arr2)
            System.out.println("Equal");
        else if(arr1 != arr2)
            System.out.println("Not equal");
        else
            System.out.println("false");
    }
}
