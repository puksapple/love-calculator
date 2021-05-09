package com.seliniumExpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDto {
	@NotBlank(message ="* user name cannot be blank")
	@Size(min = 3 ,max=15, message="*atleast three character needed")
	private String userName;
	@NotBlank(message ="* crush name cannot be blank")
	@Size(min = 3 ,max=15, message="*atleast three character needed")
	private String crushName;
	@AssertTrue(message ="* you must agree terms and condition")
	private boolean termsAndCondition;
	private String email;
	private String appResult;
	public boolean isTermsAndCondition() {
		return termsAndCondition;
	}
	public void setTermsAndCondition(boolean termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "userInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAppResult() {
		return appResult;
	}
	public void setAppResult(String appResult) {
		this.appResult = appResult;
	}
	
	

}
