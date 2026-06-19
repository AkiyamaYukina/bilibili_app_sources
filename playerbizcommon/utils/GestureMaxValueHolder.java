package com.bilibili.playerbizcommon.utils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/GestureMaxValueHolder.class */
public final class GestureMaxValueHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80266b = true;

    public final int getMaxValue() {
        return this.f80265a;
    }

    public final boolean getShouldUpdate() {
        return this.f80266b;
    }

    public final void refresh(int i7) {
        if (!this.f80266b || i7 <= 0) {
            return;
        }
        float fAtan = i7 / 1000.0f;
        if (fAtan < 0.0f) {
            fAtan = 0.0f;
        } else if (fAtan >= 60.0f) {
            if (fAtan < 1380.0f) {
                fAtan = 100 - ((float) Math.pow((fAtan - 1380) / 209.0f, 2));
            } else if (fAtan < 2700.0f) {
                fAtan = ((float) Math.pow((fAtan - 1380) / 295.0f, 2)) + 100;
            } else {
                fAtan = 120 + (177 * ((float) Math.atan((fAtan - 2700.0f) / 1000)));
            }
        }
        this.f80265a = ((int) fAtan) * 1000;
        this.f80266b = false;
    }

    public final void setShouldUpdate(boolean z6) {
        this.f80266b = z6;
    }
}
