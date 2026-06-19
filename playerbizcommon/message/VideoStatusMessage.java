package com.bilibili.playerbizcommon.message;

import android.support.v4.media.session.a;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import com.bilibili.bus.IIdentifiedData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/message/VideoStatusMessage.class */
public final class VideoStatusMessage implements IIdentifiedData<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f80225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f80226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f80227g;
    public final long h;

    public VideoStatusMessage(long j7, boolean z6, boolean z7, boolean z8, long j8, long j9, long j10, long j11) {
        this.f80221a = j7;
        this.f80222b = z6;
        this.f80223c = z7;
        this.f80224d = z8;
        this.f80225e = j8;
        this.f80226f = j9;
        this.f80227g = j10;
        this.h = j11;
    }

    public /* synthetic */ VideoStatusMessage(long j7, boolean z6, boolean z7, boolean z8, long j8, long j9, long j10, long j11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, z6, z7, z8, (i7 & 16) != 0 ? -233L : j8, (i7 & 32) != 0 ? -233L : j9, (i7 & 64) != 0 ? -233L : j10, (i7 & 128) != 0 ? -233L : j11);
    }

    public static /* synthetic */ VideoStatusMessage copy$default(VideoStatusMessage videoStatusMessage, long j7, boolean z6, boolean z7, boolean z8, long j8, long j9, long j10, long j11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = videoStatusMessage.f80221a;
        }
        if ((i7 & 2) != 0) {
            z6 = videoStatusMessage.f80222b;
        }
        if ((i7 & 4) != 0) {
            z7 = videoStatusMessage.f80223c;
        }
        if ((i7 & 8) != 0) {
            z8 = videoStatusMessage.f80224d;
        }
        if ((i7 & 16) != 0) {
            j8 = videoStatusMessage.f80225e;
        }
        if ((i7 & 32) != 0) {
            j9 = videoStatusMessage.f80226f;
        }
        if ((i7 & 64) != 0) {
            j10 = videoStatusMessage.f80227g;
        }
        if ((i7 & 128) != 0) {
            j11 = videoStatusMessage.h;
        }
        return videoStatusMessage.copy(j7, z6, z7, z8, j8, j9, j10, j11);
    }

    public final long component1() {
        return this.f80221a;
    }

    public final boolean component2() {
        return this.f80222b;
    }

    public final boolean component3() {
        return this.f80223c;
    }

    public final boolean component4() {
        return this.f80224d;
    }

    public final long component5() {
        return this.f80225e;
    }

    public final long component6() {
        return this.f80226f;
    }

    public final long component7() {
        return this.f80227g;
    }

    public final long component8() {
        return this.h;
    }

    @NotNull
    public final VideoStatusMessage copy(long j7, boolean z6, boolean z7, boolean z8, long j8, long j9, long j10, long j11) {
        return new VideoStatusMessage(j7, z6, z7, z8, j8, j9, j10, j11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStatusMessage)) {
            return false;
        }
        VideoStatusMessage videoStatusMessage = (VideoStatusMessage) obj;
        return this.f80221a == videoStatusMessage.f80221a && this.f80222b == videoStatusMessage.f80222b && this.f80223c == videoStatusMessage.f80223c && this.f80224d == videoStatusMessage.f80224d && this.f80225e == videoStatusMessage.f80225e && this.f80226f == videoStatusMessage.f80226f && this.f80227g == videoStatusMessage.f80227g && this.h == videoStatusMessage.h;
    }

    public final long getAid() {
        return this.f80221a;
    }

    public final long getCoinCount() {
        return this.f80225e;
    }

    public final boolean getCoinState() {
        return this.f80222b;
    }

    public final long getCommentCount() {
        return this.h;
    }

    public final long getFavCount() {
        return this.f80227g;
    }

    public final boolean getFavState() {
        return this.f80224d;
    }

    @NotNull
    /* JADX INFO: renamed from: getId, reason: merged with bridge method [inline-methods] */
    public Long m8297getId() {
        return Long.valueOf(this.f80221a);
    }

    public final long getLikeCount() {
        return this.f80226f;
    }

    public final boolean getLikeState() {
        return this.f80223c;
    }

    public int hashCode() {
        return Long.hashCode(this.h) + C3554n0.a(C3554n0.a(C3554n0.a(z.a(z.a(z.a(Long.hashCode(this.f80221a) * 31, 31, this.f80222b), 31, this.f80223c), 31, this.f80224d), 31, this.f80225e), 31, this.f80226f), 31, this.f80227g);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoStatusMessage(aid=");
        sb.append(this.f80221a);
        sb.append(", coinState=");
        sb.append(this.f80222b);
        sb.append(", likeState=");
        sb.append(this.f80223c);
        sb.append(", favState=");
        sb.append(this.f80224d);
        sb.append(", coinCount=");
        sb.append(this.f80225e);
        sb.append(", likeCount=");
        sb.append(this.f80226f);
        sb.append(", favCount=");
        sb.append(this.f80227g);
        sb.append(", commentCount=");
        return a.a(sb, this.h, ")");
    }
}
