package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.EngineType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialResult.class */
public final class MaterialResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Result> f108471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public EngineType f108472b;

    public MaterialResult() {
        this(null, 1, null);
    }

    public MaterialResult(@NotNull List<Result> list) {
        this.f108471a = list;
        this.f108472b = EngineType.Meicam;
    }

    public /* synthetic */ MaterialResult(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new ArrayList() : list);
    }

    @NotNull
    public final EngineType getEngineType() {
        return this.f108472b;
    }

    @NotNull
    public final List<Result> getResults() {
        return this.f108471a;
    }

    public final void setEngineType(@NotNull EngineType engineType) {
        this.f108472b = engineType;
    }
}
