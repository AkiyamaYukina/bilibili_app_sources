package com.bilibili.studio.editor.question.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/QuestionConfig.class */
@Keep
public final class QuestionConfig {

    @Nullable
    private InvestigationEvent event;

    @Nullable
    private InvestigationActionParam param;

    public QuestionConfig() {
        this(null, null, 3, null);
    }

    public QuestionConfig(@Nullable InvestigationEvent investigationEvent, @Nullable InvestigationActionParam investigationActionParam) {
        this.event = investigationEvent;
        this.param = investigationActionParam;
    }

    public /* synthetic */ QuestionConfig(InvestigationEvent investigationEvent, InvestigationActionParam investigationActionParam, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : investigationEvent, (i7 & 2) != 0 ? null : investigationActionParam);
    }

    public static /* synthetic */ QuestionConfig copy$default(QuestionConfig questionConfig, InvestigationEvent investigationEvent, InvestigationActionParam investigationActionParam, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            investigationEvent = questionConfig.event;
        }
        if ((i7 & 2) != 0) {
            investigationActionParam = questionConfig.param;
        }
        return questionConfig.copy(investigationEvent, investigationActionParam);
    }

    @Nullable
    public final InvestigationEvent component1() {
        return this.event;
    }

    @Nullable
    public final InvestigationActionParam component2() {
        return this.param;
    }

    @NotNull
    public final QuestionConfig copy(@Nullable InvestigationEvent investigationEvent, @Nullable InvestigationActionParam investigationActionParam) {
        return new QuestionConfig(investigationEvent, investigationActionParam);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionConfig)) {
            return false;
        }
        QuestionConfig questionConfig = (QuestionConfig) obj;
        return Intrinsics.areEqual(this.event, questionConfig.event) && Intrinsics.areEqual(this.param, questionConfig.param);
    }

    @Nullable
    public final InvestigationEvent getEvent() {
        return this.event;
    }

    @Nullable
    public final InvestigationActionParam getParam() {
        return this.param;
    }

    public int hashCode() {
        InvestigationEvent investigationEvent = this.event;
        int iHashCode = 0;
        int iHashCode2 = investigationEvent == null ? 0 : investigationEvent.hashCode();
        InvestigationActionParam investigationActionParam = this.param;
        if (investigationActionParam != null) {
            iHashCode = investigationActionParam.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setEvent(@Nullable InvestigationEvent investigationEvent) {
        this.event = investigationEvent;
    }

    public final void setParam(@Nullable InvestigationActionParam investigationActionParam) {
        this.param = investigationActionParam;
    }

    @NotNull
    public String toString() {
        return "QuestionConfig(event=" + this.event + ", param=" + this.param + ")";
    }
}
