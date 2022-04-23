package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;//java.sql.Date
//型態: Food, Product, Expirable
public class Food extends Product implements Expirable {


    private Date expireDate;

    @Override
    public Date 最後期限() {
    	return this.expireDate;
    }

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        // 2022/3/15, y:year, M:month, d= Day
        
        description = description +",到期日："+  format.format(expireDate);
        return description;
    }

}
