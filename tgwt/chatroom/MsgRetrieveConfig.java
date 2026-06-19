package com.bilibili.tgwt.chatroom;

import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/MsgRetrieveConfig.class */
@StabilityInferred(parameters = 1)
@Bson
public final class MsgRetrieveConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f110963f;

    public MsgRetrieveConfig() {
        this(false, 0L, 0, 0L, 0, 0L, 63);
    }

    public MsgRetrieveConfig(boolean z6, long j7, int i7, long j8, int i8, long j9, int i9) {
        z6 = (i9 & 1) != 0 ? true : z6;
        j7 = (i9 & 2) != 0 ? 10L : j7;
        i7 = (i9 & 4) != 0 ? 3 : i7;
        j8 = (i9 & 8) != 0 ? 3L : j8;
        i8 = (i9 & 16) != 0 ? 100 : i8;
        j9 = (i9 & 32) != 0 ? 1L : j9;
        this.f110958a = z6;
        this.f110959b = j7;
        this.f110960c = i7;
        this.f110961d = j8;
        this.f110962e = i8;
        this.f110963f = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgRetrieveConfig)) {
            return false;
        }
        MsgRetrieveConfig msgRetrieveConfig = (MsgRetrieveConfig) obj;
        return this.f110958a == msgRetrieveConfig.f110958a && this.f110959b == msgRetrieveConfig.f110959b && this.f110960c == msgRetrieveConfig.f110960c && this.f110961d == msgRetrieveConfig.f110961d && this.f110962e == msgRetrieveConfig.f110962e && this.f110963f == msgRetrieveConfig.f110963f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f110963f) + I.a(this.f110962e, C3554n0.a(I.a(this.f110960c, C3554n0.a(Boolean.hashCode(this.f110958a) * 31, 31, this.f110959b), 31), 31, this.f110961d), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgRetrieveConfig(enabled=");
        sb.append(this.f110958a);
        sb.append(", delay=");
        sb.append(this.f110959b);
        sb.append(", maxRetryTimes=");
        sb.append(this.f110960c);
        sb.append(", retryDelay=");
        sb.append(this.f110961d);
        sb.append(", pageSize=");
        sb.append(this.f110962e);
        sb.append(", interval=");
        return android.support.v4.media.session.a.a(sb, this.f110963f, ")");
    }
}
