public class DenseMatrix
	{
	private int nRow;
	private int nCol;
	private double[][] vals;
	
	public DenseMatrix()
		{
		nRow = 0;
		nCol = 0;
		}
	public DenseMatrix(double[][] mat)
		{
		nRow = mat.length;
		nCol = mat[0].length;
		vals = mat;
		}
	public DenseMatrix(int n, int m)
		{
		nRow = n;
		nCol = m;
		vals = new double[nRow][nCol];
		}
	
	
	public static void main(String args[])
		{
		DenseMatrix laMatrice = new DenseMatrix(3, 2);
		laMatrice.display();
		laMatrice.set(3, 2, 1);
		laMatrice.display();
		laMatrice = laMatrice.mult(new DenseMatrix(laMatrice.vals));
		laMatrice.display();
		
		
		
		
		
		}
	
	
	
	
	public double get(int i, int j)
		{
		return vals[i-1][j-1];
		}
	public void set(int i, int j, double aij)
		{
		vals[i-1][j-1] = aij;
		}
	public int getRowDimension()
		{
		return nRow;
		}
	public int getColDimension()
		{
		return nCol;
		}
	public void display()
		{
		for(int i=0; i<this.nRow; i++)
			{
			System.out.print("| ");
			for(int j=0; j<this.nCol; j++)
				{
				System.out.print(this.vals[i][j] + " | ");
				}
			System.out.println("");
			}
		System.out.println("");
		}
	public DenseMatrix sum(DenseMatrix B)
		{
		double[][] laValeur = new double[this.nRow][this.getColDimension()];
		for(int i=0; i<this.nRow; i++)
			{
			for(int j=0; j<this.nCol; j++)
				{
				laValeur[i][j] = vals[i][j] + B.vals[i][j];
				}
			}
		return new DenseMatrix(laValeur);
		}
	public DenseMatrix minus(DenseMatrix B)
		{
		double[][] laValeur = new double[this.nRow][this.getColDimension()];
		for(int i=0; i<this.nRow; i++)
			{
			for(int j=0; j<this.nCol; j++)
				{
				laValeur[i][j] = vals[i][j] - B.vals[i][j];
				}
			}
		return new DenseMatrix(laValeur);
		}
	public DenseMatrix mult(double s)
		{
		double[][] laValeur = new double[this.nRow][this.getColDimension()];
		for(int i=0; i<this.nRow; i++)
			{
			for(int j=0; j<this.nCol; j++)
				{
				laValeur[i][j] = vals[i][j] * s;
				}
			}
		return new DenseMatrix(laValeur);
		}
	public DenseMatrix mult(DenseMatrix B)
		{
		double[][] laValeur1 = new double[this.nRow][this.getColDimension()];
		double[][] laValeur2 = new double[B.nRow][B.getColDimension()];
		double[][] laValeur = new double[this.nRow][B.getColDimension()];
		for(int j=0; j<this.nCol; j++)
			{
			for(int i=0; i<B.nRow; i++)
				{
				laValeur2[j][i] = 
				}
			}
		for(int i=0; i<this.nRow; i++)
			{
			for(int j=0; j<this.nRow; j++)
				{
				laValeur[i][j] = this.get(i, i)* B.vals[j][i];
				}
			}
		return new DenseMatrix(laValeur);
		}
	}