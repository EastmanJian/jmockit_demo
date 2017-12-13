package jmockit.demo;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MyServiceTestByMockAPI {
    @Test
    public void testUpdateMyMemberProfile() throws Exception {
        //Using Mock API to mock the DependentService's method
        new MockUp<DependentService>() {
            @Mock
            public String updateMemberProfile(String numberProfile, String memberId) {
                System.out.println("Mocked third party method updateNumberProfile() using Mock API");
                System.out.println("numberProfile = " + numberProfile + ", memberId = " + memberId);
                return "doneMock";
            }
        };

        assertEquals((new MyService()).updateMyMemberProfile("numPro", "memId"), "doneMock");
    }
}