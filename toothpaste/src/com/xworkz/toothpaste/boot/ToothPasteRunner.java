package com.xworkz.toothpaste.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.toothpaste.dto.ToothPasteDto;

public class ToothPasteRunner {
	
	public static void main(String[] args) {
		ToothPasteDto pasteDto = new ToothPasteDto(1, 150,"sensodine", "mint");
		ToothPasteDto pasteDto2 = new ToothPasteDto(2, 200, "colgate","mint");
		ToothPasteDto pasteDto3 = new ToothPasteDto(3, 100, "close up", "mint");
		ToothPasteDto pasteDto4 = new ToothPasteDto(4, 50, "mesvak", "mint");
		ToothPasteDto pasteDto5 = new ToothPasteDto(5, 75, "sencol", "mint");
		
		String name="sensodyne";
		String name2="amway gilster";
		String name3="oral-b";
		String name4="senquel";
		String name5="anchor";
		String name6="vicco";
		String name7="dadar red";
		String name8="himalayan";
		String name9="vedshakthi";
		String name10="max fresh";
		
		
		
		Collection <ToothPasteDto> paste = new ArrayList<ToothPasteDto>();
		System.out.println(paste.size());
		paste.add(pasteDto5);
		paste.add(pasteDto4);
		paste.add(pasteDto3);
		paste.add(pasteDto2);
		paste.add(pasteDto);
		
		Collection <String> names = new ArrayList<String>();
		names.add(name10);
		names.add(name9);
		names.add(name8);
		names.add(name7);
		names.add(name6);
		names.add(name5);
		names.add(name4);
		names.add(name3);
		names.add(name2);
		names.add(name);
		
		Iterator <String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println("the other paste names=="+iterator.next());
		}
		
		
		Iterator <ToothPasteDto> tooth = paste.iterator();
		while (tooth.hasNext()) {
			System.out.println(tooth.next());
		}
		System.out.println(paste.size());
		System.out.println(paste.remove(pasteDto));
		System.out.println(paste.size());
		paste.clear();
		System.out.println(paste.size());
	}

}
