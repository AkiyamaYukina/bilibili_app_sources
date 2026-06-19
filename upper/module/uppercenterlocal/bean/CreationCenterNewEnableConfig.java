package com.bilibili.upper.module.uppercenterlocal.bean;

import J3.C2332d;
import O4.c;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/bean/CreationCenterNewEnableConfig.class */
@StabilityInferred(parameters = 1)
@Keep
public final class CreationCenterNewEnableConfig {
    public static final int $stable = 0;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final Lazy<CreationCenterNewEnableConfig> config$delegate = LazyKt.lazy(new C2332d(10));

    @SerializedName("enable")
    private final int enable;

    @SerializedName("max_followers")
    private final long maxFollowers;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/bean/CreationCenterNewEnableConfig$a.class */
    public static final class a {
    }

    public CreationCenterNewEnableConfig() {
        this(0L, 0, 3, null);
    }

    public CreationCenterNewEnableConfig(long j7, int i7) {
        this.maxFollowers = j7;
        this.enable = i7;
    }

    public /* synthetic */ CreationCenterNewEnableConfig(long j7, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? 0 : i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationCenterNewEnableConfig config_delegate$lambda$0() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Lazy lazy = UpperFawkesDeviceDecision.f105475a;
            obj = Result.constructor-impl((CreationCenterNewEnableConfig) new Gson().fromJson((String) UpperFawkesDeviceDecision.f105480c0.getValue(), CreationCenterNewEnableConfig.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        CreationCenterNewEnableConfig creationCenterNewEnableConfig = new CreationCenterNewEnableConfig(0L, 0, 3, null);
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = creationCenterNewEnableConfig;
        }
        return (CreationCenterNewEnableConfig) obj2;
    }

    public static /* synthetic */ CreationCenterNewEnableConfig copy$default(CreationCenterNewEnableConfig creationCenterNewEnableConfig, long j7, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = creationCenterNewEnableConfig.maxFollowers;
        }
        if ((i8 & 2) != 0) {
            i7 = creationCenterNewEnableConfig.enable;
        }
        return creationCenterNewEnableConfig.copy(j7, i7);
    }

    public final long component1() {
        return this.maxFollowers;
    }

    public final int component2() {
        return this.enable;
    }

    @NotNull
    public final CreationCenterNewEnableConfig copy(long j7, int i7) {
        return new CreationCenterNewEnableConfig(j7, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationCenterNewEnableConfig)) {
            return false;
        }
        CreationCenterNewEnableConfig creationCenterNewEnableConfig = (CreationCenterNewEnableConfig) obj;
        return this.maxFollowers == creationCenterNewEnableConfig.maxFollowers && this.enable == creationCenterNewEnableConfig.enable;
    }

    public final int getEnable() {
        return this.enable;
    }

    public final long getMaxFollowers() {
        return this.maxFollowers;
    }

    public int hashCode() {
        return Integer.hashCode(this.enable) + (Long.hashCode(this.maxFollowers) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbB = c.b(this.enable, this.maxFollowers, "CreationCenterNewEnableConfig(maxFollowers=", ", enable=");
        sbB.append(")");
        return sbB.toString();
    }
}
