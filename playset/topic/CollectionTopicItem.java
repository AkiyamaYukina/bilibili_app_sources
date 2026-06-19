package com.bilibili.playset.topic;

import G0.d;
import J1.z;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicItem.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class CollectionTopicItem implements Parcelable {
    private long discuss;
    private long id;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @Nullable
    private String name;
    private long view;

    @NotNull
    public static final Parcelable.Creator<CollectionTopicItem> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicItem$a.class */
    public static final class a implements Parcelable.Creator<CollectionTopicItem> {
        @Override // android.os.Parcelable.Creator
        public final CollectionTopicItem createFromParcel(Parcel parcel) {
            return new CollectionTopicItem(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionTopicItem[] newArray(int i7) {
            return new CollectionTopicItem[i7];
        }
    }

    public CollectionTopicItem() {
        this(0L, null, 0L, 0L, null, 31, null);
    }

    public CollectionTopicItem(long j7, @Nullable String str, long j8, long j9, @Nullable String str2) {
        this.id = j7;
        this.name = str;
        this.view = j8;
        this.discuss = j9;
        this.jumpUrl = str2;
    }

    public /* synthetic */ CollectionTopicItem(long j7, String str, long j8, long j9, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? 0L : j8, (i7 & 8) != 0 ? 0L : j9, (i7 & 16) != 0 ? null : str2);
    }

    public static /* synthetic */ CollectionTopicItem copy$default(CollectionTopicItem collectionTopicItem, long j7, String str, long j8, long j9, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = collectionTopicItem.id;
        }
        if ((i7 & 2) != 0) {
            str = collectionTopicItem.name;
        }
        if ((i7 & 4) != 0) {
            j8 = collectionTopicItem.view;
        }
        if ((i7 & 8) != 0) {
            j9 = collectionTopicItem.discuss;
        }
        if ((i7 & 16) != 0) {
            str2 = collectionTopicItem.jumpUrl;
        }
        return collectionTopicItem.copy(j7, str, j8, j9, str2);
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.view;
    }

    public final long component4() {
        return this.discuss;
    }

    @Nullable
    public final String component5() {
        return this.jumpUrl;
    }

    @NotNull
    public final CollectionTopicItem copy(long j7, @Nullable String str, long j8, long j9, @Nullable String str2) {
        return new CollectionTopicItem(j7, str, j8, j9, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionTopicItem)) {
            return false;
        }
        CollectionTopicItem collectionTopicItem = (CollectionTopicItem) obj;
        return this.id == collectionTopicItem.id && Intrinsics.areEqual(this.name, collectionTopicItem.name) && this.view == collectionTopicItem.view && this.discuss == collectionTopicItem.discuss && Intrinsics.areEqual(this.jumpUrl, collectionTopicItem.jumpUrl);
    }

    public final long getDiscuss() {
        return this.discuss;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getView() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.name;
        int iA = C3554n0.a(C3554n0.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.view), 31, this.discuss);
        String str2 = this.jumpUrl;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    public final void setDiscuss(long j7) {
        this.discuss = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setView(long j7) {
        this.view = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.name;
        long j8 = this.view;
        long j9 = this.discuss;
        String str2 = this.jumpUrl;
        StringBuilder sbA = n.a(j7, "CollectionTopicItem(id=", ", name=", str);
        z.a(j8, ", view=", ", discuss=", sbA);
        d.a(j9, ", jumpUrl=", str2, sbA);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.view);
        parcel.writeLong(this.discuss);
        parcel.writeString(this.jumpUrl);
    }
}
