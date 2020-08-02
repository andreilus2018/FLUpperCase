import java.util.regex.*;

public class FLUpperCase {

	public static String translator(String phrase) {
		if (!(phrase.matches("\\s*") || phrase==null)) {
			StringBuffer words = new StringBuffer("");
			for (String nextWord : phrase.split("\\s")) {
				StringBuffer tempBuf = new StringBuffer(nextWord);
				tempBuf.setCharAt(0,Character.toUpperCase(nextWord.charAt(0)));
				words.append(tempBuf.toString() + " ");
			}
		return words.toString();
		} else return null;
	}

	public static void main(String[] args) {
		System.out.println(translator("your text goes here"));
	}
}