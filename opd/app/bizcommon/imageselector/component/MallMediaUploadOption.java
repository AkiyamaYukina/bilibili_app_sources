package com.bilibili.opd.app.bizcommon.imageselector.component;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/component/MallMediaUploadOption.class */
@StabilityInferred(parameters = 0)
public final class MallMediaUploadOption {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String DOMAIN_UP_TYPE_DYNAMIC = "dynamic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ArrayList<BaseMedia> f73729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f73730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f73731g;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f73725a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f73726b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f73727c = "mall";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f73728d = MallMediaParams.VIDEO_PROFILE_DEF;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f73732i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f73733j = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/component/MallMediaUploadOption$a.class */
    public static final class a {
    }

    @Nullable
    public final String getBiz() {
        return this.f73731g;
    }

    @NotNull
    public final String getBossKey() {
        return this.f73733j;
    }

    @NotNull
    public final String getBossUploadUrl() {
        return this.f73732i;
    }

    @NotNull
    public final String getDomain() {
        return this.f73726b;
    }

    @NotNull
    public final String getDomainUpType() {
        return this.f73727c;
    }

    @Nullable
    public final ArrayList<BaseMedia> getMedias() {
        return this.f73729e;
    }

    public final boolean getOriginal() {
        return this.f73730f;
    }

    @NotNull
    public final String getSceneType() {
        return this.f73725a;
    }

    @NotNull
    public final String getVideoProfile() {
        return this.f73728d;
    }

    public final boolean isDynamic() {
        return Intrinsics.areEqual(this.f73727c, "dynamic");
    }

    public final boolean isSync() {
        return this.h;
    }

    public final void setBiz(@Nullable String str) {
        this.f73731g = str;
    }

    public final void setBossKey(@NotNull String str) {
        this.f73733j = str;
    }

    public final void setBossUploadUrl(@NotNull String str) {
        this.f73732i = str;
    }

    public final void setDomain(@NotNull String str) {
        this.f73726b = str;
    }

    public final void setDomainUpType(@NotNull String str) {
        this.f73727c = str;
    }

    public final void setMedias(@Nullable ArrayList<BaseMedia> arrayList) {
        this.f73729e = arrayList;
    }

    public final void setOriginal(boolean z6) {
        this.f73730f = z6;
    }

    public final void setSceneType(@NotNull String str) {
        this.f73725a = str;
    }

    public final void setSync(boolean z6) {
        this.h = z6;
    }

    public final void setVideoProfile(@NotNull String str) {
        this.f73728d = str;
    }
}
