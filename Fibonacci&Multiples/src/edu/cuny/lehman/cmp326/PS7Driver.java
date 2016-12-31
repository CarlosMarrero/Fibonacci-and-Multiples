package edu.cuny.lehman.cmp326;

public class PS7Driver {

    public static void main(String[] args) {

        // testing Problem 1
        System.out.println("Testing prob1(). Should print 57918:");
        System.out.println(PS7.prob1());
        System.out.println("Testing prob1Rec(). Should print 57918:");
        System.out.println(PS7.prob1Rec(0, 1));

        // testing Problem 2
        System.out.println("Testing prob2(). Should print 1089154:");
        System.out.println(PS7.prob2());
        System.out.println("Testing prob2Rec(). Should print 1089154:");
        System.out.println(PS7.prob2Rec(0, 0, 1));

    }

}
