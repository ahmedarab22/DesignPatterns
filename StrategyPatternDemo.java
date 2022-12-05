package com.designPatterns.strategy;
public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10,5));
		
		 context = new Context(new OperationSubtraction());
		System.out.println("10 - 5 = " + context.executeStrategy(10,5));
		
		 context = new Context(new OperationMultiplication());
		System.out.println("10 * 5 = " + context.executeStrategy(10,5));
		
		//context = new Context(new OperationSubtraction());
		//System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	}

}
