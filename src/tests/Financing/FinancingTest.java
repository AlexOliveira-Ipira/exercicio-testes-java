package tests.Financing;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.Factory.FinancingFactory;

public class FinancingTest {
    @Test
    public void constructorShouldCreateObjectWhenValidData() {

        double expectedTotalAmount = 100000.0;
        double expectedIncome = 2000.0;
        Integer expectedMonths = 80;

        Financing finance = FinancingFactory.createFinancing(expectedTotalAmount, expectedIncome, expectedMonths);

        Assertions.assertEquals(expectedTotalAmount, finance.getTotalAmount());
        Assertions.assertEquals(expectedIncome, finance.getIncome());
        Assertions.assertEquals(expectedMonths, finance.getMonths());
    }

    @Test
    public void constructorShouldThrowExceptionWhenInvalidData() {

        double expectedTotalAmount = 100000.0;
        double expectedIncome = 2000.0;
        Integer expectedMonths = 20;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FinancingFactory.createFinancing(expectedTotalAmount, expectedIncome, expectedMonths);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double newTotalAmount = 90000.0;

        Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

        finance.setTotalAmount(newTotalAmount);

        Assertions.assertEquals(newTotalAmount, finance.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowExceptionWhenInvalidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double newTotalAmount = 110000.0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
            finance.setTotalAmount(newTotalAmount);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double newIncome = 2100.0;

        Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

        finance.setIncome(newIncome);

        Assertions.assertEquals(newIncome, finance.getIncome());
    }

    @Test
    public void setIncomeShouldThrowExceptionWhenInvalidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double newIncome = 1900.0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
            finance.setIncome(newIncome);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        Integer newMonths = 81;

        Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

        finance.setMonths(newMonths);

        Assertions.assertEquals(newMonths, finance.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenInvalidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        Integer newMonths = 79;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);
            finance.setMonths(newMonths);
        });
    }

    @Test
    public void entryShouldGetEntryWhenValidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double expectedEntry = 20000.0;

        Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

        Assertions.assertEquals(expectedEntry, finance.entry());
    }

    @Test
    public void quotaShouldGetQuotaWhenValidData() {

        double initialTotalAmount = 100000.0;
        double initialIncome = 2000.0;
        Integer initialMonths = 80;
        double expectedQuota = 1000.0;

        Financing finance = FinancingFactory.createFinancing(initialTotalAmount, initialIncome, initialMonths);

        Assertions.assertEquals(expectedQuota, finance.quota());
    }
}
