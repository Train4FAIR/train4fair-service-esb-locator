package de.fraunhofer.fit.train.model;

public enum EnvENUM {
	
	DEV("DEV"), PROD("PROD"), TEST("TEST");
	private String text;

	EnvENUM(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
	

	public String setText(String text) {
		return this.text = text;
	}

	public static EnvENUM fromString(String text) {
		for (EnvENUM b : EnvENUM.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}


}
