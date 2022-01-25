class Uc5 {
	public static void main(String [] a){
        	int isPartTime=1;
        	int isFullTime=2;
        	int empRatePerHr=20;
        	int numOfWorkingDays=20;
		int totalWorkingDays =1;
        	int totalEmpHr=0;
        	int empHrs;
	while ( totalWorkingDays < numOfWorkingDays)
	{
        	totalWorkingDays++;
        	double num = Math.floor( Math.random() * 3 );
        	int x = (int) num;
                switch(x){
                	case 0:
                         	empHrs = 4;
                        	break;
                        case 1:
                        	empHrs = 8;
                        	break;
                        default :
                        	empHrs = 0;
                        break;

		}
		totalEmpHr=totalEmpHr + empHrs;
	}

	int totalSalary = totalEmpHr * empRatePerHr;
	System.out.println("Tatal Wage = " +totalSalary);
	}
}
