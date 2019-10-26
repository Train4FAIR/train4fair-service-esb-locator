package de.fraunhofer.fit.train.model;

public enum AppENUM {
	
	MS("MS"), MONGO_MS("MONGO_MS"), TMT("TMT"),NODES("NODES"),WEBDAV("WEBDAV"),DATACITE("DATACITE"); ; 
	private String text;

	AppENUM(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
	

	public String setText(String text) {
		return this.text = text;
	}

	public static AppENUM fromString(String text) {
		for (AppENUM b : AppENUM.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}


}
