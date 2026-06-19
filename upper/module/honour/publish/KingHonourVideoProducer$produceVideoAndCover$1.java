package com.bilibili.upper.module.honour.publish;

import P50.n;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/KingHonourVideoProducer$produceVideoAndCover$1.class */
public final class KingHonourVideoProducer$produceVideoAndCover$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f113172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f113173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f113174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f113175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f113176e;

    public KingHonourVideoProducer$produceVideoAndCover$1(a aVar, c cVar, n nVar, b bVar, d dVar) {
        this.f113172a = aVar;
        this.f113173b = cVar;
        this.f113174c = nVar;
        this.f113175d = bVar;
        this.f113176e = dVar;
    }

    public final void a(String str) {
        a aVar = this.f113172a;
        aVar.getClass();
        BLog.d("KingHonourVideoProducer", "onProduceFinished=" + str);
        if (str == null) {
            this.f113173b.invoke(null, Boolean.FALSE);
            return;
        }
        BuildersKt.launch$default(aVar.f113180d, Dispatchers.getIO(), (CoroutineStart) null, new KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1(this.f113172a, str, this.f113174c, this.f113175d, null), 2, (Object) null);
    }
}
