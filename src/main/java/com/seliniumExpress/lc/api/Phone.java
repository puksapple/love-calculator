package com.seliniumExpress.lc.api;

public class Phone {
String countryCode;
String userNum;
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getUserNum() {
	return userNum;
}
public void setUserNum(String userNum) {
	this.userNum = userNum;
}
@Override
public String toString() {
	return getCountryCode()+"-"+getUserNum();
}

}
