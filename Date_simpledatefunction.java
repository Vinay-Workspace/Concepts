import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_simpledatefunction {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat obj = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(obj.format(d));

    }

}