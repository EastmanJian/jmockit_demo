package jmockit.demo;

public class MyService {
    private DependentService service;

    public String updateMyMemberProfile(String memberProfile, String memberId) {
        String result = null;
        System.out.println("do something in my service");
        // invoke thirdparty mothod
        service = new DependentService();
        result = service.updateMemberProfile(memberProfile, memberId);
        return result;
    }
}  