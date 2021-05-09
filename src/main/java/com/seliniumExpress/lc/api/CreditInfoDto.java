package com.seliniumExpress.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreditInfoDto {
	@NotNull
private CreditDto creditNumber;

private AmountDto amount;

public CreditDto getCreditNumber() {
	return creditNumber;
}

public void setCreditNumber(CreditDto creditNumber) {
	this.creditNumber = creditNumber;
}

public AmountDto getAmount() {
	return amount;
}

public void setAmount(AmountDto amount) {
	this.amount = amount;
}



}
