package co.edureka.io;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/edureka.xls");
		String data = "NITR - PGP in Bigdata.... first modulle starts from 28th Sept 2019 ";
		fout.write(data);
		//data.getBytes() - to convert String to byte[]
		System.out.println("file saved");
		fout.close();
	}

}
