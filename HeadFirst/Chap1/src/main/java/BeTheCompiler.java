package main.java;

public class BeTheCompiler {

    public static class A {
        public static class Exercise1b {
            public static void main(String [] args) {
                int x = 1;
                while ( x < 10 ) {
                    if ( x > 3) { System.out.println("big x"); }
                    x = x + 1;
                }
            }
        }
    }

    public static class B {
        public static void main(String [] args) {
            int x = 5;
            while ( x > 1 ) { x = x - 1;
                if ( x < 3) {
                    System.out.println("small x"); }
            }
        }
    }

    public static class C {
        public static class Exercise1b {
            public static void main(String[] args) {
                int x = 5;
                while ( x > 1 ) {
                    x = x - 1;
                    if ( x < 3 ) { System.out.println("small x"); }
                }
            }
        }
    }
}
