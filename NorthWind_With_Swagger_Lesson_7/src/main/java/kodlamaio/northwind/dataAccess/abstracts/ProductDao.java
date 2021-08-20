package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}

//Bazı mimarilerde domain design architecture denilen DATA ACCESS
//Persistence Layer -> datayı persist etmek yani kalıcı hale getirmek için veri tabanı kulllanıyoruz
//persistance = süreklilik , devamlılık /// persist = sürdürmek
//Kısaca veri erişim işlerini Data Access Katmanı ile yapıyoruz
//Javada sıklıkla kullanılan Dao isimlendirmesiyle ProductDao interface oluşturuldu.
//ProductDao da JpaRepository isimli başka bir interface extends ederek CRUD işlemlerini yapmamızı sağlıyor.
//CRUD = Create Read Update Delete işlemleri
//JpaRepository her nesne için çalışabilecek yapıya sahip
//Bu sınıf <Product, Integer> generic yapısına sahip 
//Yani ben Product sınıfı için çalışıyorum ve primary key alanımın veri tipi integer diye belirtiyorsun	
