package sjtlib;

import java.util.ArrayList;

public class SJTTimer implements Runnable {
	int milis;
	private Thread t;
	private String methodName, timerName;
	private Object o;
	private Object[] params;
	private boolean parar = false;
	@SuppressWarnings("rawtypes")
	ArrayList<Class> params2 = new ArrayList<Class>();
	public SJTTimer(String timerName, int milis, Object theInstance, String methodName, Object... params){
		this.milis = milis;
		this.methodName = methodName;
		this.params = params;
		o = theInstance;
		this.timerName = timerName;
		try {
			for (int i = 0;i<params.length;i++)
				params2.add(params[i].getClass());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void start(){
		if(t!=null)
			t=null;
		t = new Thread(this);
		t.start();
		
	}
	public void run(){
		Class<?>[] clss= new  Class<?>[params2.size()];
		while(!parar)
			try{
				// Convertir ArrayList<Class> a Class<?>[]
				for(int i = 0 ;i<params2.size();i++){
					clss[i] = params2.get(i);
				}
				o.getClass().getMethod(methodName, clss).invoke(o, params);
				Thread.sleep(milis);
			}catch (Exception ex){
				ex.printStackTrace();
			}
		System.out.println("Timer with ID \""+timerName+"\" Finished");
		t = null;
	}
	public void stop(){
		parar = true;
	}
}