package jmockit.demo;

public class MyServiceStatic {

    public String updateMyMemberProfile(String memberProfile, String memberId){
    	String result = null;
    	System.out.println("do something in my service");
    	
    	// invoke thirdparty static method
        result = DependentServiceStatic.updateMemberProfile(memberProfile, memberId);
        return result;
    }
}  