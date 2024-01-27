import java.util.ArrayList;

public class CollectionDemo {

    public static void main(String[] args) {

        int a[] = { 44, 33, 222, 233, 555, 44, 55, 66 };
        ArrayList<Integer> ab = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;

            if (!ab.contains(a[i])) {

                ab.add(a[i]);
                k++;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;

                    }
                }
            }
            System.out.println("Number " + a[i] + " is repeated " + k);

            // unique number
            if (k == 1) {
                System.out.println("This is the unique number" + k);
            }
        }

    }
}
