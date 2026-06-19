package com.bilibili.studio.module.tuwen.model;

import M6.f;
import android.os.Bundle;
import bilibili.live.app.service.resolver.a;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BcutRequest.class */
public final class BcutRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f108620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f108621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<Integer> f108622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f108623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Bundle f108625g;

    public BcutRequest() {
        throw null;
    }

    public final int getBizType() {
        return this.f108623e;
    }

    public final boolean getDefaultLoader() {
        return this.f108624f;
    }

    @NotNull
    public final Bundle getExtra() {
        return this.f108625g;
    }

    @NotNull
    public final List<Integer> getFilterResourceType() {
        return this.f108622d;
    }

    @NotNull
    public final String getId() {
        return this.f108620b;
    }

    public final int getType() {
        return this.f108619a;
    }

    @NotNull
    public final String getUrl() {
        return this.f108621c;
    }

    public final void setBizType(int i7) {
        this.f108623e = i7;
    }

    public final void setDefaultLoader(boolean z6) {
        this.f108624f = z6;
    }

    public final void setExtra(@NotNull Bundle bundle) {
        this.f108625g = bundle;
    }

    public final void setFilterResourceType(@NotNull List<Integer> list) {
        this.f108622d = list;
    }

    public final void setId(@NotNull String str) {
        this.f108620b = str;
    }

    public final void setType(int i7) {
        this.f108619a = i7;
    }

    public final void setUrl(@NotNull String str) {
        this.f108621c = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.f108619a;
        String str = this.f108620b;
        String str2 = this.f108621c;
        List<Integer> list = this.f108622d;
        int i8 = this.f108623e;
        Bundle bundle = this.f108625g;
        StringBuilder sbB = a.b(i7, "BcutRequest(type=", ", id='", str, "', url='");
        f.a(str2, "', resourceType=", ", bizType = ", sbB, list);
        sbB.append(i8);
        sbB.append(", extra=");
        sbB.append(bundle);
        sbB.append(")");
        return sbB.toString();
    }
}
