package com.bilibili.tgwt.im.widget;

import com.bilibili.tgwt.im.widget.RealInputBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/v.class */
public final class v implements RealInputBar.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111471a;

    public v(m mVar) {
        this.f111471a = mVar;
    }

    @Override // com.bilibili.tgwt.im.widget.RealInputBar.f
    public final void b() {
        m mVar = this.f111471a;
        mVar.dismiss();
        mVar.f111434B = true;
    }
}
