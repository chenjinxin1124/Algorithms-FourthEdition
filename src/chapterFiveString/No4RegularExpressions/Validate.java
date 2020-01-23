package chapterFiveString.No4RegularExpressions;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by chenjinxin on 2020-01-23 19:30
 */

public class Validate {

    public static void main(String[] args) {
        String regexp = args[0];
        String text   = args[1];
        StdOut.println(text.matches(regexp));
    }

}
