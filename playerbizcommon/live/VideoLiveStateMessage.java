package com.bilibili.playerbizcommon.live;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.compose.ui.graphics.e0;
import androidx.media3.common.util.C4638g;
import cf.l;
import com.bilibili.bus.IInterProcData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/live/VideoLiveStateMessage.class */
public final class VideoLiveStateMessage implements IInterProcData {

    @NotNull
    public static final a CREATOR = new Object();
    public static final int FROM_H5 = 1;
    public static final int FROM_NATIVE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<Long> f80219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80220g;

    @NotNull
    public final String h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/live/VideoLiveStateMessage$a.class */
    public static final class a implements Parcelable.Creator<VideoLiveStateMessage> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveStateMessage createFromParcel(Parcel parcel) {
            return new VideoLiveStateMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveStateMessage[] newArray(int i7) {
            return new VideoLiveStateMessage[i7];
        }
    }

    public VideoLiveStateMessage(long j7, boolean z6) {
        this(j7, z6, true, true, 0, new ArrayList(), -1, "");
    }

    public VideoLiveStateMessage(long j7, boolean z6, boolean z7, boolean z8, int i7, @NotNull List<Long> list, int i8, @NotNull String str) {
        this.f80214a = j7;
        this.f80215b = z6;
        this.f80216c = z7;
        this.f80217d = z8;
        this.f80218e = i7;
        this.f80219f = list;
        this.f80220g = i8;
        this.h = str;
    }

    public /* synthetic */ VideoLiveStateMessage(long j7, boolean z6, boolean z7, boolean z8, int i7, List list, int i8, String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, z6, (i9 & 4) != 0 ? true : z7, (i9 & 8) != 0 ? true : z8, (i9 & 16) != 0 ? 0 : i7, (i9 & 32) != 0 ? new ArrayList() : list, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? "" : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoLiveStateMessage(@org.jetbrains.annotations.NotNull android.os.Parcel r12) {
        /*
            r11 = this;
            r0 = r12
            long r0 = r0.readLong()
            r18 = r0
            r0 = r12
            byte r0 = r0.readByte()
            if (r0 == 0) goto L13
            r0 = 1
            r15 = r0
            goto L16
        L13:
            r0 = 0
            r15 = r0
        L16:
            r0 = r12
            byte r0 = r0.readByte()
            if (r0 == 0) goto L23
            r0 = 1
            r16 = r0
            goto L26
        L23:
            r0 = 0
            r16 = r0
        L26:
            r0 = r12
            byte r0 = r0.readByte()
            if (r0 == 0) goto L33
            r0 = 1
            r17 = r0
            goto L36
        L33:
            r0 = 0
            r17 = r0
        L36:
            r0 = r12
            int r0 = r0.readInt()
            r13 = r0
            r0 = r12
            long[] r0 = r0.createLongArray()
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L5c
            r0 = r20
            java.util.List r0 = kotlin.collections.ArraysKt.toList(r0)
            r21 = r0
            r0 = r21
            r20 = r0
            r0 = r21
            if (r0 != 0) goto L59
            goto L5c
        L59:
            goto L64
        L5c:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r20 = r0
            goto L59
        L64:
            r0 = r12
            int r0 = r0.readInt()
            r14 = r0
            r0 = r12
            java.lang.String r0 = r0.readString()
            r21 = r0
            r0 = r21
            r12 = r0
            r0 = r21
            if (r0 != 0) goto L7a
            java.lang.String r0 = ""
            r12 = r0
        L7a:
            r0 = r11
            r1 = r18
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r13
            r6 = r20
            r7 = r14
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.live.VideoLiveStateMessage.<init>(android.os.Parcel):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoLiveStateMessage copy$default(VideoLiveStateMessage videoLiveStateMessage, long j7, boolean z6, boolean z7, boolean z8, int i7, List list, int i8, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j7 = videoLiveStateMessage.f80214a;
        }
        if ((i9 & 2) != 0) {
            z6 = videoLiveStateMessage.f80215b;
        }
        if ((i9 & 4) != 0) {
            z7 = videoLiveStateMessage.f80216c;
        }
        if ((i9 & 8) != 0) {
            z8 = videoLiveStateMessage.f80217d;
        }
        if ((i9 & 16) != 0) {
            i7 = videoLiveStateMessage.f80218e;
        }
        if ((i9 & 32) != 0) {
            list = videoLiveStateMessage.f80219f;
        }
        if ((i9 & 64) != 0) {
            i8 = videoLiveStateMessage.f80220g;
        }
        if ((i9 & 128) != 0) {
            str = videoLiveStateMessage.h;
        }
        return videoLiveStateMessage.copy(j7, z6, z7, z8, i7, list, i8, str);
    }

    public final long component1() {
        return this.f80214a;
    }

    public final boolean component2() {
        return this.f80215b;
    }

    public final boolean component3() {
        return this.f80216c;
    }

    public final boolean component4() {
        return this.f80217d;
    }

    public final int component5() {
        return this.f80218e;
    }

    @NotNull
    public final List<Long> component6() {
        return this.f80219f;
    }

    public final int component7() {
        return this.f80220g;
    }

    @NotNull
    public final String component8() {
        return this.h;
    }

    @NotNull
    public final VideoLiveStateMessage copy(long j7, boolean z6, boolean z7, boolean z8, int i7, @NotNull List<Long> list, int i8, @NotNull String str) {
        return new VideoLiveStateMessage(j7, z6, z7, z8, i7, list, i8, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveStateMessage)) {
            return false;
        }
        VideoLiveStateMessage videoLiveStateMessage = (VideoLiveStateMessage) obj;
        return this.f80214a == videoLiveStateMessage.f80214a && this.f80215b == videoLiveStateMessage.f80215b && this.f80216c == videoLiveStateMessage.f80216c && this.f80217d == videoLiveStateMessage.f80217d && this.f80218e == videoLiveStateMessage.f80218e && Intrinsics.areEqual(this.f80219f, videoLiveStateMessage.f80219f) && this.f80220g == videoLiveStateMessage.f80220g && Intrinsics.areEqual(this.h, videoLiveStateMessage.h);
    }

    public final int getCode() {
        return this.f80220g;
    }

    public final int getFrom() {
        return this.f80218e;
    }

    @NotNull
    public final String getMsg() {
        return this.h;
    }

    public final long getSid() {
        return this.f80214a;
    }

    @NotNull
    public final List<Long> getSids() {
        return this.f80219f;
    }

    public int hashCode() {
        return this.h.hashCode() + I.a(this.f80220g, e0.a(I.a(this.f80218e, z.a(z.a(z.a(Long.hashCode(this.f80214a) * 31, 31, this.f80215b), 31, this.f80216c), 31, this.f80217d), 31), 31, this.f80219f), 31);
    }

    public final boolean isFromNative() {
        return this.f80218e == 0;
    }

    public final boolean isManual() {
        return this.f80216c;
    }

    public final boolean isReserved() {
        return this.f80215b;
    }

    public final boolean isSuccess() {
        return this.f80217d;
    }

    @NotNull
    public String toString() {
        long j7 = this.f80214a;
        boolean z6 = this.f80215b;
        boolean z7 = this.f80216c;
        boolean z8 = this.f80217d;
        int i7 = this.f80218e;
        List<Long> list = this.f80219f;
        int i8 = this.f80220g;
        String str = this.h;
        StringBuilder sbB = A.b(j7, "VideoLiveStateMessage(sid=", ", isReserved=", z6);
        C4638g.b(", isManual=", ", isSuccess=", sbB, z7, z8);
        sbB.append(", from=");
        sbB.append(i7);
        sbB.append(", sids=");
        sbB.append(list);
        l.a(i8, ", code=", ", msg=", str, sbB);
        sbB.append(")");
        return sbB.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f80214a);
        parcel.writeByte(this.f80215b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f80216c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f80217d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f80218e);
        parcel.writeList(this.f80219f);
        parcel.writeInt(this.f80220g);
        parcel.writeString(this.h);
    }
}
