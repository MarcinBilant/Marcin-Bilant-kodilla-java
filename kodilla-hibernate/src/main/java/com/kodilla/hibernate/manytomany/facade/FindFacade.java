package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindFacade {
    @Autowired
    private CompanyDao companies;
    @Autowired
    private EmployeeDao employees;

    public List<Company> findCompanies(String text) {
        return companies.findByText("%" + text + "%");
    }

    public List<Employee> findEmployess(String text) {
        return employees.findByText("%" + text +"%");
    }
}
