package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog(){
        Logger.getInstance().log("Open file was 09.07.2019");
    }

    @Test
    public void testGetLastLog() {
        //given
        //when
        String textLog1 = Logger.getInstance().getLastLog();
        Logger.getInstance().log("Save file was 10.09.2019");
        String textLog2 = Logger.getInstance().getLastLog();

        //then
        Assert.assertEquals("Open file was 09.07.2019",textLog1);
        Assert.assertEquals("Save file was 10.09.2019",textLog2);

    }


}
