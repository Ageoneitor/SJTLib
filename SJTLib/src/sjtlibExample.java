import sjtlib.SJTConsole;
import sjtlib.SJTConversor;
import sjtlib.SJTTimer;
import sjtlib.SeriesNums.Fibonacci;



public class sjtlibExample {

	public static void main(String[] args) {
		SJTConsole c = new SJTConsole();
		c.setSysOut();
		c.sleep(1);
		System.out.println("Hola!!");
		c.sleep(4);
		Fibonacci a = new Fibonacci(9);
	 	int b = 1;
	 	while (a.hasNext()){
			System.out.println(b+".\t"+a.next());
			b++;
	 	}
	 
	 System.out.println("1 dia en horas son "+SJTConversor.diasahoras(1)+" horas!\n\nY 25 en binario es "+SJTConversor.intabin(25));
	 
	 SJTTimer t = new SJTTimer("SJTTimer", 1000, new sjtlibExample(), "metodo", "hola");
	 t.start();
	 System.out.println("Timer iniciado!!; durmiendo 1 ms");
	 try{Thread.sleep(1);}catch(Exception ex){ex.printStackTrace();}
	 t.stop();
	 c.pause("Presiona <ENTER> para continuar la prueba...");
	 c.clear();
	 c.out.println("hola :D\nVamos a sumar 2 numeros.\n");
	 try{Thread.sleep(1);}catch (Exception e){e.printStackTrace();}
	 int a2 = c.scan("Ingresa el primer numero: ").nextInt();
	 int a3 = c.scan("Ingresa el segundo numero: ").nextInt();
	 c.out.println(Integer.toString(a2)+" + "+Integer.toString(a3)+" = "+ Integer.toString(a3+a2));
	 c.fin(0);
	 c.sleep(4, "Prueba SysOut");
	 System.out.println("Prueba de Sergio :D");
	 c.exit(0);
	}
	public void metodo(String a){
		System.out.println("Desde metodo :). Argumento: "+a);
	}
}
