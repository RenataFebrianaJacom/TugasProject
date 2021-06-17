package Restauran;

public class Menu {
    public String namamakanan;
    public String namaminuman;
    public int jumlahmakanan;
    public int jumlahminuman;
    public String jenismakanan;
    public String jenisminuman;
    public String hargamakanan;
    public String hargaminuman;

    public void tmenuamakanan(){}
    public void tjumlahmenu(){}
    public void tjenismakanan(){}
    public void tampilkanMenu(){
        System.out.println("Nama Makanan : " +namamakanan);
        System.out.println("Nama Minuman : " +namaminuman);
        System.out.println("Jumlah Makanan : " +jumlahmakanan);
        System.out.println("Jumlah Minuman : " +jumlahminuman);
        System.out.println("Jenis Makanan  : " +jenismakanan);
        System.out.println("Jenis Minuman  : " +jenisminuman);
        System.out.println("Harga Makanan  : " +hargamakanan);
        System.out.println("Harga Minuman  : " +hargaminuman);

    }

}
