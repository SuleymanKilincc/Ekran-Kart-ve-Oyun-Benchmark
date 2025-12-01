import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, EkranKartlariVeriMerkezi> kartKutuphanesi = new HashMap<>();

        kartKutuphanesi.put("RTX 2060", new EkranKartlariVeriMerkezi("Nvidia RTX 2060", "GDDR6", 44, 160, 6, 1920, 12, 192, 1, 1750));
        kartKutuphanesi.put("RTX 3060", new EkranKartlariVeriMerkezi("Nvidia RTX 3060", "GDDR6", 45, 170, 6, 3584, 8, 128, 1, 1850));
        kartKutuphanesi.put("RTX 4060", new EkranKartlariVeriMerkezi("Nvidia RTX 4060", "GDDR6", 52, 115, 8, 3072, 5, 128, 2, 2125));
        kartKutuphanesi.put("RTX 5060", new EkranKartlariVeriMerkezi("Nvidia RTX 5060", "GDDR7", 58, 145, 8, 3840, 4, 128, 2, 2600));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sorgulamak istediğiniz ekran kartı modelini girin ,örnek : RTX 3060 , RTX 4060");
        String girilenModel = scanner.nextLine().strip().toUpperCase();

        if (kartKutuphanesi.containsKey(girilenModel)) {
            EkranKartlariVeriMerkezi bulunanKart = kartKutuphanesi.get(girilenModel);
            bulunanKart.bilgiGoster();

            HashMap<String, GameBenchmark> benchmarkKutuphanesi = new HashMap<>();

            benchmarkKutuphanesi.put("The Last Of Us Remake", new GameBenchmark("The Last OF Us", "Naughty Dog", "Aksiyon - Hayatta Kalma", 97, 2024, 32, "Intel Core i7 11400k", "RTX 3060", 80, "Windows 11", "SSD"));
            benchmarkKutuphanesi.put("Red Redemption 2", new GameBenchmark("Red Redemption 2", "Rockstar Games", "Açık Dünya - Aksiyon", 97, 2018, 16, "Intel Core i7 9920k", "RTX 2060", 130, "Windows 10", "SSD-HDD"));
            benchmarkKutuphanesi.put("God Of War", new GameBenchmark("God Of War", "Sony Santa Monica", "Aksiyon - Macera", 94, 2018, 16, "Intel Core i7 10770k", "RTX 2060", 70, "Windows 10", "SSD-HDD"));
            benchmarkKutuphanesi.put("Cyberpunk 2077", new GameBenchmark("Cyberpunk 2077", "CD Project Red", "Açık Dünya - Aksiyon - Rol Yapma", 86, 2019, 32, "Intel Core i7 11770k", "RTX 4060", 90, "Windows 11", "SSD"));
            benchmarkKutuphanesi.put("Cities Skylines 2", new GameBenchmark("Cities Skylines 2", "Colossal Order", "Strateji - İnşa", 75, 2023, 32 - 64, "Intel Core i7 13900k", "RTX 5060", 60, "Windows 11", "SSD"));

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Benchmark sorgulamak için oyun seçiniz ,örnek : The Last Of Us");
            String girilenOyun = scanner2.nextLine().strip();

            if (benchmarkKutuphanesi.containsKey(girilenOyun)) {
                GameBenchmark bulunanOyun = benchmarkKutuphanesi.get(girilenOyun);

                bulunanOyun.testiBaslat(bulunanKart);
            }
        }
    }
}