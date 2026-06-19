package com.bilibili.studio.module.tuwen.model;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutRequestToDetail.class */
public final class BCutRequestToDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f108617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Bundle f108618c;

    public BCutRequestToDetail(int i7, String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this.f108616a = i7;
        this.f108617b = str;
        this.f108618c = bundle;
    }

    @NotNull
    public final Bundle getExtra() {
        return this.f108618c;
    }

    @NotNull
    public final String getTimeline() {
        return this.f108617b;
    }

    public final int getType() {
        return this.f108616a;
    }

    public final void setExtra(@NotNull Bundle bundle) {
        this.f108618c = bundle;
    }

    public final void setTimeline(@NotNull String str) {
        this.f108617b = str;
    }
}
