package org.fastica.test;

import static org.junit.Assert.fail;
import org.fastica.BelowEVFilter;
import org.fastica.CompositeEVFilter;
import org.fastica.FastICA;
import org.fastica.FirstEVFilter;
import org.fastica.GaussCFunction;
import org.fastica.PCA;
import org.fastica.PercentageEVFilter;
import org.fastica.Power3CFunction;
import org.fastica.SortingEVFilter;
import org.fastica.TanhCFunction;
import org.junit.Assert;
import org.junit.Test;

public class FastICA_Test {

	
	@Test
	public void deltaMatrices_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double [][]mat2= {{2.0,1.0}, {1.0,3.0}};
		double result = FastICA.deltaMatrices(mat1,mat2);
		double exp=1.5;
		Assert.assertEquals(result,exp,0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void deltaVectors_test() {
		
		try{
		double []vec1= {1.0,2.0,3.0,1.0};
		double []vec2= {2.0,1.0,1.0,3.0};
		double result = FastICA.deltaVectors(vec1,vec2);
		double exp=1.5;
		Assert.assertEquals(result,exp,0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void powerSymmMatrix_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double power=2;
		double result[][] = FastICA.powerSymmMatrix(mat1,power);
		double exp[][]={{9.999999999999998,5.999999999999998}, {5.999999999999998,9.999999999999998}};
		Assert.assertEquals(exp,result);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void inVector_test() {
		
		try{
		double []vec1= {1.0,2.0,3.0,1.0};
		double[] result = FastICA.invVector(vec1);
		double[] exp={1.0,0.5,0.3333333333333333,1.0};
		Assert.assertArrayEquals(exp,result,0.0);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void sqrtVector_test() {
		
		try{
		double []vec1= {1.0,4.0,9.0,16.0};
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		FastICA fast = new FastICA(mat1, 1);
		double[] result = fast.sqrtVector(vec1);
		double[] exp={1.0,2.0,3.0,4.0};
		Assert.assertArrayEquals(exp,result,0.0);
		FirstEVFilter fv= new FirstEVFilter(0);
		fv.passEigenValues(vec1, mat1);
		fv.getEigenValues();
		fv.getEigenVectors();
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void passEigenValues_test() {
		
		try{
		double d=5.0;
		boolean bool= true;
		double []vec1= {1.0,4.0,9.0,16.0};
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		BelowEVFilter below = new BelowEVFilter(d,bool);
		below.passEigenValues(vec1, mat1);
		below.getEigenValues();
		below.getEigenVectors();
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void function_test() {
		
		try{
		double a=5.0;
		GaussCFunction gc= new GaussCFunction(a);
		double result= gc.function(a);
		double exp =3.593E-27;
		Assert.assertEquals(exp,result,0.0001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void derivative_test() {
		
		try{
		double a=5.0;
		GaussCFunction gc= new GaussCFunction(a);
		double result= gc.derivative(a);
		double exp =-8.91284935643E-26;
		Assert.assertEquals(exp,result,0.00000001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	
	
	@Test
	public void passEigenValuesComp_test() {
		
		try{
		double []vec1= {1.0,4.0,9.0,16.0};
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		CompositeEVFilter below = new CompositeEVFilter();
		below.passEigenValues(vec1, mat1);
		below.getEigenValues();
		below.getEigenVectors();
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void calcMeanValues_test() {
		
		try{
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		PCA pca = new PCA(mat1);
		PCA.calcMeanValues(mat1);
		pca.getEigenValues();
		pca.getEigenVectors();
		pca.getVectorsZeroMean();
		pca.getResultingVectors();
		pca.getMeanValues();
		double[] result=PCA.calcMeanValues(mat1);
		double [] exp={1.5,2.0};
		Assert.assertArrayEquals(exp, result, 0.001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	
	@Test
	public void tanc_test() {
		
		try{
		double x = 30;
		TanhCFunction tanh = new TanhCFunction(x);
		double result= tanh.function(x);
		double exp = 0.9999999969540041;
		Assert.assertEquals(exp, result, 0.001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void tanderivative_test() {
		
		try{
		
		double x = 2;
		TanhCFunction tanh = new TanhCFunction(x);
		double result= tanh.derivative(x);
		double exp = 0.0026819013;
		Assert.assertEquals(exp, result, 0.001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	
	
	@Test
	public void pow_test() {
		
		try{
		double x = 30;
		Power3CFunction pow = new Power3CFunction();
		double result= pow.function(x);
		double exp = 27000.0;
		Assert.assertEquals(exp, result, 0.001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void derivative_test1() {
		
		try{
		
		double x = 2;
		Power3CFunction pow = new Power3CFunction();
		double result= pow.derivative(x);
		double exp = 12.0;
		Assert.assertEquals(exp, result, 0.001);
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void SortingEV_test() {
		
		try{		
		double x = 2;
		SortingEVFilter sort = new SortingEVFilter(true, true);
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double []vec1= {1.0,4.0};
		sort.passEigenValues(vec1, mat1);
		double []result = sort.getEigenValues();
		double[] exp={4.0,1.0};
		Assert.assertArrayEquals(exp, result, 0);
		double[][] result1=sort.getEigenVectors();
		double[][] exp1={{2.0,1.0}, {1.0,3.0}};
		Assert.assertArrayEquals(exp1, result1);
		
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void percentageEV_test1() {
		
		try{		
		double x = 20.0;
		PercentageEVFilter sort = new PercentageEVFilter(x);
		double [][]mat1= {{1.0,2.0}, {3.0,1.0}};
		double []vec1= {1.0};
		sort.passEigenValues(vec1, mat1);
		double []result = sort.getEigenValues();
		double[] exp={1.0};
		Assert.assertArrayEquals(exp, result, 0);
		double[][] result1=sort.getEigenVectors();
		double[][] exp1={{1.0},{3.0}};
		Assert.assertArrayEquals(exp1, result1);
		
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
