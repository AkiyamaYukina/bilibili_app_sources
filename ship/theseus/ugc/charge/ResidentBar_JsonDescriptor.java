package com.bilibili.ship.theseus.ugc.charge;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ResidentBar_JsonDescriptor.class */
public final class ResidentBar_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96433a = {new PojoPropertyDescriptor("question_text", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("button", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_image", (String[]) null, String.class, (Class) null, 4)};

    public ResidentBar_JsonDescriptor() {
        super(ResidentBar.class, f96433a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        TextVo textVo = (TextVo) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        TextVo textVo2 = (TextVo) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        return new ResidentBar(textVo, str, textVo2, (ReportVo) obj4, (String) objArr[4], (String) objArr[5], i10);
    }

    public final Object get(Object obj, int i7) {
        ResidentBar residentBar = (ResidentBar) obj;
        if (i7 == 0) {
            return residentBar.f();
        }
        if (i7 == 1) {
            return residentBar.c();
        }
        if (i7 == 2) {
            return residentBar.b();
        }
        if (i7 == 3) {
            return residentBar.e();
        }
        if (i7 == 4) {
            return residentBar.d();
        }
        if (i7 != 5) {
            return null;
        }
        return residentBar.a();
    }
}
