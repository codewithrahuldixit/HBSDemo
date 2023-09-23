package com.jfs.polydemo;

public class FinalDemo {
	//The blank final field x may not have been initialized
	final int x;
	public FinalDemo(){
		x=10;
	}
	public FinalDemo(int x){
		this.x=x;
	}
	
	
	void setX(int x) {
		//The final field FinalDemo.x cannot be assigned
		this.x=x;
	}

}
