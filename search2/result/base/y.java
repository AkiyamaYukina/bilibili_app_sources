package com.bilibili.search2.result.base;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/y.class */
@StabilityInferred(parameters = 0)
public abstract class y extends BaseSearchResultViewModel {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f87706i;

    public y(@NotNull Application application) {
        super(application);
        this.f87706i = getClass().getSimpleName();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow f1(@NotNull u.k kVar) {
        return FlowKt.catch(S0(FlowKt.flow(new VerticalSearchResultViewModel$toEffectFlow$suspendImpl$$inlined$transform$1(S0(FlowKt.flow(new VerticalSearchResultViewModel$makeVerticalSearchFlow$1(this, kVar.f87639a, null)), "vertical1"), new VerticalSearchResultViewModel$onResponseSuspend$1(this, null), null)), "vertical2"), new VerticalSearchResultViewModel$toEffectFlow$2(null));
    }

    @Nullable
    public Object g1(@NotNull FlowCollector<? super q> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = flowCollector.emit(new q.g.b(false), continuation);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objEmit = Unit.INSTANCE;
        }
        return objEmit;
    }

    @Nullable
    public abstract Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation);
}
