package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.room.RoomDatabase;
import com.bilibili.base.util.NumberFormat;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/o.class */
public final class o extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerSeekWidget3 f83058a;

    public o(PlayerSeekWidget3 playerSeekWidget3) {
        this.f83058a = playerSeekWidget3;
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
        PlayerSeekWidget3 playerSeekWidget3 = this.f83058a;
        if (playerSeekWidget3.f82915D != null) {
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            long currentPosition = playerSeekWidget3.getPlayerCoreService().getCurrentPosition();
            long j7 = RoomDatabase.MAX_BIND_PARAMETER_CNT;
            accessibilityNodeInfo.setText("视频进度，已播放到" + NumberFormat.formatPlayTimeForRead(currentPosition + j7) + "，共" + NumberFormat.formatPlayTimeForRead(((long) playerSeekWidget3.getPlayerCoreService().getDuration()) + j7));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (!(view instanceof PlayerSeekWidget3) || (i7 != 4096 && i7 != 8192)) {
            return super.performAccessibilityAction(view, i7, bundle);
        }
        PlayerSeekWidget3 playerSeekWidget3 = (PlayerSeekWidget3) view;
        if (playerSeekWidget3.isIndeterminate() || !playerSeekWidget3.isEnabled()) {
            return false;
        }
        int iMax = Math.max(1, MathKt.roundToInt(playerSeekWidget3.getMax() / 20));
        int i8 = iMax;
        if (i7 == 8192) {
            i8 = -iMax;
        }
        this.f83058a.setProgress(playerSeekWidget3.getProgress() + i8);
        this.f83058a.getPlayerCoreService().seekTo(playerSeekWidget3.getProgress());
        return true;
    }
}
