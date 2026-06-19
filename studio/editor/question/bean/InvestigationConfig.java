package com.bilibili.studio.editor.question.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.j;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/InvestigationConfig.class */
@Keep
public final class InvestigationConfig {

    @NotNull
    private Map<String, InvestigationEvent> events;

    @JSONCreator
    public InvestigationConfig(@JSONField(name = "events") @NotNull Map<String, InvestigationEvent> map) {
        this.events = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestigationConfig copy$default(InvestigationConfig investigationConfig, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            map = investigationConfig.events;
        }
        return investigationConfig.copy(map);
    }

    @NotNull
    public final Map<String, InvestigationEvent> component1() {
        return this.events;
    }

    @NotNull
    public final InvestigationConfig copy(@JSONField(name = "events") @NotNull Map<String, InvestigationEvent> map) {
        return new InvestigationConfig(map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestigationConfig) && Intrinsics.areEqual(this.events, ((InvestigationConfig) obj).events);
    }

    @NotNull
    public final Map<String, InvestigationEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public final void setEvents(@NotNull Map<String, InvestigationEvent> map) {
        this.events = map;
    }

    @NotNull
    public String toString() {
        return j.a("InvestigationConfig(events=", ")", this.events);
    }
}
