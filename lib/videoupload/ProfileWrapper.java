package com.bilibili.lib.videoupload;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/ProfileWrapper.class */
@Keep
public final class ProfileWrapper {

    @Nullable
    private Profile profile;

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    public final void setProfile(@Nullable Profile profile) {
        this.profile = profile;
    }
}
