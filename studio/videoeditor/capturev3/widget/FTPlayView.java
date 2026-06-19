package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.studio.videoeditor.media.base.opengl.GLTextureView;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/FTPlayView.class */
public class FTPlayView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureView f109377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GLTextureView f109378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f109379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109380d;

    public FTPlayView(Context context) {
        this(context, null);
    }

    public FTPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131494024, (ViewGroup) null);
        this.f109377a = (TextureView) viewInflate.findViewById(2131298331);
        this.f109378b = (GLTextureView) viewInflate.findViewById(2131298330);
        addView(viewInflate);
        this.f109380d = 4;
    }

    public GLTextureView getGLTextureView() {
        return this.f109378b;
    }

    public int getResizeMode() {
        return this.f109380d;
    }

    public TextureView getTextureView() {
        return this.f109377a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        float f7;
        float f8;
        float f9;
        super.onMeasure(i7, i8);
        if (this.f109379c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = (this.f109379c / (f10 / f11)) - 1.0f;
        if (Math.abs(f12) <= 0.01f) {
            return;
        }
        int i9 = this.f109380d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    f7 = this.f109379c;
                } else if (i9 == 3) {
                    f8 = this.f109379c;
                    if (f8 >= 1.0f) {
                        f9 = f11 * f8;
                        measuredWidth = (int) f9;
                    }
                } else if (i9 == 4) {
                    if (f12 > 0.0f) {
                        f7 = this.f109379c;
                    } else {
                        f8 = this.f109379c;
                    }
                }
                f9 = f11 * f7;
                measuredWidth = (int) f9;
            } else {
                f8 = this.f109379c;
            }
            measuredHeight = (int) (f10 / f8);
        } else if (f12 > 0.0f) {
            f8 = this.f109379c;
            measuredHeight = (int) (f10 / f8);
        } else {
            f7 = this.f109379c;
            f9 = f11 * f7;
            measuredWidth = (int) f9;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(measuredHeight, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }

    public void setAspectRatio(float f7) {
        if (this.f109379c != f7) {
            this.f109379c = f7;
            requestLayout();
        }
    }

    public void setResizeMode(int i7) {
        if (this.f109380d != i7) {
            this.f109380d = i7;
            BLog.e("FTPlayView", "resize mode = ".concat(i7 == 1 ? "RESIZE_MODE_FIXED_WIDTH" : i7 == 2 ? "RESIZE_MODE_FIXED_HEIGHT" : i7 == 4 ? "RESIZE_MODE_ZOOM" : i7 == 0 ? "RESIZE_MODE_FIT" : i7 == 3 ? "RESIZE_MODE_FILL" : ""));
            requestLayout();
        }
    }
}
