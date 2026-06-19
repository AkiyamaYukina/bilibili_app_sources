package com.bilibili.ogv.review.detailpage;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/l.class */
@StabilityInferred(parameters = 0)
public final class l extends BaseViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BangumiReviewFragment f72364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f72365c;

    public l(@NotNull View view, @Nullable b bVar, @Nullable BangumiReviewFragment bangumiReviewFragment) {
        super(view, bVar);
        this.f72364b = bangumiReviewFragment;
        Lazy lazy = LazyKt.lazy(new Fx.c(view, 4));
        this.f72365c = lazy;
        ((View) lazy.getValue()).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        BangumiReviewFragment bangumiReviewFragment = this.f72364b;
        if (bangumiReviewFragment != null) {
            bangumiReviewFragment.lf();
        }
    }
}
