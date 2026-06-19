package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/Author_JsonDescriptor.class */
public final class Author_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72230a = {new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("uname", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("vip", (String[]) null, Vip.class, (Class) null, 4), new PojoPropertyDescriptor("level", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("vip_label", (String[]) null, VipLabel.class, (Class) null, 4)};

    public Author_JsonDescriptor() {
        super(Author.class, f72230a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Vip vip = (Vip) objArr[3];
        Integer num = (Integer) objArr[4];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Author(jLongValue, str, str2, vip, iIntValue, (VipLabel) objArr[5]);
    }

    public final Object get(Object obj, int i7) {
        Author author = (Author) obj;
        if (i7 == 0) {
            return Long.valueOf(author.f72224a);
        }
        if (i7 == 1) {
            return author.f72225b;
        }
        if (i7 == 2) {
            return author.f72226c;
        }
        if (i7 == 3) {
            return author.f72227d;
        }
        if (i7 == 4) {
            return Integer.valueOf(author.f72228e);
        }
        if (i7 != 5) {
            return null;
        }
        return author.f72229f;
    }
}
