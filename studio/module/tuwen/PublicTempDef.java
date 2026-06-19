package com.bilibili.studio.module.tuwen;

import com.bilibili.studio.module.tuwen.model.PbTemplateResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/PublicTempDef.class */
public final class PublicTempDef {

    @NotNull
    public static final PublicTempDef INSTANCE = new PublicTempDef();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f108600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static PbTemplateResult f108601b;

    public final int getPbHasCustomGif() {
        return f108600a;
    }

    @Nullable
    public final PbTemplateResult getPbTemplateResult() {
        return f108601b;
    }

    public final void setPbHasCustomGif(int i7) {
        f108600a = i7;
    }

    public final void setPbTemplateResult(@Nullable PbTemplateResult pbTemplateResult) {
        f108601b = pbTemplateResult;
    }
}
