public class GameBenchmarks {

    String oyunIsmi;
    double islemciPuani;
    double ekranKartiPuani;
    double cpuWeight;
    double gpuWeight;

    public GameBenchmarks(String oyunIsmi, double islemciPuani, double ekranKartiPuani, double cpuWeight, double gpuWeight) {

        this.oyunIsmi = oyunIsmi;

        this.islemciPuani = islemciPuani;
        this.ekranKartiPuani = ekranKartiPuani;
        this.cpuWeight = cpuWeight;
        this.gpuWeight = gpuWeight;
    }

    public void benchmarkYap(EkranKartlariVeriMerkezi ekranKartlariVeriMerkezi, IslemciVeriMerkezi islemciVeriMerkezi) {

        System.out.println("-------------------------------");
        System.out.println("Seçilen Oyun : " + oyunIsmi);

        double cpuRatio = (islemciVeriMerkezi.performansDuzeyi / islemciPuani);
        double gpuRatio = (ekranKartlariVeriMerkezi.performansDuzeyi / ekranKartiPuani);

        double performance = (cpuRatio * cpuWeight) + (gpuRatio * gpuWeight);

        if (performance >= 2) {
            System.out.println("\n------Çözünürlük ve FPS Aralığı------");
            System.out.println("4k : 100+");
            System.out.println("2K : 130+");
            System.out.println("1K : 180+");
        } else if (performance >= 1.75) {
            System.out.println("\n------Çözünürlük ve FPS Aralığı------");
            System.out.println("4k : 80-100");
            System.out.println("2K : 100-140");
            System.out.println("1K : 144-180");
        } else if (performance >= 1.5) {
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 60-80");
            System.out.println("2K : 80-110");
            System.out.println("1K : 100-144");
        } else if (performance >= 1.25) {
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 40-60");
            System.out.println("2K : 60-80");
            System.out.println("1K : 80-100");
        } else if (performance >= 1) {
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 15-35");
            System.out.println("2K : 30-55");
            System.out.println("1K : 60-80");
        } else if (performance >= 0.8) {
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 5-15");
            System.out.println("2K : 15-35");
            System.out.println("1K : 35-55");
        } else if (performance >= 0.5) {
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 1-5");
            System.out.println("2K : 5-15");
            System.out.println("1K : 15-35");
        } else if (performance >= 0.2){
            System.out.println("Çözünürlük ve FPS Aralığı");
            System.out.println("4k : 0");
            System.out.println("2K : 1-10");
            System.out.println("1K : 10-25");
        } else {
            System.out.println("Maalesef oyun sisteminizde çalışmaz");
        }
    }
}