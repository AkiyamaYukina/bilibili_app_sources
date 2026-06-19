package com.bilibili.tgwt.im.widget;

import com.bilibili.chatroom.widget.ChatInputEditText;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/C.class */
public final class C implements ChatInputEditText.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f111348a;

    public C(D d7) {
        this.f111348a = d7;
    }

    public final void a(int i7, int i8) {
        D d7 = this.f111348a;
        int iA = D.a(d7, i7);
        int iA2 = D.a(d7, i8);
        int length = d7.f111356g.length();
        if (iA < 0 || i7 > length || iA2 < 0 || iA2 > length) {
            return;
        }
        d7.f111356g.setSelection(iA, iA2);
    }
}
