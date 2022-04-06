package san.cruz;

public class Programm {
	private String pgName;
	private String pgGameVersion;
	private long pgID;
	public String getPgName() {
		return pgName;
	}
	public void setPgName(String pgName) {
		this.pgName = pgName;
	}
	public String getPgGameVersion() {
		return pgGameVersion;
	}
	public void setPgGameVersion(String pgGameVersion) {
		this.pgGameVersion = pgGameVersion;
	}
	public long getPgID() {
		return pgID;
	}
	public void setPgID(long pgID) {
		this.pgID = pgID;
	}
	@Override
	public String toString() {
		return "Programm [pgName=" + pgName + ", pgGameVersion=" + pgGameVersion + ", pgID=" + pgID + "]";
	}
	
	
	
}
