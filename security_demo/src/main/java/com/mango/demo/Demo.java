package com.mango.demo;
/*
 * 啊
 */
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
	public static void main(String[] args) {
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		System.out.println(b.encode("123456"));
	}
}
