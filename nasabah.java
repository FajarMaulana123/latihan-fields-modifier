
public class nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int noAntri=1;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Berhasil DItarik Sebesar " + uang );
            noAntri++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String peringatan){
        if(saldo - uang < 50 ){
            System.out.println("Gagal ditarik sebesar " + uang );
            noAntri++;
            pesan=peringatan;
            return saldo;

        }else{
            System.out.println("Berhasil ditarik sebesar " + uang );
            noAntri++;
            pesan=peringatan;
           return saldo-=uang;
           
        }
        
    }
   
}

