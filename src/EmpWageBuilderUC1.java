public class EmpWageBuilderUC1 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	/*public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 100;
	*/
			
 public static int compute(String company ,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)
 {
	int empHrs = 0, empWage = 0, totalEmpWage = 0;
	for (int day = 0; day < NUM_OF_WORKING_DAYS; day++)
	{
	 int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	
	 switch (empCheck)
	 {
	 case IS_PART_TIME:
	 empHrs = 4;
	 break;
	
	 case IS_FULL_TIME:			
	 empHrs = 8;
	 break;
	
	 default:
	 empHrs = 0;
	
	}
	 
	empWage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpWage += empWage;
	//System.out.println("Emp Wage: " + empWage);
	}
	
	return totalEmpWage;

 }

 public static void main(String[] args) 
 {
	compute("Tesla",20, 2, 100 );
	compute("Jio",10, 4, 100 ); 
 }	


}