package com.seliniumExpress.lc.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seliniumExpress.lc.api.CreditDto;
import com.seliniumExpress.lc.api.CreditInfoDto;

public class CreditCardFormatter implements Formatter<CreditDto>{

	public String print(CreditDto object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreditDto parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		int index=text.indexOf("-");
		String[] arr=text.split("-");
		CreditDto cr=new CreditDto();
		
		
		if(index==-1) {
			
		}else {
			cr.setFirstDigit(Integer.parseInt(arr[0]));
			cr.setSecondDigit(Integer.parseInt(arr[1]));
			cr.setThirdDigit(Integer.parseInt(arr[2]));
			cr.setFourthDigit(Integer.parseInt(arr[3]));
		}
		
		return cr;
	}

}
