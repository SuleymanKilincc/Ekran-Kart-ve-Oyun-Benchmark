import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EkranKartlariVeriMerkezi bulunanKart = null;
        IslemciVeriMerkezi bulunanIslemci = null;

        System.out.println("Sisteminizi puanlamamız için , lütfen sırasısyla sistem parçalarınızı giriniz ");

        HashMap<String, EkranKartlariVeriMerkezi> kartKutuphanesi = new HashMap<>();

        // NVIDIA GEFORCE RTX AİLESİ EKRAN KARTLARI
        kartKutuphanesi.put("RTX 2060", new EkranKartlariVeriMerkezi("Nvidia RTX 2060", "GDDR6", 44, 160, 6, 1920, 12, 192, 1, 1750));
        kartKutuphanesi.put("RTX 2070", new EkranKartlariVeriMerkezi("Nvidia RTX 2070", "GDDR6", 46, 185, 8, 2304, 12, 256, 1, 1750));
        kartKutuphanesi.put("RTX 2080", new EkranKartlariVeriMerkezi("Nvidia RTX 2080", "GDDR6", 48, 215, 8, 2944, 12, 256, 2, 1800));
        kartKutuphanesi.put("RTX 3050", new EkranKartlariVeriMerkezi("Nvidia RTX 3050", "GDDR6", 44, 130, 8, 2560, 8, 128, 1, 1822));
        kartKutuphanesi.put("RTX 3060", new EkranKartlariVeriMerkezi("Nvidia RTX 3060", "GDDR6", 45, 170, 8, 3584, 8, 128, 1, 1850));
        kartKutuphanesi.put("RTX 3070", new EkranKartlariVeriMerkezi("Nvidia RTX 3070", "GDDR6", 53, 220, 8, 5888, 8, 256, 2, 1815));
        kartKutuphanesi.put("RTX 3080", new EkranKartlariVeriMerkezi("Nvidia RTX 3080", "GDDR6X", 62, 370, 10,8704, 8, 370, 4, 1905));
        kartKutuphanesi.put("RTX 3090", new EkranKartlariVeriMerkezi("Nvidia RTX 3090", "GDDR6X", 66, 350, 24,10496, 8, 384, 4, 1740));
        kartKutuphanesi.put("RTX 4060", new EkranKartlariVeriMerkezi("Nvidia RTX 4060", "GDDR6", 52, 115, 8, 3072, 5, 128, 1, 2125));
        kartKutuphanesi.put("RTX 4070", new EkranKartlariVeriMerkezi("Nvidia RTX 4070", "GDDR6X", 60, 200, 12, 5888, 5, 192, 2, 2508));
        kartKutuphanesi.put("RTX 4080", new EkranKartlariVeriMerkezi("Nvidia RTX 4080", "GDDR6X", 69, 320, 16, 9728, 5, 256, 4, 2655));
        kartKutuphanesi.put("RTX 4090", new EkranKartlariVeriMerkezi("Nvidia RTX 4090", "GDDR6X", 80, 450, 24, 16384, 4, 384, 4, 2595));
        kartKutuphanesi.put("RTX 5050", new EkranKartlariVeriMerkezi("Nvidia RTX 5050", "GDDR6", 53, 130, 8, 2560, 5, 128, 1, 2587));
        kartKutuphanesi.put("RTX 5060", new EkranKartlariVeriMerkezi("Nvidia RTX 5060", "GDDR7", 58, 145, 8, 3840, 4, 128, 2, 2600));
        kartKutuphanesi.put("RTX 5070", new EkranKartlariVeriMerkezi("Nvidia RTX 5070", "GDDR7", 67, 250, 12, 6144, 4, 192, 4, 2715));
        kartKutuphanesi.put("RTX 5080", new EkranKartlariVeriMerkezi("Nvidia RTX 5080", "GDDR7", 77, 360, 16, 10752, 4, 256, 4, 2730));
        kartKutuphanesi.put("RTX 5090", new EkranKartlariVeriMerkezi("Nvidia RTX 5090", "GDDR7", 95, 575, 32, 21760, 4, 512, 8, 2610));

        // AMD RADEON AİLESİ EKRAN KARTLARI
        kartKutuphanesi.put("RX 6600", new EkranKartlariVeriMerkezi("AMD RADEON RX 6600", "GDDR6", 44, 132, 8, 1792, 7, 128, 1, 2044));
        kartKutuphanesi.put("RX 6700 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 6700 XT", "GDDR6", 52, 230, 12, 2560, 7, 192, 2, 2424));
        kartKutuphanesi.put("RX 6800 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 6800 XT", "GDDR6", 61, 300, 16, 4608, 7, 256, 4, 2250));
        kartKutuphanesi.put("RX 6900 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 6900 XT", "GDDR6", 67, 300, 16, 5120, 7, 256, 4, 2250));
        kartKutuphanesi.put("RX 7600", new EkranKartlariVeriMerkezi("AMD RADEON RX 7600", "GDDR6", 50, 165, 8, 2048, 6, 128, 1, 2655));
        kartKutuphanesi.put("RX 7700 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 7700 XT", "GDDR6", 58, 245, 12, 3456, 5, 192, 2, 2544));
        kartKutuphanesi.put("RX 7800 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 7800 XT", "GDDR6", 64, 263, 16, 3840, 5, 256, 4, 2430));
        kartKutuphanesi.put("RX 7900 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 7900 XT", "GDDR6", 74, 315, 20, 5376, 5, 320, 4, 2400));
        kartKutuphanesi.put("RX 7900 XTX", new EkranKartlariVeriMerkezi("AMD RADEON RX 7900 XTX", "GDDR6", 79, 355, 24, 6144, 5, 384, 4, 2500));
        kartKutuphanesi.put("RX 9060 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 9060 XT", "GDDR6", 58, 160, 16, 2048, 4, 128, 2, 3340));
        kartKutuphanesi.put("RX 9070 XT", new EkranKartlariVeriMerkezi("AMD RADEON RX 9700 XT", "GDDR6", 65, 304, 16, 4096, 5, 256, 4, 3080));

        System.out.println("Sorgulamak istediğiniz ekran kartı modelini girin , (tüm harfler büyük) örnek : RTX 3060 , RTX 4060 , RX 6700 XT , RX 7900 XTX");

        while (true) {
            String girilenKartmodeli = scanner.nextLine().strip().toUpperCase();

            if (kartKutuphanesi.containsKey(girilenKartmodeli)) {
                bulunanKart = kartKutuphanesi.get(girilenKartmodeli);
                bulunanKart.bilgiGosterEkranKarti();
                break;
            } else {
                System.out.println("Sistemde böyle bir ekran kartı yok , lütfen tekrar deneyiniz");
                System.out.println("Örnek : RTX 2080 , RTX 4090 , RX 6800 XT , RX 9700 XT");
                System.out.print("Tekrar deneyin > ");
            }
        }
        HashMap<String, IslemciVeriMerkezi> islemciKutuphanesi = new HashMap<>();

        //INTEL CORE AİLESİ İŞLEMCİLER
        islemciKutuphanesi.put("INTEL CORE i3-12100", new IslemciVeriMerkezi("INTEL CORE i3-12100","DDR5",47,60,10,4,8,3.3,4.3,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-12600", new IslemciVeriMerkezi("INTEL CORE i5-12600","DDR5",55,65,10,6,12,3.3,4.8,4800,"448 KB","7.5 MB","18 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-12600K", new IslemciVeriMerkezi("INTEL CORE i5-12600K","DDR5",61,125,10,10,16,3.7,4.9,4800,"864 KB","9.5 MB","20 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-12700", new IslemciVeriMerkezi("INTEL CORE i7-12700","DDR5",59,65,10,12,20,2.1,4.9,4800,"900 KB","15 MB","25 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-12700K", new IslemciVeriMerkezi("INTEL CORE i7-12700K","DDR5",64,125,10,12,20,3.6,5.0,4800,"900 KB","15 MB","25 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-12900", new IslemciVeriMerkezi("INTEL CORE i7-12900","DDR5",62,65,10,16,24,2.4,5.1,4800,"1.375 MB","14 MB","30 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-12900K", new IslemciVeriMerkezi("INTEL CORE i9-12900K","DDR5",68,125,10,16,24,3.2,5.2,4800,"1.375 MB","14 MB","30 MB"));
        islemciKutuphanesi.put("INTEL CORE i3-13100", new IslemciVeriMerkezi("INTEL CORE i3-13100","DDR5",49,60,10,4,8,3.4,4.5,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-13600", new IslemciVeriMerkezi("INTEL CORE i5-13600","DDR5",64,65,10,14,20,2.7,5.0,4800,"1.125 MB","11.5 MB","24 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-13600K", new IslemciVeriMerkezi("INTEL CORE i5-13600K","DDR5",67,125,10,14,20,3.5,5.1,5600,"1.125 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-13700", new IslemciVeriMerkezi("INTEL CORE i7-13700","DDR5",65,65,10,16,24,2.1,5.2,5600,"1.375 MB","24 MB","30 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-13700K", new IslemciVeriMerkezi("INTEL CORE i7-13700K","DDR5",73,125,10,16,24,3.4,5.4,5600,"1.375 MB","24 MB","30 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-13900", new IslemciVeriMerkezi("INTEL CORE i9-13900","DDR5",75,65,10,24,32,2.0,5.6,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-13900K", new IslemciVeriMerkezi("INTEL CORE i9-13900K","DDR5",83,125,10,24,32,3.9,5.8,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("INTEL CORE i3-14100", new IslemciVeriMerkezi("INTEL CORE i3-14100","DDR5",50,60,10,4,8,3.5,4.7,4800,"320 KB","5 MB","12 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-14600", new IslemciVeriMerkezi("INTEL CORE i5-14600","DDR5",63,65,10,14,20,2.7,5.2,5600,"1.1 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("INTEL CORE i5-14600K", new IslemciVeriMerkezi("INTEL CORE i5-14600K","DDR5",69,125,10,14,20,3.5,5.3,5600,"1.1 MB","20 MB","24 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-14700", new IslemciVeriMerkezi("INTEL CORE i7-14700","DDR5",69,65,10,20,28,2.1,5.4,5600,"1.6 MB","28 MB","33 MB"));
        islemciKutuphanesi.put("INTEL CORE i7-14700K", new IslemciVeriMerkezi("INTEL CORE i7-14700K","DDR5",78,125,10,20,28,3.4,5.6,5600,"1.8 MB","28 MB","33 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-14900", new IslemciVeriMerkezi("INTEL CORE i9-14900","DDR5",74,65,10,24,32,2.0,5.8,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-14900K", new IslemciVeriMerkezi("INTEL CORE i9-14900K","DDR5",82,125,10,24,32,3.2,6.0,5600,"1.9 MB","32 MB","36 MB"));
        islemciKutuphanesi.put("INTEL CORE i9-14900KS", new IslemciVeriMerkezi("INTEL CORE i9-14900KS","DDR5",85,150,10,24,32,3.2,6.2,5600,"1.9 MB","32 MB","36 MB"));

        
        islemciKutuphanesi.put("RYZEN 5 5600", new IslemciVeriMerkezi("AMD RYZEN 5 5600", "DDR4", 54, 65, 7, 6, 12, 3.5, 4.4, 3200, "384 KB", "3 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 7 5700X", new IslemciVeriMerkezi("AMD RYZEN 7 5700X", "DDR4", 60, 65, 7, 8, 16, 3.4, 4.6, 3200, "512 KB", "4 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 7 5800X3D", new IslemciVeriMerkezi("AMD RYZEN 7 5800X3D", "DDR4", 74, 105, 7, 8, 16, 3.4, 4.5, 3200, "512 KB", "4 MB", "96 MB"));
        islemciKutuphanesi.put("RYZEN 5 7600", new IslemciVeriMerkezi("AMD RYZEN 5 7600", "DDR5", 65, 65, 5, 6, 12, 3.8, 5.1, 5200, "384 KB", "6 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 7 7700X", new IslemciVeriMerkezi("AMD RYZEN 7 7700X", "DDR5", 74, 105, 5, 8, 16, 4.5, 5.4, 5200, "512 KB", "8 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 7 7800X3D", new IslemciVeriMerkezi("AMD RYZEN 7 7800X3D", "DDR5", 86, 120, 5, 8, 16, 4.2, 5.0, 5200, "512 KB", "8 MB", "96 MB")); // Oyun canavarı
        islemciKutuphanesi.put("RYZEN 9 7900X", new IslemciVeriMerkezi("AMD RYZEN 9 7900X", "DDR5", 75, 170, 5, 12, 24, 4.7, 5.6, 5200, "768 KB", "12 MB", "64 MB"));
        islemciKutuphanesi.put("RYZEN 9 7950X", new IslemciVeriMerkezi("AMD RYZEN 9 7950X", "DDR5", 78, 170, 5, 16, 32, 4.5, 5.7, 5200, "1 MB", "16 MB", "64 MB"));
        islemciKutuphanesi.put("RYZEN 5 9600X", new IslemciVeriMerkezi("AMD RYZEN 5 9600X", "DDR5", 72, 65, 4, 6, 12, 3.9, 5.4, 5600, "480 KB", "6 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 7 9700X", new IslemciVeriMerkezi("AMD RYZEN 7 9700X", "DDR5", 80, 65, 4, 8, 16, 3.8, 5.5, 5600, "640 KB", "8 MB", "32 MB"));
        islemciKutuphanesi.put("RYZEN 9 9950X", new IslemciVeriMerkezi("AMD RYZEN 9 9950X", "DDR5", 84, 170, 4, 16, 32, 4.3, 5.7, 5600, "1.2 MB", "16 MB", "64 MB"));
        islemciKutuphanesi.put("RYZEN 7 9800X3D", new IslemciVeriMerkezi("AMD RYZEN 7 9800X3D", "DDR5", 89, 120, 4, 8, 16, 4.7, 5.2, 5600, "640 KB", "8 MB", "96 MB"));
        islemciKutuphanesi.put("RYZEN 9 9900X3D", new IslemciVeriMerkezi("AMD RYZEN 9 9900X3D", "DDR5", 92, 120, 4, 12, 24, 4.4, 5.6, 5600, "960 KB", "12 MB", "128 MB"));
        islemciKutuphanesi.put("RYZEN 9 9950X3D", new IslemciVeriMerkezi("AMD RYZEN 9 9950X3D", "DDR5", 96, 120, 4, 16, 32, 4.3, 5.7, 5600, "1.25 MB", "16 MB", "128 MB"));
        
            System.out.println("Sorgulamak istediğniz işlemci modelini girin  , (tüm harfler büyük) örnek : INTEL CORE i3-12100 , INTEL CORE i7-13700K , RYZEN 7 7700X , RYZEN 7 7800X3D ");

        while (true) {
            String girilenIsLemcimodeli = scanner.nextLine().strip().toUpperCase();

        if (islemciKutuphanesi.containsKey(girilenIsLemcimodeli)) {
            bulunanIslemci = islemciKutuphanesi.get(girilenIsLemcimodeli);
            bulunanIslemci.bilgiGosterIslemci();
            break;
         } else {
            System.out.println("Sistemde böyle bir işlemci yok , lütfen tekrar deneyiniz");
            System.out.println("Örnek : INTEL CORE i3-14100 , INTEL CORE i9-12900 , INTEL CORE i9-14900K , RYZEN 9 7950X , RYZEN" + " 9 9950X3D ");
            System.out.print("Tekrar deneyin > ");
         }
        }
            System.out.println("Sisteminizin toplam performans puanı");

        ToplamSistemGucu sistemGuc = new ToplamSistemGucu();
        sistemGuc.sistemGucu(bulunanKart , bulunanIslemci);

            double gucSonucu = sistemGuc.sistemGucu(bulunanKart , bulunanIslemci);

            System.out.println(gucSonucu);
            System.out.println("--------------------");

            System.out.println("Sisteminizin darboğaz hesabı\n");

        sistemGuc.darbogazHesap(bulunanKart , bulunanIslemci);


            HashMap<String, OyunBilgileri> sistemGereksinimkutuphanesi = new HashMap<>();

        System.out.println("\n--------------------------------------------------------");
        System.out.println("Sistem gereksinimlerini ve oyun bilgilerini öğrenmek istediğiniz oyunu giriniz , (tüm harfler büyük) örnek : THE LAST OF US PART 2");

            sistemGereksinimkutuphanesi.put("THE LAST OF US REMAKE", new OyunBilgileri("The Last OF Us", "Naughty Dog", "Aksiyon - Hayatta Kalma", 97, 2024, 32, "INTEL CORE i7 11400k", "RTX 3060", 80, "Windows 11", "SSD"));
            sistemGereksinimkutuphanesi.put("RED DEAD REDEMPTİON 2", new OyunBilgileri("Red Redemption 2", "Rockstar Games", "Açık Dünya - Aksiyon", 97, 2018, 16, "INTEL CORE i7 9920k", "RTX 2060", 130, "Windows 10", "SSD-HDD"));
            sistemGereksinimkutuphanesi.put("GOD OF WAR", new OyunBilgileri("God Of War", "Sony Santa Monica", "Aksiyon - Macera", 94, 2018, 16, "INTEL CORE i7 10770k", "RTX 2060", 70, "Windows 10", "SSD-HDD"));
            sistemGereksinimkutuphanesi.put("CYBERPUNK 2077", new OyunBilgileri("Cyberpunk 2077", "CD Project Red", "Açık Dünya - Aksiyon - Rol Yapma", 86, 2019, 32, "INTEL CORE i7 11770k", "RTX 4060", 90, "Windows 11", "SSD"));
            sistemGereksinimkutuphanesi.put("CITIES SKYLINES 2", new OyunBilgileri("Cities Skylines 2", "Colossal Order", "Strateji - İnşa", 75, 2023, 32 - 64, "INTEL CORE i7 13900k", "RTX 3080", 60, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("DYING LIGHT 2", new OyunBilgileri("Dying Light 2: Stay Human", "Techland", "Aksiyon - Rol Yapma", 77, 2022, 16, "INTEL CORE i5 8600K", "RTX 2060", 60, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("DYING LIGHT: THE BEAST", new OyunBilgileri("Dying Light: The Beast", "Techland", "Aksiyon - Hayatta Kalma", 80, 2025, 32, "INTEL CORE i7 12700K", "RTX 4070", 90, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("STATE OF DECAY 2", new OyunBilgileri("State of Decay 2", "Undead Labs", "Hayatta Kalma", 69, 2018, 16, "INTEL CORE i5 4570", "GTX 1060", 30, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("DAYS GONE", new OyunBilgileri("Days Gone", "Bend Studio", "Aksiyon - Macera", 76, 2021, 16, "INTEL CORE i7 4770K", "GTX 1060", 70, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("UNCHARTED LEGACY", new OyunBilgileri("Uncharted: Legacy of Thieves", "Naughty Dog", "Aksiyon - Macera", 88, 2022, 16, "INTEL CORE i7 4770", "GTX 1060", 126, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("GTA 5 ENHANCED", new OyunBilgileri("GTA V: Enhanced", "Rockstar Games", "Açık Dünya", 97, 2022, 16, "INTEL CORE i7 8700K", "RTX 2070", 110, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("FORZA HORIZON 4", new OyunBilgileri("Forza Horizon 4", "Playground Games", "Yarış", 88, 2018, 12, "INTEL CORE i7 3820", "GTX 1060", 80, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("FORZA HORIZON 5", new OyunBilgileri("Forza Horizon 5", "Playground Games", "Yarış", 92, 2021, 16, "INTEL CORE i5 8400", "RTX 2060 ", 110, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("FORZA MOTORSPORT", new OyunBilgileri("Forza Motorsport 8", "Turn 10", "Simülasyon Yarış", 84, 2023, 16, "INTEL CORE i5 11600k", "RTX 2080 Ti", 130, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("NFS HEAT", new OyunBilgileri("NFS Heat", "Ghost Games", "Yarış", 74, 2019, 16, "INTEL CORE i7 4790", "GTX 1060", 50, "Windows 10", "HDD"));
        sistemGereksinimkutuphanesi.put("NFS UNBOUND", new OyunBilgileri("NFS Unbound", "Criterion Games", "Yarış", 77, 2022, 16, "INTEL CORE i7 8700", "RTX 2070", 60, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("BEAMNG DRIVE", new OyunBilgileri("BeamNG.drive", "BeamNG", "Simülasyon - Fizik", 90, 2024, 32, "RYZEN 7 5800X", "RTX 3060", 45, "Windows 10", "SSD")); // Fizik işlemcisi canavarı
        sistemGereksinimkutuphanesi.put("F1 25", new OyunBilgileri("F1 25", "Codemasters", "Simülasyon Yarış", 82, 2024, 16, "INTEL CORE i5 12600K", "RTX 3070", 100, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("F1 26", new OyunBilgileri("F1 26", "Codemasters", "Simülasyon Yarış", 85, 2025, 16, "INTEL CORE i7 12700K", "RTX 4070", 110, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("FC 25", new OyunBilgileri("EA Sports FC 25", "EA Sports", "Spor", 76, 2024, 16, "INTEL CORE i7 6700", "GTX 1660", 100, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("FC 26", new OyunBilgileri("EA Sports FC 26", "EA Sports", "Spor", 78, 2025, 16, "INTEL CORE i7 8700K", "RTX 2060", 105, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("NBA 2K25", new OyunBilgileri("NBA 2K25", "Visual Concepts", "Spor", 79, 2024, 16, "INTEL CORE i5 10600K", "RTX 2070", 150, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("NBA 2K26", new OyunBilgileri("NBA 2K26", "Visual Concepts", "Spor", 80, 2025, 16, "INTEL CORE i7 10700K", "RTX 2070", 160, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("COD MW2 REBOOT", new OyunBilgileri("Call of Duty: MW2", "Infinity Ward", "FPS", 79, 2022, 16, "INTEL CORE i7 4770K", "GTX 1060", 125, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("COD MW3 REBOOT", new OyunBilgileri("Call of Duty: MW3", "Sledgehammer", "FPS", 70, 2023, 16, "INTEL CORE i7 6700K", "GTX 1080", 149, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("COD BLACK OPS 6", new OyunBilgileri("Call of Duty: Black Ops 6", "Treyarch", "FPS", 85, 2024, 16, "INTEL CORE i7 8700K", "RTX 3060", 160, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("COD BLACK OPS 7", new OyunBilgileri("Call of Duty: Black Ops 7", "Treyarch", "FPS", 67, 2025, 16, "INTEL CORE i7 11600", "RTX 3060", 180, "Windows 11", "SSD"));
        sistemGereksinimkutuphanesi.put("COD WARZONE", new OyunBilgileri("Call of Duty: Warzone", "Raven Software", "Battle Royale", 80, 2020, 16, "INTEL CORE i7 8700K", "RTX 3050", 125, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("BATTLEFIELD 2042", new OyunBilgileri("Battlefield 2042", "DICE", "FPS", 68, 2021, 16, "INTEL CORE i7 4790", "RTX 3060", 100, "Windows 10", "SSD"));
        sistemGereksinimkutuphanesi.put("BATTLEFIELD 6", new OyunBilgileri("Battlefield 6", "DICE", "FPS", 85, 2025, 32, "INTEL CORE i7 11700", "RTX 4070", 150, "Windows 11", "SSD")); // Yıkım efektleri CPU ister
        sistemGereksinimkutuphanesi.put("FORTNITE", new OyunBilgileri("Fortnite (UE5)", "Epic Games", "Battle Royale", 85, 2024, 16, "INTEL CORE i7 9700K", "RTX 3070", 50, "Windows 11", "SSD")); // Lumen/Nanite grafikleri için RTX şart

        while (true) {
            String gameName = scanner.nextLine().strip();

            if (sistemGereksinimkutuphanesi.containsKey(gameName)) {
                OyunBilgileri bulunanOyun = sistemGereksinimkutuphanesi.get(gameName);
                bulunanOyun.gereksinimleriGoster();
                break;
            } else {
                System.out.println("Sistemde böyle oyun yok lütfen tekrar giriniz");
                System.out.println("Örnek : The Last Of Us Remake , Red Redemption 2 , Cities Skylines 2");
                System.out.print("Tekrar deneyin > ");
            }
          }
        
        HashMap<String, GameBenchmarks> benchmarkKutuphanesi = new HashMap<>();

        benchmarkKutuphanesi.put("CITIES SKYLİNES 2", new GameBenchmarks("Cities Skylines 2", 70 ,62, 0.8, 0.2));
        benchmarkKutuphanesi.put("THE LAST OF US Part 1", new GameBenchmarks("The Last Of Us Part 1", 47 ,48, 0.4, 0.6));
        benchmarkKutuphanesi.put("THE LAST OF US Part 2", new GameBenchmarks("The Last Of Us Part 2", 45 ,45, 0.35, 0.65));
        benchmarkKutuphanesi.put("RED DEAD REDEMPTİON 2", new GameBenchmarks("Red Dead Redemption 2", 43 ,42, 0.35, 0.65));
        benchmarkKutuphanesi.put("CYBERPUNK 2077", new GameBenchmarks("Cyberpunk 2077", 57 ,50, 0.3, 0.7));
        benchmarkKutuphanesi.put("GOD OF WAR 2018", new GameBenchmarks("God Of War 2018", 42 ,36, 0.4, 0.6));
        benchmarkKutuphanesi.put("GOD OF WAR RAGNARÖK", new GameBenchmarks("God Of War Ragnarök", 44 ,38, 0.45, 0.55));
        benchmarkKutuphanesi.put("SPIDER-MAN REMASTERED", new GameBenchmarks("Spider-Man Remastered", 38 ,37, 0.4, 0.6));
        benchmarkKutuphanesi.put("SPIDER-MAN 2", new GameBenchmarks("Spider-Man 2", 41 ,48, 0.45, 0.55));
        benchmarkKutuphanesi.put("DYING LIGHT 2", new GameBenchmarks("Dying Light 2: Stay Human", 44, 45, 0.4, 0.6));
        benchmarkKutuphanesi.put("DYING LIGHT: THE BEAST", new GameBenchmarks("Dying Light: The Beast", 48, 55, 0.4, 0.6)); // Yeni oyun, daha ağır
        benchmarkKutuphanesi.put("STATE OF DECAY 2", new GameBenchmarks("State of Decay 2", 35, 45, 0.5, 0.5)); // İşlemciye biraz yük biner
        benchmarkKutuphanesi.put("DAYS GONE", new GameBenchmarks("Days Gone", 38, 44, 0.35, 0.65)); // Sürüler işlemci ister ama grafik ağırlıklı
        benchmarkKutuphanesi.put("UNCHARTED LEGACY", new GameBenchmarks("Uncharted: Legacy of Thieves Collection", 40, 42, 0.3, 0.7));
        benchmarkKutuphanesi.put("GTA 5 ENHANCED", new GameBenchmarks("GTA V: Enhanced & Expanded", 43, 42, 0.5, 0.5)); // Açık dünya dengeli
        benchmarkKutuphanesi.put("FORZA HORIZON 4", new GameBenchmarks("Forza Horizon 4", 38, 35, 0.3, 0.7)); // İyi optimize edilmiş
        benchmarkKutuphanesi.put("FORZA HORIZON 5", new GameBenchmarks("Forza Horizon 5", 44, 45, 0.35, 0.65));
        benchmarkKutuphanesi.put("FORZA MOTORSPORT", new GameBenchmarks("Forza Motorsport (2023)", 50, 56, 0.45, 0.55)); // Fizik motoru ağır
        benchmarkKutuphanesi.put("NFS HEAT", new GameBenchmarks("Need for Speed Heat", 33, 35, 0.4, 0.6));
        benchmarkKutuphanesi.put("NFS UNBOUND", new GameBenchmarks("Need for Speed Unbound", 35, 37, 0.4, 0.6)); // Efektler GPU ister
        benchmarkKutuphanesi.put("BEAMNG DRIVE", new GameBenchmarks("BeamNG.drive", 50, 45, 0.85, 0.15)); // Tamamen işlemci odaklı bir fizik simülasyonu
        benchmarkKutuphanesi.put("F1 24", new GameBenchmarks("F1 24", 50, 39, 0.6, 0.4));
        benchmarkKutuphanesi.put("F1 25", new GameBenchmarks("F1 25", 55, 42, 0.6, 0.4)); // Yıl geçtikçe işlemci yükü artar
        benchmarkKutuphanesi.put("F1 26", new GameBenchmarks("F1 26", 60, 45, 0.6, 0.4));
        benchmarkKutuphanesi.put("FC 25", new GameBenchmarks("EA Sports FC 25", 45, 39, 0.55, 0.45));
        benchmarkKutuphanesi.put("FC 26", new GameBenchmarks("EA Sports FC 26", 48, 40, 0.55, 0.45));
        benchmarkKutuphanesi.put("NBA 2K25", new GameBenchmarks("NBA 2K25", 58, 52, 0.4, 0.6)); // Grafikler ağırlaştı
        benchmarkKutuphanesi.put("NBA 2K26", new GameBenchmarks("NBA 2K26", 62, 55, 0.4, 0.6));
        benchmarkKutuphanesi.put("COD MW2 REBOOT", new GameBenchmarks("Call of Duty: MW2 (2022)", 48, 48, 0.5, 0.5));
        benchmarkKutuphanesi.put("COD MW3 REBOOT", new GameBenchmarks("Call of Duty: MW3 (2023)", 50, 50, 0.5, 0.5));
        benchmarkKutuphanesi.put("COD BLACK OPS 6", new GameBenchmarks("Call of Duty: Black Ops 6", 58, 55, 0.5, 0.5));
        benchmarkKutuphanesi.put("COD BLACK OPS 7", new GameBenchmarks("Call of Duty: Black Ops 7", 60, 57, 0.5, 0.5));
        benchmarkKutuphanesi.put("COD WARZONE", new GameBenchmarks("Call of Duty: Warzone 2.0", 55, 65, 0.6, 0.4)); // Büyük harita = Yüksek İşlemci
        benchmarkKutuphanesi.put("BATTLEFIELD 2042", new GameBenchmarks("Battlefield 2042", 44, 42, 0.7, 0.3)); // 128 Oyuncu işlemciyi yer
        benchmarkKutuphanesi.put("BATTLEFIELD 6", new GameBenchmarks("Battlefield 6", 47, 50, 0.7, 0.3)); // Yıkım efektleri ve işlemci yükü tavan yapacak
        benchmarkKutuphanesi.put("FORTNITE", new GameBenchmarks("Fortnite (Unreal Engine 5)", 68, 55, 0.3, 0.7)); // Lumen ve Nanite GPU'yu çok yorar

        while (true) {

            System.out.println("\nLütfen sisteminiz için benchmark yapmak istediğiniz oyunu seçin");
            String gameName = scanner.nextLine().strip();

            if (benchmarkKutuphanesi.containsKey(gameName)) {
                GameBenchmarks bulunanOyun = benchmarkKutuphanesi.get(gameName);
                bulunanOyun.benchmarkYap(bulunanKart, bulunanIslemci);
                break;
            } else {
                System.out.println("Sistemde böyle oyun yok lütfen tekrar giriniz");
                System.out.println("Örnek : The Last Of Us Remake , Red Redemption 2 , Cities Skylines 2");
                System.out.print("Tekrar deneyin > ");
            }
        }
        }
    }
