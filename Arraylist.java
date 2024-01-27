import java.util.ArrayList;

public class Arraylist {
    private int i = 5;

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Dellta");
        a.add("Practicing ");
        a.add("Java ");
        System.out.println(a);
        a.add(0, "student");
        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("Delta"));
        System.out.println(a.indexOf("Practicing"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }

    protected void abc() {
        System.out.println("hello");
    }
}
