package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/q.class */
@StabilityInferred(parameters = 1)
@Module
public final class C5453q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5453q f68149a = new Object();

    public static final boolean a(PagerState pagerState, List list) {
        T t7 = ((C5449m) list.get(pagerState.getCurrentPage() % list.size())).f68127d;
        return t7 == null || !t7.f68048b.getValue().booleanValue();
    }
}
