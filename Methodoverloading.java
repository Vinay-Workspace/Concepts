public class Methodoverloading extends parent_abstract_class {
    public static void main(String[] args) {
        // creating object of the child class
        Methodoverloading obj = new Methodoverloading();
        obj.Dream();
        obj.number("Fifty");
        obj.number(5);
    }

    @Override
    public void Dream() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Dream'");
        System.out.println("Dream big");

    }

    public void number(int a) {
        System.out.println(a);
    }

    public void number(String a) {
        System.out.println(a);

    }

}
