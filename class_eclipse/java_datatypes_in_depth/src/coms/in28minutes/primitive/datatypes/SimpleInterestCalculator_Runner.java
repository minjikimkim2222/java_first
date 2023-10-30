package coms.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator_Runner {

	public static void main(String[] args) {

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.println(totalValue);
	}

}

class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
		this.interest = this.interest.divide(new BigDecimal("100"));
		// interest 7.5% == 7.5 / 100 임을 잊지 말 것!
	}

	public BigDecimal calculateTotalValue(int Periods) {
		BigDecimal totalAmount;
		BigDecimal PeriodsBigDecimal = new BigDecimal(Periods);

		totalAmount = principal.add(principal.multiply(interest.multiply(PeriodsBigDecimal)));
		// total value = principal + principal * interest * Periods2
		return (totalAmount);
	}

}
