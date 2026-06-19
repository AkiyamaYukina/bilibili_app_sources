package com.bilibili.search2.result.user;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/h.class */
@StabilityInferred(parameters = 0)
public final class h extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f88554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f88555k;

    public h(@NotNull Application application) {
        super(application);
        this.f88554j = "";
        this.f88555k = "";
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    public final void K0(@NotNull VerticalSearchResult verticalSearchResult) {
        this.f88554j = verticalSearchResult.getExpStr();
    }

    @Override // com.bilibili.search2.result.base.y
    @Nullable
    public final Object h1(@NotNull x xVar, @NotNull Continuation<? super VerticalSearchResult<?>> continuation) {
        VerticalSearchResult verticalSearchResult = null;
        if (xVar instanceof x.e) {
            x.e eVar = (x.e) xVar;
            Object objC = com.bilibili.search2.result.b.f87326a.c(eVar.f87697c, eVar.f87698d, eVar.f87699e, eVar.f87700f, eVar.f87701g, eVar.h ? null : ((SearchState) this.f87499f.getValue()).getNext(), eVar.f87703j, eVar.f87704k, eVar.f87705l, (ContinuationImpl) continuation);
            if (objC == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objC;
            }
            verticalSearchResult = (VerticalSearchResult) objC;
        }
        return verticalSearchResult;
    }
}
