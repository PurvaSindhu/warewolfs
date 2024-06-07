package com.xworkz.fruits.things;

public class Fruits {

	public String apple;
	public String banana;
	public String strawberry;
	public String mashMelon;
	public String waterMelon;
	public String promogranite;
	public String blueBerry;
	public String berries;
	public String calaBash;

	public Fruits() {
		System.out.println("this is a no args constructor");
	}

	public Fruits(String apple, String banana, String mashMelon, String strawberry) {
		this.apple = apple;
		this.banana = banana;
		this.mashMelon = mashMelon;
		this.strawberry = strawberry;
		System.out.println("this.apple=" + this.apple + "this.banana=" + this.banana + "this.mashMelon="
				+ this.mashMelon + "this.strawberry=" + this.strawberry);
	}

	public Fruits(String waterMelon, String promogranite, String blueBerry, String berries, String calaBash) {
		this.waterMelon = waterMelon;
		this.promogranite = promogranite;
		this.blueBerry = blueBerry;
		this.berries = berries;
		this.calaBash = calaBash;
		System.out.println(
				"this.waterMelon=" + this.waterMelon + "this.promogranite=" + this.promogranite + "this.blueBerry="
						+ this.blueBerry + "this.berries=" + this.berries + "this.calaBash=" + this.calaBash);
	}

	public void setBanana(String bananas) {
		this.banana = bananas;
	}

	public String getBanana() {
		System.out.println("this is banana method" + banana);
		return banana;
	}

	public void setApple(String apples) {
		this.apple = apples;
	}

	public String getApple() {
		System.out.println("this is banana method" + banana);
		return apple;
	}

	public void setstrawberry(String strawberrys) {
		this.strawberry = strawberrys;
	}

	public String getstrawberry() {
		System.out.println("this is banana method" + strawberry);
		return strawberry;
	}

	@Override
	public String toString() {
		return "[apple=" + apple + ", banana=" + banana + ", mashMelon=" + mashMelon + ", waterMelon=" + waterMelon
				+ ", promogranite=" + promogranite + ", blueBerry=" + blueBerry + ", berries=" + berries + ", calaBash="
				+ calaBash + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apple == null) ? 0 : apple.hashCode());
		result = prime * result + ((banana == null) ? 0 : banana.hashCode());
		result = prime * result + ((berries == null) ? 0 : berries.hashCode());
		result = prime * result + ((blueBerry == null) ? 0 : blueBerry.hashCode());
		result = prime * result + ((calaBash == null) ? 0 : calaBash.hashCode());
		result = prime * result + ((mashMelon == null) ? 0 : mashMelon.hashCode());
		result = prime * result + ((promogranite == null) ? 0 : promogranite.hashCode());
		result = prime * result + ((strawberry == null) ? 0 : strawberry.hashCode());
		result = prime * result + ((waterMelon == null) ? 0 : waterMelon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (!(this instanceof Object)) {
			return false;
		}
		Fruits fruit = (Fruits) obj;
		return this.apple.equals(fruit.apple) && this.banana.equals(fruit.banana) && this.berries.equals(fruit.berries)
				&& this.blueBerry.equals(fruit.blueBerry) && this.calaBash.equals(fruit.calaBash)
				&& this.mashMelon.equals(fruit.mashMelon) && this.promogranite.equals(fruit.promogranite)
				&& this.strawberry.equals(fruit.strawberry)&&this.waterMelon.equals(fruit.waterMelon);
	}

	
}
