package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;
//型態:SimCard, Product,  Warrantable, Expirable
public class SimCard extends Product implements Warrantable,Expirable{
    private Date expireDate;
	public int warranty;
	
	@Override
	public int 保固天數() {
		return this.warranty;
	}
	@Override
	public Date 最後期限() {//ctrl+d : delete line
		return this.expireDate;
	}
	
	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}
	
	@Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        description = description +",最後開卡日："+  format.format(expireDate)+",使用data:"+warranty+"天";
        return description;
    }



	
    
}
