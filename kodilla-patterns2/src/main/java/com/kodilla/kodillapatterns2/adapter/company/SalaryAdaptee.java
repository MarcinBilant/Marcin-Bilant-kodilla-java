package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.SalaryProcesor;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.Callable;

public class SalaryAdaptee implements SalaryProcesor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
