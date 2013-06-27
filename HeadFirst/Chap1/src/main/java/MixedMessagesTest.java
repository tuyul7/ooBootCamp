package main.java;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MixedMessagesTest {

//    @Test
//    public void output1(){
//        MixedMessages.Test test = new MixedMessages.Test();
//        assertThat(test.run(), is("22 46 "));
//    }

    @Test
    public void output2(){
        MixedMessages.Test test = new MixedMessages.Test();
        assertThat(test.input4(), is("11 34 59 "));
    }

//    @Test
//    public void output3(){
//        MixedMessages.Test test = new MixedMessages.Test();
//        assertThat(test.run(), is("02 14 26 38 "));
//    }

    @Test
    public void output4(){
        MixedMessages.Test test = new MixedMessages.Test();
        assertThat(test.input5(), is("02 14 36 48 "));
    }

    @Test
    public void output5(){
        MixedMessages.Test test = new MixedMessages.Test();
        assertThat(test.input1(), is("00 11 21 32 42 "));
    }

//    @Test
//    public void output6(){
//        MixedMessages.Test test = new MixedMessages.Test();
//        assertThat(test.run(), is("11 21 32 42 53 "));
//    }

    @Test
    public void output7(){
        MixedMessages.Test test = new MixedMessages.Test();
        assertThat(test.input2(), is("00 11 23 36 410 "));
    }

    @Test
    public void output8(){
        MixedMessages.Test test = new MixedMessages.Test();
        assertThat(test.input3(), is("02 14 25 36 47 "));
    }
}