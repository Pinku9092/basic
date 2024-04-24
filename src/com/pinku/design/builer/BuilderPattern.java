package com.pinku.design.builer;

public class BuilderPattern {
		public static void main(String[] args) {
			Coffee coffee = new Coffee.Builder("Mocha").milk(true).sugar(false).size("Large").build();
		}
}

class Coffee {

	private Coffee(Builder builder) {
		this.type = builder.type;
		this.sugar = builder.sugar;
		this.milk = builder.milk;
		this.size = builder.size;
	}

	private String type;

	private boolean sugar;

	private boolean milk;

	private String size;
	
	  static class Builder {
		
		 private String type;

			private boolean sugar;

			private boolean milk;

			private String size;
		 
		public Builder(String type) {
			this.type = type;
		}
		
		public Builder sugar(boolean value) {
			this.sugar = value;
			return this;
		}
		
		public Builder milk(boolean value) {
			this.milk = value;
			return this;
		}
		
		public Builder size(String value) {
			this.size = value;
			return this;
		}
		
		public Coffee build() {
			return new Coffee(this);
		}
	}

}
