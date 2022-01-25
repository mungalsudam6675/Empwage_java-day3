class Uc3{
	public static void main(String [] a){

		int wagePerHr=20;

		int isPartTime=1;

		double empCheck=Math.floor(Math.random() * 2);

		if(empCheck == 1){

			int dailyWage=(8*wagePerHr);

			System.out.println("Daily wage = "+dailyWage);

		}

		else{

			int dailyWage = (4*wagePerHr);

                        System.out.println("Daily wage = "+dailyWage);

		}

	}

}

