package jagrammar;

import org.antlr.runtime.*;
import java.lang.reflect.Field;
import java.util.*;

public class JaLexerDriver {

    public static void main(String[] args) throws Exception {
        CreateMap();
        // reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        Lexer lexer = new JaLexer(input);

        Token token;

        double s = 0;
        System.out.println("Start reading tokens...");
        while ((token = lexer.nextToken()) != Token.EOF_TOKEN) {
            // s += lexer.lex(token.getText());
            System.out.println("Token " + d.get(token.getType()) + ":" + token.getText());
        }
    }
    private static Dictionary d = new Hashtable();

    private static void CreateMap() {
        for (Field f : JaLexer.class.getDeclaredFields()) {
            try {
                d.put(f.get(null), f.getName());
            } catch (Exception e) {
            }
        }
    }
}
