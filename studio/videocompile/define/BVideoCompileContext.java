package com.bilibili.studio.videocompile.define;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileContext.class */
public abstract class BVideoCompileContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f108762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f108763b;

    public BVideoCompileContext(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f108762a = obj;
        this.f108763b = obj2;
    }

    @NotNull
    public final Object getMediaContext() {
        return this.f108762a;
    }

    @NotNull
    public final Object getTimeline() {
        return this.f108763b;
    }
}
