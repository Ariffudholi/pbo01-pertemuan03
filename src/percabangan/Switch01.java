package percabangan;

public class Switch01 {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs    : \"Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen  : \"!*&&*\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen  : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs    : \"hihihi....\"");
                break;
            default:
                System.out.println("Mhs  : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Mhs  : \"Bujur jua kah?\"");
                System.out.println("Mhs  : \"memeriksa berkas\"");
                System.out.println("Mhs  : \"Menceleng\"");
                System.out.println("Mhs  : \"kabur\"");
                break;
        }
    }
}
