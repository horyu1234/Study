package com.horyu1234.random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class random {
	public static List<Integer> l = new ArrayList<Integer>();
	public static void main(String[] a) {
		long startTime = System.currentTimeMillis();
		
		runn1 rr = new runn1();
		rr.start();
		
		long endTime = System.currentTimeMillis();
		long lTime = endTime - startTime;
		double b = lTime / 1000D;
		System.out.println("작동 시간 : " + lTime + "(ms)");
		System.out.println("작동 시간 : " + b + "(s)");
		System.exit(0);
	}

	public static int getRandom() {
		Random rand = new Random();
		return rand.nextInt((2147483647 - 1) + 1) + 1;
	}

	public static void LogFile(String msg) {
		File data = new File("out_put.txt");
		try {
			FileWriter outfile = new FileWriter(data, true);
			PrintWriter out = new PrintWriter(outfile);
			data.createNewFile();
			out.println(msg);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class runn1 extends Thread {
	public void run() {
		for (int i = 0; i < 2147483647; i++) {
			int r = random.getRandom();
			while (random.l.contains(r)) {
				r = random.getRandom();
				random.l.add(r);
			}
			random.LogFile("출력" + r);
		}
	}
}

/*
 * class runn extends Thread { public void run() { for (int i = 0; i <
 * 2147483647; i++) { random.LogFile("출력"+i); } } }
 */
