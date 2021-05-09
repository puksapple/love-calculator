package com.seliniumExpress.lc.api;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreditDto {
	@NotBlank
	@Size(min=4)
	private int firstDigit;
	@NotBlank
	@Size(min=4)
	private int secondDigit;
	@NotBlank
	@Size(min=4)
	private int thirdDigit;
	@NotBlank
	@Size(min=4)
	private int fourthDigit;

	public int getFirstDigit() {
		return firstDigit;
	}

	public void setFirstDigit(int firstDigit) {
		this.firstDigit = firstDigit;
	}

	public int getSecondDigit() {
		return secondDigit;
	}

	public void setSecondDigit(int secondDigit) {
		this.secondDigit = secondDigit;
	}

	public int getThirdDigit() {
		return thirdDigit;
	}

	public void setThirdDigit(int thirdDigit) {
		this.thirdDigit = thirdDigit;
	}

	public int getFourthDigit() {
		return fourthDigit;
	}

	public void setFourthDigit(int fourthDigit) {
		this.fourthDigit = fourthDigit;
	}
}
