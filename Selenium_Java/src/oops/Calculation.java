package oops;

public class Calculation extends Arithmatic{

    public static void main(String[] args){
        Calculation cal = new Calculation();
        cal.setAddition(10, 20);
        System.out.println(cal.getAddition());
    }

}
