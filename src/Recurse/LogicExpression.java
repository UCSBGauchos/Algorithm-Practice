package Recurse;

public class LogicExpression {
	public int function(String expression, boolean result, int start, int end){
		int previousNum = 0;
		if(expression == null){
			return 0;
		}else{
			if(start == end){
				if(result == true && expression.charAt(start) == '1'){
					return 1;
				}else if(result == false && expression.charAt(start) == '0'){
					return 1;
				}
			}else if(result == true){
				int currentNum = 0;
				for(int i=start+1; i<=end; i = i+2){
					if(expression.charAt(i) == '&'){
						currentNum = currentNum + function(expression, true, start, i-1)*function(expression, true, i+1, end);
					}else if(expression.charAt(i) == '|'){
						currentNum = currentNum + function(expression, true, start, i-1)*function(expression, false, i+1, end);
						currentNum = currentNum + function(expression, false, start, i-1)*function(expression, true, i+1, end);
						currentNum = currentNum + function(expression, true, start, i-1)*function(expression, true, i+1, end);
					}
				}
				previousNum = currentNum;
			}else if(result == false){
				int currentNum = 0;
				for(int i=start+1; i<=end; i=i+2){
					if(expression.charAt(i) == '&'){
						currentNum = currentNum + function(expression, false, start, i-1)*function(expression, false, i+1, end);
						currentNum = currentNum + function(expression, true, start, i-1)*function(expression, false, i+1, end);
						currentNum = currentNum + function(expression, false, start, i-1)*function(expression, true, i+1, end);
					}else if(expression.charAt(i) == '|'){
						currentNum = currentNum + function(expression, false, start, i-1)*function(expression, false, i+1, end);
					}
				}
				previousNum = currentNum;
			}
			return previousNum;
		}
	}
	
	public static void main(String [] args){
		LogicExpression logic = new LogicExpression();
		String expression = "0&0|0|0|1";
		int number = logic.function(expression, true, 0, expression.length()-1);
		System.out.println(number);
	}
}
