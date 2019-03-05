package calculatrice;


public class calcNormal {

	public calcNormal() {
	}
	
	public static double add(double val1, double val2) {
		org.apache.commons.math3.analysis.function.Add add = new org.apache.commons.math3.analysis.function.Add();
		return add.value(val1, val2);
	}
	
	public static double mul(double val1, double val2) {
		org.apache.commons.math3.analysis.function.Multiply mul = new org.apache.commons.math3.analysis.function.Multiply();
		return mul.value(val1, val2);
	}

}
