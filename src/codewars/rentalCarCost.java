package codewars;

public class rentalCarCost {

    public static int rentalCarCost(int d) {
        int rentValue = 40;
        int discount7MoreDays = 50;
        int discount3MoreDays = 20;
        if (d >= 7){
            return (rentValue * d) - discount7MoreDays;
        }else if(d >= 3){
            return (rentValue * d) - discount3MoreDays;
        }else{
            return rentValue * d;
        }
    }
}
