package com.bilibili.search2.result.column;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.result.base.y;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/j.class */
@StabilityInferred(parameters = 0)
public final class j extends y {
    public j(@NotNull Application application) {
        super(application);
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation) {
        VerticalSearchResult verticalSearchResult = null;
        if (xVar instanceof x.a) {
            x.a aVar = (x.a) xVar;
            Object objA = com.bilibili.search2.result.column.api.b.f87726a.a(aVar.f87678i ? null : ((SearchState) this.f87499f.getValue()).getNext(), aVar.f87674d, aVar.f87675e, aVar.f87676f, aVar.f87677g, aVar.h, aVar.f87680k, aVar.f87681l, (ContinuationImpl) continuation);
            if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objA;
            }
            verticalSearchResult = (VerticalSearchResult) objA;
        }
        return verticalSearchResult;
    }
}
