package com.bilibili.lib.resmanager;

import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/ResRequest.class */
public class ResRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f64279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f64280b;

    @JvmOverloads
    public ResRequest(@Nullable String str) {
        this(str, null, 2, null);
    }

    @JvmOverloads
    public ResRequest(@Nullable String str, @Nullable String str2) {
        this.f64279a = str;
        this.f64280b = str2;
    }

    public /* synthetic */ ResRequest(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? "" : str2);
    }

    @Nullable
    public final String getKey$resmanager_release() {
        return this.f64280b;
    }

    @Nullable
    public final String getUrl$resmanager_release() {
        return this.f64279a;
    }

    public final void setKey$resmanager_release(@Nullable String str) {
        this.f64280b = str;
    }

    public final void setUrl$resmanager_release(@Nullable String str) {
        this.f64279a = str;
    }

    @NotNull
    public String toString() {
        return p.a("ResRequest(url=", this.f64279a, ", key=", this.f64280b, ")");
    }
}
