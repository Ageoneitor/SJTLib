package sjtlib;

public class SJTConversor{
	public static double segundosaminutos (double segs){
		 double minutos= segs/60;
		 return minutos;
	 }
	public static double minutosasegundos (double minutos){
		 double segs=minutos*60;
		 return segs;
	 }
	public static double segundosahoras (double segs){
		 double horas= segundosaminutos(segs)/60;
		 return horas;
	 }
	public static double horasasegundos (double horas){
		 double segs= minutosasegundos(horas*60);
		 return segs;
	 }
	public static double segundosadias (double segs){
		 double dias= segundosahoras(segs)/24;
		 return dias;
	 }
	public static double diasasegundos (double dias){
		 double segs= horasasegundos(dias*24);
		 return segs;
	 }
	public static double segundosasemanas (double segs){
		 double semanas= segundosadias(segs)/7;
		 return semanas;
	 }
	public static double semanasasegundos (double semanas){
		 double segs= diasasegundos(semanas*7);
		 return segs;
	 }
	public static double segundosameses (double segs){
		 double meses= segundosadias(segs)/30;
		 return meses;
	 }
	public static double mesesasegundos (double meses){
		 double segs= diasasegundos(meses*30);
		 return segs;
	 }
	public static double segundosaaños (double segs){
		 double años= segundosameses(segs)/12;
		 return años;
	 }
	public static double añosasegundos (double años){
		 double segs= mesesasegundos(años*12);
		 return segs;
	 }
	public static double minutosahoras(double minutos){
		double horas = minutos/60;
		return horas;
	}
	public static double horasaminutos(double horas){
		double minutos = horas*60;
		return minutos;
	}
	public static double minutosadias(double minutos){
		double dias = minutosahoras(minutos)/24;
		return dias;
	}
	public static double diasaminutos(double dias){
		double minutos = horasaminutos(dias*24);
		return minutos;
	}
	public static double minutosasemanas(double minutos){
		double semanas = minutosadias(minutos)/7;
		return semanas;
	}
	public static double semanasaminutos(double semanas){
		double minutos = diasaminutos(semanas*7);
		return minutos;
	}
	public static double minutosameses(double minutos){
		double meses = minutosadias(minutos)/30;
		return meses;
	}
	public static double mesesaminutos(double meses){
		double minutos = diasaminutos(meses*30);
		return minutos;
	}
	public static double minutosaaños(double minutos){
		double años = minutosameses(minutos)/12;
		return años;
	}
	public static double añosaminutos(double años){
		double minutos = mesesaminutos(años*12);
		return minutos;
	}
	public static double horasadias(double horas){
		double dias =horas/24;
		return dias;
	}
	public static double diasahoras(double dias){
		double horas =dias*24;
		return horas;
	}
	public static double horasasemanas(double horas){
		double semanas = horasadias(horas)/7;
		return semanas;
	}
	public static double semanasahoras(double semanas){
		double horas =diasahoras(semanas*7);
		return horas;
	}
	public static double horasameses(double horas){
		double meses = horasadias(horas)/30;
		return meses;
	}
	public static double mesesahoras(double meses){
		double horas = diasahoras(meses*30);
		return horas;
	}
	public static double horasaaños(double horas){
		double años = horasameses(horas)/12;
		return años;
	}
	public static double añosahoras(double años){
		double horas =mesesahoras(años*12);
		return horas;
	}
	public static double diasasemanas(double dias){
		double semanas = dias/7;
		return semanas;
	}
	public static double semanasadias(double semanas){
		double dias = semanas*7;
		return dias;	
	}
	public static double diasameses(double dias){
		double meses = dias/30;
		return meses;
	}
	public static double mesesadias(double meses){
		double dias =meses*30;
		return dias;
	}
	public static double diasaaños(double dias){
		double años =diasameses(dias)/12;
		return años;
	}
	public static double añosadias(double años){
		double dias = mesesadias(años*12);
		return dias;
	}
	public static double semanasameses (double semanas){
		 double meses=(semanas/7)*30;
		 return meses;
	 }
	public static double mesesasemanas (double meses){
		 double semanas=(meses/30)/7;
		 return semanas;
	 }
	public static double semanasaaños (double semanas){
		 double años= semanasameses(semanas)/12;
		 return años;
	 }
	public static double añosasemanas (double años){
		 double semanas= mesesasemanas(años*12);
		 return semanas;
	 }
	public static double mesesaaños(double meses){
		double años =meses/12;
		return años;
	}
	public static double añosameses(double años){
		double meses =años*12;
		return meses;
	}
	public static String decimalaromano(long numdcml){
		String numromano = "",numdecimal = Long.toString(numdcml),lineas="";
		int num;
		if (numdcml<10000000) {
		switch(numdecimal.length()){
		case 0:numromano="ERROR: No se ingresó un número\n";break;
		case 1:
			if (numdcml!=0){
			num = Integer.parseInt(numdecimal.substring(0, 1));
			switch(num){
			case 0:numromano="";break;
			case 1:numromano="I";break;
			case 2:numromano="II";break;
			case 3:numromano="III";break;
			case 4:numromano="IV";break;
			case 5:numromano="V";break;
			case 6:numromano="VI";break;
			case 7:numromano="VII";break;
			case 8:numromano="VIII";break;
			case 9:numromano="IX";break;
			}
			numromano = lineas+"\n"+numromano;
			}else{
				numromano="ERROR: No existe un símbolo que represente a 0\n";
			}
			break;
		case 2:
			for (int i=1;i<=2;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"X":"I");break;
				case 2:numromano+=(i==1?"XX":"II");break;
				case 3:numromano+=(i==1?"XXX":"III");break;
				case 4:numromano+=(i==1?"XL":"IV");break;
				case 5:numromano+=(i==1?"L":"V");break;
				case 6:numromano+=(i==1?"LX":"VI");break;
				case 7:numromano+=(i==1?"LXX":"VII");break;
				case 8:numromano+=(i==1?"LXXX":"VIII");break;
				case 9:numromano+=(i==1?"XC":"IX");break;
				}
				}
			numromano = lineas+"\n"+numromano;
				break;
		case 3:
			for (int i=1;i<=3;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"C":(i==2?"X":"I"));break;
				case 2:numromano+=(i==1?"CC":(i==2?"XX":"II"));break;
				case 3:numromano+=(i==1?"CCC":(i==2?"XXX":"III"));break;
				case 4:numromano+=(i==1?"CD":(i==2?"XL":"IV"));break;
				case 5:numromano+=(i==1?"D":(i==2?"L":"V"));break;
				case 6:numromano+=(i==1?"DC":(i==2?"LX":"VI"));break;
				case 7:numromano+=(i==1?"DCC":(i==2?"LXX":"VII"));break;
				case 8:numromano+=(i==1?"DCCC":(i==2?"LXXX":"VIII"));break;
				case 9:numromano+=(i==1?"CM":(i==2?"XC":"IX"));break;
				}
				}
			numromano = lineas+"\n"+numromano;
				break;
		case 4:
			for (int i=1;i<=4;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"M":(i==2?"C":(i==3?"X":"I")));break;
				case 2:numromano+=(i==1?"MM":(i==2?"CC":(i==3?"XX":"II")));break;
				case 3:numromano+=(i==1?"MMM":(i==2?"CCC":(i==3?"XXX":"III")));break;
				case 4:numromano+=(i==1?"IV":(i==2?"CD":(i==3?"XL":"IV")));lineas+=(i==1?"__":"");break;
				case 5:numromano+=(i==1?"V":(i==2?"D":(i==3?"L":"V")));lineas+=(i==1?"_":"");break;
				case 6:numromano+=(i==1?"VI":(i==2?"DC":(i==3?"LX":"VI")));lineas+=(i==1?"__":"");break;
				case 7:numromano+=(i==1?"VII":(i==2?"DCC":(i==3?"LXX":"VII")));lineas+=(i==1?"___":"");break;
				case 8:numromano+=(i==1?"VIII":(i==2?"DCCC":(i==3?"LXXX":"VIII")));lineas+=(i==1?"____":"");break;
				case 9:numromano+=(i==1?"IX":(i==2?"CM":(i==3?"XC":"IX")));lineas+=(i==1?"__":"");break;
				}
				}
			numromano = lineas+"\n"+numromano;
				break;
			
		case 5:
			for (int i=1;i<=5;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"X":(i==2?"M":(i==3?"C":(i==4?"X":"I"))));lineas+=(i==1?"_":"");break;
				case 2:numromano+=(i==1?"XX":(i==2?"MM":(i==3?"CC":(i==4?"XX":"II"))));lineas+=(i==1?"__":"");break;
				case 3:numromano+=(i==1?"XXX":(i==2?"MMM":(i==3?"CCC":(i==4?"XXX":"III"))));lineas+=(i==1?"___":"");break;
				case 4:numromano+=(i==1?"XL":(i==2?"IV":(i==3?"CD":(i==4?"XL":"IV"))));lineas+=(i==1?"__":(i==2?"__":""));break;
				case 5:numromano+=(i==1?"L":(i==2?"V":(i==3?"D":(i==4?"L":"V"))));lineas+=(i==1?"_":(i==2?"_":""));break;
				case 6:numromano+=(i==1?"LX":(i==2?"VI":(i==3?"DC":(i==4?"LX":"VI"))));lineas+=(i==1?"__":(i==2?"__":""));break;
				case 7:numromano+=(i==1?"LXX":(i==2?"VII":(i==3?"DCC":(i==4?"LXX":"VII"))));lineas+=(i==1?"___":(i==2?"___":""));break;
				case 8:numromano+=(i==1?"LXXX":(i==2?"VIII":(i==3?"DCCC":(i==4?"LXXX":"VIII"))));lineas+=(i==1?"____":(i==2?"____":""));break;
				case 9:numromano+=(i==1?"XC":(i==2?"IX":(i==3?"CM":(i==4?"XC":"IX"))));lineas+=(i==1?"__":(i==2?"__":""));break;
				}
				}
			numromano = lineas+"\n"+numromano;
				break;
		case 6:
			for (int i=1;i<=6;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"C":(i==2?"X":(i==3?"M":(i==4?"C":(i==5?"X":"I")))));lineas+=(i==1?"_":(i==2?"_":""));break;
				case 2:numromano+=(i==1?"CC":(i==2?"XX":(i==3?"MM":(i==4?"CC":(i==5?"XX":"II")))));lineas+=(i==1?"__":(i==2?"__":""));break;
				case 3:numromano+=(i==1?"CCC":(i==2?"XXX":(i==3?"MMM":(i==4?"CCC":(i==5?"XXX":"III")))));lineas+=(i==1?"___":(i==2?"___":""));break;
				case 4:numromano+=(i==1?"CD":(i==2?"XL":(i==3?"IV":(i==4?"CD":(i==5?"XL":"IV")))));lineas+=(i==1?"__":(i==2?"__":(i==3?"__":"")));break;
				case 5:numromano+=(i==1?"D":(i==2?"L":(i==3?"V":(i==4?"D":(i==5?"L":"V")))));lineas+=(i==1?"_":(i==2?"_":(i==3?"_":"")));break;
				case 6:numromano+=(i==1?"DC":(i==2?"LX":(i==3?"VI":(i==4?"DC":(i==5?"LX":"VI")))));lineas+=(i==1?"__":(i==2?"__":(i==3?"__":"")));break;
				case 7:numromano+=(i==1?"DCC":(i==2?"LXX":(i==3?"VII":(i==4?"DCC":(i==5?"LXX":"VII")))));lineas+=(i==1?"___":(i==2?"___":(i==3?"___":"")));break;
				case 8:numromano+=(i==1?"DCCC":(i==2?"LXXX":(i==3?"VIII":(i==4?"DCCC":(i==5?"LXXX":"VIII")))));lineas+=(i==1?"____":(i==2?"____":(i==3?"____":"")));break;
				case 9:numromano+=(i==1?"CM":(i==2?"XC":(i==3?"IX":(i==4?"CM":(i==5?"XC":"IX")))));lineas+=(i==1?"__":(i==2?"__":(i==3?"__":"")));break;
				}
				}
			numromano = lineas+"\n"+numromano;
				break;
		case 7:
			for (int i=1;i<=7;i++){
				num = Integer.parseInt(numdecimal.substring(i-1, i));
				
				switch(num){
				case 0:numromano+="";break;
				case 1:numromano+=(i==1?"M":(i==2?"C":(i==3?"X":(i==4?"M":(i==5?"C":(i==6?"X":"I"))))));lineas+=(i==1?"_":(i==2?"_":(i==3?"_":"")));break;
				case 2:numromano+=(i==1?"MM":(i==2?"CC":(i==3?"XX":(i==4?"MM":(i==5?"CC":(i==6?"XX":"II"))))));lineas+=(i==1?"__":(i==2?"__":(i==3?"__":"")));break;
				case 3:numromano+=(i==1?"MMM":(i==2?"CCC":(i==3?"XXX":(i==4?"MMM":(i==5?"CCC":(i==6?"XXX":"III"))))));lineas+=(i==1?"___":(i==2?"___":(i==3?"__":"")));break;
				case 4:numromano+=(i==1?"IV":(i==2?"CD":(i==3?"XL":(i==4?"IV":(i==5?"CD":(i==6?"XL":"IV"))))));lineas+=(i==1?"==":(i==2?"__":(i==3?"__":(i==4?"__":""))));break;
				case 5:numromano+=(i==1?"V":(i==2?"D":(i==3?"L":(i==4?"V":(i==5?"D":(i==6?"L":"V"))))));lineas+=(i==1?"=":(i==2?"_":(i==3?"_":(i==4?"_":""))));break;
				case 6:numromano+=(i==1?"VI":(i==2?"DC":(i==3?"LX":(i==4?"VI":(i==5?"DC":(i==6?"LX":"VI"))))));lineas+=(i==1?"==":(i==2?"__":(i==3?"__":(i==4?"__":""))));break;
				case 7:numromano+=(i==1?"VII":(i==2?"DCC":(i==3?"LXX":(i==4?"VII":(i==5?"DCC":(i==6?"LXX":"VII"))))));lineas+=(i==1?"===":(i==2?"___":(i==3?"___":(i==4?"___":""))));break;
				case 8:numromano+=(i==1?"VIII":(i==2?"DCCC":(i==3?"LXXX":(i==4?"VIII":(i==5?"DCCC":(i==6?"LXXX":"VIII"))))));lineas+=(i==1?"====":(i==2?"____":(i==3?"____":(i==4?"____":""))));break;
				case 9:numromano+=(i==1?"IX":(i==2?"CM":(i==3?"XC":(i==4?"IX":(i==5?"CM":(i==6?"XC":"IX"))))));lineas+=(i==1?"==":(i==2?"__":(i==3?"__":(i==4?"__":""))));break;
				}
				}
			numromano = lineas+"\n"+numromano;
			
				break;
		}
		}else{
			numromano="ERROR: Se ingresó un número mayor a 9999999";
		}
		return numromano;
	}
	public static String intahex(int numint){
		double pint,pdec;
		int aux=0;
		String numhex="";
		do{
			pint = numint/16.0;
			pdec = Double.parseDouble("0"+Double.toString(pint).substring(Double.toString(pint).indexOf(".")));
			aux = (int) (pdec*16);
			numint=Integer.parseInt(Double.toString(pint).substring(0, Double.toString(pint).indexOf(".")));
			numhex = (aux==0?"0":(aux==1?"1":(aux==2?"2":(aux==3?"3":(aux==4?"4":(aux==5?"5":(aux==6?"6":(aux==7?"7":(aux==8?"8":(aux==9?"9":(aux==10?"A":(aux==11?"B":(aux==12?"C":(aux==13?"D":(aux==14?"E":(aux==15?"F":""))))))))))))))))+numhex;
		}while(pint>=1);
		return numhex;
	}
	public static int hexaint(String numhex){
		int numint=0;
		String aux;
		for (int i=0;i<numhex.length();i++){
			aux= numhex.substring(numhex.length()-(i+1),numhex.length()-i);
			numint += (aux.equals("0")?0:(aux.equals("1")?1:(aux.equals("2")?2:(aux.equals("3")?3:(aux.equals("4")?4:(aux.equals("5")?5:(aux.equals("6")?6:(aux.equals("7")?7:(aux.equals("8")?8:(aux.equals("9")?9:(aux.equals("A")?10:(aux.equals("B")?11:(aux.equals("C")?12:(aux.equals("D")?13:(aux.equals("E")?14:(aux.equals("F")?15:10))))))))))))))))*(Math.pow(16, i));
		}
		return numint;
	}
	public static String intaoct(int numint){
		double pint,pdec;
		int aux=0;
		String numoct="";
		do{
			pint = numint/8.0;
			pdec = Double.parseDouble("0"+Double.toString(pint).substring(Double.toString(pint).indexOf(".")));
			aux = (int) (pdec*8);
			numint=Integer.parseInt(Double.toString(pint).substring(0, Double.toString(pint).indexOf(".")));
			numoct = (aux==0?"0":(aux==1?"1":(aux==2?"2":(aux==3?"3":(aux==4?"4":(aux==5?"5":(aux==6?"6":(aux==7?"7":""))))))))+numoct;
		}while(pint>=1);
		return numoct;
	}
	public static int octaint(String numoct){
		int numint=0;
		String aux;
		for (int i=0;i<numoct.length();i++){
			aux= numoct.substring(numoct.length()-(i+1),numoct.length()-i);
			numint += (aux.equals("0")?0:(aux.equals("1")?1:(aux.equals("2")?2:(aux.equals("3")?3:(aux.equals("4")?4:(aux.equals("5")?5:(aux.equals("6")?6:(aux.equals("7")?7:0))))))))*(Math.pow(8, i));
		}
		return numint;
	}
	public static String intabin(int numint){
		double pint,pdec;
		int aux=0;
		String numbin="";
		do{
			pint = numint/2.0;
			pdec = Double.parseDouble("0"+Double.toString(pint).substring(Double.toString(pint).indexOf(".")));
			aux = (int) (pdec*2);
			numint=Integer.parseInt(Double.toString(pint).substring(0, Double.toString(pint).indexOf(".")));
			numbin = (aux==0?"0":(aux==1?"1":""))+numbin;
		}while(pint>=1);
		return numbin;
	}
	public static int binaint(String numbin){
		int numint=0;
		String aux;
		for (int i=0;i<numbin.length();i++){
			aux= numbin.substring(numbin.length()-(i+1),numbin.length()-i);
			numint += (aux.equals("0")?0:(aux.equals("1")?1:0))*(Math.pow(2, i));
		}
		return numint;
	}
}
