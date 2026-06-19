package com.bilibili.playset.api;

import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/u.class */
public interface u {
    @NotNull
    String a();

    @NotNull
    String getBizId();

    @NotNull
    TranslationBusiness getBizType();

    void h(@Nullable String str);

    @Nullable
    String m();

    int n();

    void q(int i7);
}
