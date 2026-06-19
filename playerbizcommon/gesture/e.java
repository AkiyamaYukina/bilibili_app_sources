package com.bilibili.playerbizcommon.gesture;

import Aq0.G;
import Vn.A;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.media.AudioManagerHelper;
import com.bilibili.playerbizcommon.gesture.MediaLevelController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/e.class */
public final class e extends MediaLevelController {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final G f80076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80077g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80080k;

    public e(@NotNull Context context, int i7, @NotNull G g7) {
        super(context);
        this.f80075e = i7;
        this.f80076f = g7;
    }

    public final boolean a() {
        int iMax = Math.max(this.f80080k, 0);
        this.f80080k = iMax;
        int iMin = Math.min(iMax, this.h);
        this.f80080k = iMin;
        if (iMin != this.f80079j) {
            this.f80079j = iMin;
            AudioManagerHelper.setStreamVolume(BiliContext.application(), this.f80075e, this.f80079j);
            com.bilibili.bangumi.logic.page.detail.playerhandler.a.a(this.f80079j, "set system volume: ", "BrightnessVolumeTag");
            this.f80078i = true;
        }
        int i7 = this.f80080k;
        int i8 = this.h;
        G g7 = this.f80076f;
        AppCompatSeekBar appCompatSeekBar = g7.f472c;
        AppCompatSeekBar appCompatSeekBar2 = appCompatSeekBar;
        if (appCompatSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            appCompatSeekBar2 = null;
        }
        appCompatSeekBar2.setMax(i8);
        AppCompatSeekBar appCompatSeekBar3 = g7.f472c;
        AppCompatSeekBar appCompatSeekBar4 = appCompatSeekBar3;
        if (appCompatSeekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            appCompatSeekBar4 = null;
        }
        appCompatSeekBar4.setProgress(i7);
        Drawable drawable = i7 <= 0 ? ContextCompat.getDrawable(g7.getContext(), 2131236802) : ContextCompat.getDrawable(g7.getContext(), 2131236803);
        if (drawable != null) {
            ImageView imageView = g7.f473d;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mImage");
                imageView2 = null;
            }
            imageView2.setImageDrawable(drawable);
        }
        AppCompatSeekBar appCompatSeekBar5 = g7.f472c;
        AppCompatSeekBar appCompatSeekBar6 = appCompatSeekBar5;
        if (appCompatSeekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            appCompatSeekBar6 = null;
        }
        int progress = appCompatSeekBar6.getProgress();
        AppCompatSeekBar appCompatSeekBar7 = g7.f472c;
        if (appCompatSeekBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            appCompatSeekBar7 = null;
        }
        PlayerLog.i("BiliPlayerV2", "[player] voice to " + progress + ", max: " + appCompatSeekBar7.getMax());
        return this.f80078i;
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final boolean change(float f7) {
        super.change(f7);
        int i7 = 0;
        if (this.h <= 0) {
            return false;
        }
        float relativeDiffFactor = getRelativeDiffFactor(f7);
        int iFloor = (int) Math.floor(1.5f * relativeDiffFactor * this.h);
        int i8 = this.f80080k;
        int i9 = this.h;
        int i10 = this.f80077g;
        int i11 = this.f80079j;
        StringBuilder sbB = A.b(i8, i9, "volume ", "/", ", level start:");
        C4690e.a(i10, i11, ", level last:", ", diffFactor:", sbB);
        sbB.append(relativeDiffFactor);
        PlayerLog.i("BrightnessVolumeTag", sbB.toString());
        int i12 = this.f80077g + iFloor;
        this.f80080k = i12;
        if (i12 > this.h || i12 < 0) {
            resetDiffFactorStart(f7);
            if (this.f80080k >= 0) {
                i7 = this.h;
            }
            this.f80077g = i7;
        }
        return a();
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final void onChangeDirection(@NotNull MediaLevelController.MoveDirection moveDirection, float f7) {
        this.f80077g = this.f80079j;
    }

    @Override // com.bilibili.playerbizcommon.gesture.MediaLevelController
    public final void startChange() {
        super.startChange();
        Context context = getContext();
        if (context == null) {
            return;
        }
        int i7 = this.h;
        int i8 = this.f80075e;
        if (i7 == 0) {
            this.h = AudioManagerHelper.getStreamMaxVolume(context, i8);
        }
        this.h = this.h;
        int streamVolume = AudioManagerHelper.getStreamVolume(context, i8);
        this.f80077g = streamVolume;
        this.f80079j = streamVolume;
        this.f80080k = streamVolume;
        this.f80078i = false;
        a();
        com.bilibili.bangumi.logic.page.detail.playerhandler.a.a(this.f80077g, "volume start ", "BrightnessVolumeTag");
    }
}
