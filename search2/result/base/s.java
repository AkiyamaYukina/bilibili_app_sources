package com.bilibili.search2.result.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/s.class */
@StabilityInferred(parameters = 0)
public final class s extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f87608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public CharSequence f87609c;

    public s() {
        this(null);
    }

    public s(@Nullable String str) {
        setGoTo("search_footer");
        ((K90.c) this).viewType = 1091444754;
        setTrackId(str);
    }
}
