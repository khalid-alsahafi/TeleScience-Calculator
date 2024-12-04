package telesci.calculator;

public class TeleSciCalculator {

    static double inX1, inY1, destX, destY, outX1, outX2, outY1, outY2, resultX, resultY, mx, my, cx, cy;
    
    public static void main(String[] args) {
	mx = calcMultiplier(outX1, outX2);
	my = calcMultiplier(outY1, outY2);

	cx = calcConstant(outX1, inX1, mx);
	cy = calcConstant(outY1, inY1, my);

	resultX = calcDestCord(destX, cx, mx);
	resultY = calcDestCord(destY, cy, my);

	new CalculatorGUI().setVisible(true);
    }
    
    static double calcMultiplier(double x1, double x2) {
        return x2 - x1;
    }
    static double calcConstant(double outX1, double inX1, double mx) {
	return outX1 - inX1 * mx;
    }
    static double calcDestCord(double outX, double cx, double mx) {
	    return (outX - cx) / mx;
    }
}
