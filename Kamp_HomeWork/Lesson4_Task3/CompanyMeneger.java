package Lesson4_Task3;

public class CompanyMeneger implements CompanyService{

    @Override
    public void addCompany(Company company) {
        System.out.println(company.getName()+" Adli Kompaniya Elave Olundu");
    }

    @Override
    public void deleteCompany(Company company) {
        System.out.println(company.getName()+" Adli Kompaniya Silindi");
    }

    @Override
    public void updateCompany(Company company) {
        System.out.println(company.getName()+" Adli Kompaniya Yeniləndi");
    }
}
