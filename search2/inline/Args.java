package com.bilibili.search2.inline;

import G0.d;
import J1.z;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import bilibili.live.app.service.resolver.a;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/inline/Args.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Args {
    public static final int $stable = 8;

    @JSONField(name = "online")
    private int online;

    @JSONField(name = "rid")
    private long rid;

    @JSONField(name = "rname")
    @Nullable
    private String rname;

    @JSONField(name = "room_id")
    private long roomId;

    @JSONField(name = "tid")
    private long tid;

    @JSONField(name = "tname")
    @Nullable
    private String tname;

    @JSONField(name = "up_id")
    private long upId;

    @JSONField(name = "up_name")
    @Nullable
    private String upName;

    public Args() {
        this(0, null, 0L, null, 0L, null, 0L, 0L, 255, null);
    }

    public Args(int i7, @Nullable String str, long j7, @Nullable String str2, long j8, @Nullable String str3, long j9, long j10) {
        this.online = i7;
        this.rname = str;
        this.roomId = j7;
        this.tname = str2;
        this.upId = j8;
        this.upName = str3;
        this.rid = j9;
        this.tid = j10;
    }

    public /* synthetic */ Args(int i7, String str, long j7, String str2, long j8, String str3, long j9, long j10, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 0L : j7, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? 0L : j8, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? 0L : j9, (i8 & 128) != 0 ? 0L : j10);
    }

    public Args(@NotNull com.bapis.bilibili.polymer.app.search.v1.Args args) {
        this(args.getOnline(), args.getRname(), args.getRoomId(), args.getTname(), args.getUpId(), args.getUpName(), args.getRid(), args.getTid());
    }

    public static /* synthetic */ Args copy$default(Args args, int i7, String str, long j7, String str2, long j8, String str3, long j9, long j10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = args.online;
        }
        if ((i8 & 2) != 0) {
            str = args.rname;
        }
        if ((i8 & 4) != 0) {
            j7 = args.roomId;
        }
        if ((i8 & 8) != 0) {
            str2 = args.tname;
        }
        if ((i8 & 16) != 0) {
            j8 = args.upId;
        }
        if ((i8 & 32) != 0) {
            str3 = args.upName;
        }
        if ((i8 & 64) != 0) {
            j9 = args.rid;
        }
        if ((i8 & 128) != 0) {
            j10 = args.tid;
        }
        return args.copy(i7, str, j7, str2, j8, str3, j9, j10);
    }

    public final int component1() {
        return this.online;
    }

    @Nullable
    public final String component2() {
        return this.rname;
    }

    public final long component3() {
        return this.roomId;
    }

    @Nullable
    public final String component4() {
        return this.tname;
    }

    public final long component5() {
        return this.upId;
    }

    @Nullable
    public final String component6() {
        return this.upName;
    }

    public final long component7() {
        return this.rid;
    }

    public final long component8() {
        return this.tid;
    }

    @NotNull
    public final Args copy(int i7, @Nullable String str, long j7, @Nullable String str2, long j8, @Nullable String str3, long j9, long j10) {
        return new Args(i7, str, j7, str2, j8, str3, j9, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Args)) {
            return false;
        }
        Args args = (Args) obj;
        return this.online == args.online && Intrinsics.areEqual(this.rname, args.rname) && this.roomId == args.roomId && Intrinsics.areEqual(this.tname, args.tname) && this.upId == args.upId && Intrinsics.areEqual(this.upName, args.upName) && this.rid == args.rid && this.tid == args.tid;
    }

    public final int getOnline() {
        return this.online;
    }

    public final long getRid() {
        return this.rid;
    }

    @Nullable
    public final String getRname() {
        return this.rname;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getTid() {
        return this.tid;
    }

    @Nullable
    public final String getTname() {
        return this.tname;
    }

    public final long getUpId() {
        return this.upId;
    }

    @Nullable
    public final String getUpName() {
        return this.upName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.online);
        String str = this.rname;
        int iA = C3554n0.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.roomId);
        String str2 = this.tname;
        int iA2 = C3554n0.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.upId);
        String str3 = this.upName;
        return Long.hashCode(this.tid) + C3554n0.a((iA2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.rid);
    }

    public final void setOnline(int i7) {
        this.online = i7;
    }

    public final void setRid(long j7) {
        this.rid = j7;
    }

    public final void setRname(@Nullable String str) {
        this.rname = str;
    }

    public final void setRoomId(long j7) {
        this.roomId = j7;
    }

    public final void setTid(long j7) {
        this.tid = j7;
    }

    public final void setTname(@Nullable String str) {
        this.tname = str;
    }

    public final void setUpId(long j7) {
        this.upId = j7;
    }

    public final void setUpName(@Nullable String str) {
        this.upName = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.online;
        String str = this.rname;
        long j7 = this.roomId;
        String str2 = this.tname;
        long j8 = this.upId;
        String str3 = this.upName;
        long j9 = this.rid;
        long j10 = this.tid;
        StringBuilder sbB = a.b(i7, "Args(online=", ", rname=", str, ", roomId=");
        d.a(j7, ", tname=", str2, sbB);
        z.a(j8, ", upId=", ", upName=", sbB);
        v.a(j9, str3, ", rid=", sbB);
        return androidx.exifinterface.media.a.a(j10, ", tid=", ")", sbB);
    }
}
