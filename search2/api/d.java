package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/d.class */
@StabilityInferred(parameters = 0)
public final class d extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f86311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f86312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f86313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f86314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86315f;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f86317i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f86319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86320l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f86316g = 1.778f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f86318j = "";

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final boolean getEnableFeedbackRemoveItem() {
        return this.f86320l;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setEnableFeedbackRemoveItem(boolean z6) {
        this.f86320l = z6;
    }
}
