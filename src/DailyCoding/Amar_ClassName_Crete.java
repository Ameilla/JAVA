package DailyCoding;

import java.util.Scanner;

public class Amar_ClassName_Crete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        StringBuilder sb = new StringBuilder();
        String modified = str.replaceAll("\\s+,","_");
//        System.out.println(modified);
        String s ="";
        if(str.charAt(0)>='0' && str.charAt(0)<='9')sb.append("_");
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i))){
                sb.append("_");
                s += "_";
            }
            else if(str.charAt(i)=='.'){
                sb.append("");
            }else {
                s += str.charAt(i);
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

