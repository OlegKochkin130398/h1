public class Main {
    public static void main(String[] args) {
        int Banan = 80*5;
        int Milk100 = 105*2;
        int IceCream = 2*100;
        int eggs = 4*70;
        float Total = Banan+Milk100+IceCream+eggs;
        System.out.println("Вес завтрака: "+ Total+" грамм!");
        float OverKg = (Total/1000)%Total;
        System.out.println("Вес завтрака: "+ OverKg+" кг");

        int kg = 7;
        float ft = 0.25F;
        float fv = 0.5F;
        float tday = kg/ft;
        System.out.println("Дней потребуется,если 250грамм в день: "+tday);
        float fday = kg/fv;
        System.out.println("Дней потребуется,если 500грамм в день: "+fday);

        int Marya = 67760;
        int Denis = 83690;
        int Kristina = 76230;

        int s1 = Marya*10/100;
        int r1 = Marya+s1;
        int d1 = Marya*12;
        int c1 = r1*12;
        int e1 = c1-d1;
        System.out.println("Маша теперь получает "+r1+" рублей!"+"\nГодовой доход вырос на "+e1+" рублей!");
        int s2 = Denis*10/100;
        int r2 = Denis+s2;
        int d2 = Denis*12;
        int c2 = r2*12;
        int e2 = c2-d2;
        System.out.println("Денис теперь получает "+r2+" рублей!"+"\nГодовой доход вырос на "+e2+" рублей!");
        int s3 = Kristina*10/100;
        int r3 = Kristina+s3;
        int d3 = Kristina*12;
        int c3 = r3*12;
        int e3 = c3-d3;
        System.out.println("Кристина теперь получает "+r3+" рублей!"+"\nГодовой доход вырос на "+e3+" рублей!");
    }
}