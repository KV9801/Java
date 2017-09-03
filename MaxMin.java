import java.util.*;

class sort
{
	void asc(int[] a)
	{
		int l = a.length;
		int temp=0;
		for(int i=0; i < l; i++)
		{  
            for(int j=1; j < (l-i); j++)
			{  
                if(a[j-1] > a[j])
				{    
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                }
			}
		}	
	}
	
	void rearrange(int[] a)
	{
		int l = a.length;
		int temp[] = new int[l];
		int first=0, last=l-1;
		boolean flag = true;
		for (int i=0; i < l; i++)
        {
            if (flag)
                temp[i] = a[last--];
            else
                temp[i] = a[first++];
     
            flag = !flag;
        }
		for (int i=0; i < l; i++)
            a[i] = temp[i];
	}
}

class MaxMin
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		sort obj = new sort();
		System.out.println("Enter the number of elements in the array: ");
		n = sc.nextInt();
		int[] a = new int[n];
		int[] temp = new int[n];
		System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
		obj.asc(a);
		obj.rearrange(a);
		System.out.println("\nAfter rearranging: ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");	}
}
