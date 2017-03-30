import java.lang.Math;

public class Matrix {
	double determinant(int size, double[][]matrix){
		
		double det = 0;
		if(size == 1){
			det = matrix[0][0];
		}else if(size == 2){
			det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
		}else{
			for(int i=0; i<size; i++){
				det += Math.pow(-1.0, (double)i) * matrix[0][i] * subMatrix(0,i).determinant();
			}
		}
		return 0;
	}
}
