public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 105600;
    }
    @Override
    public double getWeight() {
        return 0.02;
    }
    @Override
    public int getAdjustment() {
        return 60000;
    }
    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

}