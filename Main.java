package main;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Math.round(integral(0, 10, 1000000)));
	}
	
	public static double f(double x) {
		return x; //f(x) = x
	}
	
	public static double integral(double min, double max, int clarity) {
		double area = 0;
		double deltaX = ((max - min)/clarity);
		for(int i = 0; i < clarity; i++) {
			area += deltaX * f(min + i*deltaX);
		}
		return area;
	}

}