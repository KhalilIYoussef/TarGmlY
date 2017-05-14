package khaliliyoussef.gradproject.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;

import java.util.ArrayList;
import java.util.List;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI;


public class InsertWords {

    public static void insertGeneralWords(Context context) {


        //create a list of fake guests
        List<ContentValues> list = new ArrayList<>();
//notice all english words are small case and arabic are single word
        ContentValues cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "android");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "روبوت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "above");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فوق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "able");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قادر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "account");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حساب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "actor");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ممثل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "application");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تطبيق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "add");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يجمع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "after");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بعد");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "agree");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يوافق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "accept");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يقبل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "airport");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مطار");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "addition");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اضافه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "also");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ايضا");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "always");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "دائما");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "art");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ask");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يسأل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "arrive");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يصل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "award");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مكافأه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "article");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مقال");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "any");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أى");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "angry");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "غاضب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "again");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اعاده");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "address");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عنوان");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "accident");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حادث");

        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bad");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سيئ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bathroom");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حمام");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "beautiful");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جميل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bear");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يتحمل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bed");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سرير");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "behind");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خلف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bell");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جرس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "believer");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مؤمن");
        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "big");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كبير");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bird");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "طائر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "blanket");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بطانيه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "blood");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "دم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "box");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صندوق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "boxing");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ملاكمه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "busy");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مشغول");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "body");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جسم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bread");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خبز");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "breakfast");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فطور");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "broom");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مكنسه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "breast");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صدر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "but");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "لكن");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "call");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يكلم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "chance");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فرصه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "can");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يستطيع");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "carpet");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سجاده");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "center");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مركز");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cheap");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رخيص");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cheat");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يخدع");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "children");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أطفال");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "choose");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يختار");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "church");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كنيسة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "city");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مدينة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "class");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فصل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "clean");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نظيف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "clear");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "واضح");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "clinic");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عيادة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "clothes");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ملابس");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cold");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بارد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "contract");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عقد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "camp");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مخيم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "control");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يسيطر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "crisis");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أزمه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cross");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يعبر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "curtain");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ستاره");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cook");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يطبخ");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dark");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ظلام");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "commerce");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تجاره");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dates");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تمر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "delay");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يؤجل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "difficult");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صعب");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "decide");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يقرر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "devil");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شيطان");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "desert");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صحراء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "different");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مختلف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dirty");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قذر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dicount");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خصم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "discover");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يكتشف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dictionary");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قاموس");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "daughter");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أبنة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "day");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يوم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "debit");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مدين");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "december");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ديسمبر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "deep");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عميق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "deliver");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يسلم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "develop");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يتطور");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "diamond");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ماسة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dice");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "النرد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dig");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يحفر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "direction");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اتجاه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "discussion");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مناقشة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "doctor");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "طبيب");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "division");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قسمه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "dog");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كلب");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "each");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eagle");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نسر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ear");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أذن");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "early");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مبكر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "earner");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مربح");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "earnings");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ايرادات");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "earth");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ارض");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "earthquake");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "زلزال");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "easel");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حامل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "east");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شرق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eat");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يأكل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "edge");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حافة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "educate");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يعلم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "efficient");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كفء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "egg");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بيضه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "egypt");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مصر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eight");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثمانيه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "elbow");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مرفق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "elders");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مسنون");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "electricity");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كهرباء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "elephant");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فيل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "embassy");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سفاره");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "employ");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يوظف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ebullience");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "غليان");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eclat");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بهاء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "echeloned");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مصطف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eclipse");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كسوف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eddy");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "دوامه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "edit");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يحرر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "effectuation");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تأثير");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eggplant");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "باذنجان");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "eighth");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثامن");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "elan");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حيوية");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "elate");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مبتهج");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "embarrassed");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مرتبك");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "add");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يضيف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "addition");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أضافه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "access");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "دخول");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "action");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نشاط");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "activate");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تنشيط");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "address");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عنوان");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "administration");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اداره");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "administrator");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مدير");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "alert");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تنبيه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "alternative");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بديل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "assign");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اسناد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "authorization");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "التحقق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "automatic");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تلقائى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ban");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حظر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "behavior");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سلوك");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "block");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "blog");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مدونة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "blog");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تدوين");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "body");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بدن");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "boolean");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "متغيرمنطقى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "boot");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اقلاع");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "bootstrap");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اقلاع");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cancel");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "الغاء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "category");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تصنيف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "character");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "محرف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "chart");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رسم بيانى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "class");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فئه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "click");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نقرة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "comment");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تعليق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "compact");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مضغوط");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "compiler");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مترجم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "compose");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يكتب");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "composition");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كتابه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "configuration");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اعداد");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "congestion");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اختناق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "console");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "محاوره");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "constant");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثابت");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "contact");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اتصال");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "context");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سياق");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "control");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تحكم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "copy");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ينسخ");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "create");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ينشأ");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "creation");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "انشاء");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "crawlers");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "هوام");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cursor");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مؤشر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "cut");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قص");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "data");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بيانات");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "database");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قاعدةبيانات");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "default");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اعتيادى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "delete");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حذف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "description");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وصف");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "desktop");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سطح.المكتب");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "destination");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وجهة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "disable");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ابطال");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "disc");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قرص");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "display");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عرض");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "download");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تنزيل");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "drawing");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رسمه");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "draw");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رسم");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "email");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بريدألكترونى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "enable");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تمكين");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "encoding");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ترميز");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "encrypt");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يشفر");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "encryption");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تشفير");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "entry");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مدخلة");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "escape");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تخطى");

        list.add(cv);

        cv = new ContentValues();

        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "export");

        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تصدير");

        list.add(cv);


        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "khalil");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "احسن واحد بيعمل تطبيقات للأندرويد");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "facsimile");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نسخة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fable");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خرافه");
        list.add(cv);


        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabled");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "أسطوري");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabric");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نسيج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabricate");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اصنع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabricated");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مصطنع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabricates");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يصنع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabulous");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رائع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fabulousness");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "روعة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "face");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وجه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "faceless");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مجهول");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "facer");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صفعه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "facet");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مظهر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "faceted");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "منحوت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "facetious");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "طريف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "facile");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سهل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fake");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مزيف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fear");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خوف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fearsome");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مفزع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feasibility");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عمليه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feasible");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عملي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feast");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عيد");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feature");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ميزة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fee");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اجر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feeble");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ضعيف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feeling");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شعور");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feigns");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يختلق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "feint");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خدعه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "femme");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "امرأه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fictional");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "خيالي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "figure");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رقم الرمز");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "fjord");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مضيق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gabble");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثرثرة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gabbled");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مثرثر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gaffe");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "غلطه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gaffer");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مسن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gaggle");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قطيع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gaiety");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مرح");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gain");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مكسب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gainers");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رابحون");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gainsaid");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "انكر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gainsay");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نتاقض");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gale");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عاصفه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "game");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "لعبة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gears");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تروس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gender");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جنس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "generally");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عموما");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "generator");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مولد");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "generous");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كريم");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "genes");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جينات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "genetics");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "علم الوراثه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "genetically");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وراثيا");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "genius");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عبقري");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "genteel");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نبيل");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "gentle");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "لطيف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "geographic");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جغرافي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "habits");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عادات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "habitant");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ساكن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "haggle");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مساومه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hair");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شعر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "haircutter");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "حلاق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "half");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نصف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hall");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صاله");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "head");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رئيس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "headache");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صداع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "health");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صحه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "healthy");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صحي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hear");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يسمع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heard");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مسموع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heart");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قلب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heaven");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سماء");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heavebward");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نحو السماء");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heaves");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يرفع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heaviest");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اثقل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heavy");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثقيل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "he");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "هو");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "high");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مستوى العالي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "higher");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اعلي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "highbrow");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مثقف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "highclass");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "راقي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hijacked");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مختطف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hijack");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اختطاف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hoar");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "صقيع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hoard");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كنز");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hobby");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "هوايه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "home");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بيت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "homebrew");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وطني");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "homebuilt");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "محلي الصنع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hours/hrs");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ساعات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ice");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثلج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "iceberg");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جبل الثلجي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "icebox");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثلاجة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "icecold");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شديد البروده");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "iced");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مجمد");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "icon");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ايقونه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "iconic");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ايقوني");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "iconoclast");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثائر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "iconoclastic");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "متمرد");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "id");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بطاقه الهويه الشخصيه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "idea");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فكرة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ideal");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مثالي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "idealism");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مثاليه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "ideals");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نماذج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "identical");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مماثل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "identifiable");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مميز");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "identifier");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "معرف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "idlest");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عاطل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jab");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ابره");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jabbed");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "وخز");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jackal");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ثعلب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jail");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "سجن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jailed");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مسجون");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jam");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مربي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jamboree");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مهرجان");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jape");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اخدع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "japed");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مخدوع");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jarred");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "متنافر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jarring");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تنافر");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "javelin");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رمح");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jaw");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "فك");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jealous");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "غيور");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jealousness");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "غيره");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "Jerseys");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بلوزات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "Jerusalem");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قدس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jest");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "دعابه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jester");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مهرج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jesus");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "المسيح");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jew");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يهودي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jewel");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جوهره");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "jeweled");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مرصع بالجواهر");
        list.add(cv);


        //insert all guests in one transaction
        try {

            //clear the table first
            context.getContentResolver().delete(CONTENT_URI, null, null);
            // go through the list and add one by one
            for (ContentValues c : list) {

                context.getContentResolver().insert(CONTENT_URI, c);
            }

        } catch (SQLException e) {

            //error while inserting the values
            //too bad :(
        }


    }

    public static void insertScientificWords(Context context) {
        //create a list of fake guests
        List<ContentValues> list = new ArrayList<>();
//notice all english words are small case and arabic are single word
        ContentValues


                cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"mouse");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"فأرة");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"module");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"وحدة برمجية");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"mode");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"وضعية");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"modification");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"تعديل");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"menu");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"قائمة خيارات");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"low level");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"مستوى دقيق");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"keyboard");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"لوحة المفاتيح");
                list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"label");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"رقعة تعريف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"logout");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"خروج");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"login");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"وُلُوج");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"localization");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"التحلية");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"list");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"قائمة بيانات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"log Entry");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"مدخلة سجل");
        list.add(cv);


        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"log");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"إدراج في السجل");
        list.add(cv);


        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"multimedia");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"وسائط المتعددة");
                list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"notification");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"إشعار");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"network");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"شبكة");
        list.add(cv);
        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH,"navigation");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"تَصفُّح");
        list.add(cv);


        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "full");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "كامل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "file");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ملف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "floppy");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مرن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "floppy disk");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قرص مرن");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "folder");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ملف/حافظه اوراق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "format");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شكل/تنسيق");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "formation");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شكل/تكوين");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "firewall");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "جدار النار");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "footer");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تذييل الصفحة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "folderlist");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قائمة المجلدات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "file manager");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اداره البرنامج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "file name");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اسم الملف");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "free software");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "برمجيات الحره");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "free ware");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "برمجيات المجانيه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "favorites");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مفضله");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "font");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نوع الخط");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "group");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مجموعة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "general");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "عام");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hexadecimal");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "نظام العد الست عشري");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hidden");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مخفي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hard disk");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "قرص صلب/ثابت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hardware");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "اجزاء صلبه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "header");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "راس");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hyperlinks");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "روابط فائقة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "hypercard");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بطاقه الفائقه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "history");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "محفوظات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "html");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "لغه المستعملة في بناء المتصفحات");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "http");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "بروتوكول انتقال النص المتشعب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "heading");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ترويسه");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "internet explorer");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "متصفح الانترنت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "insert");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "ملحق/يدرج");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "install");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "يركب جهاز");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "installation");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "تركيب");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "icdl");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "رخصه الدوليه لقياده الحاسب الآلي");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "italic");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "مائل");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "intranet");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "انترانت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "internet");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "انترنت");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "isdn");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "شبكه الرقميه للخدمات المتكاملة");
        list.add(cv);

        cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "informatics");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC, "معلوماتيه");
        list.add(cv);


        //insert all guests in one transaction
        try {

            //clear the table first
            context.getContentResolver().delete(CONTENT_URI, null, null);
            // go through the list and add one by one
            for (ContentValues c : list) {

                context.getContentResolver().insert(CONTENT_URI, c);
            }

        } catch (SQLException e) {

            //error while inserting the values
            //too bad :(
        }


    }


}
