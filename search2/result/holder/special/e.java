package com.bilibili.search2.result.holder.special;

import Ps0.C2794o;
import android.content.Context;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchSpecialItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/e.class */
public final class e extends BiliApiDataCallback<C2794o> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f88218b;

    public e(g gVar) {
        this.f88218b = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.special.g] */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(C2794o c2794o) {
        C2794o c2794o2 = c2794o;
        ?? r02 = this.f88218b;
        Context context = r02.itemView.getContext();
        if (context == null) {
            return;
        }
        ((SearchSpecialItem) r02.getData()).setReserveInfo(c2794o2);
        r02.q0();
        if (c2794o2 == null || !c2794o2.a()) {
            ToastHelper.showToastShort(context, context.getString(2131847908));
        } else {
            ToastHelper.showToastShort(context, context.getString(2131847842));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Context context = this.f88218b.itemView.getContext();
        if (context == null) {
            return;
        }
        ToastHelper.showToastShort(context, context.getString(2131847724));
    }
}
