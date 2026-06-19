package com.bilibili.playerbizcommon.view;

import Zq0.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import com.bilibili.playerbizcommon.view.VideoEditView;
import dq0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/b.class */
public final class b extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<VideoEditView.b> f80428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Scroller f80429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80431g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<c> f80432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InterfaceC0523b f80433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f80434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f80435l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/b$a.class */
    public interface a {
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/b$b.class */
    public interface InterfaceC0523b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/b$c.class */
    public interface c {
        void onTranslationChanged();
    }

    @JvmOverloads
    public b(@NotNull Context context) {
        this(context, null, 0);
    }

    @JvmOverloads
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80429e = new Scroller(context);
        this.f80432i = new ArrayList();
        this.f80435l = getTranslationX();
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f116626f, i7, 0);
        this.f80425a = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, NewPlayerUtilsKt.toPx(66.0f));
        this.f80426b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, NewPlayerUtilsKt.toPx(56.0f));
        this.f80427c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, NewPlayerUtilsKt.toPx(0.5f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int getParentWidth() {
        return ((View) getParent()).getWidth();
    }

    private final void setCurrentRangeWidth(int i7) {
        this.f80430f = i7;
        this.f80431g = (getParentWidth() - this.f80430f) / 2;
        this.h = -((getWidth() - this.f80430f) - this.f80431g);
    }

    private final void setTargetTranslationX(float f7) {
        if (this.f80435l == f7) {
            return;
        }
        this.f80435l = f7;
        setTranslationX(f7);
        Iterator it = ((ArrayList) this.f80432i).iterator();
        while (it.hasNext()) {
            ((c) it.next()).onTranslationChanged();
        }
    }

    public final void a(int i7) {
        float translationX = getTranslationX() + i7;
        int i8 = this.f80431g;
        float f7 = translationX;
        if (translationX > i8) {
            f7 = i8;
        }
        int i9 = this.h;
        float f8 = f7;
        if (f7 < i9) {
            f8 = i9;
        }
        setTargetTranslationX(f8);
    }

    public final void b(int i7) {
        float f7 = i7;
        int i8 = this.f80431g;
        float f8 = f7;
        if (f7 > i8) {
            f8 = i8;
        }
        int i9 = this.h;
        float f9 = f8;
        if (f8 < i9) {
            f9 = i9;
        }
        setTargetTranslationX(f9);
    }

    public final void c(int i7) {
        setCurrentRangeWidth(i7);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (!this.f80429e.computeScrollOffset()) {
            a aVar = this.f80434k;
            if (aVar != null) {
                ((l) aVar).a(false);
                return;
            }
            return;
        }
        a aVar2 = this.f80434k;
        if (aVar2 != null) {
            ((l) aVar2).a(true);
        }
        setTargetTranslationX(this.f80429e.getCurrX());
        invalidate();
    }

    @Nullable
    public final List<VideoEditView.b> getItemList() {
        return this.f80428d;
    }

    public final int getItemUseWidth() {
        return this.f80425a + this.f80427c;
    }

    public final int getOffsetX() {
        return (int) getTranslationX();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        setCurrentRangeWidth(this.f80430f);
        IT0.e eVar = this.f80433j;
        if (eVar != null) {
            IT0.e eVar2 = eVar;
            int i11 = VideoEditView.f80375l;
            ((VideoEditView) eVar2.a).e();
        }
    }

    public final void setItemList(@Nullable List<VideoEditView.b> list) {
        this.f80428d = list;
        removeAllViews();
        if (this.f80428d == null || !(!r0.isEmpty())) {
            return;
        }
        getLayoutParams().width = getItemUseWidth() * this.f80428d.size();
        for (VideoEditView.b bVar : this.f80428d) {
            ImageView imageView = new ImageView(getContext());
            imageView.setBackgroundColor(ContextCompat.getColor(getContext(), 2131103712));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f80425a, this.f80426b);
            layoutParams.rightMargin = this.f80427c;
            imageView.setLayoutParams(layoutParams);
            Bitmap bitmap = bVar.f80387b;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            addView(imageView);
        }
        requestLayout();
    }

    public final void setOnFlingChangedListener(@NotNull a aVar) {
        this.f80434k = aVar;
    }

    public final void setOnSizeChangedListener(@NotNull InterfaceC0523b interfaceC0523b) {
        this.f80433j = interfaceC0523b;
    }
}
