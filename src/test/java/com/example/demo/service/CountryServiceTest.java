package com.example.demo.service;

import com.example.demo.SpringBootMybatisApplication;
import com.example.demo.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Import(SpringBootMybatisApplication.class)
public class CountryServiceTest {

    @Autowired
    private CountryService countryService;


    @Autowired
    private DataSource dataSource;

    @Test
    public void getAll() {
        List<Country> all = countryService.getAll(new Country());
        System.out.println("================"+all);
        System.out.println("============"+dataSource);
    }
}