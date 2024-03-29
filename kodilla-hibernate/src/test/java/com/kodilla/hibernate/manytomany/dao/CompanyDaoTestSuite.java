package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Test
    void testSameManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId  = softwareMachine.getId();
        companyDao.save(greyMatter);
        int greyMatterId  = softwareMachine.getId();
        //Then
        assertNotEquals(0,softwareMachineId);
        assertNotEquals(0,dataMaestersId);
        assertNotEquals(0,greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            companyDao.deleteById(softwareMachineId);
        }catch (Exception e){

        }
    }

    @Test
    void testQueryEmployee(){
        //Given
        Employee employee = new Employee("Lara","Smith");
        employeeDao.save(employee);
        //When
        List<Employee> allSmith = employeeDao.retrieveAllSmith();
        //Then
        assertEquals(20,allSmith.size());
        //CleanUp
        employeeDao.deleteById(employee.getId());
    }

    @Test
    void testNativeQueryCompany(){
        //Given
        Company company = new Company("Software GID");
        companyDao.save(company);
        //When
        List<Company> companiesStartSoft = companyDao.retrieveAllCompaniesWhoStartsSoft();
        //Then
        assertEquals(21,companiesStartSoft.size());
        //CleanUp
    }
}
