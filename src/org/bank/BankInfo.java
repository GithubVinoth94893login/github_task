package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
	System.out.println("Savings ");
}
private void fixed() {
	System.out.println("fixed");

}
public static void main(String[] args) {
	BankInfo object=new BankInfo();
	object.deposit();
	object.savings();
	object.fixed();
}
}

