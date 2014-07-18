package org.fastica.test;

import static org.junit.Assert.*;

import org.fastica.math.Matrix;
import org.fastica.math.Vector;
import org.junit.Assert;
import org.junit.Test;

public class Vector_Test {

	@Test
	public void equals_test() {
		
		try{
		double []vec1= {1.0,2.0,3.0};
		double []vec2= {1.0,2.0,3.0};
		boolean result= Vector.equals(vec1, vec2);
		Assert.assertTrue(result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void equals2_test() {
		
		try{
		double []vec1= {1.0,2.0,3.0};
		double []vec2= {1.0,2.0};
		boolean result= Vector.equals(vec1, vec2);
		Assert.assertFalse(result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}

	@Test
	public void string_test() {
		
		try{
		double []vec1= {1.0,2.0};
		String result= Vector.toString(vec1);
		String expected="                     1.0\n                     2.0\n";
		Assert.assertEquals(result,expected);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void newVector_test() {
		
		try{
		double val=3;
		int m=4;
		double result[]= Vector.newVector(m, val);
		double exp[]={3,3,3,3};
		Assert.assertArrayEquals(result, exp,0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void scale_test() {
		
		try{
		double []mat1= {1.0,2.0,3.0,1.0};
		double factor= 2;
		double[]result = Vector.scale(factor, mat1);
		double exp[]={2.0,4.0,6.0,2.0};
		Assert.assertArrayEquals(exp, result, 0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void dot_test() {
		
		try{
		double []mat1= {1.0,2.0,3.0,1.0};
		double []mat2= {1.0,2.0,3.0,1.0};
		double result = Vector.dot(mat2, mat1);
		double exp=15.0;
		Assert.assertEquals(exp, result, 0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void add_test() {
		
		try{
		double []mat1= {1.0,2.0,3.0,1.0};
		double []mat2= {1.0,2.0,3.0,1.0};
		double result[] = Vector.add(mat2, mat1);
		double exp[]= {2.0,4.0,6.0,2.0};
		Assert.assertArrayEquals(exp, result, 0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void sub_test() {
		
		try{
		double []mat1= {1.0,2.0,3.0,1.0};
		double []mat2= {2.0,1.0,5.0,0.0};
		double result[] = Vector.sub(mat2, mat1);
		double exp[]= {1.0,-1.0,2.0,-1.0};
		Assert.assertArrayEquals(exp, result, 0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void clone_test() {
		
		try{
		double []mat1= {1.0,2.0,3.0,1.0};
		double result[] = Vector.clone(mat1);
		double exp[]= {1.0,2.0,3.0,1.0};
		Assert.assertArrayEquals(exp, result, 0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void random_test() {
		

		try{
		double []mat= {1.0,2.0,3.0,1.0};
		int m=4;	
		double[]result = Vector.random(m);
		double exp[]={1.0,2.0,3.0,1.0};
		Assert.assertNotSame(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void addVecToSet_test() {
		
		try{
			double [][]mat= {{1.0,2.0}, {3.0,1.0}};	
			double []vec= {1.0,2.0,3.0,1.0};		
			double[][]result = Vector.addVecToSet(mat, vec);
			double exp[][]={{2.0,3.0}, {5.0,3.0}};
			Assert.assertArrayEquals(exp, result);
			}		
			catch (Exception e) {
				// TODO Auto-generated catch block
				fail("Not yet implemented");
			}
	}
}
