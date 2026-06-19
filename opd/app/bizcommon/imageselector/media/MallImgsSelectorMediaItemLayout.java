package com.bilibili.opd.app.bizcommon.imageselector.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.opd.app.bizcommon.imageselector.widget.MallMediaImageView;
import com.bilibili.opd.app.bizcommon.imageselector.widget.SquareRelativeLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallImgsSelectorMediaItemLayout.class */
@StabilityInferred(parameters = 0)
public final class MallImgsSelectorMediaItemLayout extends SquareRelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final MallMediaImageView f73734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final View f73735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f73736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public View f73737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final View f73738g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextView f73739i;

    @JvmOverloads
    public MallImgsSelectorMediaItemLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public MallImgsSelectorMediaItemLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public MallImgsSelectorMediaItemLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(2131499017, (ViewGroup) this, true);
        this.f73734c = (MallMediaImageView) findViewById(2131306818);
        this.f73735d = findViewById(2131307314);
        this.f73737f = findViewById(2131307316);
        this.f73736e = (TextView) findViewById(2131316167);
        this.f73738g = findViewById(2131315657);
        this.h = findViewById(2131298734);
        this.f73739i = (TextView) findViewById(2131315191);
    }

    @Nullable
    public final View getMCheckCover() {
        return this.h;
    }

    @Nullable
    public final View getMCheckLayout() {
        return this.f73737f;
    }

    @Nullable
    public final TextView getMmFlagLayout() {
        return this.f73736e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setOnClickListener(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (z6) {
            View view = this.f73738g;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f73738g;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void setMCheckCover(@Nullable View view) {
        this.h = view;
    }

    public final void setMCheckLayout(@Nullable View view) {
        this.f73737f = view;
    }

    public final void setMedia(@NotNull BaseMedia baseMedia) {
        String path;
        if (baseMedia instanceof ImageMedia) {
            MallMediaImageView mallMediaImageView = this.f73734c;
            if (mallMediaImageView != null && (path = ((ImageMedia) baseMedia).getPath()) != null) {
                MallMediaHelper.a(path, mallMediaImageView);
            }
            TextView textView = this.f73736e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.f73737f;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (baseMedia instanceof MallVideoMedia) {
            MallVideoMedia mallVideoMedia = (MallVideoMedia) baseMedia;
            String path2 = mallVideoMedia.getPath();
            MallMediaImageView mallMediaImageView2 = this.f73734c;
            if (mallMediaImageView2 != null && path2 != null) {
                MallMediaHelper.a(path2, mallMediaImageView2);
            }
            View view2 = this.f73737f;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            TextView textView2 = this.f73736e;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f73736e;
            if (textView3 != null) {
                textView3.setText(mallVideoMedia.getDuration());
            }
        }
    }

    public final void setMmFlagLayout(@Nullable TextView textView) {
        this.f73736e = textView;
    }
}
