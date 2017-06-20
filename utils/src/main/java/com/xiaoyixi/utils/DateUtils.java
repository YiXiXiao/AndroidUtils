package com.xiaoyixi.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hxfy on 16/12/23.
 * 时间转换类
 * 兼容JAVA十三位  PHP十位
 */

public class DateUtils {
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy-MM-dd格式的时间
     */
    public static String stampToDate(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy:MM:dd格式的时间
     */
    public static String stampToDate2(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy.MM.dd格式的时间
     */
    public static String stampToDate3(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy.MM.dd HH:mm:ss格式的时间
     */
    public static String stampToDate10(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy/MM/dd HH:mm:ss格式的时间
     */
    public static String stampToDate4(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy-MM-dd HH:mm格式的时间
     */
    public static String stampToDate5(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(Long.valueOf(s));
        res = simpleDateFormat.format(date);
        return res;
    }
    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy年MM月dd格式的时间
     */
    public static String stampToDate6(String s){
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /**
     * 将时间戳转时间
     * @param s 时间戳
     * @return 返回yyyy-MM-dd格式的时间
     */
    public static String dateToStamp(String s) throws ParseException {
        if(s.length() == 10){
            s = s+"000";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /**
     * 根据时间戳获取一周周几
     * @param pTime 时间戳
     * @return 0代表周一 1代表周二
     */
    public static int getWeek(String pTime) {
        if(pTime.length() == 10){
            pTime = pTime+"000";
        }
        int Week = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//也可将此值当参数传进来
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(format.parse(pTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1:
//                Week += "天";
                Week = 0;
                break;
            case 2:
                Week = 1;
                break;
            case 3:
                Week = 2;
                break;
            case 4:
                Week = 3;
                break;
            case 5:
                Week = 4;
                break;
            case 6:
                Week = 5;
                break;
            case 7:
                Week = 6;
                break;
            default:
                break;
        }
        return Week;
    }

    /**
     * 根据时间戳获取几点
     * @param time
     * @return 返回几点
     */
    public static int getHour(String time){
        if(time.length() == 10){
            time = time+"000";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(time, pos);
        return strtodate.getHours();
    }

    /**
     * 根据时间戳返回几分
     * @param time
     * @return
     */
    public static int getMinutes(String time){
        if(time.length() == 10){
            time = time+"000";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(time, pos);
        return strtodate.getMinutes();
    }

}
