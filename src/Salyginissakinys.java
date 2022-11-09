public class Salyginissakinys {
    public static void main(String[] args) {
        int skaicius = 1;
        int skaicius1 = 5;
        System.out.println("Ar lyginis:" + arLyginis(skaicius));
        System.out.println("Ar neigiamas:" + arNeigiamas(skaicius));
        System.out.println("Didesne sandauga ar suma:" + sandauga(skaicius, skaicius1));
    }
        public static boolean arLyginis(int skaicius){
            return skaicius % 2 == 0;

    }

        public static boolean arNeigiamas(int skaicius){
        return skaicius > 0;
        }


        public static boolean sandauga(double skaicius, double skaicius1){
        return ( skaicius * skaicius) > (skaicius + skaicius);

        }
}
