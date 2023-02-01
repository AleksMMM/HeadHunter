package service.impl;

import com.headhunter.entity.Company;
import com.headhunter.repository.CompanyRepo;
import org.springframework.stereotype.Service;
import service.CompanyService;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepo companyRepo;

    public CompanyServiceImpl(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }


    @Override
    public List<Company> findAllCompany() {
        return companyRepo.findAll();
    }

    @Override
    public Company findCompanyById(Long id) {
        if (id == null) {
            return new Company();
        }
        if (companyRepo.findById(id).isPresent()) {
            return companyRepo.findById(id).get();
        }
        return new Company();
    }

    @Override
    public Company addCompany(Company company) {

        if (!company.equals(new Company())) {
            companyRepo.save(company);
        }
        return company;
    }
    @Override
    public void deleteCompany(Long id) {
        companyRepo.deleteById(id);
    }
}
