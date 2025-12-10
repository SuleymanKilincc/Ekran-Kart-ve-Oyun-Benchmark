
# 🚀 PC Donanım ve Performans Analiz Sistemi (v3.0)

Bu proje, bilgisayar donanım parçalarını (Ekran Kartı ve İşlemci) analiz eden, parçalar arasındaki uyumluluğu hesaplayan ve artık oyunların mimarisine göre (CPU veya GPU odaklı) dinamik performans testi yapan kapsamlı bir Java Konsol Uygulamasıdır.

## 🌟 v3.0 Sürüm Yenilikleri & Özellikler
Bu sürümle birlikte "Kırmızı Takım" (AMD) sahalara indi ve analiz motoru oyunların karakterine göre puan veren çok daha zeki bir yapıya kavuştu.

### 🔴 1. Tam Kapsamlı AMD Desteği
Artık sadece Intel ve NVIDIA yok! Veri tabanı devasa ölçüde genişletildi.
* **İşlemciler:** AMD Ryzen 5, 7 ve 9 serisi (Zen 3, Zen 4 mimarileri).
* **Ekran Kartları:** AMD Radeon RX 6000 ve 7000 serisi kartlar sisteme entegre edildi.

### ⚖️ 2. Oyun Odaklı Ağırlıklandırma (Game-Specific Weighting)
Her oyun sistemi aynı şekilde yormaz. Geliştirdiğimiz yeni algoritma şunları yapar:
* **Analiz:** Seçilen oyunun **CPU Bound** (İşlemci odaklı, örn: CS2, Valorant) mı yoksa **GPU Bound** (Ekran kartı odaklı, örn: Cyberpunk 2077) mı olduğunu tespit eder.
* **Hesaplama:** Eğer oyun işlemciye yükleniyorsa CPU puanının katsayısını, grafiğe yükleniyorsa GPU puanının katsayısını artırarak "Oyun Özelinde" bir performans puanı üretir.

### ⚡ 3. Dinamik Benchmark Simülasyonu
Statik puanların ötesine geçildi. Sistem, seçilen donanım ikilisini sanal bir stres testine sokar:
* Arka planda senaryo bazlı yük bindirilir.
* Sistemin darboğaz (bottleneck) durumu ve sıcaklık (simüle edilmiş) risklerine göre anlık bir **Benchmark Skoru** üretilir.

### 🧠 4. Akıllı Darboğaz (Bottleneck) Algoritması (v2.0'dan Geliştirildi)
Sistem, seçilen Ekran Kartı ve İşlemci arasındaki güç farkını yüzdesel olarak hesaplar.
* Kullanıcıya % kaç oranında darboğaz olduğunu söyler.
* Sistemi frenleyen parçayı (CPU veya GPU) tespit eder ve buna uygun yükseltme (upgrade) tavsiyesinde bulunur.

### 🛡️ 5. Gelişmiş Kullanıcı Deneyimi (UX) & Input Validation
Hatalı girişleri engelleyen döngüler sayesinde kullanıcı yanlış model girse bile program çökmez, doğruyu girene kadar rehberlik eder.

---

## 🛠️ Kullanılan Teknolojiler ve Yapılar
* **Dil:** Java (JDK 21)
* **Veri Yapıları:**
    * `HashMap`: Donanım ve oyun verilerine O(1) hızında erişim için.
    * `ArrayList`: Dinamik listeleme işlemleri için.
* **Algoritmalar:** Ağırlıklı Ortalama (Weighted Average), Darboğaz Hesaplama Mantığı.
* **OOP Prensipleri:** Polymorphism (Çok biçimlilik), Inheritance (Kalıtım), Encapsulation.

---

## 🔜 Gelecek Sürüm Hedefleri (Roadmap v4.0)
v3.0 ile AMD entegrasyonu ve Dinamik Test hedeflerine ulaştık. Bir sonraki büyük güncelleme için hedeflerimiz:

* ☁️ **Canlı Fiyat Çekme:** API kullanarak güncel donanım fiyatlarını internetten çekip "Fiyat/Performans" puanı hesaplanması.
---

### 👨‍💻 Geliştirici Notu
Bu proje, Java'da Nesne Yönelimli Programlama (OOP) ve veri yapıları yetkinliklerini geliştirmek amacıyla açık kaynak olarak kodlanmıştır.

