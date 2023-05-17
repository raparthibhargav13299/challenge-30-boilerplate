import java.util.Scanner;

public class ch300 
{
    public static void main(String[] args) 
    {
        int opt = 0;
        Scanner scan = new Scanner(System.in);  
        do
        {
            System.out.println("Welcome to main Menu");
            System.out.println("1 . Mathematical Calculation"+"\n"+"2 . Scientific Calculation"+"\n"+"3 . Exit");
            try {
                opt = scan.nextInt();
                if(opt==3) {throw new Exception();}
               
               else  if(opt==1)
                {
                    calculator calc =new calculator();
                    calc.calculate();
                }
                else if(opt==2)
                {
                   sci so = new sci();
                    so.operation();
                }
            } 
            catch (Exception e) {
            if(opt==3)
            {
                System.out.println("Wrong Choice");
                e.printStackTrace();
            }
        }
          




           
        } 
        while(opt<3);
    }    





    }

