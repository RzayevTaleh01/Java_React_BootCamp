package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind")).build();
	}

}
/*Bean sınıfını genellikle configuration amaçlı kullanırız
 Projeyi çalıştırıp java derlendiğinde program @Bean'i gördüğü zaman
 belleğe yerleştiriyor ve Docket nesnesi uygulamanın içindeki bütün apileri buluyor ve tarıyor
 ve onları dokumante edilebilir bir seviyeye getiriyor
 @EnableSwagger2 annotation Swaggeri başlatan annotation

 http://localhost:8080/swagger-ui.html ile aslında
 kodlamaio.northwind içindeki requestHandelers'ları buluyor
 requestHandler = yapılan istekleri handler eden yerleri yani controller'ları buluyor
 @RestController annotation ile buluyor
 controllerin için içindeki parametreleri ismini senin için dokumente ediyor yani hızlıca test yapmaya yarıyor

 endpoint = istek yapılan yer
 get butonunun yanındaki /api/products/getall endpointine istekte bulunursan example value deki modele benzer bir şey verir
 orada bir array notasyanu var
 köşeli parantez olunca birden fazla product gelecek demek
 süslü parantez ise object notasyonu yani her bir product

 iki tür istek var : datayı getir ve şu datayı kaydet (herhangi bir şey döndürme)
 üç durum var : 1)Data  2)İşlem sonucu barılımı başarısızmı yani true false  3)mesaj bilgisi
 bunlardan işlem sonucu ve mesaj bilgisi zorunlu
 data zorunlu değil*/
