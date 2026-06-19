package com.bilibili.studio.editor.asr.bean;

import G0.d;
import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/CaptionRecognition.class */
@Keep
public final class CaptionRecognition {
    private int from;
    private long inPoint;
    private long inPointUs;
    private long outPoint;
    private long outPointUs;
    private long trimIn;
    private long trimOut;

    @Nullable
    private String version;

    @NotNull
    private String text = "";
    private double playRate = 1.0d;

    public final int getCaptionType() {
        int i7 = this.from;
        int i8 = 2;
        if (i7 != 0) {
            i8 = i7 != 1 ? i7 != 2 ? 0 : 3 : 1;
        }
        return i8;
    }

    public final int getFrom() {
        return this.from;
    }

    public final long getInPoint() {
        return this.inPoint;
    }

    public final long getInPointUs() {
        return this.inPointUs;
    }

    public final long getOutPoint() {
        return this.outPoint;
    }

    public final long getOutPointUs() {
        return this.outPointUs;
    }

    public final double getPlayRate() {
        return this.playRate;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final long getTrimIn() {
        return this.trimIn;
    }

    public final long getTrimOut() {
        return this.trimOut;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setFrom(int i7) {
        this.from = i7;
    }

    public final void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public final void setInPointUs(long j7) {
        this.inPointUs = j7;
    }

    public final void setOutPoint(long j7) {
        this.outPoint = j7;
    }

    public final void setOutPointUs(long j7) {
        this.outPointUs = j7;
    }

    public final void setPlayRate(double d7) {
        this.playRate = d7;
    }

    public final void setText(@NotNull String str) {
        this.text = str;
    }

    public final void setTrimIn(long j7) {
        this.trimIn = j7;
    }

    public final void setTrimOut(long j7) {
        this.trimOut = j7;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.inPoint;
        long j8 = this.outPoint;
        long j9 = this.inPointUs;
        long j10 = this.outPointUs;
        String str = this.text;
        long j11 = this.trimIn;
        long j12 = this.trimOut;
        double d7 = this.playRate;
        String str2 = this.version;
        int i7 = this.from;
        StringBuilder sbA = z.a(j7, "CaptionRecognition(inPoint=", ", outPoint=");
        sbA.append(j8);
        J1.z.a(j9, ", inPointUs=", ", outPointUs=", sbA);
        d.a(j10, ", text='", str, sbA);
        J1.z.a(j11, "', trimIn=", ", trimOut=", sbA);
        sbA.append(j12);
        a.a(sbA, ", playRate=", d7, ", version=");
        return K.a(i7, str2, ", from=", ")", sbA);
    }
}
