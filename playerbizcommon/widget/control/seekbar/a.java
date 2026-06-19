package com.bilibili.playerbizcommon.widget.control.seekbar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80626b = true;

    public final void a(int i7) {
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
        this.f80625a = ((int) fAtan) * 1000;
        this.f80626b = false;
    }
}
