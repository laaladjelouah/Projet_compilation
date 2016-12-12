import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {

			File f = new File("try.txt");
			FileReader  myFile = new FileReader(f);
			Yylex myLex = new Yylex(myFile);
			Parser myParser = new Parser(myLex);
				myParser.parse();


	}

}