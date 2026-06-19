package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/ScreenCompatPopupWindow.class */
public class ScreenCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PopOrientation f80368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenModeType f80369b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/ScreenCompatPopupWindow$PopOrientation.class */
    public enum PopOrientation {
        SIDE,
        BOTTOM
    }

    public ScreenCompatPopupWindow() {
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(int i7, int i8) {
        super(i7, i8);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(Context context) {
        super(context);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(View view) {
        super(view);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(View view, int i7, int i8) {
        super(view, i7, i8);
        this.f80368a = PopOrientation.SIDE;
    }

    public ScreenCompatPopupWindow(View view, int i7, int i8, boolean z6) {
        super(view, i7, i8, z6);
        this.f80368a = PopOrientation.SIDE;
    }

    public void checkScreenMode(ScreenModeType screenModeType) {
        ScreenModeType screenModeType2 = this.f80369b;
        boolean z6 = (screenModeType2 == null || screenModeType2.equals(screenModeType)) ? false : true;
        View contentView = getContentView();
        if (ScreenModeType.VERTICAL_FULLSCREEN.equals(screenModeType) || this.f80368a == PopOrientation.BOTTOM) {
            int measuredHeight = contentView.getMeasuredHeight();
            if (measuredHeight <= 0 || z6) {
                try {
                    contentView.measure(0, 0);
                    measuredHeight = contentView.getMeasuredHeight();
                } catch (Exception e7) {
                    BLog.e("ScreenCompatPopupWindow", "error when measure popup window", e7);
                    measuredHeight = (int) DpUtils.dp2px(contentView.getContext(), 380.0f);
                }
            }
            setHeight(measuredHeight);
            setWidth(-1);
        } else {
            int measuredWidth = contentView.getMeasuredWidth();
            if (contentView.isLayoutRequested() || measuredWidth <= 0 || z6) {
                try {
                    contentView.measure(0, 0);
                    measuredWidth = contentView.getMeasuredWidth();
                } catch (Exception e8) {
                    BLog.e("ScreenCompatPopupWindow", "error when measure popup window", e8);
                    measuredWidth = -2;
                }
            }
            setWidth(measuredWidth);
            setHeight(-1);
        }
        setScreenMode(screenModeType);
    }

    public void setPopOrientation(@NonNull PopOrientation popOrientation) {
        this.f80368a = popOrientation;
    }

    public void setScreenMode(ScreenModeType screenModeType) {
        this.f80369b = screenModeType;
    }
}
