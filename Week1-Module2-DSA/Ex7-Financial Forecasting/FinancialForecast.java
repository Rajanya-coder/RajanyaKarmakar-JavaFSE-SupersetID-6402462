public class FinancialForecast {
    public static double calculateFutureValue(double initialAmount, double rate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        // Recursive case
        return calculateFutureValue(initialAmount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;     // Initial amount
        double annualGrowthRate = 0.08;         // 8% growth rate
        int forecastYears = 5;                  // Forecast for 5 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value after %d years = %.2f\n", forecastYears, futureValue);
    }
}
