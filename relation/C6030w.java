package com.bilibili.relation;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.api.AttentionGroup;

/* JADX INFO: renamed from: com.bilibili.relation.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/w.class */
public final class C6030w extends BiliApiDataCallback<AttentionGroup> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f86194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6024p f86195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vn.g f86196d;

    public C6030w(Context context, C6024p c6024p, Vn.g gVar) {
        this.f86194b = context;
        this.f86195c = c6024p;
        this.f86196d = gVar;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(AttentionGroup attentionGroup) {
        AttentionGroup attentionGroup2 = attentionGroup;
        if (attentionGroup2 == null) {
            this.f86196d.invoke(this.f86194b.getString(2131858007));
        } else {
            Context context = this.f86194b;
            ToastHelper.showToastShort(context, context.getString(2131821397));
            this.f86195c.invoke(attentionGroup2);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String string = this.f86194b.getString(2131858007);
        String message = string;
        if (th instanceof BiliApiException) {
            message = ((BiliApiException) th).getMessage();
            if (message == null) {
                message = string;
            }
        }
        this.f86196d.invoke(message);
    }
}
