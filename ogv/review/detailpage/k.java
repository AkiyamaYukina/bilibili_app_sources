package com.bilibili.ogv.review.detailpage;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/k.class */
@StabilityInferred(parameters = 0)
public final class k extends BaseViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f72363b;

    public k(@NotNull View view, @Nullable b bVar) {
        super(view, bVar);
        this.f72363b = LazyKt.lazy(new OS0.b(view, 2));
    }
}
