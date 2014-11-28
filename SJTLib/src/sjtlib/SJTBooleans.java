package sjtlib;

public class SJTBooleans {
	private static boolean resultado;
	public static boolean es_int(String num){
		resultado=true;
		try{
			Integer.parseInt(num);
		}catch(Exception ex){
			resultado = false;
		}
		return resultado;
	}
	public static boolean es_string (Object str){
		resultado = true;
				if(!(str.getClass().equals("".getClass()))){
					resultado=false;
				};
		return resultado;
	}
	
	
	public static boolean es_par(String num){
		resultado = true;
		
		if(!(Integer.parseInt(num)%2==0)){
			resultado =false;
		}
		return resultado;
	}
	public static boolean es_par(int num){
		resultado=true;
		
		if(!(num%2==0)){
			resultado = false;
		}
		return resultado;
	}
}
