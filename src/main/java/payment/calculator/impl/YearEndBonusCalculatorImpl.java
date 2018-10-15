package payment.calculator.impl;

import java.math.BigDecimal;

import employee.model.Employee;
import payment.calculator.YearEndBonusCalculator;

public class YearEndBonusCalculatorImpl implements YearEndBonusCalculator {
    
    @Override
    public BigDecimal getYearEndBonus(Employee employee, BigDecimal salary) {
        // TODO: Implement this method with logic:
        // Employees, that are employed longer than 3 years receives year end
        // bonus -> 20% of salary
        // Employees, that are employed longer than 5 years receives year end
        // bonus -> 30% of salary
        // Employees, that are employed longer than 8 years receives year end
        // bonus -> 50% of salary
        // Self-employed employees receive nothing!
        throw new RuntimeException("Not implemented yet!");
    }
    
}
