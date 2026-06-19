package com.bilibili.ogv.opbase;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.opbase.RecommendModule;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule_Skin_JsonDescriptor.class */
public final class RecommendModule_Skin_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69934a = {new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("start_gradients_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("end_gradients_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12)};

    public RecommendModule_Skin_JsonDescriptor() {
        super(RecommendModule.Skin.class, f69934a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new RecommendModule.Skin(iIntValue, (String) objArr[1], (Integer) objArr[2], (Integer) objArr[3], (Integer) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        RecommendModule.Skin skin = (RecommendModule.Skin) obj;
        if (i7 == 0) {
            return Integer.valueOf(skin.f69925a);
        }
        if (i7 == 1) {
            return skin.f69926b;
        }
        if (i7 == 2) {
            return skin.f69927c;
        }
        if (i7 == 3) {
            return skin.f69928d;
        }
        if (i7 != 4) {
            return null;
        }
        return skin.f69929e;
    }
}
