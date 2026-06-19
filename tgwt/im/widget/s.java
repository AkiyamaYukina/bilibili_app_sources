package com.bilibili.tgwt.im.widget;

import android.content.Context;
import com.bilibili.chatroom.widget.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/s.class */
public final class s implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f111469b;

    public s(m mVar, Context context) {
        this.f111468a = mVar;
        this.f111469b = context;
    }

    public final void keyBoardHide() {
        m mVar = this.f111468a;
        if (!mVar.f111449o) {
            mVar.dismiss();
            return;
        }
        int i7 = mVar.f111451q;
        int iB = i7;
        if (i7 == 0) {
            iB = Uj0.c.b(284, this.f111469b);
        }
        mVar.k(iB);
        mVar.f111449o = false;
    }

    public final void keyBoardShow(int i7) {
        m mVar = this.f111468a;
        mVar.f111451q = i7;
        mVar.f111448n = true;
        mVar.f111437b.f110930w.setValue(Integer.valueOf(i7));
        if (mVar.f111449o) {
            mVar.f111449o = false;
        }
    }
}
