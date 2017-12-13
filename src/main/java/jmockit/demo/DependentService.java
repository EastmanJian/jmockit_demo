package jmockit.demo;

public class DependentService {
    public String updateMemberProfile(String numberProfile, String memberId) {
        System.out.println("Third party method updateNumberProfile()");
        System.out.println("memberProfile = " + numberProfile + ", memberId = " + memberId);
        return "done";
    }
}
