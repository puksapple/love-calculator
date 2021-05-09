package com.seliniumExpress.lc.Formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seliniumExpress.lc.api.AmountDto;

public class AmountFormatter implements Formatter<AmountDto>{

	public String print(AmountDto object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public AmountDto parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		int index=text.indexOf("-");
		String[] arr=text.split("-");
		AmountDto am=new AmountDto();
		if(index==-1) {
			
		}else {
			am.setAmount(new BigDecimal(arr[0]));
			am.setLocale(arr[1]);
		}
		return am;
	}

}
