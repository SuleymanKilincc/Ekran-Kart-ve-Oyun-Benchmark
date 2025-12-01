public class EkranKartlariVeriMerkezi {

    String model;
    String bellekTuru;
    int performansDuzeyi;
    int watDegeri;
    int vram;
    int cekirdekSayisi;
    int transistorMesafesi;
    int bellekArayuzu;
    int oyunCozunurlugu;
    int cekirdekFrekansi;

    public EkranKartlariVeriMerkezi(String model, String bellekTuru, int performansDuzeyi, int watDegeri, int vram, int cekirdekSayisi, int transistorMesafesi, int bellekArayuzu, int oyunCozunurlugu, int cekirdekFrekansi) {

        this.model = model;
        this.bellekTuru = bellekTuru;
        this.performansDuzeyi = performansDuzeyi;
        this.watDegeri = watDegeri;
        this.vram = vram;
        this.cekirdekSayisi = cekirdekSayisi;
        this.transistorMesafesi = transistorMesafesi;
        this.bellekArayuzu = bellekArayuzu;
        this.oyunCozunurlugu = oyunCozunurlugu;
        this.cekirdekFrekansi = cekirdekFrekansi;
    }

    public void bilgiGoster() {

        System.out.println("--------------------");
        System.out.println("Ekran kartınız " + model);
        System.out.println("Bellek türü " + bellekTuru);
        System.out.println("Wat değeri " + watDegeri + "W");
        System.out.println("Vram " + vram + "Gb");
        System.out.println("ÇekirdekSayisi " + cekirdekSayisi);
        System.out.println("Çekirdek frekansı " + cekirdekFrekansi + " Mhz");
        System.out.println("Transistör mesafesi " + transistorMesafesi + " nm");
        System.out.println("Bellek arayüzü " + bellekArayuzu);
        System.out.println("Oyun çözünürlüğü " + oyunCozunurlugu + "K");
        System.out.println("Toplam performans " + performansDuzeyi + "/100");
        System.out.println("----------------------");
    }
}