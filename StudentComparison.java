import java.util.*;
import java.util.Scanner;
class StudentComparison
{
	String [] Fname;
	String [] Lname;
	int [] id;
	int n;
	int i;
	double [] totalscore;
	double [][] score;
}
class Mathstudent extends Student
{
	double calculusScore = score[i][1];
	double statScore = score[i][2];
	double [] total = new double[n+1];

    void double calculateScore(double calculusScore,double statScore,double [] total)
	{
		total[1]+ = calculusScore+statScore);
		return total[1];
	}
	return this.totalscore[1] = total[1]; 
	
}
class Comstudent extends Student
{
	double programmingScore = this.score[i][1];
	double algorithmScore = this.score[i][2];

	void double calculateScore(double programmingScore,double algorithmScore)
	{
		total[2]++ = programmingScore+algorithmScore;
		return total[2];
	}
	return this.totalscore[1] = total[1]; 
	
}
public class StudentComparison
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner( System.in );
		System.out.print("Data size (1-500) = "); int n = sc.nextInt();
		if(n>500) System.out.println("Error");
		else
			
		int [] id = new int[n+1][n+1];
		String [] Fname = new String[n+1];
		String [] Lname = new String[n+1];
		String [] Department = new String[n+1];
		double [][] score = new double[n+1][n+1];
		double [] totalscore = new double[n+1];
		String a ="Math";
		for(int i=1;i<=n;i++)
		{
		System.out.print("\nStudent's id number = ");id[i] = sc.nextInt();
		System.out.print("]nFirstname = ");Fname[i] = sc.nextLine();
		System.out.print("\nLastname = ");Lname[i] = sc.nextLine();
		System.out.print("\nDepartment (Math or Com) = ");Department[i] = sc.nextLine();
		
		if(Department.equals(a))
			{
			System.out.print("\nScore_Calculus = "); score[i][1] = sc.nextDouble();
		    System.out.print("\nScore_Stat = "); score[i][2] = sc.nextDouble();
			Mathstudent m = new Mathstudent(Fname,Lname,id,n,i,totalscore,score);
			
			}
		else
			{
			System.out.print("\nScore_Programming = "); score[i][1] = sc.nextDouble();
		    System.out.print("\nScore_algorithm = "); score[i][2] = sc.nextDouble();
			Comstudent(Fname,Lname,id,n,i,totalscore,score);
			
			}
		}
		totalscore[1] = totalscore[1]/n;
	        totalscore[2] = totalscore[2]/n;
		System.out.println("\nMathstudent(x)/Comstudent(y)  = "+totalscore[1]+"/"+totalscore[2]);
	}
}
