

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question2 {

	public static void main(String...strings ) {
		System.out.println("------ (Jaspal Singh) Question 2 ------");
		System.out.println("Testing method fillMap( ): ");
		Map<Integer, String> map = new HashMap();
		fillMap(map);
		System.out.println();
		System.out.println();
		System.out.println("Testing method createHashTable( ): ");
		String[] hashTable = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the prime number: ");
		var num = sc.nextInt();
		boolean isValid =isPrime(num);
		while(!isValid)
		{
			System.out.println(num + "is not a prime number!");
			System.out.print("Enter the prime number: ");
			num = sc.nextInt();
			isValid =isPrime(num);
		}
		System.out.println("Hash table created.");
		hashTable = createHashTable(map, hashTable, num);
		
		System.out.println("\n");
		System.out.println("Testing method printHashTable( ): \n");
		printHashTable(hashTable);
	}
	
	public static void fillMap(Map<Integer, String> map) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(count < 7)
		{
			System.out.print("Enter a key: ");
			var key = sc.nextInt();
			System.out.print("Enter a name: ");
			var name = sc.next();
			map.put(key, name);
			count++;
		}
		
	}
	
	public static int hash(int key, int prime_number) {
		int index = 0;
			index = key%prime_number;
		return index;
	}
	
	public static  String[] createHashTable(Map<Integer,String> map, String[] hashTable, int primeNumber) {
		hashTable = new String[primeNumber];
		for ( var key : map.keySet()) {
			var index = hash(key, primeNumber);
			if(hashTable[index] == null)
			{
				hashTable[index] = "Key: " + key.toString() + " Name: " + map.get(key);
			}
			else {
				while(hashTable[index] != null)
				{
					index++;
				}
				hashTable[index] = key.toString();
			}
		}
		
		return hashTable;
	}
	
	public static void printHashTable(String[] hashTable) {
		
		for(var item : hashTable)
		{
			System.out.println(item);
		}
		
	}
	static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 
}
