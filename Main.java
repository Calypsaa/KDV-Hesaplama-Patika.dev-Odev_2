import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran,kdvTutar;
        double KDV=0.18;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen tutarı girin: ");
        tutar=input.nextDouble();

        kdvOran=tutar*KDV;
        System.out.println("KDV tutarı: "+kdvOran);

        kdvTutar=tutar+kdvOran;
        System.out.println("KDV'li tutar: "+kdvTutar);
    }
}
