package main;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(integral(0, 10, 1000));
	}
	
	public static double f(double x) {
		return x; //f(x) = x
	}
	
	public static double integral(double min, double max, int clarity) {
		double area = 0;
		double width = ((max - min)/clarity);
		double height;
		for(int i = 0; i < clarity; i++) {
			height = ((f(min + i * width) + f(min + (i+1) * width)) / 2); //take average height between interval
			area += (width * height);
		}
		return area;
	}
}
