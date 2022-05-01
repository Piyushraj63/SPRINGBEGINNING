package bom.bay2;

public class Programm {
	
   private String pgName;
   private String pgGameVersion;
   private int pgID;
   
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
		public int getPgID() {
			return pgID;
		}
		public void setPgID(int pgID) {
			this.pgID = pgID;
		}
		
		@Override
		public String toString() {
			return "Programm [pgName=" + pgName + ", pgGameVersion=" + pgGameVersion + ", pgID=" + pgID + "]";
		}	   
   
}
