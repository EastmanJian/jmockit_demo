package jmockit.demo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Normal test class without using Mock
 */
public class MyServiceTest {
    @Test
    public void updateMyMemberProfile() throws Exception {
        //test MyServer.updateMyMemberProfile() without Mock.
        assertEquals((new MyService()).updateMyMemberProfile("numPro", "memId"), "done");
    }

}