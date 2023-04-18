import java.io.*;
import java.util.*;

import static java.lang.System.*;

@SuppressWarnings("unchecked")
public class LexicalAnalyzer {

    private List<String> KEYWORDS = new ArrayList<>();
    private List<String> OPERATORS = new ArrayList<>();

    public void initializeKeyWordsList() {
        String[] keyWords = {"$include<stdio.h>", "#include", "<stdio.h>", "void", "main", "int", "float", "char", "return"};
        KEYWORDS = Arrays.asList(keyWords);
    }

    public void initializeOperatorsList() {
        String[] operators = {"+", "-", "*", "/", "%", "&", "|", "^", "&=", "|=", "^=", "=", "+=", "-=", "*=", "/=", "%=", ">", "<", ">=", "<=", "==", "!=", "&&", "||", "!"};
        OPERATORS = Arrays.asList(operators);
    }

    public static void main(String...args) {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        lexicalAnalyzer.initializeKeyWordsList();
        lexicalAnalyzer.initializeOperatorsList();
        String[] tokens = lexicalAnalyzer.readFile();
        lexicalAnalyzer.findKeywordsAndIdentifiers(tokens);
    }

    public String[] readFile() {
        String fileInput = "";
        String[] tokens = {""};
        try {
            File file = new File("C:\\Users\\DELL\\Desktop\\temp.c");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                fileInput = fileInput + sc.nextLine() + " ";
            fileInput = fileInput.replace('\t', ' ');
            tokens = fileInput.split(" ");
            out.println("List of all tokens: ");
            for(int i = 0; i < tokens.length; i++) {
                tokens[i] = tokens[i].replace(';', ' ').trim();
                if(!tokens[i].isEmpty())
                    out.println(tokens[i]);
            }
        } catch(FileNotFoundException fileNotFoundException) {
            out.println("File was not found.");
            exit(1);
        }
        return tokens;
    }

    public void findKeywordsAndIdentifiers(String[] tokens) {
        ArrayList<String> operatorsFound = new ArrayList<>();
        ArrayList<String> variablesFound = new ArrayList<>();
        for(int i = 0; i < tokens.length - 1; i++) {
            if(OPERATORS.contains(tokens[i])) {
                if(!operatorsFound.contains(tokens[i]))
                    operatorsFound.add(tokens[i]);
            }
            else if(isVariable(tokens, i)) {
                if(!variablesFound.contains(tokens[i]))
                    variablesFound.add(tokens[i]);
            }
        }
        out.println("Operators Found are: " + operatorsFound);
        out.println("Variables Found are: " + variablesFound);
    }

    public boolean isVariable(String[] tokens, int position) {
        String token = tokens[position].trim();
        if(KEYWORDS.contains(token))
            return false;
        if(token.length() > 0) {
            //Checking if it is a valid C Language Variable or not.
            if (!(token.charAt(0) > 47 && token.charAt(0) < 58)) {
                for (int i = 0; i < token.length(); i++) {
                    char currentChar = token.charAt(i);
                    if (!((currentChar > 64 && currentChar < 91) || (currentChar > 96 && currentChar < 123) || (currentChar > 47 && currentChar < 58) || currentChar == 95))
                        return false;
                }
            } else {
                return false;
            }
        }
        else
            return false;
        return true;
    }
}
