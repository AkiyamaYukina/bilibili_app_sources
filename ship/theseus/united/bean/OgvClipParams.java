package com.bilibili.ship.theseus.united.bean;

import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/OgvClipParams.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvClipParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f98727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f98728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f98729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InlineScene f98730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InlineType f98731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f98732f;

    public OgvClipParams(long j7, long j8, long j9, InlineScene inlineScene, InlineType inlineType, long j10) {
        this.f98727a = j7;
        this.f98728b = j8;
        this.f98729c = j9;
        this.f98730d = inlineScene;
        this.f98731e = inlineType;
        this.f98732f = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvClipParams)) {
            return false;
        }
        OgvClipParams ogvClipParams = (OgvClipParams) obj;
        return Duration.equals-impl0(this.f98727a, ogvClipParams.f98727a) && Duration.equals-impl0(this.f98728b, ogvClipParams.f98728b) && Duration.equals-impl0(this.f98729c, ogvClipParams.f98729c) && this.f98730d == ogvClipParams.f98730d && this.f98731e == ogvClipParams.f98731e && this.f98732f == ogvClipParams.f98732f;
    }

    public final int hashCode() {
        int iA = l.a(l.a(Duration.hashCode-impl(this.f98727a) * 31, 31, this.f98728b), 31, this.f98729c);
        int iHashCode = this.f98730d.hashCode();
        return Long.hashCode(this.f98732f) + ((this.f98731e.hashCode() + ((iHashCode + iA) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f98727a);
        String str2 = Duration.toString-impl(this.f98728b);
        String str3 = Duration.toString-impl(this.f98729c);
        StringBuilder sbA = G0.b.a("OgvClipParams(offsetStartTime=", str, ", offsetEndTime=", str2, ", totalDuration=");
        sbA.append(str3);
        sbA.append(", inlineScene=");
        sbA.append(this.f98730d);
        sbA.append(", inlineVideoType=");
        sbA.append(this.f98731e);
        sbA.append(", clipId=");
        return android.support.v4.media.session.a.a(sbA, this.f98732f, ")");
    }
}
