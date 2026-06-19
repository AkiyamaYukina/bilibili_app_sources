package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlineProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/s.class */
@StabilityInferred(parameters = 0)
public final class s implements com.bilibili.ogv.kmm.operation.inlinevideo.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70974c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private IInlineCardData f70975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final IInlineProperty f70976b = new BangumiInlineProperty();

    @Nullable
    public final IInlineCardData a() {
        return this.f70975a;
    }

    @NotNull
    public final IInlineProperty b() {
        return this.f70976b;
    }

    public final void c(@Nullable IInlineCardData iInlineCardData) {
        this.f70975a = iInlineCardData;
    }
}
