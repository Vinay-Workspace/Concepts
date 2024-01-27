public class implement_interface implements Myinterface, interface2 {

    public static void main(String[] args) {
        Myinterface obj = new implement_interface();
        obj.getdata();
        obj.getdpic();
        obj.getemail();
        obj.getdata();
        interface2 obj2 = new implement_interface();
        obj2.greeting();
    }

    @Override
    public void getdata() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getdata'");
        System.out.println("You can get the getdata here");
    }

    @Override
    public void getname() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getname'");
        System.out.println("You can get the name here");
    }

    @Override
    public void getdpic() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getdpic'");
        System.out.println("You can get the picture here");
    }

    @Override
    public void getemail() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getemail'");
        System.out.println("You can get the getemail here");
    }

    @Override
    public void greeting() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'greeting'");
        System.out.println("how are you all hope you are doing great and have a great time");
    }

}
