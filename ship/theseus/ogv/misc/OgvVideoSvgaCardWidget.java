package com.bilibili.ship.theseus.ogv.misc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import java.net.URL;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvVideoSvgaCardWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvVideoSvgaCardWidget extends FrameLayout {
    @JvmOverloads
    public OgvVideoSvgaCardWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public OgvVideoSvgaCardWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public OgvVideoSvgaCardWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    private final BiliImageView getImageView() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof BiliImageView) {
                return (BiliImageView) childAt;
            }
            removeAllViews();
        }
        BiliImageView biliImageView = new BiliImageView(getContext());
        biliImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(biliImageView);
        return biliImageView;
    }

    private final SVGAImageView getSvgaImageView() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof SVGAImageView) {
                return (SVGAImageView) childAt;
            }
            removeAllViews();
        }
        SVGAImageView sVGAImageView = new SVGAImageView(getContext());
        sVGAImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(sVGAImageView);
        return sVGAImageView;
    }

    public final void a(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            removeAllViews();
            return;
        }
        if (StringsKt.w(str, ".svga")) {
            new SVGAParser(getContext()).parse(new URL(str), new e(getSvgaImageView()));
        } else {
            BiliImageLoader.INSTANCE.with(getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(str).into(getImageView());
        }
    }
}
