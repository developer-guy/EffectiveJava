import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        int[] intArray = (int[]) Array.newInstance(int.class, 3); /* we created int type array and gave the length of array is a three */

        Array.set(intArray, 0, 123); /* the second parameter of Array.set method is an index of array and the thirth one is value of given index.*/
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);

        System.out.println("intArray[0] = " + Array.get(intArray, 0)); /*the second parameter of Array.set method is an index of array */
        System.out.println("intArray[1] = " + Array.get(intArray, 1));
        System.out.println("intArray[2] = " + Array.get(intArray, 2));
    }
}
