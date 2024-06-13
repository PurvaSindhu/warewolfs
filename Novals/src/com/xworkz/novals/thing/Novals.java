package com.xworkz.novals.thing;

import com.xworkz.novals.dto.NovalGenereDto;

public class Novals {

	public void names(String fantasyies, String horrorNoval, String mysteryNoval, String scienceFictions,
			String comedyNoval, String nonFictionNoval,String thrillerNoval,String historical,String romanticNoval,boolean reading) {

		NovalGenereDto genere = new NovalGenereDto();
		
		genere.setFantasy(fantasyies);
		genere.setHorror(horrorNoval);
		genere.setMystery(mysteryNoval);
		genere.setScienceFiction(scienceFictions);
		genere.setComedy(comedyNoval);
		genere.setNonFiction(nonFictionNoval);
		genere.setThriller(thrillerNoval);
		genere.setHistoricalmystery(historical);
		genere.setRomance(romanticNoval);
		genere.setEnjoyReading(reading);
		
		genere.getFantasy();
		genere.getHorror();
		genere.getMystery();
		genere.getScienceFiction();
		genere.getComedy();
		genere.getNonFiction();
		genere.getThriller();
		genere.getHistoricalmystery();
		genere.getRomance();
		genere.isEnjoyReading();
		
		
	}

}
