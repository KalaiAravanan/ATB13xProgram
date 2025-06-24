package MyPractise;

import org.w3c.dom.ls.LSOutput;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        //This is a basic and popular pattern printing question where stars are printed in a right-angled triangle form.
        //*
        //**
        //***
        //****
        //*****

        String star = "*";
        System.out.println(star);

        for(int i =0;i<5;i++) {
            star = star + "*";
            System.out.println(star);
        }

        }
    }

