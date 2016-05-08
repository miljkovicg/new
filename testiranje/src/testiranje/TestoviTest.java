package testiranje;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class TestoviTest extends TestCase {
       Testovi t= new Testovi();
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : ints)
		list.add(i);
		return list;
		}
	public void testOne()
	{
		assertEquals(list(),t.generate(1));
	}
	public void testTwo(){
		assertEquals(list(2,5),t.generate(10));
	}
	public void testThree(){
		assertEquals(list(2,2,3),t.generate(12));
	}
	public void testFour(){
		assertEquals(list(2,2,2,3),t.generate(24));
	}

}
