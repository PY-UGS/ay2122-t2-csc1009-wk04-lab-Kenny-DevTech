package Q1;

public class BMI {

	final static double POUND_TO_KG = 0.45359237;
	final static double INCH_TO_METER = 0.0254;

	private double height, weight;

	public BMI() {
	}

	public BMI(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI(){

		double BMI = (weight * POUND_TO_KG) / Math.pow((height * INCH_TO_METER), 2);

		return BMI;
	}

	public String interpretationOfBMI(double BMI) {

		String interpretationOutput;

		if(BMI < 18.5){
			interpretationOutput = "Underweight";
		}else if(BMI < 25){
			interpretationOutput = "Normal";
		}else if(BMI < 30){
			interpretationOutput = "Overweight";
		}else {
			interpretationOutput = "Obese";
		}

		return interpretationOutput;
	}

	public void printOutput(){

		double BMI = calculateBMI();
		String interpretationOutput = interpretationOfBMI(BMI);
		System.out.println("BMI is " + BMI);
		System.out.println(interpretationOutput);
	}
}
