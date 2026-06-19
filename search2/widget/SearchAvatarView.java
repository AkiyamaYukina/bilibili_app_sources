package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.avatar.PendantAvatarView;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.theme.R$color;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchAvatarView.class */
@StabilityInferred(parameters = 0)
public final class SearchAvatarView extends PendantAvatarView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f88916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f88917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88918l;

    @JvmOverloads
    public SearchAvatarView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public SearchAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public SearchAvatarView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88916j = 1.0f;
        this.f88917k = 1.2f;
        this.f88918l = ListExtentionsKt.toPx(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ViewDebug.ExportedProperty(category = "pendant-layout")
    @ColorInt
    public int getAvatarBorderColor() {
        return ContextCompat.getColor(getContext(), R$color.Line_light);
    }

    @ViewDebug.ExportedProperty(category = "pendant-layout")
    public float getAvatarBorderSize() {
        return 0.0f;
    }

    public int getAvatarImageSize() {
        ensureStyle();
        return (int) (getNormalAvatarSize() * this.f88916j);
    }

    public int getAvatarViewSize() {
        ensureStyle();
        return (int) (this.f88917k * getNormalAvatarSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ViewDebug.ExportedProperty(category = "pendant-layout")
    @ColorInt
    public int getBadgeBorderColor() {
        return ContextCompat.getColor(getContext(), R$color.f64616Wh0);
    }

    @ViewDebug.ExportedProperty(category = "pendant-layout")
    public float getBadgeBorderSize() {
        return this.f88918l;
    }

    public final int getBadgeStroke() {
        return this.f88918l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleImageRequestBuilder(@NotNull ImageRequestBuilder imageRequestBuilder) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.setBorderId(getContext(), R$color.Line_light, ListExtentionsKt.toPx(0.5d));
        roundingParams.setRoundAsCircle(true);
        imageRequestBuilder.roundingParams(roundingParams);
    }

    public final void setBadgeStroke(int i7) {
        this.f88918l = i7;
    }
}
