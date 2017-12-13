package jmockit.demo;

import mockit.Expectations;
import mockit.Tested;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MyServiceTestStaticTest {
    @Tested
    MyServiceStatic myServiceStatic;

    @Test
    public void testDoMyMemberProfile() {
        //Using Expectations API to mock a static method
        new Expectations(DependentServiceStatic.class) {{
            //the method to mock, expected result; invocation times;
            DependentServiceStatic.updateMemberProfile(anyString, anyString); result = doneMockStaticMethod(); times = 1;
        }};

        assertEquals(myServiceStatic.updateMyMemberProfile("numPro", "memId"), "doneMockStaticMethod");

    }

    private String doneMockStaticMethod() {
        System.out.println("Mocked third party static method updateMemberProfile() using Expectations API");
        return "doneMockStaticMethod";
    }

}
