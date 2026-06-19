package com.bilibili.search2.ogv;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/d.class */
@StabilityInferred(parameters = 0)
public class d extends y {
    public d(@NotNull Application application) {
        super(application);
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation) {
        Object objE;
        VerticalSearchResult verticalSearchResult = null;
        if (xVar instanceof x.d) {
            x.d dVar = (x.d) xVar;
            objE = com.bilibili.search2.result.b.f87326a.e(dVar.f87694e, dVar.f87695f ? null : ((SearchState) this.f87499f.getValue()).getNext(), dVar.f87693d, (ContinuationImpl) continuation);
            if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                verticalSearchResult = (VerticalSearchResult) objE;
                objE = verticalSearchResult;
            }
        } else {
            objE = verticalSearchResult;
        }
        return objE;
    }
}
