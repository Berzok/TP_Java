import java.util.Random;


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
		
		DenseMatrix laMatrice = aleaMatrix(3, 2);
		laMatrice.set(3, 2, 1);
		laMatrice = laMatrice.sum(laMatrice);
		laMatrice.display();
		
		DenseMatrix B = aleaMatrix(2, 3);
		B.display();
		laMatrice = laMatrice.mult(B);
		
		laMatrice = laMatrice.transpose();
		
		
		
		
		
		}
	
	
	
	
	public double get(int i, int j)
		{
		return vals[i-1][j-1];
		}
	public double get(int i, int j, boolean exact)
		{
		return vals[i][j];
		}
	public void set(int i, int j, double aij)
		{
		vals[i-1][j-1] = aij;
		}
	public void set(int i, int j, double aij, boolean exact)
		{
		vals[i][j] = aij;
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
		for(int i=0; i<this.nCol; i++)
			{
			for(int j=0; j<this.nRow; j++)
				{
				laValeur[i][j] = vals[i][j] * s;
				}
			}
		return new DenseMatrix(laValeur);
		}
	public DenseMatrix mult(DenseMatrix B)
		{
		DenseMatrix laValeur = new DenseMatrix(this.getRowDimension(), B.nCol);
		System.out.println("laValeur ");
		laValeur.display();
		for(int i=0; i<B.nRow; i++)
			{
			for(int j=0; j<this.nCol; j++)
				{
				for(int k=0; k<2; k++)
					{
					System.out.println("i=" + i);
					System.out.println("j=" + j);
					laValeur.vals[i][j] += (B.vals[i][j] * this.vals[j][i]);
					laValeur.display();
					}
				}
			}
		return laValeur;
		}
	public DenseMatrix transpose()
		{
		DenseMatrix laValeur = new DenseMatrix(new double[this.nCol][this.nRow]);
		for(int i=0; i<this.nRow; i++)
			{
			for(int j=0; j<this.nCol; j++)
				{
				laValeur.vals[j][i] = this.get(i, j, true);
				}
			}	
		return laValeur;
		}
	
	
	public static DenseMatrix aleaMatrix(int n, int m)
		{
		Random rand = new Random();
		DenseMatrix matrice = new DenseMatrix(n, m);
		for(int i=0; i<matrice.nRow; i++)
			{
			for(int j=0; j<matrice.nCol; j++)
				{
				matrice.vals[i][j] = (double) rand.nextInt(1)+1;
				}
			}
		return matrice;
		}
	}