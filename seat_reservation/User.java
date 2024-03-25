package seat_reservation;
import java.util.*;
class Main {
    public static void main(String[] args) {
        blank blanker = new blank();
        blanker.calculate();
    }
}

class blank implements input{
    public void calculate(){
        Scanner inp = new Scanner(System.in);
        System.out.println("input first value : ");
        int first = inp.nextInt();
        System.out.println("input second value : ");
        int second = inp.nextInt();
        int sum = first + second;
        System.out.println("sum = " + sum);
        inp.close();
    }
}