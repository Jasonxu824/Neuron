package per.jasonxu.neuron.math.algebra.linear.common;

public class LinearSpaceSize {
	protected int col;
	protected int row;
	
	public LinearSpaceSize(int row, int col)
	{
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}

	public boolean equals(LinearSpaceSize other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (getClass() != other.getClass())
			return false;

		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Size [col=" + col + ", row=" + row + "]";
	}
}
