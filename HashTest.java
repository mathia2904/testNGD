package testNGD;

public class HashTest {
    public static void main(String[] args) {
        String Ord;
        Ord = "Test";
        String NesteOrd;
        NesteOrd = "Heia";

        int key;
        key = Ord.hashCode();     //hashcode brukes som unike addresser i hashmap
        int key2;
        key2 = NesteOrd.hashCode();

        key = key % 3;
        key2 = key2 % 3;
        System.out.println(key);
        System.out.println(key2); //if same hashcode, linked list is used.

    }
}