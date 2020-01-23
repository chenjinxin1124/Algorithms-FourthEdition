package chapterFiveString.No4RegularExpressions;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by chenjinxin on 2020-01-23 19:30
 */
public class GREP {

    // do not instantiate
    private GREP() { }

    /**
     * Interprets the command-line argument as a regular expression
     * (supporting closure, binary or, parentheses, and wildcard)
     * reads in lines from standard input; writes to standard output
     * those lines that contain a substring matching the regular
     * expression.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String regexp = "(.*" + args[0] + ".*)";
        NFA nfa = new NFA(regexp);
        while (StdIn.hasNextLine()) {
            String line = StdIn.readLine();
            if (nfa.recognizes(line)) {
                StdOut.println(line);
            }
        }
    }
}
