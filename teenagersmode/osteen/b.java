package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/b.class */
public final class b extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f110584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f110585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f110586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Uri uri, d dVar, Context context) {
        super(null);
        this.f110584a = uri;
        this.f110585b = dVar;
        this.f110586c = context;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, Uri uri) {
        if (Intrinsics.areEqual(this.f110584a, uri)) {
            try {
                d dVar = this.f110585b;
                Context context = this.f110586c;
                dVar.getClass();
                boolean zF = d.f(context);
                MutableStateFlow<com.bilibili.app.comm.restrict.f> mutableStateFlow = this.f110585b.f110589a;
                com.bilibili.app.comm.restrict.f fVar = (com.bilibili.app.comm.restrict.f) mutableStateFlow.getValue();
                int i7 = fVar.b;
                fVar.getClass();
                mutableStateFlow.setValue(new com.bilibili.app.comm.restrict.f(zF, i7));
            } catch (Exception e7) {
                BLog.w("OSTeenagersModeProvider", e7);
            }
        }
    }
}
