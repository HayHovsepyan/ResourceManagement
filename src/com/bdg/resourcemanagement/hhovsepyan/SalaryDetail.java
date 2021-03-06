package hhovsepyan;

public final class SalaryDetail {
    private double salaryAmount;
   private SalaryType  salaryType;
    private String cardNumber;

    public SalaryDetail(final double amount, String cardNumber) {

        this.salaryAmount = amount;

        this.cardNumber = cardNumber;

        this.salaryType = SalaryType.CARD;

    }



    public SalaryDetail(final double amount) {

        this.salaryAmount = amount;

        this.salaryType = SalaryType.CASH;

        this.cardNumber = null;

    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "SalaryDetail{" +
                "salaryAmount=" + salaryAmount +
                ", salaryType=" + salaryType +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
