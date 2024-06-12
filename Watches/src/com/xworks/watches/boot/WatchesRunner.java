package com.xworks.watches.boot;

import com.xworks.watches.bridge.SmartWatches;
import com.xworks.watches.bridge.Watches;

public class WatchesRunner {

	public static void main(String [] args) {
		SmartWatches watch = new SmartWatches();
		Watches watch1 = new Watches();
	
		watch.modalA1();
		watch1.modalA2();
		watch.modalA3();
		watch.modalA4();
		watch.modalA5();
		watch.price();
		watch.gst();
		watch.helpLine();
		watch.modalFT1();
		watch.modalFT2();
		watch.modalFT3();
		watch.modalFT4();
		watch.modalFT5();
		watch.modalF1();
		watch.modalF2();
		watch.modalF3();
		watch.modalF4();
		watch.modalF5();
		watch.modalG1();
		watch.modalG2();
		watch.modalG3();
		watch.modalG4();
		watch.modalG5();
		watch.modalR1();
		watch.modalR2();
		watch.modalR3();
		watch.modalR4();
		watch.modalR5();
	}
}
