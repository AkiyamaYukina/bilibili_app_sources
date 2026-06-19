package com.bilibili.pegasus.common.inlineplay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import fp0.m;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayer.preload.strategy.AbstractStrategy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/g.class */
@StabilityInferred(parameters = 0)
public final class g extends AbstractStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f75646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f75647c = "PegasusInlinePreload";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UB.e f75648d = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [UB.e, java.lang.Object] */
    public g(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.f75646b = lifecycleCoroutineScope;
    }

    public final void a(@NotNull List<m> list) {
        if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) || !((Boolean) tv.danmaku.biliplayer.preload.strategy.a.b.getValue()).booleanValue()) {
            return;
        }
        BuildersKt.launch$default(this.f75646b, (CoroutineContext) null, (CoroutineStart) null, new PegasusInlinePreload$updateDoublePreload$1(list, this, null), 3, (Object) null);
    }

    @NotNull
    public final String getTag() {
        return this.f75647c;
    }
}
