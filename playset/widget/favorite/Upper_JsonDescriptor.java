package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/Upper_JsonDescriptor.class */
public final class Upper_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85735a = {new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5)};

    public Upper_JsonDescriptor() {
        super(Upper.class, f85735a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new Upper(l7 == null ? 0L : l7.longValue(), (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Upper upper = (Upper) obj;
        if (i7 == 0) {
            return Long.valueOf(upper.getMid());
        }
        if (i7 != 1) {
            return null;
        }
        return upper.getName();
    }
}
