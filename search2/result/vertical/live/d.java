package com.bilibili.search2.result.vertical.live;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/d.class */
@StabilityInferred(parameters = 0)
public final class d extends y {
    public d(@NotNull Application application) {
        super(application);
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation) {
        VerticalSearchResult verticalSearchResult = null;
        if (xVar instanceof x.b) {
            x.b bVar = (x.b) xVar;
            Object objD = com.bilibili.search2.result.b.f87326a.d(4, bVar.f87684e ? null : ((SearchState) this.f87499f.getValue()).getNext(), bVar.f87682c, (ContinuationImpl) continuation);
            if (objD == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objD;
            }
            verticalSearchResult = (VerticalSearchResult) objD;
        }
        return verticalSearchResult;
    }
}
