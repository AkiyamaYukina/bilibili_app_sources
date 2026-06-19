package com.bilibili.studio.videoeditor.generalrender.bean;

import Dp.b;
import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.compose.animation.n;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRUploadInfoResult.class */
@Keep
public final class GRUploadInfoResult {
    private float progress;
    private float remainTime;
    private long speed;

    @JSONCreator
    public GRUploadInfoResult() {
        this(0.0f, 0.0f, 0L, 7, null);
    }

    @JSONCreator
    public GRUploadInfoResult(@JSONField(name = NotificationCompat.CATEGORY_PROGRESS) float f7, @JSONField(name = "remainTime") float f8, @JSONField(name = "speed") long j7) {
        this.progress = f7;
        this.remainTime = f8;
        this.speed = j7;
    }

    public /* synthetic */ GRUploadInfoResult(float f7, float f8, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 1.0f : f7, (i7 & 2) != 0 ? 0.0f : f8, (i7 & 4) != 0 ? 0L : j7);
    }

    public static /* synthetic */ GRUploadInfoResult copy$default(GRUploadInfoResult gRUploadInfoResult, float f7, float f8, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = gRUploadInfoResult.progress;
        }
        if ((i7 & 2) != 0) {
            f8 = gRUploadInfoResult.remainTime;
        }
        if ((i7 & 4) != 0) {
            j7 = gRUploadInfoResult.speed;
        }
        return gRUploadInfoResult.copy(f7, f8, j7);
    }

    public final float component1() {
        return this.progress;
    }

    public final float component2() {
        return this.remainTime;
    }

    public final long component3() {
        return this.speed;
    }

    @NotNull
    public final GRUploadInfoResult copy(@JSONField(name = NotificationCompat.CATEGORY_PROGRESS) float f7, @JSONField(name = "remainTime") float f8, @JSONField(name = "speed") long j7) {
        return new GRUploadInfoResult(f7, f8, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRUploadInfoResult)) {
            return false;
        }
        GRUploadInfoResult gRUploadInfoResult = (GRUploadInfoResult) obj;
        return Float.compare(this.progress, gRUploadInfoResult.progress) == 0 && Float.compare(this.remainTime, gRUploadInfoResult.remainTime) == 0 && this.speed == gRUploadInfoResult.speed;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final float getRemainTime() {
        return this.remainTime;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Long.hashCode(this.speed) + n.a(this.remainTime, Float.hashCode(this.progress) * 31, 31);
    }

    public final void setProgress(float f7) {
        this.progress = f7;
    }

    public final void setRemainTime(float f7) {
        this.remainTime = f7;
    }

    public final void setSpeed(long j7) {
        this.speed = j7;
    }

    @NotNull
    public String toString() {
        float f7 = this.progress;
        float f8 = this.remainTime;
        return a.a(b.a("GRUploadInfoResult(progress=", f7, ", remainTime=", f8, ", speed="), this.speed, ")");
    }
}
