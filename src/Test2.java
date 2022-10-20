public class Test2 {

    public enum Testo {
        TEST("test"), TEST1("test1"), TEST2("test2");

        public String name;

        Testo(String name) {
            this.name = name;
        }



    }


    public static void main(String[] args) {

        System.out.println(Testo.values());
        System.out.println(Testo.TEST);
        System.out.println(Testo.valueOf("TEST"));
        System.out.println(Testo.TEST2.name());


    }
}
