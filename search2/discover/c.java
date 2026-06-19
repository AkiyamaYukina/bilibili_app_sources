package com.bilibili.search2.discover;

import android.content.Context;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/c.class */
public final class c extends BiliApiDataCallback<List<? extends SearchSquareType>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f86429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f86430c;

    public c(Context context, k kVar) {
        this.f86429b = kVar;
        this.f86430c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(List<? extends SearchSquareType> list) {
        List<? extends SearchSquareType> list2 = list;
        k kVar = this.f86429b;
        kVar.c();
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                kVar.f(list2);
            }
        }
        String str = d.f86431a;
        d.a(this.f86430c, kVar);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        k kVar = this.f86429b;
        kVar.c();
        String str = d.f86431a;
        d.a(this.f86430c, kVar);
    }
}
