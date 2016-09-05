package tp1;

/**
 * Classe Money
 * @author cyprien
 */
public class Money {
	
	private int montant;
	private String devise;
	
	/**
	 * Constructeur de la classe Money
	 * @param mon int
	 * @param dev String
	 */
	public Money(int mon, String dev) {
		this.montant = mon;
		this.devise = dev;
	}
	
	/**
	 * Getter du montant
	 * @return int
	 */
	public int getMontant() {
		return this.montant;
	}
	
	/**
	 * Getter de la devis
	 * @return String
	 */
	public String getDevise() {
		return this.devise;
	}
	
	/**
	 * Méthode qui permet d'ajouter de l'argent
	 * @param m Money
	 * @return Money
	 * @throws DeviseException 
	 */
	public Money add(Money m) throws DeviseException {
		if(!this.devise.equals(m.getDevise())){
			throw new DeviseException();
		}else {
			return new Money(this.getMontant()+m.getMontant(), this.getDevise());
		}
	}
	
	/**
	 * Methode pour comparer
	 * @return boolean
	 */
	public boolean equals(Object ob) {
		Money m = (Money)ob;
		return (this.montant == m.montant)&&(this.devise == m.devise);
	}
	
	/**
	 * toString
	 * @return String
	 */
	public String toString() {
		return this.montant + this.devise;
	}
}
