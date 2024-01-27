public class access_abstract_class extends parent_abstract_class {
    public static void main(String[] args) {
        System.out.println("Accessing the abstract method of an Abstract Class");
        // we can not access abstract class through object make sure create obj of child
        // class that you want to inherit.
        // parent_abstract_class obj = new parent_abstract_class();
        access_abstract_class obj = new access_abstract_class();
        obj.Hope();
        obj.Dream();
        obj.quotes();

    }

    @Override
    public void Dream() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Dream'");
        System.out.println("Dreamhardwork");
    }

}