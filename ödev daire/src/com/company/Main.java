package com.company;

import java.util.Scanner;

/*Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360 */
public class Main {

    public static void main(String[] args) {
	   int aci,yaricap;
       double pi=3.14,alan;
       Scanner inp=new Scanner(System.in);

       System.out.print("yaricap:");
       yaricap= inp.nextInt();

       System.out.print("aci:");
       aci= inp.nextInt();

       alan=(pi*(yaricap*yaricap)*aci)/360;
       System.out.print("Alan:"+alan);
    }
}
