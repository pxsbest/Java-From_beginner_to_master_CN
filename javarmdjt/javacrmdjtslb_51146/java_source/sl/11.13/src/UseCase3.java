package com.wsy;

public class UseCase3 {
	static class a{
		void f(){
			System.out.println("f()");
		}
	}
	public static void main(String args[]){
		UseCase3 u=new UseCase3();
		UseCase3.a a=new a();
		a.f();
	}
	
}
