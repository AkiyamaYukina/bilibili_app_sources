package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/a.class */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f110581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f110582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f110583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Uri uri, d dVar, Context context) {
        super(null);
        this.f110581a = uri;
        this.f110582b = dVar;
        this.f110583c = context;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, Uri uri) {
        if (Intrinsics.areEqual(this.f110581a, uri)) {
            try {
                d dVar = this.f110582b;
                Context context = this.f110583c;
                dVar.getClass();
                int iE = d.e(context);
                MutableStateFlow<com.bilibili.app.comm.restrict.f> mutableStateFlow = this.f110582b.f110589a;
                com.bilibili.app.comm.restrict.f fVar = (com.bilibili.app.comm.restrict.f) mutableStateFlow.getValue();
                int iA = com.bilibili.app.comm.restrict.c.a(iE);
                boolean z7 = fVar.a;
                fVar.getClass();
                mutableStateFlow.setValue(new com.bilibili.app.comm.restrict.f(z7, iA));
            } catch (Exception e7) {
                BLog.w("OSTeenagersModeProvider", e7);
            }
        }
    }
}
