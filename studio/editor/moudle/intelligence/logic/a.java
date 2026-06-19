package com.bilibili.studio.editor.moudle.intelligence.logic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f107344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f107345b;

    public static List a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104228)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104230), 7));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104226)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104229)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104225)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104219)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104221)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104218)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104231)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104217)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104223)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104224)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104220)));
        arrayList.add(new CaptionListItem(ContextCompat.getColor(context, 2131104227)));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((CaptionListItem) arrayList.get(i7)).getId() == 0) {
                ((CaptionListItem) arrayList.get(i7)).setId(i7 + 10);
            }
        }
        return arrayList;
    }

    public static List b(Context context) {
        if (f107345b == null) {
            ArrayList arrayList = new ArrayList();
            f107345b = arrayList;
            arrayList.add(new CaptionListItem(17, 0));
            f107345b.add(new CaptionListItem(-1, 1));
            f107345b.add(new CaptionListItem(ViewCompat.MEASURED_STATE_MASK, 2));
            f107345b.addAll(a(context));
        }
        f(f107345b);
        return f107345b;
    }

    public static List c(Context context) {
        if (f107344a == null) {
            ArrayList arrayList = new ArrayList();
            f107344a = arrayList;
            arrayList.add(new CaptionListItem(-1, 0));
            f107344a.addAll(a(context));
            f107344a.add(new CaptionListItem(ViewCompat.MEASURED_STATE_MASK, 8));
        }
        f(f107344a);
        return f107344a;
    }

    public static int d(String str) {
        if ("#FFFAAFC4".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("#FFFB7299".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("#FFA8071A".equalsIgnoreCase(str)) {
            return 12;
        }
        if ("#FFF5222D".equalsIgnoreCase(str)) {
            return 13;
        }
        if ("#FFFF7A45".equalsIgnoreCase(str)) {
            return 14;
        }
        if ("#FFFF9100".equalsIgnoreCase(str)) {
            return 15;
        }
        if ("#FFFADB14".equalsIgnoreCase(str)) {
            return 16;
        }
        if ("#FF52c41a".equalsIgnoreCase(str)) {
            return 17;
        }
        if ("#FF13C2C2".equalsIgnoreCase(str)) {
            return 18;
        }
        if ("#FF40a9ff".equalsIgnoreCase(str)) {
            return 19;
        }
        if ("#FF1890ff".equalsIgnoreCase(str)) {
            return 20;
        }
        if ("#FF5a62c7".equalsIgnoreCase(str)) {
            return 21;
        }
        if ("#FF9254de".equalsIgnoreCase(str)) {
            return 22;
        }
        return "#FF595959".equalsIgnoreCase(str) ? 23 : -1;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int color = Color.parseColor(str);
        if (color == -16777216) {
            return 2;
        }
        if (color != -1) {
            return d(str);
        }
        return 1;
    }

    public static void f(List list) {
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CaptionListItem) it.next()).setSelected(false);
            }
            ((CaptionListItem) list.get(0)).setSelected(true);
        }
    }
}
