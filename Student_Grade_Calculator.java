import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		System.out.print("Student Grade Calculator by ABHAY VERMA");
		System.out.print("\n");
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter the "+(i+1)+"subject marks:");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/5;
        
        System.out.print("The total marks of student: ");
        System.out.print(total);
        System.out.print("\n");
        System.out.print("The student Grade is: ");
        
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}