import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.Math;
public class ch30 
{
    public static void main(String[] args) 
    {
        int option = 0;
        Scanner scanner = new Scanner(System.in);  
        do{
            System.out.println("Welcome to main Menu");
            System.out.println("1 . Mathematical Calculation"+"\n"+"2 . Scientific Calculation"+"\n"+"3 . Exit");
            try {
                option = scanner.nextInt();
                if(option==0) {throw new ArithmeticException();}
                if(option==1)
                {
                    Calculator calculator =new Calculator();
                    calculator.calculate();
                }
                else if(option==2)
                {
                    Scientific scientific = new Scientific();
                    scientific.Operation();
                }
            } catch (ArithmeticException ae) {
                //TODO: handle exception
                System.out.println("Wrong Choice");
            }
        } while(option<3);
    }    
}
class Calculator
{
    Scanner sc=new Scanner(System.in);
    int choice;
    float a,b,sum,dif,pr,q,m;
    void calculate()
    {
        do{
            System.out.println("Operation Menu");
            System.out.println(" 1 - Addition"+"\n"+" 2 - Subtraction"+"\n"+" 3 - Multiplication"+"\n"+" 4 - Division"+"\n"+" 5 - Modulo "+"\n"+" 6 - Back to Operation Menu");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : {System.out.println("Enter the first number");
                         a=sc.nextFloat();
                         System.out.println("Enter the second number");
                         b=sc.nextFloat();
                         sum=a+b;
                         System.out.println("Sum of "+a+" and "+b+" is "+sum);
                         break; }
                case 2 :{System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        dif=a-b;
                        System.out.println("Difference of "+a+" and "+b+" is "+dif);
                        break;}
                case 3 :{System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        pr=a*b;
                        System.out.println("Product of "+a+" and "+b+" is "+pr);
                        break;}
                case 4 :{
                        System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        if(b==0){throw new ArithmeticException();}
                        q=a/b;
                        System.out.println("Quotient of "+a+" and "+b+" is "+q);
                        break ; }
                case 5 :{
                        System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        if(b==0){throw new ArithmeticException();}
                        m=a%b;
                        System.out.println("Modulos of "+a+" and "+b+" is "+m);
                        break ; }
            }
        }while(choice<6);
    }
}
class Scientific
{
    Scanner scan = new Scanner(System.in);
    double a , b , result;
    int ch;
    void Operation()
    {
        do
        {
            System.out.println("Operation Menu");
            System.out.println(" 1 - Ceil"+"\n"+" 2 - Floor"+"\n"+" 3 - Square Root"+"\n"+" 4 - Power"+"\n"+" 5 - Back to menu");
            try{
            ch = scan.nextInt();
            switch(ch)
            {
                case 1 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new ArithmeticException();}
                    result = Math.ceil(a);
                    System.out.println("Ceil value of "+a+" is "+result);
                    break;
                }
                case 2 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new ArithmeticException();}
                    result = Math.floor(a);
                    System.out.println("Floor value of "+a+" is "+result);
                    break;
                }
                case 3 :
                {
                    System.out.println("Enter the number");
                    a=scan.nextDouble();
                    if(a<=0) {throw new ArithmeticException();}
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
                    if(a<=0 || b<=0) {throw new ArithmeticException();}
                    result = Math.pow(a , b);
                    System.out.println(+a+"to the power of "+b+" is "+result);
                    break;
                }
            }
            }
            catch(ArithmeticException ae){
                System.out.println("Number < = 0");
            }
        } while(ch<5);
    }
}