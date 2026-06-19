package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewResult_JsonDescriptor.class */
public final class ReviewResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72312a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3), new PojoPropertyDescriptor("share_url", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("data", (String[]) null, JsonObject.class, (Class) null, 6), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("need_captcha", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("captcha_url", (String[]) null, String.class, (Class) null, 6)};

    public ReviewResult_JsonDescriptor() {
        super(ReviewResult.class, f72312a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
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
        JsonObject jsonObject = (JsonObject) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str2 = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Boolean bool = (Boolean) obj5;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Object obj6 = objArr[5];
        return new ReviewResult(jLongValue, str, jsonObject, str2, zBooleanValue, (String) obj6, obj6 == null ? i11 | 32 : i11);
    }

    public final Object get(Object obj, int i7) {
        ReviewResult reviewResult = (ReviewResult) obj;
        if (i7 == 0) {
            return Long.valueOf(reviewResult.f72306a);
        }
        if (i7 == 1) {
            return reviewResult.e();
        }
        if (i7 == 2) {
            return reviewResult.c();
        }
        if (i7 == 3) {
            return reviewResult.b();
        }
        if (i7 == 4) {
            return Boolean.valueOf(reviewResult.d());
        }
        if (i7 != 5) {
            return null;
        }
        return reviewResult.a();
    }
}
