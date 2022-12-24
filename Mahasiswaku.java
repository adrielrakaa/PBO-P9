package Sesi9;

public class Mahasiswaku {

    public static void main(String[] args) {
        Mahasiswa <String,String, Integer> m = new Mahasiswa<>();
        m.setNim("1102021");
        m.setName("Ucup");
        m.setClas(21);
        System.out.println(m.getNim());
        System.out.print(m.getName());
        System.out.println(m.getClas());
    }
    
}
