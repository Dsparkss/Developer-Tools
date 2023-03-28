package Oopsbankaccount;

public class SimpleCalculator {
	

	    
	    double firstNumber;
	    double secondNumber;
	    
	    public double getFirstNumber(){
	        return firstNumber;
	    }
	    
	    public double getSecondNumber(){
	        return secondNumber;
	    }
	    
	    public void setFirstNumber(double firstNumber){
	        this.firstNumber = firstNumber;
	    }
	    
	    public void setSecondNumber(double secondNumber){
	        this.secondNumber = secondNumber;
	    }
	    
	    public double getAdditionResult(){
	        
	        double add = firstNumber + secondNumber ;
	        return add;
	        
	    }
	    
	    public double getSubtractionResult (){
	        
	        double sub = firstNumber - secondNumber ;
	        return sub;
	    }
	    
	    public double getMultiplicationResult(){
	        double multi = firstNumber * secondNumber;
	        return multi;
	    }
	    
	    public double getDivisionResult(){
	        
	        if(secondNumber == 0){
	            return 0;
	        }else{
	        double divi = firstNumber / secondNumber ;
	            return divi;
	        }
	    }
	    
	    public static void main(String[] args) {
	    	SimpleCalculator calculator = new SimpleCalculator();
	    	calculator.setFirstNumber(5.0);
	    	calculator.setSecondNumber(4);
	    	System.out.println("add= " + calculator.getAdditionResult());
	    	System.out.println("subtract= " + calculator.getSubtractionResult());
	    	calculator.setFirstNumber(5.25);
	    	calculator.setSecondNumber(0);
	    	System.out.println("multiply= " + calculator.getMultiplicationResult());
	    	System.out.println("divide= " + calculator.getDivisionResult());
	    }
	        
	       
	    
	

}
