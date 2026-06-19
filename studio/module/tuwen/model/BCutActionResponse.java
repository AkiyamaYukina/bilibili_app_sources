package com.bilibili.studio.module.tuwen.model;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutActionResponse.class */
public final class BCutActionResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public BCutActionResponseData f108609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108610c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108611d = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutActionResponse$BCutActionResponseData.class */
    public static final class BCutActionResponseData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f108613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f108614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Bundle f108615d;

        public BCutActionResponseData(int i7, @Nullable String str, long j7, @Nullable Bundle bundle) {
            this.f108612a = i7;
            this.f108613b = str;
            this.f108614c = j7;
            this.f108615d = bundle;
        }

        public final int getActionType() {
            return this.f108612a;
        }

        public final long getDuration() {
            return this.f108614c;
        }

        @Nullable
        public final Bundle getExtra() {
            return this.f108615d;
        }

        @Nullable
        public final String getFilePath() {
            return this.f108613b;
        }

        public final void setActionType(int i7) {
            this.f108612a = i7;
        }

        public final void setDuration(long j7) {
            this.f108614c = j7;
        }

        public final void setExtra(@Nullable Bundle bundle) {
            this.f108615d = bundle;
        }

        public final void setFilePath(@Nullable String str) {
            this.f108613b = str;
        }
    }

    public BCutActionResponse(boolean z6, @NotNull BCutActionResponseData bCutActionResponseData) {
        this.f108608a = z6;
        this.f108609b = bCutActionResponseData;
    }

    @NotNull
    public final BCutActionResponseData getData() {
        return this.f108609b;
    }

    public final int getRequestCode() {
        return this.f108610c;
    }

    public final int getResultCode() {
        return this.f108611d;
    }

    public final boolean getSuccess() {
        return this.f108608a;
    }

    public final void setData(@NotNull BCutActionResponseData bCutActionResponseData) {
        this.f108609b = bCutActionResponseData;
    }

    public final void setRequestCode(int i7) {
        this.f108610c = i7;
    }

    public final void setResultCode(int i7) {
        this.f108611d = i7;
    }

    public final void setSuccess(boolean z6) {
        this.f108608a = z6;
    }
}
