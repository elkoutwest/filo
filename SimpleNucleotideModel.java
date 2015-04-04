public class SimpleNucleotideModel extends SubstitutionModel<Nucleotide> {

	/**
	 * The "distance" between two nucleotides in this model is 1 if the
	 * nucleotides are different, and 0 if they are the same.
	 * 
	 */
	@Override
	public double distance(Nucleotide x, Nucleotide y) {
		//identical codes
		if (x.equals(y)) return 0;
		else if (x==Nucleotide.N || y==Nucleotide.N) return 0;
		else if (x==Nucleotide._ || y==Nucleotide._) return 0; //comment this out to stop ignoring gaps
		else if((x==Nucleotide.T || x==Nucleotide.U) && (y==Nucleotide.T || y==Nucleotide.U)) return 0;
		else return 1;
	}

}
