package chapterFiveString.Overview;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by chenjinxin on 2020-01-17 16:50
 */
public class Count {
    // Do not instantiate.
    private Count() { }

    /**
     * Reads in text from standard input; calculates the frequency of
     * occurrence of each character over the alphabet specified as a
     * commmand-line argument; and prints the frequencies to standard
     * output.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet("ABCDR");
        int R = alphabet.R();
        int[] count = new int[R];

        try {
            //File StdIn = new File("abra.txt");
            InputStream StdIn = new FileInputStream("C:\\Users\\YEYILING\\Desktop\\Algorithms-FourthEdition\\src\\chapterFiveString\\abra.txt");
            //System.out.println(StdIn.read());65
            //System.out.println(StdIn.read());66
            //String s = StdIn.toString();
            //String s = System.in.readAll();
            char ch;
            while ((ch = (char)StdIn.read())>=65){
                //System.out.println(ch);
                if (alphabet.contains(ch))
                    count[alphabet.toIndex(ch)]++;
            }

            for (int c = 0; c < R; c++)
                System.out.println(alphabet.toChar(c) + " " + count[c]);
                //StdOut.println(alphabet.toChar(c) + " " + count[c]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
