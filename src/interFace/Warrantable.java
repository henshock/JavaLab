package interFace;

public interface Warrantable {
	//系統常數,全大寫,中間是_區隔兩個字,在介面中,public static final皆可省略
	public static final int MAX_WARRANTY = 365;
	
	int 保固天數();
	
	public default int 檢測費用() {
		return 500;
	}
	
}
