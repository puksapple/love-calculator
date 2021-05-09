package com.seliniumExpress.lc.Service;

import org.springframework.stereotype.Service;
@Service
public class LoveCalculationImpl implements LoveCalculation {
	public final String LC_APP_FORMULA = "FLAME";

	
	public String lovecalc(String userName, String crushName) {

		int totalCount = (userName + crushName).toCharArray().length;
		int formulaCnt = LC_APP_FORMULA.toCharArray().length;
		int rem = totalCount % formulaCnt;
		char resultchar = LC_APP_FORMULA.charAt(rem);
		String result=WhatBetweenUs(resultchar);
		return result;
	}

	public String WhatBetweenUs(char result) {
		
		String res=null;
		if(result=='F') {
			res=LoveCalcConstants.charMeaningF;
		}
		else if(result=='L') {
			res= LoveCalcConstants.charMeaningL;
		}
		
		else if(result=='A') {
			res= LoveCalcConstants.charMeaningA;
		}
		
		else if(result=='M') {
			res= LoveCalcConstants.charMeaningM;
		}
		else if(result=='E') {
			res= LoveCalcConstants.charMeaningE;
		}
		
			return res;
		
			
		
	}



}



