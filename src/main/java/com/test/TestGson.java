package com.test;

import com.google.gson.Gson;

public class TestGson {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		Gson gson = new Gson();
		String jsonStr = gson.toJson(arr);
		System.out.println(jsonStr);
	}
}
