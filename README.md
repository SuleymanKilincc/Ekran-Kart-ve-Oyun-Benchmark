# 🎮 Ekran Kartı & Oyun Benchmark Simülasyonu

Bu proje, **Java** programlama dili kullanılarak geliştirilmiş bir donanım ve yazılım performans analiz simülasyonudur. Nesne Yönelimli Programlama (OOP) mantığının pekiştirilmesi amacıyla, gerçek hayat senaryoları kod üzerine taşınmıştır.

## 🚀 Projenin Amacı
Kullanıcının kütüphaneden seçtiği bir **Ekran Kartı** ile bir **Bilgisayar Oyununu** karşılaştırarak; donanımın o oyunu hangi ayarlarda ve tahmini kaç FPS ile çalıştıracağını analiz etmektir.

## 🛠️ Kullanılan Teknolojiler ve Yapılar
* **Java (JDK 21):** Ana geliştirme dili.
* **OOP (Nesne Yönelimli Programlama):**
    * **Custom Classes:** `EkranKartlariVeriMerkezi` ve `GameBenchmark` sınıfları ile kendi veri tiplerim oluşturuldu.
    * **Constructor (Yapıcı Metotlar):** Nesne üretimini standartlaştırmak ve veriyi tek satırda işlemek için kullanıldı.
    * **Object Interaction:** Sınıflar arası veri transferi (Bir sınıfın metoduna parametre olarak başka bir sınıfın nesnesini göndermek) uygulandı.
* **Veri Yapıları (Collections):** Verilerin hızlı sorgulanması ve depolanması için `HashMap<Key, Value>` yapısı kullanıldı.
* **Input Handling:** `Scanner` sınıfı ve String manipülasyonları (`strip`, `toUpperCase` vb.) ile güvenli kullanıcı veri girişi sağlandı.

## ⚙️ Nasıl Çalışır?
1.  Program başladığında arka planda bir ekran kartı ve oyun veritabanı (HashMap) oluşturulur.
2.  Kullanıcıdan bir ekran kartı modeli girmesi istenir (Örn: RTX 3060).
3.  Seçilen kartın özellikleri hafızaya alınır.
4.  Kullanıcıdan test etmek istediği oyun seçilir (Örn: Cyberpunk 2077).
5.  Sistem, seçilen kartı (`EkranKartlariVeriMerkezi` nesnesi) oyunun test metoduna (`GameBenchmark`) parametre olarak gönderir.
6.  Algoritma, kartın performans düzeyi ile oyunun gereksinimlerini kıyaslar ve sonucu ekrana basar.

## 👨‍💻 Geliştirici
* **Ad:** Süleyman
* **Bölüm:** Yazılım Mühendisliği 1. Sınıf
