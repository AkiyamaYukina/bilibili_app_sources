package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.authorspace.ui.D0;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/G.class */
@StabilityInferred(parameters = 0)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<C5607h> f75974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final D0 f75975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 f75976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ComposeView f75977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public F f75978e;

    public G(@NotNull StateFlow stateFlow, @NotNull D0 d02, @NotNull com.bilibili.ad.adview.pegasus.holders.inline.card134.g0 g0Var) {
        this.f75974a = stateFlow;
        this.f75975b = d02;
        this.f75976c = g0Var;
    }
}
