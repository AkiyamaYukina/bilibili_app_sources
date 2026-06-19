package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<RecyclerView, View, Integer> f75220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function2<RecyclerView, View, Integer> f75221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<RecyclerView.ViewHolder, Boolean> f75222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<RecyclerView.ViewHolder, Unit> f75223d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function2<? super RecyclerView, ? super View, Integer> function2, @NotNull Function2<? super RecyclerView, ? super View, Integer> function22, @NotNull Function1<? super RecyclerView.ViewHolder, Boolean> function1, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> function12) {
        this.f75220a = function2;
        this.f75221b = function22;
        this.f75222c = function1;
        this.f75223d = function12;
    }
}
