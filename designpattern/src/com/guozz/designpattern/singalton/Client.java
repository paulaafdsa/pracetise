package com.guozz.designpattern.singalton;

public class Client {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton1==singleton2){
			System.out.println("��һ������");
		}else{
			System.out.println("����һ������");
		}
		
	}
}