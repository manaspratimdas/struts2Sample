package com.manas.action;

import com.manas.service.MyServiceImpl;

public class MyAction {
	
	
	private String myDisplay;
	private String condition;
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getMyDisplay() {
		return myDisplay;
	}

	public void setMyDisplay(String myDisplay) {
		this.myDisplay = myDisplay;
	}

	MyServiceImpl myService;
	
	public String execute() {
		
		
		myService=new MyServiceImpl();
		setMyDisplay(myService.display());
		
		
		
		
		System.out.println("in the action class :"+getCondition());
		return "success";
	}

}
