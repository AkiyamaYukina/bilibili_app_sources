package com.bilibili.playerbizcommon.utils;

import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.playerbizcommon.utils.c;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/b.class */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f80278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.a f80279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f80280e;

    public /* synthetic */ b(String str, boolean z6, c.a aVar, c.a aVar2, CountDownLatch countDownLatch) {
        this.f80276a = str;
        this.f80277b = z6;
        this.f80278c = aVar;
        this.f80279d = aVar2;
        this.f80280e = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Exception] */
    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f80276a;
        boolean z6 = this.f80277b;
        c.a aVar = this.f80278c;
        c.a aVar2 = this.f80279d;
        CountDownLatch countDownLatch = this.f80280e;
        try {
            try {
                aVar.f80281a = BiliImageLoaderHelper.getDiskCacheFile(str, z6);
            } catch (Exception e7) {
                aVar2.f80281a = e7;
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
