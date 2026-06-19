package com.bilibili.pegasus.page;

import android.text.TextUtils;
import com.bilibili.playset.playlist.search.MusicSearchResultFragment;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/f.class */
public final /* synthetic */ class RunnableC5717f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78394b;

    public /* synthetic */ RunnableC5717f(Object obj, int i7) {
        this.f78393a = i7;
        this.f78394b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78393a) {
            case 0:
                C5721j c5721j = (C5721j) this.f78394b;
                c5721j.f78406g = null;
                if (!c5721j.f78407i && !c5721j.f78408j) {
                    c5721j.c();
                    break;
                }
                break;
            default:
                qs0.p pVar = ((MusicSearchResultFragment) this.f78394b).f85353f;
                pVar.f126323d = 1;
                if (!TextUtils.isEmpty(pVar.f126326g)) {
                    pVar.K0();
                } else {
                    pVar.J0();
                }
                break;
        }
    }
}
