public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Check input data!");
        }

        return purchaseAmount - (purchaseAmount * (float)discountAmount/100);
    }
}
