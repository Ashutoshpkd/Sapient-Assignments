import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        Map<String, Set<String> > syn = new LinkedHashMap<> (  );
        Set<String> s = new HashSet<> (  );
        Set<String> s1 = new HashSet<> (  );
        s.add ( "GoodMorning" );
        s.add ( "Bonjour" );
        s.add ( "Shubhohday" );
        s.add ( "Subhodaya" );
        syn.put ( "GoodMorning",s);

        s1.add ( "good Evening" );
        s1.add("Subha sange");
        s1.add ( "susandhya" );
        s1.add ( "Bonsoir" );

        syn.put ( "GoodEvening" ,s1);

        String user = new String (  );
        user = input.nextLine ();

        if(syn.containsKey ( user ))
        {
            printSynonyms(syn,user);
        }

        else
        {
            System.out.println ("Do u want to add synonym for the word ....");
            getSynonyms(syn,user);
        }

    }

    public static void printSynonyms(Map<String, Set<String>> syn, String user)
    {
            System.out.println (syn.get ( user ));
    }

    public static void getSynonyms(Map<String, Set<String>> syn,String user)
    {
        String answer = new String (  );
        Set<String> s = new HashSet<> (  );
        Scanner input = new Scanner ( System.in );
        int ans;
        ans = input.nextInt();

        if(ans == 1)
        {

            answer = input.nextLine ();

            while(!answer.isEmpty ())
            {
                s.add(answer);
                answer = input.nextLine ();
            }

            syn.put ( user,s );
            System.out.println ("Synonyms successfully added #####");
            printSynonyms ( syn,user );
        }

        else
        {
            System.out.println ("Exiting the program ......");
        }
    }

}
