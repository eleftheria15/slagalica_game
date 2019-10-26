package Code;

public class IgracRezultat {
	
	private String ime;
	private int rezultat;
	public IgracRezultat(String ime, int rezultat) {
		super();
		this.ime = ime;
		this.rezultat = rezultat;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getRezultat() {
		return rezultat;
	}
	public void setRezultat(int rezultat) {
		this.rezultat = rezultat;
	}
	@Override
	public String toString() {
		return "Ime: " + ime + " Rezultat: " + rezultat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + rezultat;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IgracRezultat other = (IgracRezultat) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (rezultat != other.rezultat)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	

}
