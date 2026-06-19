package com.bilibili.upper.module.cover_v2.service;

import KH0.i;
import UC0.k;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import java.util.Iterator;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f112850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public MultiCoverDraft f112851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f112852c;

    public b(@NotNull i iVar, @NotNull MultiCoverDraft multiCoverDraft) {
        this.f112850a = iVar;
        this.f112851b = multiCoverDraft;
    }

    public final void a(boolean z6) {
        UpperTimeline upperTimeline;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        i iVar = this.f112850a;
        double coverScaleX = iVar.f12754m.f112851b.getCoverScaleX();
        LH0.a aVar = iVar.f12746d;
        double d12 = aVar.f14538c;
        float videoRatio = iVar.f12745c.getVideoRatio();
        int[] selectedMaterialSize = iVar.f12745c.getSelectedMaterialSize();
        if (coverScaleX < d12) {
            iVar.f12754m.b(d12);
            iVar.f12754m.c(d12);
        }
        int[] originImageWH = (iVar.h() && (upperTimeline = iVar.f12749g) != null) ? upperTimeline.getOriginImageWH() : null;
        if (originImageWH == null || originImageWH.length != 2) {
            return;
        }
        double d13 = originImageWH[0];
        double d14 = originImageWH[1];
        double d15 = selectedMaterialSize[0];
        double d16 = selectedMaterialSize[1];
        double dWidth = aVar.f14536a.width();
        double dHeight = aVar.f14536a.height();
        RectF rectF = aVar.f14537b;
        double d17 = ((double) (((int) (rectF.left - aVar.f14536a.left)) * 1.0f)) / dWidth;
        double d18 = ((double) rectF.top) / dHeight;
        double coverScaleX2 = iVar.f12754m.f112851b.getCoverScaleX();
        double coverScaleY = iVar.f12754m.f112851b.getCoverScaleY();
        final double coverTransX = iVar.f12754m.f112851b.getCoverTransX();
        final double coverTransY = iVar.f12754m.f112851b.getCoverTransY();
        if (d15 / d16 >= videoRatio) {
            d8 = (d16 * d13) / d15;
            d7 = d13;
        } else {
            d7 = (d14 * d15) / d16;
            d8 = d14;
        }
        double d19 = d7 * coverScaleX2;
        double d20 = 2;
        double d21 = (d19 - d13) / d20;
        double d22 = (-d21) + coverTransX;
        double d23 = d19 + d22;
        iVar.f12745c.getVideoTouchRect().left = (float) d22;
        iVar.f12745c.getVideoTouchRect().right = (float) d23;
        double d24 = d17 * d13;
        if (d22 > d24) {
            d9 = d21 + d24;
            iVar.f12745c.getVideoTouchRect().left = (float) d24;
        } else {
            d9 = coverTransX;
        }
        double d25 = d13 - d24;
        if (d23 < d25) {
            iVar.f12745c.getVideoTouchRect().right = (float) d25;
            d10 = ((coverTransX + d13) - d23) - d24;
        } else {
            d10 = d9;
        }
        double d26 = d8 * coverScaleY;
        double d27 = ((d26 + d14) / d20) + coverTransY;
        double d28 = d27 - d26;
        iVar.f12745c.getVideoTouchRect().top = (float) (d14 - d27);
        iVar.f12745c.getVideoTouchRect().bottom = (float) (d14 - d28);
        double d29 = d18 * d14;
        double d30 = d14 - d29;
        if (d30 - d27 > 1.0d) {
            d11 = (((-d27) + d14) + coverTransY) - d29;
            iVar.f12745c.getVideoTouchRect().top = (float) (d14 - d30);
        } else {
            d11 = coverTransY;
        }
        if (d28 - d29 > 1.0d) {
            iVar.f12745c.getVideoTouchRect().bottom = (float) d30;
            d11 = (-d28) + coverTransY + d29;
        }
        if (coverTransX != d10 || coverTransY != d11) {
            if (z6) {
                ValueAnimator valueAnimator = this.f112852c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator2 = this.f112852c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.f112852c = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final double d31 = d10;
                final double d32 = d11;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(coverTransX, d31, coverTransY, d32, this) { // from class: com.bilibili.upper.module.cover_v2.service.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final double f112845a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final double f112846b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final double f112847c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final double f112848d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final b f112849e;

                    {
                        this.f112845a = coverTransX;
                        this.f112846b = d31;
                        this.f112847c = coverTransY;
                        this.f112848d = d32;
                        this.f112849e = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        double d33 = this.f112845a;
                        double d34 = this.f112846b;
                        double d35 = this.f112847c;
                        double d36 = this.f112848d;
                        b bVar = this.f112849e;
                        double dFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        double dA = F0.a.a(d36, d35, dFloatValue, d35);
                        bVar.d(((d34 - d33) * dFloatValue) + d33);
                        bVar.e(dA);
                        bVar.f112850a.l();
                    }
                });
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.start();
                this.f112852c = valueAnimatorOfFloat;
            } else {
                d(d10);
                e(d11);
            }
        }
        iVar.l();
    }

    public final void b(double d7) {
        this.f112851b.setCoverScaleX(d7);
        i iVar = this.f112850a;
        k kVar = iVar.h;
        if (kVar != null) {
            kVar.F("Scale X", d7);
        }
        Iterator<T> it = iVar.f12753l.f12742d.iterator();
        while (it.hasNext()) {
            ((KH0.a) it.next()).getClass();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void c(double d7) {
        this.f112851b.setCoverScaleY(d7);
        i iVar = this.f112850a;
        k kVar = iVar.h;
        if (kVar != null) {
            kVar.F("Scale Y", d7);
        }
        Iterator<T> it = iVar.f12753l.f12742d.iterator();
        while (it.hasNext()) {
            ((KH0.a) it.next()).getClass();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void d(double d7) {
        this.f112851b.setCoverTransX(d7);
        i iVar = this.f112850a;
        k kVar = iVar.h;
        if (kVar != null) {
            kVar.F("Trans X", d7);
        }
        for (KH0.a aVar : iVar.f12753l.f12742d) {
            this.f112851b.getCoverTransX();
            this.f112851b.getCoverTransY();
            aVar.getClass();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(double d7) {
        this.f112851b.setCoverTransY(d7);
        i iVar = this.f112850a;
        k kVar = iVar.h;
        if (kVar != null) {
            kVar.F("Trans Y", d7);
        }
        for (KH0.a aVar : iVar.f12753l.f12742d) {
            this.f112851b.getCoverTransX();
            this.f112851b.getCoverTransY();
            aVar.getClass();
            Unit unit = Unit.INSTANCE;
        }
    }
}
