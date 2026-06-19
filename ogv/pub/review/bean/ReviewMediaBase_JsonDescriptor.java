package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase_JsonDescriptor.class */
public final class ReviewMediaBase_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71719a;

    static {
        Class cls = Long.TYPE;
        f71719a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("media_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("horizontal_picture", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("share_url", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("type_id", new String[]{"type"}, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("type_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("style", (String[]) null, Types.parameterizedType(List.class, new Type[]{ReviewMediaBase.ReviewTag.class}), (Class) null, 6), new PojoPropertyDescriptor("rating", (String[]) null, MediaRating.class, (Class) null, 6), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("area", new String[]{"areas"}, Types.parameterizedType(List.class, new Type[]{Types.wildcardType(new Type[]{ReviewMediaBase.ReviewArea.class}, new Type[0])}), (Class) null, 7), new PojoPropertyDescriptor("new_ep", (String[]) null, MediaEpisodeIndex.class, (Class) null, 6)};
    }

    public ReviewMediaBase_JsonDescriptor() {
        super(ReviewMediaBase.class, f71719a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewMediaBase reviewMediaBase = new ReviewMediaBase();
        Object obj = objArr[0];
        if (obj != null) {
            reviewMediaBase.f71703a = ((Long) obj).longValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            reviewMediaBase.f71704b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            reviewMediaBase.f71705c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            reviewMediaBase.f71706d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            reviewMediaBase.f71707e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            reviewMediaBase.f71708f = ((Integer) obj6).intValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            reviewMediaBase.f71709g = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            reviewMediaBase.h = (List) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            reviewMediaBase.f71710i = (MediaRating) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            reviewMediaBase.f71711j = ((Long) obj10).longValue();
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            reviewMediaBase.f71712k = (List) obj11;
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            reviewMediaBase.f71713l = (MediaEpisodeIndex) obj12;
        }
        return reviewMediaBase;
    }

    public final Object get(Object obj, int i7) {
        ReviewMediaBase reviewMediaBase = (ReviewMediaBase) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(reviewMediaBase.f71703a);
            case 1:
                return reviewMediaBase.f71704b;
            case 2:
                return reviewMediaBase.f71705c;
            case 3:
                return reviewMediaBase.f71706d;
            case 4:
                return reviewMediaBase.f71707e;
            case 5:
                return Integer.valueOf(reviewMediaBase.f71708f);
            case 6:
                return reviewMediaBase.f71709g;
            case 7:
                return reviewMediaBase.h;
            case 8:
                return reviewMediaBase.f71710i;
            case 9:
                return Long.valueOf(reviewMediaBase.f71711j);
            case 10:
                return reviewMediaBase.f71712k;
            case 11:
                return reviewMediaBase.f71713l;
            default:
                return null;
        }
    }
}
