import java.util.Scanner;

public class sci
{



    Scanner scan = new Scanner(System.in);
    double a , b , result;
    int op;
    void operation()
    {
        do
        {
            System.out.println("Operation Menu");
            System.out.println(" 1 - Ceil"+"\n"+" 2 - Floor"+"\n"+" 3 - Square Root"+"\n"+" 4 - Power"+"\n"+" 5 - Back to menu");
            try{
            op= scan.nextInt();
            switch(op)
            {
                case 1 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new Exception();}
                    result = Math.ceil(a);
                    System.out.println("Ceil value of "+a+" is "+result);
                    break;
                }
                case 2 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new Exception();}
                    result = Math.floor(a);
                    System.out.println("Floor value of "+a+" is "+result);
                    break;
                }
                case 3 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new Exception();}
                    result = Math.sqrt(a);
                    System.out.println("Square root of "+a+" is "+result);
                    break;
                }
                case 4 :
                {
                    System.out.println("Enter the first number");
                    a=scan.nextDouble();
                    System.out.println("Enter the second number");
                    b=scan.nextDouble();
                    if(a<=0 || b<=0) {throw new Exception();}
                    result = Math.pow(a , b);
                    System.out.println(+a+"to the power of "+b+" is "+result);
                    break;
                }
            }
            }
        
            catch(Exception e){
                e.printStackTrace();
               

            }
        }
         while(op<5);
    }
}



    

