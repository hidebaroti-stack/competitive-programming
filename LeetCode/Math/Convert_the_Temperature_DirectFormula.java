class Solution {
    public double[] convertTemperature(double celsius) {
        double fahrenheit = celsius * (9.0/5) + 32;
        double kelvin = celsius + 273.15;
        return new double[]{kelvin, fahrenheit};
    }
}