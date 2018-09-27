package example;

import example.fruits.Applt;
import example.fruits.Banana;
import example.fruits.Watermelon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FruitsFactory {

    private static DateFormat df = new SimpleDateFormat("yyyy-MM-yy HH24:mm:ss");

    public static Applt getGoodApplt(){
        return new Applt("好的苹果", 12, df.format(new Date()));
    }

    public static Applt getApplt(){
        return new Applt("一般苹果", 8, df.format(new Date()));
    }

    public static Banana getGoodBanana(){
        return new Banana("好的香蕉", 10, df.format(new Date()));
    }

    public static Banana getBanana(){
        return new Banana("一般香蕉", 6, df.format(new Date()));
    }

    public static Watermelon getGoodWatermelon(){
        return new Watermelon("好的西瓜", 16, df.format(new Date()));
    }

    public static Watermelon getWatermelon(){
        return new Watermelon("一般西瓜", 7, df.format(new Date()));
    }

}
