package com.bilibili.ship.theseus.sail;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ArcPrivacyException.class */
public final class ArcPrivacyException extends Throwable {

    @Nullable
    private final String hint;

    public ArcPrivacyException(@Nullable String str) {
        this.hint = str;
    }

    @Nullable
    public final String getHint() {
        return this.hint;
    }
}
