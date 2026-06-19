package com.bilibili.live;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/PushRefreshDto.class */
public final class PushRefreshDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f65139a;

    public PushRefreshDto(@NotNull String str) {
        this.f65139a = str;
    }

    public static /* synthetic */ PushRefreshDto copy$default(PushRefreshDto pushRefreshDto, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pushRefreshDto.f65139a;
        }
        return pushRefreshDto.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f65139a;
    }

    @NotNull
    public final PushRefreshDto copy(@NotNull String str) {
        return new PushRefreshDto(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushRefreshDto) && Intrinsics.areEqual(this.f65139a, ((PushRefreshDto) obj).f65139a);
    }

    @NotNull
    public final String getActivityId() {
        return this.f65139a;
    }

    public int hashCode() {
        return this.f65139a.hashCode();
    }

    @NotNull
    public String toString() {
        return C8770a.a(new StringBuilder("PushRefreshDto(activityId="), this.f65139a, ")");
    }
}
