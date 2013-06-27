package main.java;

public class MixedMessages {

    public static class Test {
        public static void main(String [] args) {
        }

        public String input1() {
            String string = "";
            int x = 0;
            int y = 0;
            while ( x < 5 ) {
                y = x - y;
                string += x + "" + y +" ";
                x = x + 1;
            }
            return string;
        }

        public String input2() {
            String string = "";
            int x = 0;
            int y = 0;
            while ( x < 5 ) {
                y = y + x;
                string += x + "" + y +" ";
                x = x + 1;
            }
            return string;
        }

        public String input3() {
            String string = "";
            int x = 0;
            int y = 0;
            while ( x < 5 ) {
                y = y + 2;
                if( y > 4 ) {
                    y = y - 1; }
                string += x + "" + y +" ";
                x = x + 1;
            }
            return string;
        }

        public String input4() {
            String string = "";
            int x = 0;
            int y = 0;
            while ( x < 5 ) {
                x = x + 1;
                y = y + x;
                string += x + "" + y +" ";
                x = x + 1;
            }
            return string;
        }

        public String input5() {
            String string = "";
            int x = 0;
            int y = 0;
            while ( x < 5 ) {
                if ( y < 5 ) {
                    x = x + 1;
                    if ( y < 3 ) {
                        x = x - 1; }
                }
                y = y + 2;
                string += x + "" + y +" ";
                x = x + 1;
            }
            return string;
        }
    }
}