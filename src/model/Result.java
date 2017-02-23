package model;

public class Result {
	private int id;
	private float firstNumber;
	private float secondNumber;
	private String calculation;
	private double result;

	public Result() {

	}
	

	public Result(float firstNumber, float secondNumber, String calculation, double result) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.calculation = calculation;
		this.result = result;
	}
	
	


	public Result(int id, float firstNumber, float secondNumber, String calculation, double result) {
		this.id = id;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.calculation = calculation;
		this.result = result;
	}


	public String getCalculation() {
		return calculation;
	}

	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}
//
//	public Result(float firstNumber, float secondNumber, double result) {
//		this.firstNumber = firstNumber;
//		this.secondNumber = secondNumber;
//		this.result = result;
//	}
//
//	public Result(int id, float firstNumber, float secondNumber, double result) {
//		this.id = id;
//		this.firstNumber = firstNumber;
//		this.secondNumber = secondNumber;
//		this.result = result;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}

	public float getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
