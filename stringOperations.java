import java.util.*;

class stringOperations
{
	String s1, s2;
	Scanner sc = new Scanner(System.in);
	void checkEqual()
	{
		System.out.println("Enter string 1: ");
		s1 = sc.next();
		System.out.println("Enter string 2: ");
		s2 = sc.next();
		if(s1.compareTo(s2)==0)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	}

	void compareString()
	{
		System.out.println("Enter string 1: ");
		s1 = sc.next();
		System.out.println("Enter string 2: ");
		s2 = sc.next();
		if(s1.compareTo(s2)==0)
			System.out.println("Strings are equal");
		else if(s1.compareTo(s2)>0)
			System.out.println(s1+" is greater than "+s2);
		else
			System.out.println(s2+" is greater than "+s1);
	}

	void checkPalindrome()
	{
		String forw, rev="";
		System.out.println("Enter the string: ");
		forw = sc.next();
		int len = forw.length();
		for(int i = len-1; i>=0; i--)
			rev = rev + forw.charAt(i);
		if(forw.equals(rev))
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("Entered string is not a palindrome");
	}

	void reverseString()
	{
		String s2="";
		System.out.println("Enter the string: ");
		sc.nextLine();
		s1 = sc.nextLine();
		StringBuffer buffer = new StringBuffer(s1);
		buffer.reverse();
		System.out.println("String after reversing: "+buffer);
	}

	void replaceSubs()
	{
		System.out.println("Enter the string: ");
		String s = sc.next();
		System.out.println("Enter substring to be replaced: ");
		String sub = sc.next();
		System.out.println("Enter new substring: ");
		String nsub = sc.next();
		String rep = s.replaceAll(sub,nsub);
		System.out.println("After replacing: "+rep);
	}

	void count()
	{
		System.out.println("Enter the string: ");
    sc.nextLine();
		String s = sc.nextLine();
		int vowels=0,consonants=0,spaces=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
                 vowels++;
			else if(ch==' ')
                spaces++;
			else
                consonants++;
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Spaces: "+spaces);
	}

	public static void main(String[] args)
	{
		stringOperations obj = new stringOperations();
		int ch;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("\n\t\tMENU\n1. Check whether two strings are equal\n2. Compare two strings\n3. Check whether string is a palindrome\n4. Reverse the string\n5. Replace substring with another string\n6. Count no. of vowels, consonants & blank spaces\n7. Exit");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				obj.checkEqual();
				break;
			case 2:
				obj.compareString();
				break;
			case 3:
				obj.checkPalindrome();
				break;
			case 4:
				obj.reverseString();
				break;
			case 5:
				obj.replaceSubs();
				break;
			case 6:
				obj.count();
				break;
			case 7:
				break;
		}
	}while(ch != 7);
	}
}
