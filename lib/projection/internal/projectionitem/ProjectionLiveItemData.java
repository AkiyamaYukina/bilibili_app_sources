package com.bilibili.lib.projection.internal.projectionitem;

import B0.b;
import H0.e;
import I1.C2157f0;
import J1.z;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.C4690e;
import androidx.paging.M;
import androidx.room.B;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionLiveItemData.class */
public final class ProjectionLiveItemData implements StandardProjectionItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f63495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f63499g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f63500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f63501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f63502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f63503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f63504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f63505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f63506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f63507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f63508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f63509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f63510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final String f63511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f63512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f63513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final String f63514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final CastContentType f63515x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionLiveItemData$a.class */
    public static final class a implements Parcelable.Creator<ProjectionItemData> {
        @Override // android.os.Parcelable.Creator
        public final ProjectionItemData createFromParcel(Parcel parcel) {
            return new ProjectionItemData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProjectionItemData[] newArray(int i7) {
            return new ProjectionItemData[i7];
        }
    }

    public ProjectionLiveItemData(int i7, long j7, @NotNull String str, long j8, long j9, long j10, long j11, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, int i8, int i9, long j12, long j13, int i10, int i11, int i12, @Nullable String str6, @Nullable String str7, int i13, int i14, @Nullable String str8, @NotNull CastContentType castContentType) {
        this.f63493a = i7;
        this.f63494b = j7;
        this.f63495c = str;
        this.f63496d = j8;
        this.f63497e = j9;
        this.f63498f = j10;
        this.f63499g = j11;
        this.h = str2;
        this.f63500i = str3;
        this.f63501j = str4;
        this.f63502k = str5;
        this.f63503l = i8;
        this.f63504m = i9;
        this.f63505n = j12;
        this.f63506o = j13;
        this.f63507p = i10;
        this.f63508q = i11;
        this.f63509r = i12;
        this.f63510s = str6;
        this.f63511t = str7;
        this.f63512u = i13;
        this.f63513v = i14;
        this.f63514w = str8;
        this.f63515x = castContentType;
    }

    public static /* synthetic */ ProjectionLiveItemData copy$default(ProjectionLiveItemData projectionLiveItemData, int i7, long j7, String str, long j8, long j9, long j10, long j11, String str2, String str3, String str4, String str5, int i8, int i9, long j12, long j13, int i10, int i11, int i12, String str6, String str7, int i13, int i14, String str8, CastContentType castContentType, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i7 = projectionLiveItemData.f63493a;
        }
        if ((i15 & 2) != 0) {
            j7 = projectionLiveItemData.f63494b;
        }
        if ((i15 & 4) != 0) {
            str = projectionLiveItemData.f63495c;
        }
        if ((i15 & 8) != 0) {
            j8 = projectionLiveItemData.f63496d;
        }
        if ((i15 & 16) != 0) {
            j9 = projectionLiveItemData.f63497e;
        }
        if ((i15 & 32) != 0) {
            j10 = projectionLiveItemData.f63498f;
        }
        if ((i15 & 64) != 0) {
            j11 = projectionLiveItemData.f63499g;
        }
        if ((i15 & 128) != 0) {
            str2 = projectionLiveItemData.h;
        }
        if ((i15 & 256) != 0) {
            str3 = projectionLiveItemData.f63500i;
        }
        if ((i15 & 512) != 0) {
            str4 = projectionLiveItemData.f63501j;
        }
        if ((i15 & 1024) != 0) {
            str5 = projectionLiveItemData.f63502k;
        }
        if ((i15 & 2048) != 0) {
            i8 = projectionLiveItemData.f63503l;
        }
        if ((i15 & 4096) != 0) {
            i9 = projectionLiveItemData.f63504m;
        }
        if ((i15 & 8192) != 0) {
            j12 = projectionLiveItemData.f63505n;
        }
        if ((i15 & 16384) != 0) {
            j13 = projectionLiveItemData.f63506o;
        }
        if ((i15 & 32768) != 0) {
            i10 = projectionLiveItemData.f63507p;
        }
        if ((65536 & i15) != 0) {
            i11 = projectionLiveItemData.f63508q;
        }
        if ((i15 & 131072) != 0) {
            i12 = projectionLiveItemData.f63509r;
        }
        if ((i15 & 262144) != 0) {
            str6 = projectionLiveItemData.f63510s;
        }
        if ((i15 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            str7 = projectionLiveItemData.f63511t;
        }
        if ((i15 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            i13 = projectionLiveItemData.f63512u;
        }
        if ((i15 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            i14 = projectionLiveItemData.f63513v;
        }
        if ((i15 & 4194304) != 0) {
            str8 = projectionLiveItemData.f63514w;
        }
        if ((i15 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            castContentType = projectionLiveItemData.f63515x;
        }
        return projectionLiveItemData.copy(i7, j7, str, j8, j9, j10, j11, str2, str3, str4, str5, i8, i9, j12, j13, i10, i11, i12, str6, str7, i13, i14, str8, castContentType);
    }

    public final int component1() {
        return this.f63493a;
    }

    @NotNull
    public final String component10() {
        return this.f63501j;
    }

    @NotNull
    public final String component11() {
        return this.f63502k;
    }

    public final int component12() {
        return this.f63503l;
    }

    public final int component13() {
        return this.f63504m;
    }

    public final long component14() {
        return this.f63505n;
    }

    public final long component15() {
        return this.f63506o;
    }

    public final int component16() {
        return this.f63507p;
    }

    public final int component17() {
        return this.f63508q;
    }

    public final int component18() {
        return this.f63509r;
    }

    @Nullable
    public final String component19() {
        return this.f63510s;
    }

    public final long component2() {
        return this.f63494b;
    }

    @Nullable
    public final String component20() {
        return this.f63511t;
    }

    public final int component21() {
        return this.f63512u;
    }

    public final int component22() {
        return this.f63513v;
    }

    @Nullable
    public final String component23() {
        return this.f63514w;
    }

    @NotNull
    public final CastContentType component24() {
        return this.f63515x;
    }

    @NotNull
    public final String component3() {
        return this.f63495c;
    }

    public final long component4() {
        return this.f63496d;
    }

    public final long component5() {
        return this.f63497e;
    }

    public final long component6() {
        return this.f63498f;
    }

    public final long component7() {
        return this.f63499g;
    }

    @Nullable
    public final String component8() {
        return this.h;
    }

    @Nullable
    public final String component9() {
        return this.f63500i;
    }

    @NotNull
    public final ProjectionLiveItemData copy(int i7, long j7, @NotNull String str, long j8, long j9, long j10, long j11, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, int i8, int i9, long j12, long j13, int i10, int i11, int i12, @Nullable String str6, @Nullable String str7, int i13, int i14, @Nullable String str8, @NotNull CastContentType castContentType) {
        return new ProjectionLiveItemData(i7, j7, str, j8, j9, j10, j11, str2, str3, str4, str5, i8, i9, j12, j13, i10, i11, i12, str6, str7, i13, i14, str8, castContentType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof StandardProjectionItem) && ((StandardProjectionItem) obj).getCid() == getCid();
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public int getAutoNext() {
        return this.f63503l;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getAvid() {
        return this.f63494b;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getBiz_id() {
        return this.f63505n;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public String getBvid() {
        return this.f63495c;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public CastContentType getCastContentType() {
        return this.f63515x;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getCid() {
        return this.f63496d;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem
    public int getClientType() {
        return this.f63493a;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public int getDesc() {
        return this.f63507p;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getEpid() {
        return this.f63497e;
    }

    @Nullable
    public final String getExtraJson() {
        return this.f63514w;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public String getFromSpmid() {
        return this.h;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public String getJumpUri() {
        return this.f63502k;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getOid() {
        return this.f63506o;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public int getOtype() {
        return this.f63509r;
    }

    @Nullable
    public final String getRoomId() {
        return this.f63511t;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public String getSpmid() {
        return this.f63500i;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getSsid() {
        return this.f63498f;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public String getStartKey() {
        return this.f63510s;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public String getTitle() {
        return this.f63501j;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public int getType() {
        return this.f63504m;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public long getUpmid() {
        return this.f63499g;
    }

    public int getWith_current() {
        return this.f63508q;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public /* bridge */ /* synthetic */ boolean isAutoNext() {
        return super.isAutoNext();
    }

    public final int isSupportDolby() {
        return this.f63513v;
    }

    public final int isSupportH265() {
        return this.f63512u;
    }

    @NotNull
    public String toString() {
        int i7 = this.f63493a;
        long j7 = this.f63494b;
        String str = this.f63495c;
        long j8 = this.f63496d;
        long j9 = this.f63497e;
        long j10 = this.f63498f;
        long j11 = this.f63499g;
        String str2 = this.h;
        String str3 = this.f63500i;
        String str4 = this.f63501j;
        String str5 = this.f63502k;
        int i8 = this.f63503l;
        int i9 = this.f63504m;
        long j12 = this.f63505n;
        long j13 = this.f63506o;
        int i10 = this.f63507p;
        int i11 = this.f63508q;
        int i12 = this.f63509r;
        String str6 = this.f63510s;
        String str7 = this.f63511t;
        int i13 = this.f63512u;
        int i14 = this.f63513v;
        String str8 = this.f63514w;
        CastContentType castContentType = this.f63515x;
        StringBuilder sbA = C2157f0.a(i7, j7, "ProjectionLiveItemData(clientType=", ", avid=");
        b.b(", bvid=", str, ", cid=", sbA);
        sbA.append(j8);
        z.a(j9, ", epid=", ", ssid=", sbA);
        sbA.append(j10);
        z.a(j11, ", upmid=", ", fromSpmid=", sbA);
        B.a(str2, ", spmid=", str3, ", title=", sbA);
        B.a(str4, ", jumpUri=", str5, ", autoNext=", sbA);
        C4690e.a(i8, i9, ", type=", ", biz_id=", sbA);
        sbA.append(j12);
        z.a(j13, ", oid=", ", desc=", sbA);
        C4690e.a(i10, i11, ", with_current=", ", otype=", sbA);
        M.a(i12, ", startKey=", str6, ", roomId=", sbA);
        e.b(i13, str7, ", isSupportH265=", ", isSupportDolby=", sbA);
        M.a(i14, ", extraJson=", str8, ", castContentType=", sbA);
        sbA.append(castContentType);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(getClientType());
        parcel.writeLong(getAvid());
        parcel.writeString(getBvid());
        parcel.writeLong(getCid());
        parcel.writeLong(getEpid());
        parcel.writeLong(getSsid());
        parcel.writeLong(getUpmid());
        parcel.writeString(getFromSpmid());
        parcel.writeString(getSpmid());
        parcel.writeString(getTitle());
        parcel.writeString(getJumpUri());
        parcel.writeInt(getAutoNext());
        parcel.writeInt(getType());
        parcel.writeLong(getBiz_id());
        parcel.writeLong(getOid());
        parcel.writeInt(getDesc());
        parcel.writeInt(getWith_current());
        parcel.writeString(this.f63511t);
        parcel.writeInt(this.f63512u);
        parcel.writeInt(this.f63513v);
        parcel.writeString(this.f63514w);
        parcel.writeString(getCastContentType().getRawValue());
    }
}
