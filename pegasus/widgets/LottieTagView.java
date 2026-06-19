package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.tag.base.BaseTagParams;
import com.bilibili.app.comm.list.widget.tag.base.TagParams;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/LottieTagView.class */
@StabilityInferred(parameters = 0)
public final class LottieTagView extends TintLinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TintLinearLayout f79181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final LottieAnimationView f79182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TagView f79183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TagParams f79184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f79185g;

    @NotNull
    public final Path h;

    @JvmOverloads
    public LottieTagView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public LottieTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LottieTagView(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f79184f = new TagParams();
        this.f79185g = new RectF();
        this.h = new Path();
        View viewInflate = View.inflate(context, 2131494693, this);
        if (viewInflate != null) {
            this.f79181c = (TintLinearLayout) viewInflate.findViewById(2131304636);
            this.f79182d = (LottieAnimationView) viewInflate.findViewById(2131299637);
            this.f79183e = viewInflate.findViewById(2131299658);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oi.a.a, 0, 0);
        try {
            setStyle(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setStyle(TypedArray typedArray) {
        ((BaseTagParams) this.f79184f).cornerRadii[0] = typedArray.getDimension(17, -1.0f);
        ((BaseTagParams) this.f79184f).cornerRadii[2] = typedArray.getDimension(18, -1.0f);
        ((BaseTagParams) this.f79184f).cornerRadii[4] = typedArray.getDimension(15, -1.0f);
        ((BaseTagParams) this.f79184f).cornerRadii[6] = typedArray.getDimension(16, -1.0f);
        float dimension = typedArray.getDimension(5, 0.0f);
        ((BaseTagParams) this.f79184f).maxLength = typedArray.getInt(9, 60);
        if (dimension >= 0.0f) {
            this.f79184f.setCornersRadii(dimension, dimension, dimension, dimension);
        } else {
            TagParams tagParams = this.f79184f;
            float[] fArr = ((BaseTagParams) tagParams).cornerRadii;
            tagParams.setCornersRadii(fArr[0], fArr[2], fArr[4], fArr[6]);
        }
        TagView tagView = this.f79183e;
        if (tagView != null) {
            tagView.setTagMaxLength(((BaseTagParams) this.f79184f).maxLength);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        this.h.reset();
        this.f79185g.set(0.0f, 0.0f, getWidth(), getHeight());
        this.h.addRoundRect(this.f79185g, ((BaseTagParams) this.f79184f).cornerRadii, Path.Direction.CW);
        canvas.clipPath(this.h);
        super.onDraw(canvas);
    }

    @Override // com.bilibili.magicasakura.widgets.TintLinearLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        super.tint();
        TintLinearLayout tintLinearLayout = this.f79181c;
        if (tintLinearLayout != null) {
            TagView tagView = this.f79183e;
            tintLinearLayout.setBackgroundColor(tagView != null ? tagView.getTagBackgroundColor() : 0);
        }
        invalidate();
    }
}
