class Solution {
    public double[] convertTemperature(double celsius) {
        final double KELVIN_OFFSET = 273.15;
        final double F_MULTIPLER = 9.0/5;
        final double F_OFFSET = 32.0;
        return new double[]{celsius + KELVIN_OFFSET, celsius * F_MULTIPLER + F_OFFSET};
    }
}