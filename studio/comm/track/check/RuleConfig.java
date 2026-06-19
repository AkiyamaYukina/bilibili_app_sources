package com.bilibili.studio.comm.track.check;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/track/check/RuleConfig.class */
@Keep
public final class RuleConfig {

    @NotNull
    private String name;

    @NotNull
    private String regex;

    public RuleConfig() {
        this(null, null, 3, null);
    }

    public RuleConfig(@NotNull String str, @NotNull String str2) {
        this.name = str;
        this.regex = str2;
    }

    public /* synthetic */ RuleConfig(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ RuleConfig copy$default(RuleConfig ruleConfig, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ruleConfig.name;
        }
        if ((i7 & 2) != 0) {
            str2 = ruleConfig.regex;
        }
        return ruleConfig.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.regex;
    }

    @NotNull
    public final RuleConfig copy(@NotNull String str, @NotNull String str2) {
        return new RuleConfig(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleConfig)) {
            return false;
        }
        RuleConfig ruleConfig = (RuleConfig) obj;
        return Intrinsics.areEqual(this.name, ruleConfig.name) && Intrinsics.areEqual(this.regex, ruleConfig.regex);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    public int hashCode() {
        return this.regex.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setRegex(@NotNull String str) {
        this.regex = str;
    }

    @NotNull
    public String toString() {
        return p.a("RuleConfig(name=", this.name, ", regex=", this.regex, ")");
    }
}
