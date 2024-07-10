class Solution {
    public double myPow(double x, int n) {
         return myPow(x, (long) n);
    }

    private double myPow(double x, long n) {
    if (n == 0) {
        return 1;
    }
    if (n < 0) {
        return myPow(1 / x, -n);
    }
    
    double halfPower = myPow(x, n / 2);
    double halfPowerSquare = halfPower * halfPower;
    
    if (n % 2 != 0) {
        return x * halfPowerSquare;
    }
    return halfPowerSquare;
}
}