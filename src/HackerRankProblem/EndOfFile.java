package HackerRankProblem;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 10-02-2022
 * Time: 23:07
 */

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(n +" "+str);
            n++;
        }

    }
}
