package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        String[] rps = {"r","p","s"};
        String computermove = rps[new Random().nextInt(rps.length)];
        Scanner scanner = new Scanner(System.in);
        String playermove;

        while(true) {
            System.out.println("Please enter your move (r,p or s)");
            playermove = scanner.nextLine();
            if (playermove.equals("r") || playermove.equals("p") || playermove.equals("s") ) {
                break;
            }
            System.out.println(playermove + "Is not valid");
        }
        System.out.println("computer played: " + computermove);
        if (playermove.equals(computermove)){
            System.out.println("The game was a  tie");
        }
        else if (playermove.equals("r")){
            if (computermove.equals("p")){
                System.out.println("You loose");

            }else if (computermove.equals("s")){
                System.out.println("You Win");
        }
            else if (playermove.equals("p")) {
                if (computermove.equals("r")) {
                    System.out.println("You Win");

                } else if (computermove.equals("s")) {
                    System.out.println("You Loose");
                } else if (playermove.equals("s")) {
                    if (computermove.equals("p")) {
                        System.out.println("You Win");

                    } else if (computermove.equals("r")) {
                        System.out.println("You Loose");
                    }


                }
            }}}}