package com.nit.threadss;

import java.util.Iterator;

public class ThreadSyrconization {
	public void print(int num) {
		for (int j = 0; j <= num; j++) {
		  System.out.println(j*num);
		}
	}

}
class Test1 extends Thread{
	ThreadSyrconization threadSyrconization;
	public Test1(ThreadSyrconization threadSyrconization) {
		this.threadSyrconization=threadSyrconization;
	}
	@Override
	public void run() {
		threadSyrconization.print(5);
	}
}
class Test2 extends Thread{
	ThreadSyrconization threadSyrconization;
	public Test2(ThreadSyrconization threadSyrconization) {
		this.threadSyrconization=threadSyrconization;
	}
	@Override
	public void run() {
		threadSyrconization.print(5);
	}
}
