import java.util.*;

class project{
    public static void main(String[] args) {
        start_programms();
    }

    public static void start_programms(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input Sale price");
        double sale_price = sc.nextDouble();
        System.out.print("Please input Appraisal Price");
        double assess_price = sc.nextDouble();
        System.out.print("Please input years");
        int year = sc.nextInt();
        if(year == 1){
            double year_ex = 0.92;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 2){
            double year_ex = 0.84;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 3){
            double year_ex = 0.77;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 4){
            double year_ex = 0.71;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 5){
            double year_ex = 0.65;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 6){
            double year_ex = 0.60;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year == 7){
            double year_ex = 0.55;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else if(year >= 8){
            double year_ex = 0.50;
            System.out.println("Deduct expenses "+year_ex+" % ");
            calculate_1(sale_price,assess_price,year_ex);
        }
        else{
            System.out.println("Please input ");
        }
    }
    public static void calculate_1(double sale_price,double assess_price,double year_ex){
        
    }

}