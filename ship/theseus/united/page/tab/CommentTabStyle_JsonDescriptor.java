package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabStyle_JsonDescriptor.class */
public final class CommentTabStyle_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f103124a = {new PojoPropertyDescriptor("badge_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_type", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public CommentTabStyle_JsonDescriptor() {
        super(CommentTabStyle.class, f103124a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Integer num = (Integer) objArr[2];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new CommentTabStyle(str, str2, iIntValue);
    }

    public final Object get(Object obj, int i7) {
        CommentTabStyle commentTabStyle = (CommentTabStyle) obj;
        if (i7 == 0) {
            return commentTabStyle.f103121a;
        }
        if (i7 == 1) {
            return commentTabStyle.f103122b;
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(commentTabStyle.f103123c);
    }
}
