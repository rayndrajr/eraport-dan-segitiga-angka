package nilai;

import java.util.Scanner;

public class Sub extends Super {

    @Override
    public void awal() {

        double bahasa[] = new double[5];
        double mat[] = new double[5];
        double ipa[] = new double[5];
        double ingg[] = new double[5];
        double rpl[] = new double[5];
        double rata[] = new double[5];
        String Predikatbahasa = null;
        String Predikatmat = null;
        String Predikatingg = null;
        String Predikatipa = null;
        String Predikatrpl = null;
        String hasil;
        String nama[] = new String[5];
        int pilihan;
        boolean ulang = true;

        Scanner bocill = new Scanner(System.in);

        System.out.println("");

        while (ulang) {
            System.out.println("====================================");
            System.out.println("=              M E N U             =");
            System.out.println("------------------------------------");
            System.out.println("1.  I N P U T  D A T A  S I S W A  =");
            System.out.println("2. I N P U T  N I L A I  S I S W A =");
            System.out.println("3.   T A M P I L A N   A K H I R   =");
            System.out.println("4.           K E L U A R           =");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            pilihan = bocill.nextInt();

            switch (pilihan) {
                case 1:
                    for (int a = 1; a < 5; a++) {
                        System.out.println("***********************************************");
                        System.out.println("*        I N P U T  D A T A  S I S W A        *");
                        System.out.println("***********************************************");
                        System.out.print("* Masukkan Nama Siswa: ");
                        nama[a] = bocill.next();
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int a = 1; a < 5; a++) {
                        System.out.println("***********************************************");
                        System.out.println("*       I N P U T  N I L A I  S I S W A       *");
                        System.out.println("***********************************************");
                        System.out.print("* Masukkan Nilai Bahasa Indonesia: ");
                        bahasa[a] = bocill.nextDouble();
                        System.out.print("* Masukkan Nilai Matematika: ");
                        mat[a] = bocill.nextDouble();
                        System.out.print("* Masukkan Nilai Bahasa Inggris: ");
                        ingg[a] = bocill.nextDouble();
                        System.out.print("* Masukkan Nilai IPA: ");
                        ipa[a] = bocill.nextDouble();
                        System.out.print("* Masukkan Nilai RPL: ");
                        rpl[a] = bocill.nextDouble();
                        System.out.println("************************************************");
                        //Predikat Nilai B. Indonesia
                        if (bahasa[a] >= 92 && bahasa[a] <= 100) {
                            Predikatbahasa = "A";
                        } else if (bahasa[a] >= 84 && bahasa[a] <= 91) {
                            Predikatbahasa = "B";
                        } else if (bahasa[a] >= 75 && bahasa[a] <= 83) {
                            Predikatbahasa = "C";
                        } else if (bahasa[a] < 75 && bahasa[a] >= 0) {
                            Predikatbahasa = "D";
                        } else {
                            System.out.println("Angka Yang Anda Masukkan Salah");
                        }
                        //Predikat Nilai Matematika
                        if (mat[a] >= 92 && mat[a] <= 100) {
                            Predikatmat = "A";
                        } else if (mat[a] >= 84 && mat[a] <= 91) {
                            Predikatmat = "B";
                        } else if (mat[a] >= 75 && mat[a] <= 83) {
                            Predikatmat = "C";
                        } else if (mat[a] < 75 && mat[a] >= 0) {
                            Predikatmat = "D";
                        } else {
                            System.out.println("Angka Yang Anda Masukkan Salah");
                        }
                        //Predikat Nilai B. Inggris
                        if (ingg[a] >= 92 && ingg[a] <= 100) {
                            Predikatingg = "A";
                        } else if (ingg[a] >= 84 && ingg[a] <= 91) {
                            Predikatingg = "B";
                        } else if (ingg[a] >= 75 && ingg[a] <= 83) {
                            Predikatingg = "C";
                        } else if (ingg[a] < 75 && ingg[a] >= 0) {
                            Predikatingg = "D";
                        } else {
                            System.out.println("Angka Yang Anda Masukkan Salah");
                        }
                        //Predikat Nilai IPA
                        if (ipa[a] >= 92 && ipa[a] <= 100) {
                            Predikatipa = "A";
                        } else if (ipa[a] >= 84 && ipa[a] <= 91) {
                            Predikatipa = "B";
                        } else if (ipa[a] >= 75 && ipa[a] <= 83) {
                            Predikatipa = "C";
                        } else if (ipa[a] < 75 && ipa[a] >= 0) {
                            Predikatipa = "D";
                        } else {
                            System.out.println("Angka Yang Anda Masukkan Salah");
                        }
                        //Predikat Nilai RPL
                        if (rpl[a] >= 92 && rpl[a] <= 100) {
                            Predikatrpl = "A";
                        } else if (rpl[a] >= 84 && rpl[a] <= 91) {
                            Predikatrpl = "B";
                        } else if (rpl[a] >= 75 && rpl[a] <= 83) {
                            Predikatrpl = "C";
                        } else if (rpl[a] < 75 && rpl[a] >= 0) {
                            Predikatrpl = "D";
                        } else {
                            System.out.println("Angka Yang Anda Masukkan Salah");
                        }
                        //Rata-Rata
                        rata[a] = (bahasa[a] + mat[a] + ingg[a] + ipa[a] + rpl[a]) / 5;
                        if (rata[a] >= 75) {
                            hasil = "LULUS dan NAIK KELAS";
                        } else {
                            hasil = "TIDAK LULUS dan TINGGAL KELAS";
                        }
                        System.out.println("========================================");
                    }
                    break;
                case 3:
                    for (int a = 1; a < 5; a++) {
                        System.out.println("");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("-                                                            N I L A I  R A P O T  S E M E S T E R  2                                                            -");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("- Nama: " + nama[a]);
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("-  B. Indo   |   Predikat   |   Matematika   |   Predikat   |   B. Inggris   |   Predikat   |   IPA   |   Predikat   |   RPL   |   Predikat   |   Rata-Rata   |  -");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("-    " + bahasa[a] + "    |       " + Predikatbahasa + "      |      " + mat[a] + "      |       " + Predikatmat + "      |      " + ingg[a] + "      |       " + Predikatingg + "      |   " + ipa[a] + "  |       " + Predikatipa + "      |   " + rpl[a] + "  |       " + Predikatrpl + "      |   " + rata[a] + "   |   -");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("");
                    }
                    break;
                case 4:
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan Anda Salah");
            }
            System.out.println("Kembali Ke menu utama :)");
        }

    }
}
