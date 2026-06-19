package com.bilibili.tgwt.im.widget;

import android.widget.FrameLayout;
import com.bilibili.tgwt.im.widget.RealInputBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/p.class */
public final class p implements RealInputBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111466a;

    public p(m mVar) {
        this.f111466a = mVar;
    }

    @Override // com.bilibili.tgwt.im.widget.RealInputBar.b
    public final void a() {
        FrameLayout frameLayout = this.f111466a.h;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
            frameLayout2 = null;
        }
        frameLayout2.setVisibility(8);
    }
}
