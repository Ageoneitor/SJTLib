package sjtlib;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SJTConsole extends JFrame implements KeyListener{
	/*
	 * gbc.gridx = posicion inicial eje x (columna 0-n)
	 * 
	 * gbc.gridy = posicion inicial eje y (fila 0-n)
	 * 
	 * gbc.gridwidth = cantidad de columnas que ocupa
	 * 
	 * gbc.gridheight = cantidad de flias que ocupa
	 * 
	 * gbc.weightx = cantidad (float) de cuanto se "estira" 
	 * en eje x al redimensionar la ventana
	 * 
	 * gbc.weighty = cantidad (float) de cuanto se "estira" 
	 * en eje y al redimensionar la ventana
	 * 
	 * gbc.fill = hacia que lado se "estira"el elemento
	 * valores comunes: (BOTH,NONE,HORIZONTAL,VERTICAL)
	 * */
	
	
	
	
	private static JTextArea txt_out;
	private JScrollPane scroll;
	private boolean esperar= false;
	private SJTScanner sjts;
	private static final String version = "V1.3.3";
	public Out out= new Out();
	public SJTConsole (){
		super("SJTConsole - "+ version);
		out = new Out();
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,400);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		
		
		txt_out = new JTextArea();
		txt_out.setEnabled(false);
		txt_out.setBackground(Color.BLACK);
		txt_out.setFont(new Font("Courier New",Font.PLAIN,15));
		scroll = new JScrollPane(txt_out);
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(scroll,gbc);
		
		setResizable(false);
		setVisible(true);
		printIntro();
	}
	public SJTConsole(String title){
		super(title+" - V1.3");
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,400);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		
		
		txt_out = new JTextArea();
		txt_out.setEnabled(false);
		txt_out.setBackground(Color.BLACK);
		txt_out.setFont(new Font("Courier New",Font.PLAIN,15));
		scroll = new JScrollPane(txt_out);
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(scroll,gbc);
		
		setResizable(false);
		setVisible(true);
		printIntro();
	}
	
	private void printIntro(){
		out.println("\t\t\t  ---------- SJTConsole "+version+" -----------\n\t\t\t\t  ---- Created by SJT ----\n\t\t\t\t\t -- 2012 --\n");
	}
	
	public void clear(){
		txt_out.setText("");
	}
	public void exit(final int errCode){
		try {
			Thread.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!txt_out.getText().endsWith(" -----\n"))
			fin(errCode);
		pause("Presione <ENTER> para salir de la Terminal...");
		setVisible(false);
		dispose();
	}
	public void pause(String msg){
		out.println(msg);
		esperar=true;
		while(esperar)
			try{Thread.sleep(1);}catch (Exception ex){ex.printStackTrace();}
	}
	public void pause(){
		out.println("Presione <ENTER> para continuar...");
		esperar=true;
		while(esperar)
			try{Thread.sleep(1);}catch (Exception ex){ex.printStackTrace();}
	}
	public void sleep(double segs, String motivo){
		out.println("\n\nDurmiendo "+ Double.toString(segs)+" segs por \""+motivo+"\"");
		try{Thread.sleep((long) (segs*1000));}catch(Exception ex){ex.printStackTrace();}
	}
	public void sleep(double segs){
		out.println("\n\nDurmiendo "+ Double.toString(segs)+" segs...");
		try{Thread.sleep((long) (segs*1000));}catch(Exception ex){ex.printStackTrace();}
	}
	public void setSysOut(){
		System.setOut(new PrintStream(new StreamCapturer("")));
	}
	public void fin(int errCode){
		out.println("\t\t----- El Programa termino "+(errCode ==0?"correctamente ":"erroneamente: Cod "+Integer.toString(errCode))+" -----");
	}
	
	public SJTScanner scan(){
		return new SJTScanner();//this);
	}
	public SJTScanner scan(String prefix){
		return new SJTScanner(prefix);//this,prefix);
	}
		
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()){
		case KeyEvent.VK_ENTER:
			esperar=false;
			break;
		case KeyEvent.VK_ALT:break;
		case KeyEvent.VK_ALT_GRAPH:break;
		case KeyEvent.VK_F1:break;
		case KeyEvent.VK_F2:break;
		case KeyEvent.VK_F3:break;
		case KeyEvent.VK_F4:break;
		case KeyEvent.VK_F5:break;
		case KeyEvent.VK_F6:break;
		case KeyEvent.VK_F7:break;
		case KeyEvent.VK_F8:break;
		case KeyEvent.VK_F9:break;
		case KeyEvent.VK_F10:break;
		case KeyEvent.VK_F11:break;
		case KeyEvent.VK_F12:break;
		case KeyEvent.VK_SHIFT:break;
		case KeyEvent.VK_UP:break;
		case KeyEvent.VK_DOWN:break;
		case KeyEvent.VK_RIGHT:break;
		case KeyEvent.VK_LEFT:break;
		case KeyEvent.VK_DELETE:break;
		case KeyEvent.VK_CAPS_LOCK:break;
		case KeyEvent.VK_HOME:break;
		case KeyEvent.VK_PAGE_UP:break;
		case KeyEvent.VK_PAGE_DOWN:break;
		case KeyEvent.VK_END:break;
		case KeyEvent.VK_ESCAPE:break;
		case KeyEvent.VK_ACCEPT:break;
		case KeyEvent.VK_CANCEL:break;
		case KeyEvent.VK_AGAIN:break;
		case KeyEvent.VK_BEGIN:break;
		case KeyEvent.VK_CLEAR:break;
		case KeyEvent.VK_CODE_INPUT:break;
		case KeyEvent.VK_COMPOSE:break;
		case KeyEvent.VK_CONTEXT_MENU:break;
		case KeyEvent.VK_CONTROL:break;
		case KeyEvent.VK_CONVERT:break;
		case KeyEvent.VK_COPY:break;
		case KeyEvent.VK_CUT:break;
		case KeyEvent.VK_FINAL:break;
		case KeyEvent.VK_FIND:break;
		case KeyEvent.VK_FULL_WIDTH:break;
		case KeyEvent.VK_HALF_WIDTH:break;
		case KeyEvent.VK_HELP:break;
		case KeyEvent.VK_HIRAGANA:break;
		case KeyEvent.VK_INPUT_METHOD_ON_OFF:break;
		case KeyEvent.VK_INSERT:break;
		case KeyEvent.VK_PASTE:break;
		case KeyEvent.VK_PAUSE:break;
		case KeyEvent.VK_PRINTSCREEN:break;
		case KeyEvent.VK_JAPANESE_HIRAGANA:break;
		case KeyEvent.VK_JAPANESE_KATAKANA:break;
		case KeyEvent.VK_BACK_SPACE: 
			if(esperar){
				try{
					sjts.scanner = sjts.scanner.substring(0, sjts.scanner.length()-1);
					txt_out.setText(sjts.aux+sjts.scanner);
				}catch (Exception ex){
				
				}
			}
			break;
		default:
			if (esperar){
				sjts.scanner = sjts.scanner+Character.toString(e.getKeyChar());
				txt_out.setText(sjts.aux+sjts.scanner);
			}
		}
		
	}
	
	public void appendText(final String text) {
		if (EventQueue.isDispatchThread()) {
			txt_out.append(text);
			txt_out.setCaretPosition(txt_out.getText().length());
        } else {

        	EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    appendText(text);
                }
            });

        }
	}
	
	public class Out{
		public void println (String txt){
			appendText(txt+"\n");
		}
		public void println(){
			appendText("\n");
		}
		public void println(boolean bool){
			appendText(Boolean.toString(bool)+"\n");
		}
		public void println(float flt){
			appendText(Float.toString(flt)+"\n");
		}
		public void println(short shrt){
			appendText(Short.toString(shrt)+"\n");
		}
		public void println(double dbl){
			appendText(Double.toString(dbl)+"\n");
		}
		public void println(long lng){
			appendText(Long.toString(lng)+"\n");
		}
		public void println(byte bte){
			appendText(Byte.toString(bte)+"\n");
		}
	}
	public class SJTScanner{
		private String scanner,aux,prefix=">>> ";

		private SJTScanner(){
			sjts = this;
		}
		private SJTScanner(String prefix){
			this.prefix=prefix;
			sjts = this;
			scan();
		}
		private void scan(){
			scanner = "";
			aux = txt_out.getText()+prefix;
			txt_out.setText(aux);
			esperar = true;
			while(esperar)
				try{
					Thread.sleep(1);
				}catch (Exception ex){
					ex.printStackTrace();
				}
			appendText("\n");
		}
		
		public int nextInt() {
			try{
				return Integer.parseInt(scanner);
			}catch (Exception ex){
				out.println("ERROR: Se esperaba un int pero se obtuvo \""+scanner+"\".");
				scan();
				return nextInt();
			}
		}
		public double nextDbl(){
			try{
				return Double.parseDouble(scanner);
			}catch (Exception ex){
				out.println("ERROR: Se esperaba un double pero se obtuvo \""+scanner+"\".");
				scan();
				return nextDbl();
			}
		}
		public String next() {
			return scanner;
		}
	}
	public class StreamCapturer extends OutputStream {
		
		private StringBuilder buffer;
		private String prefix;
		private PrintStream old;
		private boolean bOld = false;
		        
		public StreamCapturer(String prefix, PrintStream old) {
			this.prefix = prefix;
			buffer = new StringBuilder(128);
			buffer.append(this.prefix).append(" > ");
			this.old = old;
			bOld = true;
		}
		
		public StreamCapturer(String prefix) {
			this.prefix = prefix;
			buffer = new StringBuilder(128);
			buffer.append(this.prefix).append(" > ");
		}

		@Override
		public void write(int b) throws IOException {
			char c = (char) b;
			String value = Character.toString(c);
			buffer.append(value);
			if (value.equals("\n")) {
				appendText(buffer.toString());
					buffer.delete(0, buffer.length());
					buffer.append("");
		            }
			if(bOld)
				old.print(c);
		}
	}
}
