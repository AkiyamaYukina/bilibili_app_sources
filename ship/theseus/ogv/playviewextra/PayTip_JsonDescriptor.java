package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.adapter.FirstFromListAdapter;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PayTip_JsonDescriptor.class */
public final class PayTip_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94371a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url_open_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type", (String[]) null, PrimaryNavType.class, (Class) null, 4), new PojoPropertyDescriptor("show_type", (String[]) null, PayTip.ShowType.class, (Class) null, 7), new PojoPropertyDescriptor("img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_day_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("bg_night_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_line_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("bg_night_line_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("text_night_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("button", (String[]) null, BadgeButtonVo.class, FirstFromListAdapter.class, 8), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 0), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5), new PojoPropertyDescriptor("giant_screen_img", (String[]) null, String.class, (Class) null, 5)};

    public PayTip_JsonDescriptor() {
        super(PayTip.class, f94371a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Integer num = (Integer) objArr[2];
        int iIntValue = num == null ? 0 : num.intValue();
        String str3 = (String) objArr[3];
        PrimaryNavType primaryNavType = (PrimaryNavType) objArr[4];
        Object obj = objArr[5];
        if (obj == null) {
            i7 = 32;
        }
        PayTip.ShowType showType = (PayTip.ShowType) obj;
        String str4 = (String) objArr[6];
        Integer num2 = (Integer) objArr[7];
        Object obj2 = objArr[8];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 256;
        }
        Integer num3 = (Integer) obj2;
        Integer num4 = (Integer) objArr[9];
        Object obj3 = objArr[10];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 1024;
        }
        Integer num5 = (Integer) obj3;
        Integer num6 = (Integer) objArr[11];
        Object obj4 = objArr[12];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 4096;
        }
        return new PayTip(str, str2, iIntValue, str3, primaryNavType, showType, str4, num2, num3, num4, num5, num6, (Integer) obj4, (BadgeButtonVo) objArr[13], (ReportVo) objArr[14], (Map) objArr[15], (String) objArr[16], i10);
    }

    public final Object get(Object obj, int i7) {
        PayTip payTip = (PayTip) obj;
        switch (i7) {
            case 0:
                return payTip.f94355a;
            case 1:
                return payTip.m();
            case 2:
                return Integer.valueOf(payTip.n());
            case 3:
                return payTip.g();
            case 4:
                return payTip.l();
            case 5:
                return payTip.i();
            case 6:
                return payTip.a();
            case 7:
                return payTip.b();
            case 8:
                return payTip.c();
            case 9:
                return payTip.d();
            case 10:
                return payTip.e();
            case 11:
                return payTip.j();
            case 12:
                return payTip.k();
            case 13:
                return payTip.f94367n;
            case 14:
                return payTip.f94368o;
            case 15:
                return payTip.h();
            case 16:
                return payTip.f();
            default:
                return null;
        }
    }
}
