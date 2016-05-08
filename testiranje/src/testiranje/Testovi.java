package testiranje;

import java.awt.List;
import java.util.ArrayList;

public class Testovi {
public static ArrayList<Integer> generate(int n)
{
	ArrayList<Integer> primes= new ArrayList<Integer>();
	for (int candidate=2;n>1;candidate++)
	{
		for(;n%candidate==0;n/=candidate)
			primes.add(candidate);
	}
	return primes;
}

}
