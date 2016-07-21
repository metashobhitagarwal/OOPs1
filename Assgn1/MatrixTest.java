package Assgn1;

import static org.junit.Assert.*;

import org.junit.Test;
/*This class is implementing test cases
 */
public class MatrixTest {

	Matrix matOp = new Matrix();

	@Test
	public void testAddElements() {
		int[][] mat1 = { { 1, 2 }, { 3, 5 } };
		int[][] mat2 = { { 5, 3 }, { 6, 4 } };
		int[][] expected = { { 6, 5 }, { 9, 9 } };
		assertArrayEquals(expected, matOp.addElements(mat1, mat2));
	}

	@Test
	public void testMultiplyElements() {
		int[][] mat1 = { { 1, 2, 3 }, { 3, 2, 1 } };
		int[][] mat2 = { { 2, 5 }, { 2, 1 }, { 6, 5 } };
		int[][] expected = { { 24, 22 }, { 16, 22 } };
		assertArrayEquals(expected, matOp.multiplyMatrix(mat1, mat2));
	}

	@Test
	public void testTransposeElements() {
		int[][] mat = { { 3, 2 }, { 6, 4 } };
		int[][] expected = { { 3, 6 }, { 2, 4 } };
		assertArrayEquals(expected, matOp.transposeElements(mat));

	}
}