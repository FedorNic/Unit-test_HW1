package Code.Home_work.Calculator;

public class Calculator {

    /***
     * Метод вычисления суммы покупки со скидкой
     * @param purchaseAmount - сумма покупки
     * @param discountAmount - размер скидки (gecnm ,eltn d ghjwtynf[)
     * @return - сумма покупки со скидкой
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        return purchaseAmount-((purchaseAmount*discountAmount)/100);
    }
}