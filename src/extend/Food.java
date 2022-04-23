package extend;

import java.text.SimpleDateFormat;
import java.util.Date;//java.sql.Date

public class Food extends Product {


    private Date expireDate;

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
