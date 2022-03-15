package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int n1, int n2, int n3){ //(int a; int b; int c)
     a = n1; //  this.a = a;
     b = n2;  //  this.b = b;
     c = n3; //  this.c = c;
    }

    public int getPerimeter(){
        return a+b+c;
    }
}
