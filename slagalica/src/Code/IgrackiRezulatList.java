package Code;

import java.util.ArrayList;
import java.util.List;

public class IgrackiRezulatList {
	
	
	private List<IgracRezultat> igraci;

	
	public IgrackiRezulatList() {
		igraci = new ArrayList<IgracRezultat>();
		
	}
	
	
	
	public boolean add(IgracRezultat s){
		if (!igraci.contains(s)) {
			igraci.add(s);
			return true;
		}
		return false;
	}



	@Override
	public String toString() {
		if (igraci.size()==0) {
			return "Nema podataka";
		}
		String s ="";
		for (IgracRezultat i : igraci) {
			s+=i + "\n";
		}
		return s;
	}
	
	
	
	
	
	
	
	
	

}
