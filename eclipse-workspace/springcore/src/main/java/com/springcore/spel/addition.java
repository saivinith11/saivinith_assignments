package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class addition {
	@Value("#{11+22}")
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "addition [x=" + x + ", y=" + y + "]";
	}
	

}
