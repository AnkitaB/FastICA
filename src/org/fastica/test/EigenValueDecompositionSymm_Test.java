package org.fastica.test;

import static org.junit.Assert.*;

import org.fastica.math.EigenValueDecompositionSymm;
import org.fastica.math.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class EigenValueDecompositionSymm_Test {

	@Test
	public void multiply() {
		
		try{
			double [][]mat= {{1.0,2.0}, {3.0,1.0}};
		
		mat = Matrix.mult(mat, Matrix.transpose(mat));
		double [][]expMat= {{5.0,5.0}, {5.0,10.0}};
		Assert.assertArrayEquals(mat, expMat);
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void eigenValues() {
		
		try{
		double [][]mat= {{1.0,2.0}, {3.0,1.0}};
		mat = Matrix.mult(mat, Matrix.transpose(mat));
		
		EigenValueDecompositionSymm evd = new EigenValueDecompositionSymm(mat);
		double eValues[]=evd.getEigenValues();
		double expEv[]={1.909830056250526,13.090169943749475};
		Assert.assertArrayEquals(eValues, expEv, 0.1);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}

	@Test
	public void eigenVectors() {
		
		try{
		double [][]mat= {{1.0,2.0}, {3.0,1.0}};
		mat = Matrix.mult(mat, Matrix.transpose(mat));		
		EigenValueDecompositionSymm evd = new EigenValueDecompositionSymm(mat);
		double eValues[][]=evd.getEigenVectors();
		double expEv[][]={{-0.8506508083520399,0.5257311121191336},{0.5257311121191336,0.8506508083520399}};
		Assert.assertEquals(eValues, expEv);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
}
