package block1;
import dhbw.koch.util.*;

public class jv01
{	/* Programm zum Test, ob Eclipse richtig installiert
			und konfiguriert wurde,
		Eingabe einer Zeichenkette 
		-->  Ausgabe der Anzahl enthaltener Zeichen  */  
	
	public static void main (String[] args)
	{	String eName = DHDialog.liesWinString 
				("Bitte geben Sie einen Namen ein:");
		int laenge = eName.length();;
		DHDialog.zeigeWinInt(laenge, 
				"Anzahl eingegebener Zeichen:");
		DHDialog.zeigeConsString("jv01 - Programmende");
	} // main
} // class