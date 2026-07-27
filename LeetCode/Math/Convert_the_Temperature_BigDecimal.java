import java.math.BigDecimal;
import java.math.RoundingMode;
class Solution {
    public double[] convertTemperature(double celsius) {
        BigDecimal c = BigDecimal.valueOf(celsius);
        BigDecimal kelvin = c.add(BigDecimal.valueOf(273.15));
        BigDecimal fahrenheit = c.multiply(BigDecimal.valueOf(9.0/5)).add(BigDecimal.valueOf(32.0));
        return new double[]{kelvin.doubleValue(), fahrenheit.doubleValue()};
    }
}