package com.xworkz.novals.boot;

import com.xworkz.novals.thing.Novals;

public class NovalRunner {

	public static void main(String[] args) {
		Novals noval = new Novals();

		noval.names("fantasy", "horror", "mystery", "scienceFictions", "comedy", "nonFictionNoval", "thrillerNoval",
				"historical", "romanticNoval", true);

	}

}
