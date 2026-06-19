package com.bilibili.search2.result.bangumi;

import android.view.View;
import com.bilibili.studio.videoeditor.util.C6649w;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/e.class */
public final /* synthetic */ class ViewOnClickListenerC6065e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87396b;

    public /* synthetic */ ViewOnClickListenerC6065e(Object obj, int i7) {
        this.f87395a = i7;
        this.f87396b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f87395a) {
            case 0:
                ((C6066f) this.f87396b).u0(view);
                break;
            default:
                com.bilibili.studio.videoeditor.util.B.a((C6649w) this.f87396b);
                break;
        }
    }
}
