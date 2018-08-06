package com.cg.test;

import java.io.IOException;

import com.cg.userinterface.UserInterface;

public class EMSTest {

	public static void main(String args[]) throws IOException {
		try {
			new UserInterface().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
