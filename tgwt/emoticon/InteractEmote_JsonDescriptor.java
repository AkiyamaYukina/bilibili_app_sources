package com.bilibili.tgwt.emoticon;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/emoticon/InteractEmote_JsonDescriptor.class */
public final class InteractEmote_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f111160a = {new PojoPropertyDescriptor("emote_id", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("small_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5)};

    public InteractEmote_JsonDescriptor() {
        super(InteractEmote.class, f111160a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new InteractEmote(iIntValue, (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        InteractEmote interactEmote = (InteractEmote) obj;
        if (i7 == 0) {
            return Integer.valueOf(interactEmote.f111157a);
        }
        if (i7 == 1) {
            return interactEmote.f111158b;
        }
        if (i7 != 2) {
            return null;
        }
        return interactEmote.f111159c;
    }
}
