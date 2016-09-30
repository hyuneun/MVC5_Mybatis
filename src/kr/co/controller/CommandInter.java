package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandInter {
	String showData(HttpServletRequest request, HttpServletResponse response) throws Exception; //추상메소드를 하나 만들었어요~~~
	
	
}
