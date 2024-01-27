public class Static_Keyword {

    static String name;
    static String address;
    static String number;

    // Instance method to set static variables
    public void setStaticVar(String name, String address, String number) {
        Static_Keyword.name = name;
        Static_Keyword.address = address;
        Static_Keyword.number = number;
    }

    // Static method to retrieve static variables
    public static String getStaticVar() {
        return name + ", " + address + ", " + number;
    }

    public static void main(String[] args) {
        Static_Keyword instance = new Static_Keyword();
        instance.setStaticVar("Vidal", "Austria", "8610721855");

        // Retrieving and printing static variables using the static method
        String result = getStaticVar();
        System.out.println(result);
    }
}
