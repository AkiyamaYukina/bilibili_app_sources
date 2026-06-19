package com.bilibili.playerbizcommon.widget.control;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.room.RoomDatabase;
import com.bilibili.base.util.NumberFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/a.class */
public final class a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HighEnergySeekWidget f80570a;

    public a(HighEnergySeekWidget highEnergySeekWidget) {
        this.f80570a = highEnergySeekWidget;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 4) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        HighEnergySeekWidget highEnergySeekWidget = this.f80570a;
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        IPlayerContainer iPlayerContainer = highEnergySeekWidget.f80451M;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        long currentPosition = iPlayerContainer2.getPlayerCoreService().getCurrentPosition();
        long j7 = RoomDatabase.MAX_BIND_PARAMETER_CNT;
        String playTimeForRead = NumberFormat.formatPlayTimeForRead(currentPosition + j7);
        IPlayerContainer iPlayerContainer3 = highEnergySeekWidget.f80451M;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        accessibilityNodeInfo.setText("视频进度，已播放到" + playTimeForRead + "，共" + NumberFormat.formatPlayTimeForRead(((long) iPlayerContainer3.getPlayerCoreService().getDuration()) + j7));
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (!(view instanceof SeekBar) || (i7 != 4096 && i7 != 8192)) {
            return super.performAccessibilityAction(view, i7, bundle);
        }
        SeekBar seekBar = (SeekBar) view;
        if (seekBar.isIndeterminate() || !seekBar.isEnabled()) {
            return false;
        }
        int iMax = Math.max(1, MathKt.roundToInt(seekBar.getMax() / 20));
        int i8 = iMax;
        if (i7 == 8192) {
            i8 = -iMax;
        }
        seekBar.setProgress(seekBar.getProgress() + i8);
        IPlayerContainer iPlayerContainer = this.f80570a.f80451M;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().seekTo(seekBar.getProgress());
        return true;
    }
}
