class Uc6 {
public static void main(String [] a){
        int isPartTime=1;
        int isFullTime=2;
        int maxRateInMonth=100;
        int empRatePerHr=20;
        int numOfWorkingDays=20;
        int totalEmpHr=0;
        int totalWorkingDays=0;
        int empHrs;
while ( totalEmpHr < maxRateInMonth
&& totalWorkingDays < numOfWorkingDays )
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
