package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue()throws IllegalStateException {
		current = current * commonFactor;
		if(this.firstValueComplete==0)
			throw new IllegalStateException("Must call firstValue() before");
		return current;
	}
	
	public String toString(){
		
		return "Geom("+this.firstValue()+","+commonFactor+")";
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
		double value = this.firstValue(); 
		double answer=0;
		answer= value*(Math.pow(this.commonFactor, n-1));
		return answer; 	
	}

	

}
