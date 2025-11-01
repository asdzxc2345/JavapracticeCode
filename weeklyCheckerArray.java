import java.util.Scanner;

public class weeklyChecker{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();

        String [] days={"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
        if(day>=1 && day<=7){
            System.out.println(days[day -1]);
        }else{
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}