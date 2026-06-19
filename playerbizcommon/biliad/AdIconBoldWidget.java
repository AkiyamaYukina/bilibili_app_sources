package com.bilibili.playerbizcommon.biliad;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import hq0.ViewOnClickListenerC7489a;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/AdIconBoldWidget.class */
public final class AdIconBoldWidget extends ViewOnClickListenerC7489a {
    @JvmOverloads
    public AdIconBoldWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public AdIconBoldWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public AdIconBoldWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hq0.ViewOnClickListenerC7489a
    public final void p(int i7, @Nullable String str) {
        switch (i7) {
            case 100:
                setCustomVisibility(8);
                break;
            case 101:
                setCustomVisibility(0);
                setImageResource(2131234326);
                break;
            case 102:
                setCustomVisibility(0);
                ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(getContext()).url(str);
                ScaleType scaleType = ScaleType.CENTER_CROP;
                imageRequestBuilderUrl.actualImageScaleType(scaleType).placeholderImageResId(2131234326, scaleType).into(this);
                break;
        }
    }
}
