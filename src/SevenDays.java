import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

import static java.util.Calendar.YEAR;

/**
 * 需求 表示最近七天（包括今天）
 * Created by 平凡的世界 on 2018/3/21.
 * @author 没想法的岁月
 */
public class SevenDays {
    public static void main(String[] args) {
        seachTime(7);

    }

    private static void seachTime(int recent) {

        Calendar c = Calendar.getInstance();
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();


        for (int i = 0; i < recent ; i++) {
            String format = dateTimeInstance.format(c.getTime());
            System.out.println(format);
            c.add(Calendar.DAY_OF_MONTH,-1);
//            c.set(Calendar.HOUR_OF_DAY,0);
//            c.set(Calendar.MINUTE,0);
//            c.set(Calendar.SECOND,0);
        }
    }
}
