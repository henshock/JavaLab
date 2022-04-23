package equals;

import java.util.Objects;

public class Employee extends Object{
	
	private String id;
	//private String name;

	public Employee(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//this==e1(17), obj==e2(20)
		//先判斷傳進來的物件是不是Employee
		if ( obj instanceof Employee) {
			//轉型成Employee,因為Object上並沒有id的屬性
			Employee emp = (Employee) obj;
			//比id的值,利用String equals做逐字比較
//			return this.id.equals(emp.id) && this.name.equals(emp.name);
			return this.id.equals(emp.id);
		}
		return false;
	}
	@Override
	public int hashCode() {
		//產生一個數字能代表物件
		return Objects.hash(id);
//		return Objects.hash(id,name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee("+this.id+") GC!!!");
		//釋放hold住資源,關閉檔案,關閉資料庫連線
	}
	
	@Override
	public String toString() {//desc()
		return String.format("員工(%s)", this.id);
	}
	
	
}











