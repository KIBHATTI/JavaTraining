import java.util.Iterator;
import java.util.TreeSet;

import emp.Employee;

public class CollectionTreeSetTest 
{

	public static void main(String[] args) 
	{
		TreeSet<ChemicalElement> tsObj = new TreeSet<ChemicalElement>();
		
		ChemicalElement ce = new ChemicalElement(21,"Scandium","Sc",44.9559f);
		ChemicalElement ce1 = new ChemicalElement(23,"Titanium","Ti",47.90f);
		ChemicalElement ce2 = new ChemicalElement(109,"Meitnerium","Mt",00.01f);
		ChemicalElement ce3 = new ChemicalElement(97,"Berkelium","Be",14.78f);
		ChemicalElement ce4 = new ChemicalElement(82,"Lead","Pb",11.35f);
		ChemicalElement ce5 = new ChemicalElement(4,"Boron","B",2.34f);
		
		tsObj.add(ce5);
		tsObj.add(ce3);
		tsObj.add(ce);
		tsObj.add(ce2);
		tsObj.add(ce1);
		
		Iterator<ChemicalElement> iterator =  tsObj.iterator();
		while(iterator.hasNext())
		{
			ChemicalElement ceobj = iterator.next();
			System.out.println("Employee "+ceobj);
					
		}
	}

}
class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicN;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	public ChemicalElement(int atomicN, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicN = atomicN;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicN=" + atomicN + ", atomicName=" + atomicName + ", atomicFormula=" + atomicFormula
				+ ", atomicWeight=" + atomicWeight + "]";
	}
	@Override
	public int compareTo(ChemicalElement co) {
		System.out.println("Comparing "+atomicName+" ["+atomicN+ "] ====with==== "+co.atomicName +"["+co.atomicN+"]");
		return Integer.compare(atomicN, co.atomicN);
		
	}
	
	

}
