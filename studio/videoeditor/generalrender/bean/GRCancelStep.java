package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.features.background.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRCancelStep.class */
@Keep
public final class GRCancelStep {

    @Nullable
    private String step;
    private long templateId;

    @JSONCreator
    public GRCancelStep(@JSONField(name = "step") @Nullable String str, @JSONField(name = "templateId") long j7) {
        this.step = str;
        this.templateId = j7;
    }

    public /* synthetic */ GRCancelStep(String str, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0L : j7);
    }

    public static /* synthetic */ GRCancelStep copy$default(GRCancelStep gRCancelStep, String str, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRCancelStep.step;
        }
        if ((i7 & 2) != 0) {
            j7 = gRCancelStep.templateId;
        }
        return gRCancelStep.copy(str, j7);
    }

    @Nullable
    public final String component1() {
        return this.step;
    }

    public final long component2() {
        return this.templateId;
    }

    @NotNull
    public final GRCancelStep copy(@JSONField(name = "step") @Nullable String str, @JSONField(name = "templateId") long j7) {
        return new GRCancelStep(str, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRCancelStep)) {
            return false;
        }
        GRCancelStep gRCancelStep = (GRCancelStep) obj;
        return Intrinsics.areEqual(this.step, gRCancelStep.step) && this.templateId == gRCancelStep.templateId;
    }

    @Nullable
    public final String getStep() {
        return this.step;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.step;
        return Long.hashCode(this.templateId) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setStep(@Nullable String str) {
        this.step = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = b.a(this.templateId, "GRCancelStep(step=", this.step, ", templateId=");
        sbA.append(")");
        return sbA.toString();
    }
}
