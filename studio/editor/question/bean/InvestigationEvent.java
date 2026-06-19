package com.bilibili.studio.editor.question.bean;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import c6.N;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/bean/InvestigationEvent.class */
@Keep
public final class InvestigationEvent {

    @NotNull
    private List<String> bind;

    @NotNull
    private String key;

    @NotNull
    private String name;

    public InvestigationEvent() {
        this(null, null, null, 7, null);
    }

    public InvestigationEvent(@JSONField(name = "key") @NotNull String str, @JSONField(name = "name") @NotNull String str2, @JSONField(name = "bind") @NotNull List<String> list) {
        this.key = str;
        this.name = str2;
        this.bind = list;
    }

    public /* synthetic */ InvestigationEvent(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestigationEvent copy$default(InvestigationEvent investigationEvent, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = investigationEvent.key;
        }
        if ((i7 & 2) != 0) {
            str2 = investigationEvent.name;
        }
        if ((i7 & 4) != 0) {
            list = investigationEvent.bind;
        }
        return investigationEvent.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final List<String> component3() {
        return this.bind;
    }

    @NotNull
    public final InvestigationEvent copy(@JSONField(name = "key") @NotNull String str, @JSONField(name = "name") @NotNull String str2, @JSONField(name = "bind") @NotNull List<String> list) {
        return new InvestigationEvent(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestigationEvent)) {
            return false;
        }
        InvestigationEvent investigationEvent = (InvestigationEvent) obj;
        return Intrinsics.areEqual(this.key, investigationEvent.key) && Intrinsics.areEqual(this.name, investigationEvent.name) && Intrinsics.areEqual(this.bind, investigationEvent.bind);
    }

    @NotNull
    public final List<String> getBind() {
        return this.bind;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.bind.hashCode() + E.a(this.key.hashCode() * 31, 31, this.name);
    }

    public final void setBind(@NotNull List<String> list) {
        this.bind = list;
    }

    public final void setKey(@NotNull String str) {
        this.key = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.name;
        return N.a(b.a("InvestigationEvent(key=", str, ", name=", str2, ", bind="), ")", this.bind);
    }
}
