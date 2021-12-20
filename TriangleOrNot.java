import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] triangleOrNot(int[] a, int[] b, int[] c) {
        boolean triangle=false;
        int[] values;
        String[] result = new String[a.length];
        //true = nondegenerate triangle
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" "+b[i]+" "+c[i]+" \n");
                if(a[i]+b[i]>c[i] && c[i]+a[i]>b[i] && b[i]+c[i]>a[i])
                {
                   result[i]="Yes";
                }
                else
                {
                    result[i]="No";
                }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int b_size = 0;
        b_size = Integer.parseInt(in.nextLine().trim());

        int[] b = new int[b_size];
        for(int i = 0; i < b_size; i++) {
            int b_item;
            b_item = Integer.parseInt(in.nextLine().trim());
            b[i] = b_item;
        }

        int c_size = 0;
        c_size = Integer.parseInt(in.nextLine().trim());

        int[] c = new int[c_size];
        for(int i = 0; i < c_size; i++) {
            int c_item;
            c_item = Integer.parseInt(in.nextLine().trim());
            c[i] = c_item;
        }

        res = triangleOrNot(a, b, c);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
