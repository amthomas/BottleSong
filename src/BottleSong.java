class BottleSong {
	String liquidName;
	String bottleFormPlural;
	String bottleFormSing;
	String bottleBackup;
	int liquidNum;

	// turned the phrase into a method for less coding
	void countPhrase() {
		System.out.println(liquidNum + " " + bottleFormPlural + " of " + liquidName + " on the wall.");
		System.out.println(liquidNum + " " + bottleFormPlural + " of " + liquidName + ".");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
	}
	
	// sing the song in the container's plural form
	void countBottlesPlural() {
		while (liquidNum > 1) {
			countPhrase();
			liquidNum --;
			if (liquidNum != 1){
				System.out.println(liquidNum + " " + bottleFormPlural + " of " + liquidName + " on the wall.");
			} else {
				System.out.println(liquidNum + " " + bottleFormSing + " of " + liquidName + " on the wall.");
			}
		}
	}
	
	// sing the song in the container's singular form
	void countBottlesSingular() {
		bottleBackup = bottleFormPlural;
		bottleFormPlural = bottleFormSing;
		countPhrase();
		liquidNum --;
		System.out.println(liquidNum + " " + bottleBackup + " of " + liquidName + " on the wall.");	
	}	
}
