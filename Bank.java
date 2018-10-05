
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n=new nasabah();
        n.nasabah("Fitri");
        n.tabungan(5000000);
        n.ambilUang(3000000);
        n.ambilUang(1000000,"Untuk UKT");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        nasabah n1=new nasabah();
        n1.nasabah("Fajar");
        n1.tabungan(8000000);
        n1.ambilUang(5000000);
        n1.ambilUang(2500000,"Untuk Ibu");
        
        System.out.println(n1.getSaldo());
        System.out.println(n1.getSaldo() + "  " + n1.getPesan());

        System.out.println();
        nasabah n2=new nasabah();
        n2.nasabah("Tati");
        n2.tabungan(3000000);
        n2.ambilUang(1500000);
        n2.ambilUang(700000,"Untuk kebutuhan Sehari-hari");

        System.out.println(n2.getSaldo());
        System.out.println(n2.getSaldo() + "  " + n2.getPesan());

        System.out.println();

        System.out.println("\nTotal Transaksi Ambil Uang : " + n2.noAntri);
        
    } 
}
