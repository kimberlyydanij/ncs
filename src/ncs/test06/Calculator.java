package ncs.test06;

public class Calculator {
	double sum;
	
	public Calculator() {
		
	}

	public Calculator(double sum) {
	
		this.sum = sum;
	}

	public double getSum(int data) {
		sum =0.0;
		if(!(data>=2 && data<=5)) {
			System.out.println(InvalidException.getMessage());
			System.exit(0);
		}
		else {
		for(int i=0;i<=data;i++) 
			sum += (double)i; 
		} //end if
		   return sum; 
		} // end getSum()
		
	} // end class




