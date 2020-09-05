package ClassesAndObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder david = new AccountHolder();

		tom.firstName = "Tom";
		tom.lastName = "Sawyer";
		tom.age = 25;
		tom.acctBal = 20000;

		tom.testEligibilityForCC();
		System.out.println("Is Tom eligible for CC: " + tom.isEligibleForCC);

		henry.firstName = "Henry";
		henry.lastName = "Hill";
		henry.age = 20;
		henry.acctBal = 35000;

		henry.testEligibilityForCC();
		System.out.println("Is henry eligible for CC: " + henry.isEligibleForCC);

	}

}
