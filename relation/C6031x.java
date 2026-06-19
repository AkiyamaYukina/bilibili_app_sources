package com.bilibili.relation;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.relation.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/x.class */
public final class C6031x extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f86238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6015g f86239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f86240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6016h f86241e;

    public C6031x(Context context, C6015g c6015g, Map map, C6016h c6016h) {
        this.f86238b = context;
        this.f86239c = c6015g;
        this.f86240d = map;
        this.f86241e = c6016h;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Void r52) {
        Context context = this.f86238b;
        ToastHelper.showToastShort(context, context.getString(2131858020));
        this.f86239c.invoke(CollectionsKt.toList(this.f86240d.keySet()));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String string = this.f86238b.getString(2131858018);
        String message = string;
        if (th instanceof BiliApiException) {
            message = ((BiliApiException) th).getMessage();
            if (message == null) {
                message = string;
            }
        }
        this.f86241e.invoke(message);
    }
}
