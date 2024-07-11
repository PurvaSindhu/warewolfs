package com.xworkz.medicalstore.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.medicalstore.dto.MedicalStoreDto;


public class MedicalStoreRunner {
	
	public static void main(String[] args) {
			
			
			
			MedicalStoreDto dto = new MedicalStoreDto("headache",6,450,"migrain");
			MedicalStoreDto dto1 = new MedicalStoreDto("stomachACHE",5,200,"Acidity");
			MedicalStoreDto dto2 = new MedicalStoreDto("leg pain",9,1200,"pain killer");
			MedicalStoreDto dto3 = new MedicalStoreDto("motion sickness",7,200,"nauseous");
					
			Comparator<MedicalStoreDto> comp = new Comparator<MedicalStoreDto>() {
				@Override
				public int compare(MedicalStoreDto i, MedicalStoreDto j) {
					
					return i.getSymptoms().compareTo(j.getSymptoms());
				}
			};
			
			List<MedicalStoreDto> list = new ArrayList<MedicalStoreDto>(); 
			list.add(dto3);
			list.add(dto2);
			list.add(dto);
			list.add(dto1);
			
			Collections.sort(list,comp);
			
			for (MedicalStoreDto store : list) {
				System.out.println(store);
			};	
		}
		
	}


