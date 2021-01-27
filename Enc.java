import java.util.*;
import java.lang.Math;
class Enc
{
    public static void enc()
    {
        String txt;
        String key;
        Scanner sc = new Scanner(System.in);
        StringBuffer string = new StringBuffer();
        
        ArrayList<Character> a = new ArrayList<Character>(Arrays.asList(' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5',
    '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'));
        
        System.out.print("Enter Text to be Encrypted : ");    
        txt=sc.nextLine();
        System.out.println(txt+txt.length());

        System.out.print("Enter Password : ");    
        key=sc.nextLine();
        System.out.println(key+"1");
        char[] ch = new char[txt.length()];  
        for (int i = 0; i < txt.length(); i++)
        { 
            ch[i] = txt.charAt(i); 
        } 
        System.out.println(key+"2");
        System.out.println(a);
        for(int i=0 ; i<key.length() ; i++)
        {
            int j = key.charAt(i);
            System.out.println(j);
            Collections.shuffle(a, new Random(j));
        }
        System.out.println(key+"3");
        System.out.println(a.size());

        int inc = key.charAt(0)%95;
        int inc_factor=key.charAt(0)%95;
        for(int i=1 ; i<key.length() ; i++)
        {
            if(inc_factor==inc)
            {
                inc_factor=key.charAt(i)%95;
            }
            else break;
        }
        if(inc_factor==inc)
        {
            inc_factor = (inc+50)%95;
        }

        System.out.println(key+"4");

        int flag=0;
        StringBuffer temp = new StringBuffer("");
        for (int i = 0; i < txt.length(); i++)
        {
            
            System.out.println("i :"+i);
            System.out.println(temp);
            System.out.println(inc);
            System.out.println(inc_factor);
            System.out.println(flag);
            if(flag==0)
            {
                
                int ind = a.indexOf(txt.charAt(i));
                System.out.println(a);
                System.out.println("Index : "+ind);
                temp.append(a.get((ind+inc)%95));
                flag=1;
            }
            else
            {
                int ind = a.indexOf(txt.charAt(i));
                System.out.println("Index : "+ind);
                temp.append(a.get(Math.abs((ind-inc)%95)));
                flag=0;
            }
            inc += inc_factor;
        }         
        System.out.println("\nEncrypted text is : "+temp);
        sc.close();
    }
    public static void dec()
    {
        String txt;
        String key;
        Scanner sc = new Scanner(System.in);
        StringBuffer string = new StringBuffer();
        
        ArrayList<Character> a = new ArrayList<Character>(Arrays.asList(' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5',
    '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'));
        
        System.out.print("Enter Text to be Decrypted : ");    
        txt=sc.nextLine();
        System.out.println(txt+txt.length());

        System.out.print("Enter Password : ");    
        key=sc.nextLine();
        System.out.println(key+"1");
        char[] ch = new char[txt.length()];  
        for (int i = 0; i < txt.length(); i++)
        { 
            ch[i] = txt.charAt(i); 
        } 
        System.out.println(key+"2");
        System.out.println(a);
        for(int i=0 ; i<key.length() ; i++)
        {
            int j = key.charAt(i);
            System.out.println(j);
            Collections.shuffle(a, new Random(j));
        }
        System.out.println(key+"3");
        System.out.println(a.size());

        int inc = key.charAt(0)%95;
        int inc_factor=key.charAt(0)%95;
        for(int i=1 ; i<key.length() ; i++)
        {
            if(inc_factor==inc)
            {
                inc_factor=key.charAt(i)%95;
            }
            else break;
        }
        if(inc_factor==inc)
        {
            inc_factor = (inc+50)%95;
        }

        System.out.println(key+"4");

        int flag=1;
        StringBuffer temp = new StringBuffer("");
        for (int i = 0; i < txt.length(); i++)
        {
            
            System.out.println("i :"+i);
            System.out.println(temp);
            System.out.println(inc);
            System.out.println(inc_factor);
            System.out.println(flag);
            if(flag==0)
            {
                
                int ind = a.indexOf(txt.charAt(i));
                System.out.println(a);
                System.out.println("Index : "+ind);
                temp.append(a.get((ind+inc)%95));
                flag=1;
            }
            else
            {
                int ind = a.indexOf(txt.charAt(i));
                System.out.println("Index : "+ind);
                temp.append(a.get(Math.abs((ind-inc)%95)));
                flag=0;
            }
            inc += inc_factor;
        }         
        System.out.println("\nDecrypted text is : "+temp);
        sc.close();
    }

    public static void main(String args[])
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Encryption/Decryption\n");
        do
        {
            System.out.print("1.Encryption\n2.Decryption\n3.Exit\n\nEnter Your Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 :
                enc();
                break;
                case 2 :
                dec();
                break;
                case 3 :
                break;
                default:
                System.out.println("Please Enter Valid Choice...");
            }
        }while(ch!=3);
        sc.close();
    }
}