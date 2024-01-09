package com.javaex.ex02;

public class Shape {
	private String fillColor;
	private String lineCloor;

	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillColor, String lineClolr) {
		this.fillColor = fillColor;
		this.lineCloor = lineClolr;
	}

}
