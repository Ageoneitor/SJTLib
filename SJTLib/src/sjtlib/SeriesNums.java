package sjtlib;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class SeriesNums{
	public static class Fibonacci implements Iterator<Object>, Iterable<Object>{
		private int numMax, mes2 = 0;
		private Hashtable<Integer,Integer> dict;

		// Una liebre crece cada mes y se clona cada mes si estaba en etapa adulta
		private class Liebre{
			int edad = 1; // Bebe
			public void crecer(ArrayList<Liebre> a){
				if (edad<=2)
					edad++;
				else
					a.add(new Liebre());
			}
		}
		
		public Fibonacci(int numMax){
			this.numMax = numMax;
			ArrayList<Liebre> array= new ArrayList<Liebre>();
			dict = new Hashtable<Integer,Integer>();
			dict.put(0, 0);
			array.add(new Liebre());
			
			for (int mes = 1;mes<=numMax;mes++){
				for (int i = 0; i<array.size();i++)
					array.get(i).crecer(array);
			dict.put(mes, array.size());
			}
		}
		
		@Override
		public boolean hasNext() {
			return mes2<=numMax?true:false;
		}
		@Override
		public Integer next() {
			
			return dict.get(mes2++);
		}
		@Override
		public void remove() {
			dict.remove(mes2-1);
			
		}
		
		@Override
		public Iterator<Object> iterator() {
			return this;
		}
	}
}
