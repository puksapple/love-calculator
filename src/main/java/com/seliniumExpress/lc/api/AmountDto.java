package com.seliniumExpress.lc.api;

import java.math.BigDecimal;
public class AmountDto {
	
	private BigDecimal amount;
	private String Locale;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getLocale() {
		return Locale;
	}

	public void setLocale(String locale) {
		Locale = locale;
	}

}
