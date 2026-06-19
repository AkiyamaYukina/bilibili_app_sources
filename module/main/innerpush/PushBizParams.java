package com.bilibili.module.main.innerpush;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/main/innerpush/PushBizParams.class */
public final class PushBizParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f66117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f66118b;

    public PushBizParams(@Nullable String str, @Nullable Map<String, String> map) {
        this.f66117a = str;
        this.f66118b = map;
    }

    @Nullable
    public final Map<String, String> getResource() {
        return this.f66118b;
    }

    @Nullable
    public final String getType() {
        return this.f66117a;
    }

    public final void setResource(@Nullable Map<String, String> map) {
        this.f66118b = map;
    }

    public final void setType(@Nullable String str) {
        this.f66117a = str;
    }
}
