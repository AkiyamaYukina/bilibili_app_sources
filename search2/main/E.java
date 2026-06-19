package com.bilibili.search2.main;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/E.class */
@StabilityInferred(parameters = 0)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SearchPageStateModel f86692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86693b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/E$a.class */
    public static final class a {
    }

    public final void a(boolean z6) {
        if (z6) {
            PageViewTracker.getInstance().onInterceptFragmentReport(false);
            return;
        }
        SearchPageStateModel searchPageStateModel = this.f86692a;
        SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
        if (searchPageStateModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel2 = null;
        }
        if (Intrinsics.areEqual(searchPageStateModel2.f86763k.getValue(), Boolean.TRUE)) {
            PageViewTracker.getInstance().onInterceptFragmentReport(false);
            SearchPageStateModel searchPageStateModel3 = this.f86692a;
            if (searchPageStateModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel3 = null;
            }
            searchPageStateModel3.f86763k.setValue(Boolean.FALSE);
        }
    }
}
