import java.util.ArrayList;
import java.util.Scanner;
public class LinearEquationLogic {




    private Scanner scan;
    private ArrayList list;
    private String orderPair1;
    private String orderPair2;




    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        list = new ArrayList<String>();
        orderPair2 = null;
        orderPair1 = null;
    }




    public void start() {
        System.out.println("Welcome User!");
        System.out.println("Please type in your ordered pair, in (x, y) format and only integers.");
        orderPair1 = scan.nextLine();
        System.out.println("Please type in your second ordered pair, in (x, y) format and only integers.");
        orderPair2 = scan.nextLine();
        LinearEquation equation = new LinearEquation(parseX(orderPair1), parseY(orderPair1), parseX(orderPair2), parseY(orderPair2));
        System.out.println(equation.lineInfo());
    }




    private int parseX(String num) {
        int idx = num.indexOf(",");
        return Integer.parseInt(num.substring(1, idx));
    }


    private int parseY(String num) {
        int idx = num.indexOf(",");
        int idx2 = num.indexOf(")");
        return Integer.parseInt(num.substring(idx + 2, idx2));
    }


    private double round(double num) {
        return Math.round(num * 100) / 100.0;
    }




}

