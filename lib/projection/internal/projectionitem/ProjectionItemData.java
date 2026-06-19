package com.bilibili.lib.projection.internal.projectionitem;

import B0.b;
import I1.C2157f0;
import J1.z;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.C4690e;
import androidx.paging.M;
import androidx.room.B;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionItemData.class */
public final class ProjectionItemData implements StandardProjectionItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f63476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f63480g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f63481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f63482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f63483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f63484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f63485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f63486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f63487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f63488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f63489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f63490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f63491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final CastContentType f63492t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/ProjectionItemData$a.class */
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

    public ProjectionItemData(int i7, long j7, @NotNull String str, long j8, long j9, long j10, long j11, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, int i8, int i9, long j12, long j13, int i10, int i11, int i12, @Nullable String str6, @NotNull CastContentType castContentType) {
        this.f63474a = i7;
        this.f63475b = j7;
        this.f63476c = str;
        this.f63477d = j8;
        this.f63478e = j9;
        this.f63479f = j10;
        this.f63480g = j11;
        this.h = str2;
        this.f63481i = str3;
        this.f63482j = str4;
        this.f63483k = str5;
        this.f63484l = i8;
        this.f63485m = i9;
        this.f63486n = j12;
        this.f63487o = j13;
        this.f63488p = i10;
        this.f63489q = i11;
        this.f63490r = i12;
        this.f63491s = str6;
        this.f63492t = castContentType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProjectionItemData(@NotNull Parcel parcel) {
        Object obj;
        int i7 = parcel.readInt();
        long j7 = parcel.readLong();
        String string = parcel.readString();
        long j8 = parcel.readLong();
        long j9 = parcel.readLong();
        long j10 = parcel.readLong();
        long j11 = parcel.readLong();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        int i8 = parcel.readInt();
        int i9 = parcel.readInt();
        long j12 = parcel.readLong();
        long j13 = parcel.readLong();
        int i10 = parcel.readInt();
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        String string6 = parcel.readString();
        CastContentType.a aVar = CastContentType.Companion;
        String string7 = parcel.readString();
        aVar.getClass();
        Iterator it = CastContentType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CastContentType) next).getRawValue(), string7)) {
                obj = next;
                break;
            }
        }
        CastContentType castContentType = (CastContentType) obj;
        this(i7, j7, string, j8, j9, j10, j11, string2, string3, string4, string5, i8, i9, j12, j13, i10, i11, i12, string6, castContentType == null ? CastContentType.CastContentTypeUnknown : castContentType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof StandardProjectionItem) && ((StandardProjectionItem) obj).getCid() == this.f63477d;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final int getAutoNext() {
        return this.f63484l;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getAvid() {
        return this.f63475b;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getBiz_id() {
        return this.f63486n;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public final String getBvid() {
        return this.f63476c;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public final CastContentType getCastContentType() {
        return this.f63492t;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getCid() {
        return this.f63477d;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem
    public final int getClientType() {
        return this.f63474a;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final int getDesc() {
        return this.f63488p;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getEpid() {
        return this.f63478e;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public final String getFromSpmid() {
        return this.h;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public final String getJumpUri() {
        return this.f63483k;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getOid() {
        return this.f63487o;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final int getOtype() {
        return this.f63490r;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public final String getSpmid() {
        return this.f63481i;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getSsid() {
        return this.f63479f;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @Nullable
    public final String getStartKey() {
        return this.f63491s;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    @NotNull
    public final String getTitle() {
        return this.f63482j;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final int getType() {
        return this.f63485m;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
    public final long getUpmid() {
        return this.f63480g;
    }

    @NotNull
    public final String toString() {
        int i7 = this.f63474a;
        long j7 = this.f63475b;
        String str = this.f63476c;
        long j8 = this.f63477d;
        long j9 = this.f63478e;
        long j10 = this.f63479f;
        long j11 = this.f63480g;
        String str2 = this.h;
        String str3 = this.f63481i;
        String str4 = this.f63482j;
        String str5 = this.f63483k;
        int i8 = this.f63484l;
        int i9 = this.f63485m;
        long j12 = this.f63486n;
        long j13 = this.f63487o;
        int i10 = this.f63488p;
        int i11 = this.f63489q;
        int i12 = this.f63490r;
        String str6 = this.f63491s;
        CastContentType castContentType = this.f63492t;
        StringBuilder sbA = C2157f0.a(i7, j7, "ProjectionItemData(clientType=", ", avid=");
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
        M.a(i12, ", startKey=", str6, ", castContentType=", sbA);
        sbA.append(castContentType);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f63474a);
        parcel.writeLong(this.f63475b);
        parcel.writeString(this.f63476c);
        parcel.writeLong(this.f63477d);
        parcel.writeLong(this.f63478e);
        parcel.writeLong(this.f63479f);
        parcel.writeLong(this.f63480g);
        parcel.writeString(this.h);
        parcel.writeString(this.f63481i);
        parcel.writeString(this.f63482j);
        parcel.writeString(this.f63483k);
        parcel.writeInt(this.f63484l);
        parcel.writeInt(this.f63485m);
        parcel.writeLong(this.f63486n);
        parcel.writeLong(this.f63487o);
        parcel.writeInt(this.f63488p);
        parcel.writeInt(this.f63489q);
        parcel.writeInt(this.f63490r);
        parcel.writeString(this.f63492t.getRawValue());
    }
}
