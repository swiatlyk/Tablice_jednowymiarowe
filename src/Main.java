public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("One-dimensional array");

        //int[] array = new int[5];
        int[] array2 = new int [10];
        //array[1] = 20;
        //System.out.println(array[0] + " " + array[1]);
        System.out.println("Amount of elements:" + " " + array2.length);
        //Adding to array
        for (int i = 0; i < 10; i++) {
            array2[i] = i +1 ;
        }
        //Printing the array
        for (int x : array2) {
            System.out.println(x);
        }
    }
}
