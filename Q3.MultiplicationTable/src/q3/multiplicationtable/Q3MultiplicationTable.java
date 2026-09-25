package q3.multiplicationtable;

public class Q3MultiplicationTable {

    public static void main(String[] args) {
        int number = 8;
        
        for(int i=1; i<=10; i++){
            int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
        }
    }
    
}
