package com.bilibili.pegasus.holders;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import com.bilibili.pegasus.data.card.DislikeItemData;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/p.class */
@StabilityInferred(parameters = 0)
public final class C5691p extends C5672n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewGroup f78075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BiliImageView f78076o;

    public C5691p(@NotNull ForegroundConstraintLayout foregroundConstraintLayout) {
        super(foregroundConstraintLayout);
        this.f78075n = (ViewGroup) foregroundConstraintLayout.findViewById(2131300192);
        this.f78076o = foregroundConstraintLayout.findViewById(2131299613);
    }

    @Override // com.bilibili.pegasus.holders.C5647b, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull DislikeItemData dislikeItemData) {
        super.u0(dislikeItemData);
        this.f78076o.setAspectRatio(PegasusCoverStyle.INSTANCE.getCoverRatio());
        if (dislikeItemData.getDislikeCardHeight() > 0) {
            ViewGroup viewGroup = this.f78075n;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = dislikeItemData.getDislikeCardHeight();
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
