package javaintermediario.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//		System.out.println(fuso);
//		}
		
		TimeZone tzLON = TimeZone.getTimeZone("Europe/London");
		
		System.out.println(tzLON.getDisplayName());
		System.out.println(tzLON.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraLON = Calendar.getInstance(tzLON);
		System.out.println(agoraLON.getTimeZone());
		System.out.println(sdf.format(agoraLON.getTime()));
		
		agoraLON.add(Calendar.HOUR_OF_DAY,tzLON.getOffset((System.currentTimeMillis())) / 1000/ 60 / 60);
		System.out.println(sdf.format(agoraLON.getTime()));
	}

}
