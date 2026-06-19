package com.bilibili.ogv.pub.review.bean;

import I.E;
import X1.C3081k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.C3339q;
import androidx.compose.animation.n;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.O;
import androidx.compose.ui.graphics.e0;
import androidx.fragment.app.D;
import androidx.room.B;
import cf.b;
import cf.d;
import cf.f;
import com.bilibili.ogv.pub.community.Area;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewShareData.class */
@Parcelize
public final class ReviewShareData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReviewShareData> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f71739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f71740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f71741g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f71742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f71743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f71744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<Area> f71745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Long f71746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Integer f71747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final String f71748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final MediaEpisodeIndex f71749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final String f71750q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewShareData$a.class */
    public static final class a implements Parcelable.Creator<ReviewShareData> {
        @Override // android.os.Parcelable.Creator
        public final ReviewShareData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            float f7 = parcel.readFloat();
            float f8 = parcel.readFloat();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            long j7 = parcel.readLong();
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int iA = 0;
            while (true) {
                int i8 = iA;
                if (i8 == i7) {
                    break;
                }
                iA = b.a(Area.CREATOR, parcel, arrayList, i8, 1);
            }
            MediaEpisodeIndex mediaEpisodeIndexCreateFromParcel = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                mediaEpisodeIndexCreateFromParcel = MediaEpisodeIndex.CREATOR.createFromParcel(parcel);
            }
            return new ReviewShareData(string, string2, string3, string4, arrayListCreateStringArrayList, string5, f7, f8, string6, string7, j7, arrayList, lValueOf, numValueOf, string8, mediaEpisodeIndexCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewShareData[] newArray(int i7) {
            return new ReviewShareData[i7];
        }
    }

    public ReviewShareData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, float f7, float f8, @NotNull String str6, @NotNull String str7, long j7, @NotNull List<Area> list2, @Nullable Long l7, @Nullable Integer num, @Nullable String str8, @Nullable MediaEpisodeIndex mediaEpisodeIndex, @Nullable String str9) {
        this.f71735a = str;
        this.f71736b = str2;
        this.f71737c = str3;
        this.f71738d = str4;
        this.f71739e = list;
        this.f71740f = str5;
        this.f71741g = f7;
        this.h = f8;
        this.f71742i = str6;
        this.f71743j = str7;
        this.f71744k = j7;
        this.f71745l = list2;
        this.f71746m = l7;
        this.f71747n = num;
        this.f71748o = str8;
        this.f71749p = mediaEpisodeIndex;
        this.f71750q = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewShareData)) {
            return false;
        }
        ReviewShareData reviewShareData = (ReviewShareData) obj;
        return Intrinsics.areEqual(this.f71735a, reviewShareData.f71735a) && Intrinsics.areEqual(this.f71736b, reviewShareData.f71736b) && Intrinsics.areEqual(this.f71737c, reviewShareData.f71737c) && Intrinsics.areEqual(this.f71738d, reviewShareData.f71738d) && Intrinsics.areEqual(this.f71739e, reviewShareData.f71739e) && Intrinsics.areEqual(this.f71740f, reviewShareData.f71740f) && Float.compare(this.f71741g, reviewShareData.f71741g) == 0 && Float.compare(this.h, reviewShareData.h) == 0 && Intrinsics.areEqual(this.f71742i, reviewShareData.f71742i) && Intrinsics.areEqual(this.f71743j, reviewShareData.f71743j) && this.f71744k == reviewShareData.f71744k && Intrinsics.areEqual(this.f71745l, reviewShareData.f71745l) && Intrinsics.areEqual(this.f71746m, reviewShareData.f71746m) && Intrinsics.areEqual(this.f71747n, reviewShareData.f71747n) && Intrinsics.areEqual(this.f71748o, reviewShareData.f71748o) && Intrinsics.areEqual(this.f71749p, reviewShareData.f71749p) && Intrinsics.areEqual(this.f71750q, reviewShareData.f71750q);
    }

    public final int hashCode() {
        int iA = e0.a(C3554n0.a(E.a(E.a(n.a(this.h, n.a(this.f71741g, E.a(e0.a(E.a(E.a(E.a(this.f71735a.hashCode() * 31, 31, this.f71736b), 31, this.f71737c), 31, this.f71738d), 31, this.f71739e), 31, this.f71740f), 31), 31), 31, this.f71742i), 31, this.f71743j), 31, this.f71744k), 31, this.f71745l);
        Long l7 = this.f71746m;
        int iHashCode = 0;
        int iHashCode2 = l7 == null ? 0 : l7.hashCode();
        Integer num = this.f71747n;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.f71748o;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        MediaEpisodeIndex mediaEpisodeIndex = this.f71749p;
        int iHashCode5 = mediaEpisodeIndex == null ? 0 : mediaEpisodeIndex.hashCode();
        String str2 = this.f71750q;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f71735a;
        String str2 = this.f71736b;
        String str3 = this.f71737c;
        String str4 = this.f71738d;
        List<String> list = this.f71739e;
        String str5 = this.f71740f;
        float f7 = this.f71741g;
        float f8 = this.h;
        String str6 = this.f71742i;
        String str7 = this.f71743j;
        long j7 = this.f71744k;
        List<Area> list2 = this.f71745l;
        Long l7 = this.f71746m;
        Integer num = this.f71747n;
        String str8 = this.f71748o;
        MediaEpisodeIndex mediaEpisodeIndex = this.f71749p;
        String str9 = this.f71750q;
        StringBuilder sbA = G0.b.a("ReviewShareData(title=", str, ", content=", str2, ", coverUrl=");
        B.a(str3, ", shareUrl=", str4, ", styles=", sbA);
        O.b(", reviewPublishTime=", str5, ", reviewScore=", sbA, list);
        C3339q.b(sbA, f7, ", mediaScore=", f8, ", authorName=");
        B.a(str6, ", authorAvatar=", str7, ", authorMid=", sbA);
        C3081k.c(sbA, j7, ", areas=", list2);
        sbA.append(", seasonId=");
        sbA.append(l7);
        sbA.append(", seasonType=");
        sbA.append(num);
        sbA.append(", typeName=");
        sbA.append(str8);
        sbA.append(", newEp=");
        sbA.append(mediaEpisodeIndex);
        return D.a(", horizontalPicture=", str9, ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f71735a);
        parcel.writeString(this.f71736b);
        parcel.writeString(this.f71737c);
        parcel.writeString(this.f71738d);
        parcel.writeStringList(this.f71739e);
        parcel.writeString(this.f71740f);
        parcel.writeFloat(this.f71741g);
        parcel.writeFloat(this.h);
        parcel.writeString(this.f71742i);
        parcel.writeString(this.f71743j);
        parcel.writeLong(this.f71744k);
        List<Area> list = this.f71745l;
        parcel.writeInt(list.size());
        Iterator<Area> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i7);
        }
        Long l7 = this.f71746m;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            d.a(parcel, 1, l7);
        }
        Integer num = this.f71747n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num);
        }
        parcel.writeString(this.f71748o);
        MediaEpisodeIndex mediaEpisodeIndex = this.f71749p;
        if (mediaEpisodeIndex == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaEpisodeIndex.writeToParcel(parcel, i7);
        }
        parcel.writeString(this.f71750q);
    }
}
