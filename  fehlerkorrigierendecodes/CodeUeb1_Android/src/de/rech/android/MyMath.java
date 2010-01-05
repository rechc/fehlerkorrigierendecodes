package de.rech.android;
import java.util.LinkedList;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MyMath extends Activity {
	public final static String ERRMSG_PRIMENUMBER = "Gf has to be a prime number.";
	public final static String ERRMSG_GFSMALLERASNUMBER = "Gf has to be greater than Number.";
	
	
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.main);
		
	   String number_widget29 =
			((TextView) findViewById(R.id.widget29)).getText().toString();
	   String gf_widget30 =
		   ((TextView) findViewById(R.id.widget29)).getText().toString();

	   
	   final int gf = Integer.parseInt(number_widget29);
	   final int number = Integer.parseInt(gf_widget30);
		
//		final int[] number = new int[] {R.id.widget29};
//	   final int[] gf = new int[] {R.id.widget30};
	   
	    Button calcButton = 
	        (Button) findViewById(R.id.widget28);
	      calcButton.setOnClickListener(

	    	        new View.OnClickListener() { public void onClick (View v){multInvText(number, gf); }});     
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
	    super.onCreateOptionsMenu(menu);
	    
		menu.add(Menu.NONE, 0, 0, "Exit");
	      //menu.add(Menu.NONE, 1, 1, "Settings");
	      //menu.add(Menu.NONE, 2, 2, "Other");
	      return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
	    switch (item.getItemId()) {
	    case 0:
	        finish();
	    }
	    return false;
	}
	
	public void onAction(){
		
	}
	
	public static int multInv(int number, int gf){
		if(!(gf > number))
			throw new IllegalArgumentException(ERRMSG_GFSMALLERASNUMBER);
		if(!isPrimeNumber(gf))
			throw new IllegalArgumentException(ERRMSG_PRIMENUMBER);
		number = addInv(number, gf);
		LinkedList<int[]> ggtList = new LinkedList<int[]>();
		int[] ggtTab;
		int rest = 1; // = 1 wegen while
		int erg;
		while(rest != 0){
			erg = gf / number;
			rest = gf % number;
			if(rest != 0){
				ggtTab = new int[3];
				ggtTab[0] = gf;
				ggtTab[1] = -erg;
				ggtTab[2] = number;
				ggtList.add(ggtTab);
			}
			gf = number;
			number = rest;
		}
		int[][] ggtArr = new int[ggtList.size()][];
		for(int i=0; i< ggtArr.length;i++){
			ggtArr[i] = ggtList.get(i);
		}
		final int LASTROW = ggtList.size() -1;
		int sum = ggtArr[LASTROW][1] * ggtArr[LASTROW][2];
		int a = 1;
		int b = ggtArr[LASTROW][0];
		int d = ggtArr[LASTROW][2];
		int c = sum / d;
		
		for(int i=LASTROW -1; i >= 0;i--){
			sum = ggtArr[i][1] * ggtArr[i][2] * c + a * b;
			a = c;
			b = ggtArr[i][0];
			d = ggtArr[i][2];
			c = sum / d;
		}
		while(c < 0)				//evtl reicht ein IF
			c += ggtArr[0][0];
		return c;
	}
	
	public static String multInvText(int number, int gf){
		if(gf < number)
			throw new IllegalArgumentException(ERRMSG_GFSMALLERASNUMBER);
		if(!isPrimeNumber(gf))
			throw new IllegalArgumentException(ERRMSG_PRIMENUMBER);
		StringBuffer text = new StringBuffer();
		if(number < 0){
			text.append(number).append("=");
			number = addInv(number, gf);
			text.append(number).append("(Gf(").append(gf).append("))\n\n");
		}
		LinkedList<int[]> ggtList = new LinkedList<int[]>();
		int[] ggtTab;
		int rest = 1; // = 1 wegen while
		int erg;
		text.append("GGT:\n");
		while(rest != 0){
			erg = gf / number;
			rest = gf % number;
			text.append(gf).append("/")
				.append(number).append("= ")
				.append(erg).append("R:")
				.append(rest).append(" || ");
			if(rest != 0){
				ggtTab = new int[3];
				ggtTab[0] = gf;
				ggtTab[1] = -erg;
				ggtTab[2] = number;
				ggtList.add(ggtTab);
				text.append(rest).append("=").append(gf);
				if(-erg >= 0)
					text.append("+");
				text.append(-erg).append("*")
					.append(number).append("\n");
			}
			gf = number;
			number = rest;
		}
		int[][] ggtArr = new int[ggtList.size()][];
		for(int i=0; i< ggtArr.length;i++){
			ggtArr[i] = ggtList.get(i);
		}
		final int LASTROW = ggtList.size() -1;
		int sum = ggtArr[LASTROW][1] * ggtArr[LASTROW][2];
		int a = 1;
		int b = ggtArr[LASTROW][0];
		int d = ggtArr[LASTROW][2];
		int c = sum / d;
		text.append("\n\n\nInverse Berechnen:\n").append("1 = ")
			.append(a).append("*").append(b);
		if(c >= 0)
			text.append("+");
		text.append(c).append("*").append(d);
		for(int i=LASTROW -1; i >= 0;i--){
			text.append(" = ").append(a).append("*").append(b);
			if(c >= 0)
				text.append("+");
			text.append(c).append("*").append("(").append(ggtArr[i][0]);
			if(ggtArr[i][1] >= 0)
				text.append("+");
			text.append(ggtArr[i][1]).append("*")
				.append(ggtArr[i][2]).append(") = ");
			sum = ggtArr[i][1] * ggtArr[i][2] * c + a * b;
			a = c;
			b = ggtArr[i][0];
			d = ggtArr[i][2];
			c = sum / d;
			text.append(a)
				.append("*").append(b);
			if(c >= 0)
				text.append("+");
			text.append(c).append("*").append(d);
		}
		text.append("\n\n1 =").append(c)
			.append("*").append(d)
			.append("(mod ").append(ggtArr[0][0])
			.append(")").append("\n=> ")
			.append(d).append("^-1 = ")
			.append(c);
		while(c < 0){				//wahrsch. reicht ein IF
			c += ggtArr[0][0];
			text.append("+").append(ggtArr[0][0])
			.append(" = ").append(c);
		}
		return text.toString();
	}
	
	public static int addInv(int number, int gf){
		while(number < 0){
			number += gf;
		}
		return number;
	}
	
	public static boolean isPrimeNumber(long p){
		if (p < 2)
			return false;
		long i;
		int pSqrt = (int)(Math.sqrt(p)) + 1;
		for(i=2; i<pSqrt; i++){
			if((p % i) == 0)
				return false;
		}
		return true;
	}
	
	
}