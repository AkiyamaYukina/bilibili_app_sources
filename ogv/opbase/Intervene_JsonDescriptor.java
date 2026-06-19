package com.bilibili.ogv.opbase;

import com.bilibili.bson.adapter.JsonInStringTypeAdapterFactory;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Intervene_JsonDescriptor.class */
public final class Intervene_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69856a = {new PojoPropertyDescriptor(CaptureSchema.JUMP_PARAMS_EXTRA, (String[]) null, RecommendModule.class, JsonInStringTypeAdapterFactory.class, 9), new PojoPropertyDescriptor("position", (String[]) null, Integer.TYPE, (Class) null, 1), new PojoPropertyDescriptor("type", (String[]) null, String.class, (Class) null, 1)};

    public Intervene_JsonDescriptor() {
        super(Intervene.class, f69856a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        RecommendModule recommendModule = (RecommendModule) objArr[0];
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Intervene(iIntValue, recommendModule, (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        Intervene intervene = (Intervene) obj;
        if (i7 == 0) {
            return intervene.f69853a;
        }
        if (i7 == 1) {
            return Integer.valueOf(intervene.f69854b);
        }
        if (i7 != 2) {
            return null;
        }
        return intervene.f69855c;
    }
}
