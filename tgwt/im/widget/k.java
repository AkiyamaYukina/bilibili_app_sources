package com.bilibili.tgwt.im.widget;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/k.class */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f111430b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f111429a = i7;
        this.f111430b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f111429a) {
            case 0:
                View view = ((m) this.f111430b).f111441f;
                View view2 = view;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                    view2 = null;
                }
                view2.getHeight();
                break;
            default:
                es0.d dVar = (es0.d) this.f111430b;
                dVar.h.setMaxLines(3 - dVar.f117392i.getLineCount());
                break;
        }
    }
}
