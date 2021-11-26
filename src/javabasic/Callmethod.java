package javabasic;

import static javabasic.Methodwritting.writestaticmethod;

public class Callmethod {

    public static void main(String[] args) {

        //call static method
        writestaticmethod("Static Method written and ", "called successfully");

        //call nonstatic method
        Methodwritting nonstatic= new Methodwritting();
        nonstatic.writenonstaticmethod("Non static method written ","called successfully" );
        }

}

