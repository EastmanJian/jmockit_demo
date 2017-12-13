package jmockit.demo;

public class DependentServiceStatic {
	public static String updateMemberProfile (String memberProfile, String memberId) {
		System.out.println("Third party method updateNumberProfile()");
		System.out.println("numberProfile = " + memberProfile + ", memberId = " + memberId);
		return "done";
	}
}
