import java.util.Scanner;

class Emp
{
    private int SSN;
    private String Ename,DOB;
    private int sal;
/**
 * @param SSN
 * @param sal
 * @param Ename
 * @param DOB
 */
Emp(int SSN,int sal,String Ename,String DOB)
{
    this.SSN=SSN;
    this.sal=sal;
    this.Ename=Ename;
    this.DOB=DOB;

}
/**
 * 
 */
void printdata()
{
    System.out.println(SSN+"\t"+sal+"\t"+Ename+"\t"+DOB);
}
}



public class j4 { 
    public static void main(String[] args) {
        Emp [] e=new Emp[4];
        Scanner sc=new  Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter SSN ");
            int SSN=sc.nextInt();
            System.out.println("Employee salary");
            int sal=sc.nextInt();
            System.out.println("Enter employee name");
            String Ename=sc.next();
            System.out.println("Employee DOB");
            String DOB=sc.next();
            e[i]=new Emp(SSN, sal, Ename, DOB);
        }
        System.out.println("\n Employee information");
        for(int i=0;i<4;i++)
        {
            e[i].printdata();
        }


    
}


    }
    
    

