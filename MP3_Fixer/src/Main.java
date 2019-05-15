import java.io.File;
import java.io.IOException;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public final class Main {
	public static void main(String[] args) {
		String fname = null;
		Mp3File mp3file = null;
		if (args.length > 0) {
			fname = args[1];
		}
		File f = new File(fname);
		if (! f.exists()) {
			System.out.println("file not found");
			System.exit(1);
		}
		if( f.isDirectory()) {
			System.out.println("Directory unsupported...");
		}
		else {
			try {
				mp3file = new Mp3File("SomeMp3File.mp3");
			} catch (UnsupportedTagException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (InvalidDataException e) {
				e.printStackTrace();
				System.exit(2);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(3);
			}
		}
		if (mp3file == null) {
			System.out.println("null object after assign block");
		}
		else {
			System.out.println("Decode the mp3 file header info here");
		}
	}
}
