package org.fastica.test;

import static org.junit.Assert.*;

import org.fastica.math.EigenValueDecompositionSymm;
import org.fastica.math.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class Matrix_Test {


	
	@Test
	public void add_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double [][]mat2= {{2.0,1.0}, {1.0,3.0}};
		double [][]result = Matrix.add(mat1, mat2);
		double exp[][]={{3.0,3.0}, {4.0,4.0}};
		Assert.assertEquals(result, exp);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void multiply_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double []mat2= {2,1};
		double[]result = Matrix.mult(mat1, mat2);
		double exp[]={4.0,7.0};
		Assert.assertArrayEquals(exp, result, 0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void scale_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double factor= 2;
		double[][]result = Matrix.scale(mat1, factor);
		double exp[][]={{2.0,4.0},{6.0,2.0}};
		Assert.assertArrayEquals(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void random_test() {
		
		try{
		double [][]mat= {{1.0,2.0}, {3.0,1.0}};
		int m=2;
		int n=2;
		double[][]result = Matrix.random(m,n);
		double exp[][]={{1.0,2.0},{3.0,1.0}};
		Assert.assertNotSame(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	

	@Test
	public void identity_test() {
		
		try{
		double [][]exp= {{1.0,0.0}, {0.0,1.0}};
		double[][]result = Matrix.identity(2);
		Assert.assertArrayEquals(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void diag_test() {
		
		try{
		double []mat= {1.0,2.0};
		double[][]result = Matrix.diag(mat);
		double [][]exp= {{1.0,0.0}, {0.0,2.0}};
		Assert.assertArrayEquals(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void getValofCol_test() {
		
		try{
		double [][]mat= {{3.0,2.0}, {1.0,3.0}};
		int j=0;
		double[]result = Matrix.getVecOfCol(mat, j);
		double []exp= {3.0,1.0};
		Assert.assertArrayEquals(exp, result, 0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void getValofRow_test() {
		
		try{
		double [][]mat= {{3.0,2.0}, {1.0,3.0}};
		int j=0;
		double[]result = Matrix.getVecOfRow(mat, j);
		double []exp= {3.0,2.0};
		Assert.assertArrayEquals(exp, result, 0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void square_test() {
		
		try{
		double [][]mat= {{3.0,2.0}, {1.0,3.0}};
		double[][]result = Matrix.square(mat);
		double [][]exp= {{13.0,9.0}, {9.0,10.0}};
		Assert.assertArrayEquals(exp, result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void toString_test() {
		
		try{
		double [][]mat= {{1.0,2.0}, {3.0,1.0}};
		String matStr = Matrix.toString(mat);
		String expStr=("                     1.0                     2.0\n"+
				       "                     3.0                     1.0\n");
		Assert.assertNotSame(matStr, expStr);
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void sub_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double [][]mat2= {{2.0,1.0}, {1.0,3.0}};
		double [][]result = Matrix.sub(mat1, mat2);
		double exp[][]={{-1.0,1.0}, {2.0,-2.0}};
		Assert.assertEquals(result, exp);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
}
