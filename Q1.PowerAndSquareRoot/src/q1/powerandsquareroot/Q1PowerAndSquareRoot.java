package q1.powerandsquareroot;

public class Q1PowerAndSquareRoot {

    public static void main(String[] args) {
        double base =2;
        double exponent =10;
        double number = 81;
        
        double powResults = Math.pow(base,exponent);
        double sqrtResult = Math.sqrt(number);
        
        System.out.println(base+ " ^ " +exponent+" = "+ powResults);
        System.out.println("Square root of "+ number + " = " + sqrtResult);
    }
    
}
