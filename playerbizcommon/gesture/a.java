package com.bilibili.playerbizcommon.gesture;

import Aq0.D;
import Vn.A;
import android.app.Activity;
import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.playerbizcommon.gesture.MediaLevelController;
import com.bilibili.search2.api.SearchBangumiItem;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/a.class */
public final class a extends MediaLevelController {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final D f80056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80058g;
    public final int h;

    public a(@NotNull Context context, @NotNull D d7) {
        int iIntValue;
        super(context);
        this.f80056e = d7;
        this.f80058g = -1;
        this.h = 255;
        try {
            iIntValue = ((Integer) PowerManager.class.getDeclaredField("BRIGHTNESS_ON").get(null)).intValue();
        } catch (Exception e7) {
            iIntValue = 255;
        }
        this.h = iIntValue;
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final boolean change(float f7) {
        super.change(f7);
        Context context = getContext();
        if (context == null) {
            return false;
        }
        float relativeDiffFactor = getRelativeDiffFactor(f7);
        int i7 = this.h;
        float f8 = 0.5f * relativeDiffFactor * i7;
        int iFloor = (int) Math.floor(this.f80057f + f8);
        int i8 = this.f80057f;
        int i9 = this.f80058g;
        StringBuilder sbB = A.b(iFloor, i7, "brightness ", "/", ", level start:");
        C4690e.a(i8, i9, ", level last:", ", level change:", sbB);
        sbB.append(f8);
        sbB.append(", diffFactor:");
        sbB.append(relativeDiffFactor);
        PlayerLog.i("BrightnessVolumeTag", sbB.toString());
        int iMax = Math.max(Math.min(iFloor, i7), 0);
        if (iMax != this.f80058g) {
            this.f80058g = iMax;
            float fMin = Math.min(Math.max(iMax / i7, 0.0f), 1.0f);
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(context);
            if (activityFindActivityOrNull != null) {
                Window window = activityFindActivityOrNull.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = RangesKt.coerceAtLeast(fMin, 0.01f);
                window.setAttributes(attributes);
            }
        }
        this.f80056e.a(iMax, i7);
        return true;
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final void onChangeDirection(@NotNull MediaLevelController.MoveDirection moveDirection, float f7) {
        resetDiffFactorStart(f7);
        this.f80057f = this.f80058g;
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final void startChange() {
        int i7;
        super.startChange();
        Context context = getContext();
        if (context == null) {
            return;
        }
        int i8 = this.f80058g;
        if (i8 < 0) {
            try {
                i7 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY);
                PlayerLog.i("BrightnessVolumeTag", "getScreenBrightnessLevel " + i7);
                if (i7 <= 0) {
                    i7 = 125;
                }
            } catch (Exception e7) {
                PlayerLog.w("BrightnessVolumeTag", e7);
                i7 = 125;
            }
            this.f80057f = i7;
            this.f80058g = i7;
        } else {
            this.f80057f = i8;
        }
        this.f80056e.a(this.f80057f, this.h);
        com.bilibili.bangumi.logic.page.detail.playerhandler.a.a(this.f80057f, "brightness start ", "BrightnessVolumeTag");
    }
}
