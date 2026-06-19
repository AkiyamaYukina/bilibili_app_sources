package com.bilibili.pegasus.channelv3.feed.item;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/item/ChannelDetailCardUserInfo.class */
@StabilityInferred(parameters = 1)
@Keep
public final class ChannelDetailCardUserInfo {
    public static final int $stable = 0;
    private final long mid;

    @Nullable
    private final String userFace;

    @Nullable
    private final String userName;

    @Nullable
    private final String userUrl;

    public ChannelDetailCardUserInfo() {
        this(null, null, null, 0L, 15, null);
    }

    public ChannelDetailCardUserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j7) {
        this.userName = str;
        this.userFace = str2;
        this.userUrl = str3;
        this.mid = j7;
    }

    public /* synthetic */ ChannelDetailCardUserInfo(String str, String str2, String str3, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? 0L : j7);
    }

    public static /* synthetic */ ChannelDetailCardUserInfo copy$default(ChannelDetailCardUserInfo channelDetailCardUserInfo, String str, String str2, String str3, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelDetailCardUserInfo.userName;
        }
        if ((i7 & 2) != 0) {
            str2 = channelDetailCardUserInfo.userFace;
        }
        if ((i7 & 4) != 0) {
            str3 = channelDetailCardUserInfo.userUrl;
        }
        if ((i7 & 8) != 0) {
            j7 = channelDetailCardUserInfo.mid;
        }
        return channelDetailCardUserInfo.copy(str, str2, str3, j7);
    }

    @Nullable
    public final String component1() {
        return this.userName;
    }

    @Nullable
    public final String component2() {
        return this.userFace;
    }

    @Nullable
    public final String component3() {
        return this.userUrl;
    }

    public final long component4() {
        return this.mid;
    }

    @NotNull
    public final ChannelDetailCardUserInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, long j7) {
        return new ChannelDetailCardUserInfo(str, str2, str3, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelDetailCardUserInfo)) {
            return false;
        }
        ChannelDetailCardUserInfo channelDetailCardUserInfo = (ChannelDetailCardUserInfo) obj;
        return Intrinsics.areEqual(this.userName, channelDetailCardUserInfo.userName) && Intrinsics.areEqual(this.userFace, channelDetailCardUserInfo.userFace) && Intrinsics.areEqual(this.userUrl, channelDetailCardUserInfo.userUrl) && this.mid == channelDetailCardUserInfo.mid;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getUserFace() {
        return this.userFace;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getUserUrl() {
        return this.userUrl;
    }

    public int hashCode() {
        String str = this.userName;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.userFace;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.userUrl;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Long.hashCode(this.mid) + (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.userName;
        String str2 = this.userFace;
        String str3 = this.userUrl;
        long j7 = this.mid;
        StringBuilder sbA = b.a("ChannelDetailCardUserInfo(userName=", str, ", userFace=", str2, ", userUrl=");
        v.a(j7, str3, ", mid=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
