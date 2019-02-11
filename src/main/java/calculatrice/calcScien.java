package calculatrice;

import org.apache.commons.math3.*;

public class calcScien {

	public calcScien() {
		
	}

	public static double ArcCosinus(double value) {
		org.apache.commons.math3.analysis.function.Acos acos = new org.apache.commons.math3.analysis.function.Acos();
		return acos.value(value);
	}
	
	public static double RacineCarree(double value) {
		org.apache.commons.math3.analysis.function.Sqrt sqrt = new org.apache.commons.math3.analysis.function.Sqrt();
		return sqrt.value(value);
	}
}
