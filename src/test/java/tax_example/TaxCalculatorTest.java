package tax_example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tax_example.taxcalculations.AmericanTaxCalculation;
import tax_example.taxcalculations.BelgianTaxCalculation;
import tax_example.taxcalculations.FrenchTaxCalculation;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A Taxcalculator")
class TaxCalculatorTest {

    private TaxCalculator taxCalculator;

    @Nested
    @DisplayName("provided with a Belgian tax calculation")
    class WhenBelgianTaxCalculator {

        @BeforeEach
        void instantiateTaxCalculator() {
            taxCalculator = new TaxCalculator(new BelgianTaxCalculation());
        }

        @Test
        @DisplayName("correctly calculate taxes")
        void calculatesTaxes() {
            double calculatedTaxes = taxCalculator.calculateTaxesForIncome(23000);
            assertEquals(calculatedTaxes, 10350);
        }

    }

    @Nested
    @DisplayName("provided with a American tax calculation")
    class WhenAmericanTaxCalculator {

        @BeforeEach
        void instantiateTaxCalculator() {
            taxCalculator = new TaxCalculator(new AmericanTaxCalculation());
        }

        @Test
        @DisplayName("correctly calculate taxes")
        void calculatesTaxes() {
            double calculatedTaxes = taxCalculator.calculateTaxesForIncome(23000);
            assertEquals(calculatedTaxes, 5090);
        }

    }

    @Nested
    @DisplayName("provided with a French tax calculation")
    class WhenFrenchTaxCalculator {

        @BeforeEach
        void instantiateTaxCalculator() {
            taxCalculator = new TaxCalculator(new FrenchTaxCalculation());
        }

        @Test
        @DisplayName("correctly calculate taxes")
        void calculatesTaxes() {
            double calculatedTaxes = taxCalculator.calculateTaxesForIncome(23000);
            assertEquals(calculatedTaxes, 11040);
        }

    }

}