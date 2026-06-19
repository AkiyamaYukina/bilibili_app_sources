package com.bilibili.studio.videocompile.define;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/EventExtraInfo.class */
@Keep
public final class EventExtraInfo {

    @NotNull
    private String scene_extra;

    @NotNull
    private String scene_type;

    @NotNull
    private String trace_id;

    public EventExtraInfo() {
        this(null, null, null, 7, null);
    }

    public EventExtraInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.scene_type = str;
        this.scene_extra = str2;
        this.trace_id = str3;
    }

    public /* synthetic */ EventExtraInfo(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ EventExtraInfo copy$default(EventExtraInfo eventExtraInfo, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = eventExtraInfo.scene_type;
        }
        if ((i7 & 2) != 0) {
            str2 = eventExtraInfo.scene_extra;
        }
        if ((i7 & 4) != 0) {
            str3 = eventExtraInfo.trace_id;
        }
        return eventExtraInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.scene_type;
    }

    @NotNull
    public final String component2() {
        return this.scene_extra;
    }

    @NotNull
    public final String component3() {
        return this.trace_id;
    }

    @NotNull
    public final EventExtraInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new EventExtraInfo(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventExtraInfo)) {
            return false;
        }
        EventExtraInfo eventExtraInfo = (EventExtraInfo) obj;
        return Intrinsics.areEqual(this.scene_type, eventExtraInfo.scene_type) && Intrinsics.areEqual(this.scene_extra, eventExtraInfo.scene_extra) && Intrinsics.areEqual(this.trace_id, eventExtraInfo.trace_id);
    }

    @NotNull
    public final String getScene_extra() {
        return this.scene_extra;
    }

    @NotNull
    public final String getScene_type() {
        return this.scene_type;
    }

    @NotNull
    public final String getTrace_id() {
        return this.trace_id;
    }

    public int hashCode() {
        return this.trace_id.hashCode() + E.a(this.scene_type.hashCode() * 31, 31, this.scene_extra);
    }

    public final void setScene_extra(@NotNull String str) {
        this.scene_extra = str;
    }

    public final void setScene_type(@NotNull String str) {
        this.scene_type = str;
    }

    public final void setTrace_id(@NotNull String str) {
        this.trace_id = str;
    }

    @NotNull
    public String toString() {
        String str = this.scene_type;
        String str2 = this.scene_extra;
        return C8770a.a(b.a("EventExtraInfo(scene_type=", str, ", scene_extra=", str2, ", trace_id="), this.trace_id, ")");
    }
}
