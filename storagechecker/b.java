package com.bilibili.storagechecker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/b.class */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f105069b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f105068a = i7;
        this.f105069b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        switch (this.f105068a) {
            case 0:
                Context context = (Context) this.f105069b;
                String str = StorageChecker.COMMON_SP;
                Thread.currentThread().setName("sdcard-scan");
                Process.setThreadPriority(10);
                StorageChecker.scanSDCards(context);
                break;
            default:
                com.mall.videodetail.vd.united.page.popupwindow.f fVar = (com.mall.videodetail.vd.united.page.popupwindow.f) this.f105069b;
                WeakReference weakReference = fVar.d;
                if (weakReference != null && (view = (View) weakReference.get()) != null && (view2 = fVar.c) != null) {
                    if (fVar.b == null) {
                        fVar.b = new Rect();
                    }
                    Rect rect = fVar.b;
                    if (rect != null) {
                        if (view.getGlobalVisibleRect(rect) && view.isAttachedToWindow()) {
                            view2.setVisibility(0);
                        } else {
                            view2.setVisibility(4);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
