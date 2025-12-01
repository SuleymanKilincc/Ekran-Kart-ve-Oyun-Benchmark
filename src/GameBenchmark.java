public class GameBenchmark {

    String oyunAdi;
    String yapimciFirma;
    String oyunTuru;
    int metaPuani;
    int cikisYili;

    int ramGereksinimi;
    String islemciGereksinimi;
    String ekranKartiGereksinimi;
    int depolamaGereksinimi;
    String windowsSurumu;
    String depolamaTuru;

    public GameBenchmark(String oyunAdi, String yapimciFirma, String oyunTuru, int metaPuani, int cikisYili, int ramGereksinimi, String islemciGereksinimi, String ekranKartiGereksinimi, int depolamaGereksinimi, String windowsSurumu, String depolamaTuru) {

        this.oyunAdi = oyunAdi;
        this.yapimciFirma = yapimciFirma;
        this.oyunTuru = oyunTuru;
        this.metaPuani = metaPuani;
        this.cikisYili = cikisYili;

        this.ramGereksinimi = ramGereksinimi;
        this.islemciGereksinimi = islemciGereksinimi;
        this.ekranKartiGereksinimi = ekranKartiGereksinimi;
        this.depolamaGereksinimi = depolamaGereksinimi;
        this.windowsSurumu = windowsSurumu;
        this.depolamaTuru = depolamaTuru;
    }

    public void testiBaslat(EkranKartlariVeriMerkezi gelenKart) {

        System.out.println("OYUN BİLGİLERİ\n");
        System.out.println("Seçtiğiniz oyun : " + oyunAdi);
        System.out.println("Oyunu yayımlayan firma : " + yapimciFirma);
        System.out.println("Oyunun piyasaya sürüldüğü tarih : " + cikisYili);
        System.out.println("Oyunun 'Meta Critic puanı' : " + metaPuani);
        System.out.println();

        System.out.println("OYUNUN SİSTEM GEREKSİNİMLERİ\n");
        System.out.println("Önerilen sistem 'RAM' : " + ramGereksinimi);
        System.out.println("Önerilen sistem 'İŞLEMCİ' : " + islemciGereksinimi);
        System.out.println("Önerilen sistem 'EKRAN KARTI' : " + ekranKartiGereksinimi);
        System.out.println("Önerilen sistem 'DEPOLAMA ALANI' : " + depolamaGereksinimi);
        System.out.println("Önerilen sistem 'DEPOLAMA TÜRÜ' : " + depolamaTuru);
        System.out.println("Önerilen sistem 'İŞLETİMİ' : " + windowsSurumu);
        System.out.println();

        System.out.println("BENCHMARK TESTİ\n");
        System.out.println("Ekran kartınız : " + gelenKart.model);
        if (gelenKart.performansDuzeyi >= 55) {
            System.out.println("Bu oyun için akıcı çözünürlük : 2K");
            System.out.println("Ortalama 'FPS' : 93");
        } else if (gelenKart.performansDuzeyi >= 50) {
            System.out.println("Bu oyun için akıcı çözünürlük : 2K");
            System.out.println("Ortalama 'FPS' : 72");
        } else if (gelenKart.performansDuzeyi >= 45) {
            System.out.println("Bu oyun için akıcı çözünürlük : 1K");
            System.out.println("Ortalama 'FPS' : 80");
        } else {
            System.out.println("Bu oyun için akıcı çözünürlük : 1K");
            System.out.println("Ortalama 'FPS' : 61");
        }
    }
}