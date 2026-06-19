package com.bilibili.lib.sharewrapper;

import android.os.Bundle;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/ShareResult.class */
public final class ShareResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64414a;
    public Bundle mResult;

    public ShareResult(Bundle bundle) {
        this.mResult = bundle;
    }

    public int getTag() {
        return this.f64414a;
    }

    public void setTag(int i7) {
        this.f64414a = i7;
    }
}
