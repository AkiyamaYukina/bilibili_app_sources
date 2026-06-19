package com.bilibili.studio.videoeditor.generalrender.model;

import M3.C2589j;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.studio.videoeditor.generalrender.bean.GRJsbResult;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/d.class */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy<d> f109591f = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2589j(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ConcurrentLinkedQueue<s> f109592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ConcurrentLinkedQueue<s> f109593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ConcurrentLinkedQueue<s> f109594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Handler f109595d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f109596e = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/d$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f109597a;

        public a(d dVar) {
            this.f109597a = dVar;
        }

        public final void a() {
            this.f109597a.a();
        }
    }

    public static JSONObject b(long j7, ConcurrentLinkedQueue concurrentLinkedQueue) {
        if (concurrentLinkedQueue == null) {
            return null;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.x() == j7) {
                return k.m(new GRJsbResult(0, "", sVar.y()));
            }
        }
        return null;
    }

    public static void c(long j7, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Iterator it;
        if (concurrentLinkedQueue == null || (it = concurrentLinkedQueue.iterator()) == null) {
            return;
        }
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.x() == j7) {
                sVar.release();
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.d.a():void");
    }
}
