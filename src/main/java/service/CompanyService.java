package service;

import com.headhunter.entity.Company;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CompanyService {

    List<Company> findAllCompany();

    Company findCompanyById(Long id);

    Company addCompany(Company company);

    void deleteCompany(Long id);
}
