package com.bilibili.music.podcast.view;

import android.view.animation.Interpolator;
import n.C8047a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/e.class */
public final class e implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f67230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f67231b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/e$a.class */
    public static final class a {
        public static final float a(float f7) {
            float f8 = f7 * 8.0f;
            return f8 < 1.0f ? f8 - (1.0f - ((float) Math.exp(-f8))) : C8047a.a(1.0f, (float) Math.exp(((double) 1.0f) - ((double) f8)), 0.63212055f, 0.36787945f);
        }
    }

    public e() {
        float fA = 1.0f / a.a(1.0f);
        this.f67230a = fA;
        this.f67231b = 1.0f - (a.a(1.0f) * fA);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        float fA = a.a(f7) * this.f67230a;
        float f8 = fA;
        if (fA > 0.0f) {
            f8 = fA + this.f67231b;
        }
        return f8;
    }
}
