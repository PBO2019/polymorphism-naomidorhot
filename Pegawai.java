public class Pegawai {
    protected int total;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Staff p = new Staff();
        Supervisor b = new Supervisor();
        Gaji o = new Gaji();

        o.hitungyuu(b.total);
        o.hitungyuu(p.total);
    }
}
