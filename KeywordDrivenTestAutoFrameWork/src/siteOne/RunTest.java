package siteOne;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class RunTest {


	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("TestScript.txt");
		BufferedReader br = new BufferedReader(f);

		String line;
		Methods methods = new Methods();
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			if (line.equalsIgnoreCase("Openbrowser")) {
				methods.openbrowser();
			}
			else if (line.equalsIgnoreCase("inputName")) {
				methods.inputName();
			}

		}

		br.close();
		System.out.println("test executed");
	}

}
