package com.devsuperior.services;


import com.devsuperior.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService  {


    private TaxService taxService;
    private PensionService pensionService;


    public SalaryService( TaxService taxService, PensionService pensionService) {
        this.pensionService = pensionService;
        this.taxService = taxService;
    }

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }



}
