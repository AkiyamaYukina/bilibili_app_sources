package com.bilibili.ogv.review.detailpage;

import E80.i0;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/p.class */
@StabilityInferred(parameters = 0)
public final class p extends BaseViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiReviewFragment f72384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f72386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f72387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f72388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final TextView f72389g;

    public p(@NotNull View view, @Nullable b bVar, @NotNull BangumiReviewFragment bangumiReviewFragment, boolean z6) {
        super(view, bVar);
        this.f72384b = bangumiReviewFragment;
        this.f72385c = z6;
        this.f72386d = LazyKt.lazy(new i0(view, 4));
        this.f72387e = LazyKt.lazy(new com.bilibili.ad.adview.videodetail.upper.common.g(view, 3));
        this.f72388f = LazyKt.lazy(new W2.e(view, 2));
        this.f72389g = (TextView) view.findViewById(2131315230);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        BangumiReviewFragment bangumiReviewFragment = this.f72384b;
        Neurons.reportClick(false, "pgc.pgc-video-detail.review-detail.edit.click", bangumiReviewFragment.f72235f);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(bangumiReviewFragment), (CoroutineContext) null, (CoroutineStart) null, new BangumiReviewFragment$onScoreHolderClick$1(bangumiReviewFragment, null), 3, (Object) null);
    }
}
