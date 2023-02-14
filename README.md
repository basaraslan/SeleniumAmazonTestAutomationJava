# SeleniumAmazonTestAutomationJava


   ![image](https://user-images.githubusercontent.com/69193881/218678556-44e584e6-ac52-4bd0-a24d-bea11b87a235.png)
  
  
Proje hakkında:

Bu projeyi stajım kapsamında selenyum ve test otomasyonunun mantığını kavramak amaçlı gerçekleştirilmiştir. Bu projede amazon websitesinin bazı fonksiyonlarını JAVA programlama dili yardımıyla test edilmiştir.


Test Senaryoları: Kullanıcının giriş yapıp airpods ürününü sepetine ekleyip silmesi.

Kullanıcının başarılı giriş yapması

- Kullanıcı amazon.com.tr sitesine gidere
- Cookileri kabul eder
- Giriş yap tuşuna tıklar
- e-mail adresi giriir
- Şifre girilir
- Giriş yap butonuna tıklanır


Kullanıcı başarılı giriş yaptıktan sonra ürün araması ve bulması

- Arama çubuğuna tıklanır
- İstenilen ürün ismi arama kısmına yazılır
- Büyüteç tuşuna tıklanır
- Filtreler kısmında Amazon tarafıdan gösterilir işaretlenir
- Filtreler kısmında Apple markası için seçilir
- İstenilen ürün görüntülenir


Kullanıcı ürünü gördükten sonra sepetine ekleyip silmesi

- Görüntülünen ürüne tıklanır 
- Sepete ekle tuşuna basılır
- Sepette ürün görüntülenir
- Ardından ürün sepetten silinir
- Sepetin boş olduğu kontrol edilir


Proje Mimarisi

Page Object Model anlayışına uygun şekilde hazırlanan yapı, test için gereken ana mimari (main) ve testlerin gerçekleştiği package (test) olarak ikiye ayrılır.



![image](https://user-images.githubusercontent.com/69193881/218683382-d26c9ff7-9e26-4e35-b524-f9a31c2fe088.png)

Main kısmındaki classlar genelde her test otomasyonuna başlamadan önce oluşturulan sabit classlardır. Bu classlar driverın ayağa kalkmasını, ve hangi tarayıcıyı desteklediğini gösterir.

ElementHelper classının içinde tıklama, yazı yazdırma, elemanı görüntüleme gibi yardımcı methodlar vardır.
Detaylar için classların içine bakınız.


![image](https://user-images.githubusercontent.com/69193881/218684060-8b3ab749-0cf4-4b03-b0bc-9d5cbca462bd.png)

Bu kısımlar test ile alakalıdır. Features packaginde senaryolar kodlama olmadan cümleler halinde gherkin dilinde yazılır. 

Elements kısmında her sayfa ve senaryo için kullanılan elemanlar variable olarak tutulur. Genelde bu variablların locatorları alınır.

Pages kısmında ise hangi sayfada hangi komutu yaptırmak istiyorsak o alanda tıklama, yazı yazdırma gibi işlemler yapılır.


Proje Kurulumu ve Çalıştırılması

Proje, resources package içindeki TESTHNG.xml dosyası ile çalışmaktadır. Hangi senaryo yani feature dosyası çalıştırılmak isteniyorsa runner classının içinde Features kısmı silinip o dosyanın ismi .feature uzantısı ile birlikte girlmelidir.



![image](https://user-images.githubusercontent.com/69193881/218686322-29874a4e-54fc-46eb-828e-dec9cacef92b.png)


Projenin geliştirildiği derleyici: IDE - IntelliJ IDEA 

Proje sıfırdan oluşturularak yapılmak isteniyorsa, projenin build systemi Maven olarak seçilmelidir.


Test aşamasında kullanılan bazı sabit değişkenler vardır, onlar config.properties dosyasında tutulmaktadır.

![image](https://user-images.githubusercontent.com/69193881/218687069-f423a29a-5a16-415a-b936-8d99e38ed195.png)


Buradaki url giriledcek web adresini tanımlamaktadır.

Kodu çalıştırıp test otomasyonuna başlamak isteyenler giriş yapmak için userMail kısmına kendi Amazon hesabının e-mailini türkçe karakter ve çift tırnak olmadan girmelidir

userPassword kısmına kendi Amazon hesabının e-şifresini türkçe karakter ve çift tırnak olmadan girmelidir. 

Hata sırasında alınan ekran görütüsünü kaydetmek için Screenshots packagesi oluşturulmuştur. screenshotPath kısmmına kendi bilgisayarındaki pathi yazmalıdır.



Raporlama için allure report ve testNG nin kendi raporu kullanılmıştır.

Allure raporunu görüntüleyebilmek için allure-results packagenin pathi kopyalandıktan sonra cmd ye girilir allure serve yazılıp bir boşluk bırakıldıktan sonra kopyalanan path yapıştırılır. Ardından report ortaya çıkar.


![image](https://user-images.githubusercontent.com/69193881/218688901-65fea557-bfa5-4983-9c3c-65d2db911020.png)

![image](https://user-images.githubusercontent.com/69193881/218688963-4314523e-cfe2-4ca5-9095-7103736db8a1.png)


Ayrıca TestNG raporlamasını görnmek içinde test-output klasörüne tıklanır ardından emaiable-report.html dosyası sırayla open in-browser-chrome tıklayarak görüntülenir.



![image](https://user-images.githubusercontent.com/69193881/218688435-dd5bd1c2-05a2-40a1-a079-412e9505b06e.png)



















