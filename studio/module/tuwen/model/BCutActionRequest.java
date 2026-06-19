package com.bilibili.studio.module.tuwen.model;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutActionRequest.class */
public final class BCutActionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f108604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f108605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Bundle f108606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f108607f = -1;

    public BCutActionRequest(int i7, int i8, @NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        this.f108602a = i7;
        this.f108603b = i8;
        this.f108604c = str;
        this.f108605d = str2;
        this.f108606e = bundle;
    }

    public final int getActionType() {
        return this.f108602a;
    }

    @NotNull
    public final String getCatId() {
        return this.f108605d;
    }

    @NotNull
    public final Bundle getExtra() {
        return this.f108606e;
    }

    @NotNull
    public final String getId() {
        return this.f108604c;
    }

    public final int getRequestCode() {
        return this.f108607f;
    }

    public final int getType() {
        return this.f108603b;
    }

    public final void setActionType(int i7) {
        this.f108602a = i7;
    }

    public final void setCatId(@NotNull String str) {
        this.f108605d = str;
    }

    public final void setExtra(@NotNull Bundle bundle) {
        this.f108606e = bundle;
    }

    public final void setId(@NotNull String str) {
        this.f108604c = str;
    }

    public final void setRequestCode(int i7) {
        this.f108607f = i7;
    }

    public final void setType(int i7) {
        this.f108603b = i7;
    }
}
