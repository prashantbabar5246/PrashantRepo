package javabasic;

public class Methodwritting {

       //static method writing and calling
        public static void writestaticmethod(String i, String j) {

            String k = i + j;
            System.out.println(k);

        }


        // Write  non static method and call the same in Callmethod class
        public void writenonstaticmethod(String i, String j)
    {
        String k = i + j;
        System.out.println(k);
            //System.out.println("Non static method written and called");
    }
}
