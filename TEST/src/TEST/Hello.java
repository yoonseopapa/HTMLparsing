package TEST;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Hello {

	public static void main(String[] args) throws IOException {
		
		File input = new File("D:\\file.html"); 
		Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
		String test = doc.toString();
		String last = Jsoup.parse(test).text();
		String createfile="D:\\csvfile1818.csv";
		FileWriter fw = new FileWriter(createfile);
			fw.append(last);
		fw.flush();
		fw.close();
	}

}
