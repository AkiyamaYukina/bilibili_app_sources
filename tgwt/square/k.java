package com.bilibili.tgwt.square;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.Banner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/k.class */
@StabilityInferred(parameters = 0)
public final class k extends Banner.BannerItemImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CommonCard f112139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f112140d = 0.2934472934472934d;

    public k(@NotNull CommonCard commonCard) {
        this.f112139c = commonCard;
    }

    public final void a(View view) {
        CommonCard commonCard = this.f112139c;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(view, commonCard.f112026i);
        ScalableImageView2 scalableImageView2FindViewById = view.findViewById(2131301895);
        if (scalableImageView2FindViewById != null) {
            double d7 = this.f112140d;
            if (d7 > 0.0d) {
                scalableImageView2FindViewById.setHeightRatio(d7);
            }
            BiliImageLoader.INSTANCE.with(scalableImageView2FindViewById.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(commonCard.f112020b).into(scalableImageView2FindViewById);
        }
        TextView textView = (TextView) view.findViewById(2131308958);
        String str = commonCard.f112019a;
        View viewFindViewById = view.findViewById(2131313130);
        if (viewFindViewById != null) {
            if (str == null || str.length() == 0) {
                viewFindViewById.setVisibility(4);
            } else {
                viewFindViewById.setVisibility(0);
            }
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    @NotNull
    public final View createItemView(@NotNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131501071, viewGroup, false);
        a(viewInflate);
        return viewInflate;
    }

    public final void reuseItemView(@NotNull View view) {
        a(view);
    }
}
