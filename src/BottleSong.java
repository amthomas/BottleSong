class BottleSong {
	private String liquidName;
	private String bottleFormPlural;
	private String bottleFormSing;
	private int liquidNum;

	public BottleSong (String liquidName, String bottleFormPlural, String bottleFormSing, int liquidNum){
		this.liquidName = liquidName;
		this.bottleFormPlural = bottleFormPlural;
		this.bottleFormSing = bottleFormSing;
		this.liquidNum = liquidNum;
	}
	// turned the phrase into a method for less coding
	private void countPhrase() {
		System.out.println(liquidNum + " " + bottleFormPlural + " of " + liquidName + " on the wall.");
		System.out.println(liquidNum + " " + bottleFormPlural + " of " + liquidName + ".");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
	}
	
	// sing the song in the container's plural form
	private void countBottlesPlural() {
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
	private void countBottlesSingular() {
		String bottleBackup = bottleFormPlural;
		bottleFormPlural = bottleFormSing;
		countPhrase();
		liquidNum --;
		System.out.println(liquidNum + " " + bottleBackup + " of " + liquidName + " on the wall.");	
	}
	
	public void singSong(){
		countBottlesPlural();
		countBottlesSingular();
	}
}
