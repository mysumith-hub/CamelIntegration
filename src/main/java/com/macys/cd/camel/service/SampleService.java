package com.macys.cd.camel.service;

import org.springframework.stereotype.Service;

@Service("SampleService")
public class SampleService {
	
	public void execute(){
		System.out.println("Execution is Started");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Execution is completed");
	}
	public void execute(String applications){
		System.out.println(applications+" execution Started");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(applications+" execution completed");
	}
	public void run(){
		System.out.println("Run Started");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run completed");
	}
	
}
