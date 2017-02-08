package getMod;

import java.util.Scanner;

public class getMod_main {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Input n > ");
int n =Integer.parseInt(scan.next());

System.out.println("Input m > ");
int m =Integer.parseInt(scan.next());

getMod_lib clib = new getMod_lib(n,m);
clib.devide(m,n);
System.out.println("n / m = "+clib.getsyou());
System.out.println("n % n = "+clib.getamari());
}

}
