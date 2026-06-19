package com.bilibili.pegasus.holders.bannerv8;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/t.class */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V8Banner f77826a;

    public t(V8Banner v8Banner) {
        this.f77826a = v8Banner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77826a.getViewPager2().requestTransform();
    }
}
