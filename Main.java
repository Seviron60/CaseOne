package main.Java;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int numb1 = Integer.parseInt(s);
            String bukv = "abcdefghigklmnopqrstuvwxyz";
            String pr = " ";
            char[][] myArray = new char[numb1][numb1];
            for (int i = 0; i < numb1; i++) {
                myArray[i][i] = bukv.charAt(0);
                myArray[numb1 - 1 - i][i] = bukv.charAt(0);
            }
                for (int a=0; a<numb1-1;a++)
                { int n=0;
                    for (int b=0;b<numb1-1;b++)
                    {
                        for (int c=0; c<numb1-1;c++)
                        { int x=a;
                            if(x>bukv.length()-1)
                            {x=x-(bukv.length()-1);}
                            int v=a+1;
                            if(v>bukv.length()-1)
                            {v=(a+1)-(bukv.length()-1);
                            }
                            if(myArray[b][c]==bukv.charAt(x)) {
                            if (c < numb1 - 1 && myArray[b][c + 1] == 0) {
                                myArray[b][c + 1] = bukv.charAt(v);
                                n++;
                            }
                            if (b < numb1 - 1 && myArray[b + 1][c] == 0) {
                                myArray[b+1][c] = bukv.charAt(v);
                                n++;
                            }
                            if (b>0 && myArray[b - 1][c] == 0) {
                                myArray[b-1][c] = bukv.charAt(v);
                                n++;
                            }
                            if (c>0 && myArray[b][c-1] == 0) {
                                myArray[b][c-1] = bukv.charAt(v);
                                n++;
                            }

                        }
                        }
                    }
                    if(n!=0)
                    {n=0;}
                    else
                    {break;}
                }




                        for (int i = 0; i < numb1; i++) {
                            for (int l = 0; l < numb1; l++) {
                                System.out.print(myArray[i][l]);
                            }
                            System.out.println();
                        }


        } catch
        (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }
}