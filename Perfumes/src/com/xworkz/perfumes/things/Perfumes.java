package com.xworkz.perfumes.things;

public class Perfumes {

	public int number;
	public String storeName;
	public String gucci;
	public String jenniferAniston;
	public String yardley;
	public String fantasy;
	public String zudio;
	public String denver;
	public String zara;
	public String carltonLandon;
	public String afforable;
	public int price;
	public int range;
	public int rating;
	public int inStock;

	public Perfumes() {
		System.out.println("this is perfumes class");
	}

	public Perfumes(int number, String storeName, String gucci, String jenniferAniston, String yardley, String fantasy,
			String zudio) {
		this.number = number;
		this.storeName = storeName;
		this.gucci = gucci;
		this.jenniferAniston = jenniferAniston;
		this.yardley = yardley;
		this.fantasy = fantasy;
		this.zudio = zudio;

		System.out.println("this.number=" + number + "this.storeName=" + this.storeName + "this.gucci=" + this.gucci
				+ "this.jenniferAniston=" + this.jenniferAniston + "this.yardley=" + this.yardley + "this.fantasy="
				+ this.fantasy + "this.zudio=" + this.zudio);
	}

	public Perfumes(String denver, String zara, String carltonLandon, String afforable, int price, int range,
			int rating, int inStock) {
		this.denver = denver;
		this.zara = zara;
		this.carltonLandon = carltonLandon;
		this.afforable = afforable;
		this.price = price;
		this.range = range;
		this.rating = rating;
		this.inStock = inStock;

		System.out.println("this.denver=" + this.denver + "this.zara=" + this.zara + "this.carltonLandon="
				+ this.carltonLandon + "this.afforable=" + this.afforable + "this.price=" + this.price + "this.range="
				+ this.range + "this.rating=" + this.rating+"this.inStock="+this.inStock);
	}

	public void setstoreName(String name) {
		this.storeName = name;
	}

	public String getstoreName() {
		System.out.println("the store name is=" + storeName);
		return storeName;
	}

	public void setprice(int cost) {
		this.price = cost;
	}

	public int getprice() {
		System.out.println("the store name is=" + price);
		return price;
	}

	public void setrange(int around) {
		this.range = around;
	}

	public int getrange() {
		System.out.println("the store name is=" + range);
		return range;
	}

	public void setrating(int stars) {
		this.rating = stars;
	}

	public int getrating() {
		System.out.println("the store name is=" + rating);
		return rating;
	}

	public void setinStock(int present) {
		this.inStock = present;
	}

	public int getinStock() {
		System.out.println("the store name is=" + inStock);
		return inStock;
	}

	@Override
	public String toString() {
		return "[number=" + number + ",storeName=" + storeName + ",gucci=" + gucci + ",jenniferAniston="
				+ jenniferAniston + ",yardley=" + yardley + ",fantasy=" + fantasy + ", zudio=" + zudio + ", denver="
				+ denver + ", zara=" + zara + ", carltonLandon=" + carltonLandon + ", afforable=" + afforable
				+ ", price=" + price + ", range=" + range + ",rating=" + rating + " , inStock=" + inStock + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (!(this instanceof Object)) {
			return false;
		}

		Perfumes scent = (Perfumes) obj;
		return this.number == (scent.number) && this.storeName.equals(scent.storeName) && this.gucci.equals(scent.gucci)
				&& this.jenniferAniston.equals(scent.jenniferAniston) && this.yardley.equals(scent.yardley)
				&& this.fantasy.equals(scent.fantasy) && this.zudio.equals(scent.zudio)
				&& this.denver.equals(scent.denver) && this.zara.equals(scent.zara)
				&& this.carltonLandon.equals(scent.carltonLandon) && this.afforable.equals(scent.afforable)
				&& this.price == (scent.price) && this.range == (scent.range) && this.rating == (scent.rating)
				&& this.inStock == (scent.inStock);
	}

	@Override
	public int hashCode() {
		final int prime = 3;
		int results = 1;
		results = results * prime + number;
		results = results * prime +((storeName==null) ? 0 : storeName.hashCode());
		results = results * prime +((gucci==null) ? 0 : gucci.hashCode());
		results = results * prime +((jenniferAniston==null) ? 0 : jenniferAniston.hashCode());
		results = results * prime +((yardley==null) ? 0 : yardley.hashCode());
		results = results * prime +((fantasy==null) ? 0 : fantasy.hashCode());
		results = results * prime +((zudio==null) ? 0 : zudio.hashCode());
		results = results * prime+((denver==null) ? 0 : denver.hashCode());
		results = results * prime +((zara==null) ? 0 : zara.hashCode());
		results = results * prime +((carltonLandon==null) ? 0 : carltonLandon.hashCode());
		results = results * prime +((afforable==null) ? 0 : afforable.hashCode());
		results = results * prime + price;
		results = results * prime + range;
		results = results * prime + rating;
		results = results * prime + inStock;
		
		return results;

	}
}
