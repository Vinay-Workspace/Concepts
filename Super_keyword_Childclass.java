public class Super_keyword_Childclass extends Super_keyword_parentclass {

    String name = "Vidal Sebastine";

    public void getName() {
        System.out.println(name);
    }

    public void getparentstring() {
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Super_keyword_Childclass obj = new Super_keyword_Childclass();
        obj.getName();
        obj.getparentstring(); // Gave preferance to local variable

    }

}
