public class Salyginissakinys {
    public static void main(String[] args) {
        int skaicius = 1;
        int skaicius1 = 5;
        String zodis = "Kompiuteris";
        double pradzia = 100;
        double pabaiga = 500;
        double sk = 501;

        System.out.println("Ar lyginis: " + arLyginis(skaicius));
        System.out.println("Ar neigiamas: " + arNeigiamas(skaicius));
        System.out.println("Didesne sandauga ar suma: " + sandauga(skaicius, skaicius1));
        maziauArLygu(zodis);
        System.out.println( "Ar skaicius yra intervale: " +  arYraIntervale(sk,pradzia,pabaiga));

    }
        public static boolean arLyginis(int skaicius){
            return skaicius % 2 == 0;
    }

        public static boolean arNeigiamas(int skaicius){
        return skaicius > 0;
        }

        public static boolean sandauga(double skaicius, double skaicius1){
        return ( skaicius * skaicius1) > (skaicius + skaicius1);

        }

        public static void maziauArLygu(String zodis){
            if (zodis.length() <= 10  ){
                System.out.println(zodis + zodis);
            }
            else {
                System.out.println(zodis);
            }
        }
        //5. Sukurkite funkciją, kuri gauna tris double parametrus:
        // skaicius, pradzia ir pabaiga. Patikrinkite ar tas skaičius yra intervale. Funkcija grąžins boolean

        public static boolean arYraIntervale(double skaicius,double pradzia,double pabaiga){
        return ((pradzia <= skaicius) && (skaicius <= pabaiga));


        }
}
