package com.seliniumExpress.lc.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seliniumExpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		return phone.getCountryCode() + "" + phone.getUserNum();
	}

	public Phone parse(String text, Locale locale) throws ParseException {
		int index = text.indexOf("-");
		String[] phnArrY = text.split("-");
		Phone ph = new Phone();
		if (index == -1 || text.startsWith("-")) {
			ph.setCountryCode("+977");
			if(text.startsWith("-")){
				ph.setUserNum(phnArrY[1]);
			}else {
			ph.setUserNum(phnArrY[0]);
			}
		} else {
			ph.setCountryCode(phnArrY[0]);
			ph.setUserNum(phnArrY[1]);
		}

		return ph;
	}

}
