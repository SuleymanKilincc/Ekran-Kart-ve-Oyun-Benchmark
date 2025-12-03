
🚀 PC Donanım ve Performans Analiz Sistemi (v2.0)
Bu proje, bilgisayar donanım parçalarını (Ekran Kartı ve İşlemci) analiz eden, parçalar arasındaki uyumluluğu hesaplayan ve popüler oyunların sistem gereksinimlerini sunan kapsamlı bir Java Konsol Uygulamasıdır.

🌟 v2.0 Yenilikleri & Özellikler
Bu sürümde proje, statik bir veri tabanından dinamik bir hesaplama aracına dönüştürülmüştür.

🧠 1. Akıllı Darboğaz (Bottleneck) Algoritması
Sistem, seçilen Ekran Kartı (GPU) ve İşlemci (CPU) arasındaki performans dengesini analiz eder.

Özel bir algoritma ile parçalar arasındaki güç farkını hesaplar.

Kullanıcıya % kaç oranında darboğaz olduğunu ve hangi parçanın (CPU veya GPU) sistemi frenlediğini söyler.

Yükseltme tavsiyeleri verir.

📊 2. Toplam Sistem Puanlaması
Donanımların teknik özellikleri (VRAM, Frekans, Çekirdek Sayısı vb.) baz alınarak sisteme 0 ile 100 arasında bir performans puanı verilir.

💾 3. Genişletilmiş Veri Tabanı (HashMap)
Ekran Kartları: RTX 20 serisinden RTX 5090'a kadar geniş bir yelpaze.

İşlemciler: Intel Core i3 12. nesilden i9 14. nesile kadar detaylı işlemci verileri.

Oyunlar: Cyberpunk 2077, God of War gibi popüler oyunların detaylı sistem gereksinimleri.

🛡️ 4. Gelişmiş Kullanıcı Deneyimi (UX)
Hatalı girişleri engelleyen Input Validation (Giriş Doğrulama) döngüleri eklendi. Kullanıcı yanlış model girse bile program çökmez, doğruyu girene kadar yol gösterir.

🛠️ Kullanılan Teknolojiler ve Yapılar
Dil: Java (JDK 21)

Veri Yapıları: HashMap (Hızlı veri erişimi için), ArrayList

OOP Prensipleri: Sınıflar (Classes), Nesneler (Objects), Constructorlar.

Kontrol Yapıları: While Döngüleri, If-Else Blokları.

🔜 Gelecek Sürüm Hedefleri (Roadmap v3.0)
Şu anki sürümde oyunların sistem gereksinimleri kütüphane olarak sunulmaktadır. Gelecek güncellemede (v3.0) planlanan özellikler:

🚀 FPS Tahmin Motoru: Mevcut donanımınızın (GPU + CPU), seçilen oyunda ortalama kaç FPS vereceğinin hesaplanması.

🎮 Dinamik Uyumluluk Testi: Sisteminizin seçilen oyunu "Low", "Medium" veya "Ultra" ayarlarda açıp açamayacağının otomatik analizi.

💾 Veri Tabanı Genişletmesi: AMD İşlemciler ve Radeon Ekran Kartlarının eklenmesi.
