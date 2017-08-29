package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		current = current + commonDifference; 
		if(this.firstValueComplete==0)
			throw new IllegalStateException("Must call firstValue() before calling nextvalue()");
		return current;
	}
	
	public String toString(){
		
		return "Arith("+this.firstValue()+","+commonDifference+")";
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
		double value = this.firstValue(); 
		double answer=0;
		answer= value+(n*this.commonDifference);
		return answer; 	
	}
}
