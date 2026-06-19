package com.bilibili.moduleservice.fasthybrid.minigame;

import I.E;
import androidx.media3.exoplayer.analytics.C4665g;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/minigame/MiniGameLaunchOpt.class */
public final class MiniGameLaunchOpt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f66308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f66309c;

    public MiniGameLaunchOpt(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        this.f66307a = z6;
        this.f66308b = str;
        this.f66309c = map;
    }

    public /* synthetic */ MiniGameLaunchOpt(boolean z6, String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, str, (i7 & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiniGameLaunchOpt copy$default(MiniGameLaunchOpt miniGameLaunchOpt, boolean z6, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = miniGameLaunchOpt.f66307a;
        }
        if ((i7 & 2) != 0) {
            str = miniGameLaunchOpt.f66308b;
        }
        if ((i7 & 4) != 0) {
            map = miniGameLaunchOpt.f66309c;
        }
        return miniGameLaunchOpt.copy(z6, str, map);
    }

    public final boolean component1() {
        return this.f66307a;
    }

    @NotNull
    public final String component2() {
        return this.f66308b;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.f66309c;
    }

    @NotNull
    public final MiniGameLaunchOpt copy(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        return new MiniGameLaunchOpt(z6, str, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniGameLaunchOpt)) {
            return false;
        }
        MiniGameLaunchOpt miniGameLaunchOpt = (MiniGameLaunchOpt) obj;
        return this.f66307a == miniGameLaunchOpt.f66307a && Intrinsics.areEqual(this.f66308b, miniGameLaunchOpt.f66308b) && Intrinsics.areEqual(this.f66309c, miniGameLaunchOpt.f66309c);
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.f66309c;
    }

    public final boolean getLastJumpFromSidebar() {
        return this.f66307a;
    }

    @NotNull
    public final String getOriginUrl() {
        return this.f66308b;
    }

    public int hashCode() {
        return this.f66309c.hashCode() + E.a(Boolean.hashCode(this.f66307a) * 31, 31, this.f66308b);
    }

    @NotNull
    public String toString() {
        Map<String, String> map = this.f66309c;
        StringBuilder sb = new StringBuilder("MiniGameLaunchOpt(lastJumpFromSidebar=");
        sb.append(this.f66307a);
        sb.append(", originUrl=");
        return C4665g.a(sb, this.f66308b, ", extras=", map, ")");
    }
}
