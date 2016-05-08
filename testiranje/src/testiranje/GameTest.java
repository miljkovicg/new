package testiranje;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class GameTest extends TestCase {

	Game g= new Game();
	
	public void testOne(){
	for(int i=0;i<20;i++)
		g.roll(0);
	assertEquals(0, g.score());
	}
	public void testTwo(){
		for(int i=0;i<20;i++)
			g.roll(4);
		assertEquals(80, g.score());
	}
	public void testThree(){
		for(int i=0;i<18;i++)
			g.roll(3);
		g.roll(10);
		g.roll(2);
		g.roll(3);
		assertEquals(69,g.score());
	}

	public void testFour()
	{
		g.roll(3);
		g.roll(7);
		g.roll(3);
		for(int i=0;i<17;i++)
			g.roll(1);
		assertEquals(33,g.score());
	}
	public void testFive()
	{
		for(int i=0;i<6;i++)
			g.roll(2);
		g.roll(5);
		g.roll(5);
		g.roll(2);
		g.roll(8);
		g.roll(3);
		g.roll(3);
		for(int i=0;i<6;i++)
		  g.roll(0);
		assertEquals(43,g.score());
	}
	public void testSix(){
		g.roll(10);
		for(int i=0;i<18;i++)
			g.roll(1);
		assertEquals(30,g.score());
	}
	public void testSeven()
	{
		for(int i=0; i<4;i++)
			g.roll(1);
		g.roll(10);
		g.roll(5);
		g.roll(5);
		g.roll(3);
		for(int i=0;i<11;i++)
			g.roll(0);
		assertEquals(40,g.score());
	}

}
