import java.io.*;
import java.util.*;

import static java.lang.System.*;

@SuppressWarnings("unchecked")
public class LexicalAnalyzer {
  
  private List<String> KEYWORDS = new ArrayList<>();
  
  public static void main(String...args) {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        lexicalAnalyzer.initializeKeyWordsList();
        String[] tokens = lexicalAnalyzer.readFile();
        lexicalAnalyzer.findKeywordsAndIdentifiers(tokens);
    }

    public void initializeKeyWordsList() {
        String[] keyWords = {"$include<stdio.h>", "#include", "<stdio.h>", "void", "main", "int", "float", "char", "return"};
        KEYWORDS = Arrays.asList(keyWords);
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
        ArrayList<String> keyWordsFound = new ArrayList<>();
        ArrayList<String> variablesFound = new ArrayList<>();
        for(int i = 0; i < tokens.length - 1; i++) {
            if(KEYWORDS.contains(tokens[i])) {
                if(!keyWordsFound.contains(tokens[i]))
                    keyWordsFound.add(tokens[i]);
            }
            else if(isVariable(tokens, i)) {
                if(!variablesFound.contains(tokens[i]))
                    variablesFound.add(tokens[i]);
            }
        }
        out.println("Key Words Found are: " + keyWordsFound);
        out.println("Variables Found are: " + variablesFound);
    }

    //All of the below can be simplified by using Regular Expression for checking [a-z][A-Z][0-9][_] input inside the variable.
    public boolean isVariable(String[] tokens, int position) {
        String token = tokens[position].trim();
        if(token.length() > 0) {
            //Checking if it is a valid C Language Variable or not.
            if (!(token.charAt(0) > 47 && token.charAt(0) < 58)) {
                for (int i = 0; i < token.length(); i++) {
                    char currentChar = token.charAt(i);
                    if (!((currentChar > 64 && currentChar < 91) || (currentChar > 96 && currentChar < 123) || (currentChar > 47 && currentChar < 58) || currentChar == 95))
                        return false;
                }
            }
            //Checking if the variable has a data type with it or not.
            if (!(KEYWORDS.contains(tokens[position - 1])))
                return false;
        }
        else
            return false;
        return true;
    }
}
