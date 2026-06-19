package com.bilibili.search2.result.ogv.aggregate.subpage;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.result.base.y;
import com.bilibili.search2.result.ogv.aggregate.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/c.class */
@StabilityInferred(parameters = 0)
public final class c extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f88424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public SearchOgvClusterRelationItem.Sort f88425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f88426l;

    public c(@NotNull Application application) {
        super(application);
        this.f88425k = SearchOgvClusterRelationItem.Sort.DEFAULT;
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object g1(@NotNull FlowCollector<? super q> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = flowCollector.emit(new q.g.b(true), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation) {
        VerticalSearchResult verticalSearchResult;
        if (xVar instanceof x.c) {
            Object objA = u.f88427a.a((x.c) xVar, (ContinuationImpl) continuation);
            if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objA;
            }
            verticalSearchResult = (VerticalSearchResult) objA;
        } else {
            verticalSearchResult = null;
        }
        return verticalSearchResult;
    }
}
