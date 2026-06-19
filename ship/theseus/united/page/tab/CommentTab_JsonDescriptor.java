package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTab_JsonDescriptor.class */
public final class CommentTab_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f103125a = {new PojoPropertyDescriptor("reply_style", (String[]) null, CommentTabStyle.class, (Class) null, 4), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("control", (String[]) null, TabControl.class, (Class) null, 4)};

    public CommentTab_JsonDescriptor() {
        super(CommentTab.class, f103125a);
    }

    public final Object constructWith(Object[] objArr) {
        return new CommentTab((CommentTabStyle) objArr[0], (String) objArr[1], (TabControl) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        CommentTab commentTab = (CommentTab) obj;
        if (i7 == 0) {
            return commentTab.a();
        }
        if (i7 == 1) {
            return commentTab.c();
        }
        if (i7 != 2) {
            return null;
        }
        return commentTab.b();
    }
}
