package ClassesAndObjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float acctBal;
	boolean isEligibleForCC;

	public void testEligibilityForCC() {
		if (age>20 && acctBal>=20000)
			isEligibleForCC = true;

	}


}
