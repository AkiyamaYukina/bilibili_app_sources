package com.bilibili.ogv.opbase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ModuleMine.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ModuleMine {
    public static final int $stable = 8;

    @JSONField(name = "modules")
    @NotNull
    private List<RecommendModule> modules;

    public ModuleMine() {
        this(null, 1, null);
    }

    public ModuleMine(@NotNull List<RecommendModule> list) {
        this.modules = list;
    }

    public /* synthetic */ ModuleMine(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Collections.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleMine copy$default(ModuleMine moduleMine, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = moduleMine.modules;
        }
        return moduleMine.copy(list);
    }

    @NotNull
    public final List<RecommendModule> component1() {
        return this.modules;
    }

    @NotNull
    public final ModuleMine copy(@NotNull List<RecommendModule> list) {
        return new ModuleMine(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModuleMine) && Intrinsics.areEqual(this.modules, ((ModuleMine) obj).modules);
    }

    @NotNull
    public final List<RecommendModule> getModules() {
        return this.modules;
    }

    public int hashCode() {
        return this.modules.hashCode();
    }

    public final void setModules(@NotNull List<RecommendModule> list) {
        this.modules = list;
    }

    @NotNull
    public String toString() {
        return k.a("ModuleMine(modules=", ")", this.modules);
    }
}
