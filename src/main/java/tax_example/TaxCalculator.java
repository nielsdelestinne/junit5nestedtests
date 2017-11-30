package tax_example;


import tax_example.taxcalculations.TaxCalculationStrategy;

public class TaxCalculator {

    private TaxCalculationStrategy taxCalculationStrategy;

    public TaxCalculator(TaxCalculationStrategy taxCalculationStrategy) {
        this.taxCalculationStrategy = taxCalculationStrategy;
    }

    public void swapTaxCalculationStrategy(TaxCalculationStrategy taxCalculationStrategy) {
        this.taxCalculationStrategy = taxCalculationStrategy;
    }

    public double calculateTaxesForIncome(double yearlyIncome) {
        return taxCalculationStrategy.calculateTaxes(yearlyIncome);
    }
}
