package jmockit.demo;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MyServiceTestByExpectationAPI {
    //Typically, a test class will exercise a single tested class. JMockit can help by automatically instantiating this class,
    //and optionally injecting the relevant mocked dependencies. This is what the @Tested annotation is for.
    @Tested MyService myService;

    // @Mocked is the central mocking annotation, having a few optional attributes which are useful in particular situations;
    @Mocked
    DependentService espService;

    @Test
    public void testUpdateMyNumberProfile() {
        //Using Expectations API to mock
        new Expectations() {{
            //the method to mock; the expected return result; times of invocation.
            espService.updateMemberProfile(anyString, anyString); result = doneMockByExpectationAPI(); times = 1;
        }};

        //MyService myService = new MyService();
        assertEquals(myService.updateMyMemberProfile("numPro", "memId"), "doneMockByExpectationAPI");

    }

    private String doneMockByExpectationAPI() {
        System.out.println("Mocked third party method updateNumberProfile() using Expectations API");
        return "doneMockByExpectationAPI";
    }

}