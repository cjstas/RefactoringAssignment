import java.util.HashMap;

public class InsuranceCalculator {

    private InsuranceStrategy strategy;
    private HashMap<Double, InsuranceStrategy> map = new HashMap<Double, InsuranceStrategy>();

    public double calculateInsurance(double income) {
        double adjustedIncome = Math.ceil(income/10000);

        map.put(1.0, new InsuranceStrategyLow());
        map.put(2.0, new InsuranceStrategyMedium());
        map.put(3.0, new InsuranceStrategyMedium());
        map.put(4.0, new InsuranceStrategyHigh());
        map.put(5.0, new InsuranceStrategyHigh());
        map.put(6.0, new InsuranceStrategyHigh());
        strategy = map.getOrDefault(adjustedIncome, new InsuranceStrategyVeryHigh());
        return strategy.calculate(income);
    }


}
