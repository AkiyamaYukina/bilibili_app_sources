package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.intro.section.bean.StatNumber;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvSeasonInfo_JsonDescriptor.class */
public final class OgvSeasonInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92254a = {new PojoPropertyDescriptor("followers", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("score", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("play_data", (String[]) null, StatNumber.class, (Class) null, 5), new PojoPropertyDescriptor("score_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("score_night_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("text_night_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12)};

    public OgvSeasonInfo_JsonDescriptor() {
        super(OgvSeasonInfo.class, f92254a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvSeasonInfo((String) objArr[0], (String) objArr[1], (StatNumber) objArr[2], (Integer) objArr[3], (Integer) objArr[4], (Integer) objArr[5], (Integer) objArr[6]);
    }

    public final Object get(Object obj, int i7) {
        OgvSeasonInfo ogvSeasonInfo = (OgvSeasonInfo) obj;
        switch (i7) {
            case 0:
                return ogvSeasonInfo.f92247a;
            case 1:
                return ogvSeasonInfo.f92248b;
            case 2:
                return ogvSeasonInfo.a();
            case 3:
                return ogvSeasonInfo.f92250d;
            case 4:
                return ogvSeasonInfo.f92251e;
            case 5:
                return ogvSeasonInfo.f92252f;
            case 6:
                return ogvSeasonInfo.f92253g;
            default:
                return null;
        }
    }
}
