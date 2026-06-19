package com.bilibili.tgwt.search;

import ES0.a0;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f111844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SearchView f111845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f111846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f111847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f111848e = LazyKt.lazy(new a0(this, 4));

    public final void a(boolean z6) {
        SearchView searchView = this.f111845b;
        if (searchView == null) {
            return;
        }
        InputMethodManagerHelper.hideSoftInput(this.f111845b.getContext(), ContextUtilKt.requireActivity(searchView.getContext()).getCurrentFocus(), 2);
        if (z6) {
            this.f111845b.clearFocus();
            this.f111845b.setFocusable(false);
        }
    }
}
