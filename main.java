import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] primes = new int[26];

        String s = new String();
        primes = getPrime();
        s = input.nextLine();
        getCode(s,primes);
    }

    public static String convertToHex(int n)
    {
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String res = new String();
        String str = new String();
        int rem;

        while(n > 0)
        {
            rem = n % 16;
            res += hex[rem];
            n /= 16;
        }

        for(int i=0;i<res.length();i++)
        {
            str += res.charAt(res.length()-1-i);
        }

        return str;
    }

    public static int[] getPrime()
    {
        int k=0;
        int[] count = new int[26];
        boolean[] prime = new boolean[102];

        for(int i=0;i<prime.length;i++)
            prime[i] = true;

        for(int i=2;i<prime.length;i++)
        {
            for(int j=2;j < prime.length && i*j < prime.length;j++)
            {
                prime[i*j] = false;
            }
        }

        prime[0] = false;
        prime[1] = false;
        prime[2] = true;

        for(int i=0;i<prime.length;i++)
        {
            if(prime[i]) {
                count[k] = i;
                k++;
            }
        }

        return count;
    }

    public static void getCode(String s,int[] primes)
    {
        String[] code = new String[s.length()];
        s = s.toLowerCase();
        int index;

        for(int i=0;i<s.length();i++)
        {
            index = s.charAt(i) + 0 - 97;
            System.out.println(index);
            code[i] = convertToHex(primes[index]);
        }
        System.out.println("The code for given string : "+s+ " is as follows ......");
        for(int i=0;i<code.length;i++)
            System.out.print(code[i]+",");
    }
}
