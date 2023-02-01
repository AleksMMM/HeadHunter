package com.headhunter.controller;

import com.headhunter.entity.Company;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CompanyService;
import service.impl.CompanyServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class ControllerHh {

    private final CompanyService companyService;

//    public ControllerHh(CompanyServiceImpl companyServiceImpl) {
//        this.companyService = companyServiceImpl;
//    }


    @GetMapping
    public List<Company> findAllCompany() {
        return companyService.findAllCompany();
    }

}
