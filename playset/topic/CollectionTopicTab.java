package com.bilibili.playset.topic;

import O4.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicTab.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class CollectionTopicTab implements Parcelable {
    private boolean tag;
    private boolean topic;

    @NotNull
    public static final Parcelable.Creator<CollectionTopicTab> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicTab$a.class */
    public static final class a implements Parcelable.Creator<CollectionTopicTab> {
        @Override // android.os.Parcelable.Creator
        public final CollectionTopicTab createFromParcel(Parcel parcel) {
            boolean z6 = false;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z6 = true;
            }
            return new CollectionTopicTab(z7, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionTopicTab[] newArray(int i7) {
            return new CollectionTopicTab[i7];
        }
    }

    public CollectionTopicTab() {
        this(false, false, 3, null);
    }

    public CollectionTopicTab(boolean z6, boolean z7) {
        this.topic = z6;
        this.tag = z7;
    }

    public /* synthetic */ CollectionTopicTab(boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? false : z7);
    }

    public static /* synthetic */ CollectionTopicTab copy$default(CollectionTopicTab collectionTopicTab, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = collectionTopicTab.topic;
        }
        if ((i7 & 2) != 0) {
            z7 = collectionTopicTab.tag;
        }
        return collectionTopicTab.copy(z6, z7);
    }

    public final boolean component1() {
        return this.topic;
    }

    public final boolean component2() {
        return this.tag;
    }

    @NotNull
    public final CollectionTopicTab copy(boolean z6, boolean z7) {
        return new CollectionTopicTab(z6, z7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionTopicTab)) {
            return false;
        }
        CollectionTopicTab collectionTopicTab = (CollectionTopicTab) obj;
        return this.topic == collectionTopicTab.topic && this.tag == collectionTopicTab.tag;
    }

    public final boolean getTag() {
        return this.tag;
    }

    public final boolean getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Boolean.hashCode(this.tag) + (Boolean.hashCode(this.topic) * 31);
    }

    public final void setTag(boolean z6) {
        this.tag = z6;
    }

    public final void setTopic(boolean z6) {
        this.topic = z6;
    }

    @NotNull
    public String toString() {
        return b.b("CollectionTopicTab(topic=", ", tag=", ")", this.topic, this.tag);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.topic ? 1 : 0);
        parcel.writeInt(this.tag ? 1 : 0);
    }
}
