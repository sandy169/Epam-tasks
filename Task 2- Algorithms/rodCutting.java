import java.util.*;
public class rodCutting {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
          int test_cases=s.nextInt();
          int special_rods,rod_length;
          while(test_cases!=0)
          {
              rod_length=s.nextInt();
              special_rods=calculate(rod_length);
              test_cases--;
              System.out.println(special_rods);
     }
    }
    public static int calculate(int rods) {
        int special=0;
        for(int i=3;i<=rods;)
        {
          special=special+1;
          i=i+(i+1);
        }
         return special;
    }
}