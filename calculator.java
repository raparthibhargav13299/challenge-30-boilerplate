import java.util.Scanner;

public class calculator
 {
int option;
float a,b,s,d,mul,div,mod;

int x,z,y;
Scanner sc=new Scanner(System.in);
void calculate()
{

   
    do{
 
        System.out.println("Operation Menu");
        System.out.println(" 1 - Addition"+"\n"+" 2 - Subtraction"+"\n"+" 3 - Multiplication"+"\n"+" 4 - Division"+"\n"+" 5 - Modulo "+"\n"+" 6 - Back to Operation Menu");
        option = sc.nextInt();
        switch(option)
        {
            case 1 : {

                System.out.println("Enter 1 for integer addition, 2 for decimal addition");
                    d=sc.nextInt();
if(d==1){
                System.out.println("Enter the first number");
                     x=sc.nextInt();
                     System.out.println("Enter the second number");
                     y=sc.nextInt();
                     z=x+y;
                     System.out.println("Sum of "+x+" and "+y+" is "+z);
                     break; 
                    }
                    else if(d==2){
                        System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        s=a+b;
                        System.out.println("Sum of "+a+" and "+b+" is "+s);
                        break; 



                    }
                }
            case 2 :{
                System.out.println("Enter 1 for integer subtraction, 2 for decimal subtraction");
                    d=sc.nextInt();
if(d==1){
                System.out.println("Enter the first number");
                     x=sc.nextInt();
                     System.out.println("Enter the second number");
                     y=sc.nextInt();
                     z=x-y;
                     System.out.println("Subtraction  of "+x+" and "+y+" is "+z);
                     break; 
                    }
                    else if(d==2){
                        System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        s=a+b;
                        System.out.println("Subtraction  of "+a+" and "+b+" is "+s);
                        break; 



                    }
                }





            case 3 :{
                System.out.println("Enter 1 for integer mutiplication, 2 for decimal multiplication");
                    d=sc.nextInt();
if(d==1){
                System.out.println("Enter the first number");
                     x=sc.nextInt();
                     System.out.println("Enter the second number");
                     y=sc.nextInt();
                     z=x*y;
                     System.out.println("Multipication  of "+x+" and "+y+" is "+z);
                     break; 
                    }
                    else if(d==2){
                        System.out.println("Enter the first number");
                        a=sc.nextFloat();
                        System.out.println("Enter the second number");
                        b=sc.nextFloat();
                        s=a*b;
                        System.out.println("Multipication  of "+a+" and "+b+" is "+s);
                        break; 



                    }
                }









            case 4 :{
                   
                System.out.println("Enter 1 for integer Division, 2 for decimal Division");
                d=sc.nextInt();
if(d==1){
            System.out.println("Enter the first number");
                 x=sc.nextInt();
                 System.out.println("Enter the second number");
                 y=sc.nextInt();
                 z=x/y;
                 System.out.println(" Division  of "+x+" and "+y+" is "+z);
                 break; 
                }
                else if(d==2){
                    System.out.println("Enter the first number");
                    a=sc.nextFloat();
                    System.out.println("Enter the second number");
                    b=sc.nextFloat();
                    s=a/b;
                    System.out.println(" Division  of "+a+" and "+b+" is "+s);
                    break; 



                }
            }






                  
            case 5 :{
                   
                System.out.println("Enter 1 for integer Modulo, 2 for decimal Modulo");
                d=sc.nextInt();
if(d==1){
            System.out.println("Enter the first number");
                 x=sc.nextInt();
                 System.out.println("Enter the second number");
                 y=sc.nextInt();
                 z=x%y;
                 System.out.println(" Modulo  of "+x+" and "+y+" is "+z);
                 break; 
                }
                else if(d==2){
                    System.out.println("Enter the first number");
                    a=sc.nextFloat();
                    System.out.println("Enter the second number");
                    b=sc.nextFloat();
                    s=a%b;
                    System.out.println(" Modulo  of "+a+" and "+b+" is "+s);
                    break; 



                }
            }






        }
    }
    
    while(option<6);
}
}

    

