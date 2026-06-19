package com.bilibili.search2.result.vertical.live.widget;

import Al.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/widget/LiveResBiliImageView.class */
@StabilityInferred(parameters = 0)
public final class LiveResBiliImageView extends BiliImageView {
    @JvmOverloads
    public LiveResBiliImageView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public LiveResBiliImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public LiveResBiliImageView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        getGenericProperties().setPlaceholderImage(2131239141);
        getGenericProperties().setFailureImage(2131239141);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAttributes(@Nullable AttributeSet attributeSet, int i7, int i8) {
        String string;
        super.applyAttributes(attributeSet, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.b, i7, i8);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (string = typedArrayObtainStyledAttributes.getString(0)) != null) {
            String imageUrl = AppResUtil.getImageUrl(string);
            setImageURI((imageUrl == null || imageUrl.length() == 0) ? null : Uri.parse(imageUrl));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
