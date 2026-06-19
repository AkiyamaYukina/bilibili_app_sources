package com.bilibili.playset.topic;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playset.entity.PageInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/RspCollectionTopic.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class RspCollectionTopic implements Parcelable {

    @JSONField(name = "fav_tab")
    @Nullable
    private CollectionTopicTab tab;

    @JSONField(name = "tag_list")
    @Nullable
    private CollectionTagList tagList;

    @JSONField(name = "topic_list")
    @Nullable
    private CollectionTopicList topicList;

    @NotNull
    public static final Parcelable.Creator<RspCollectionTopic> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/RspCollectionTopic$a.class */
    public static final class a implements Parcelable.Creator<RspCollectionTopic> {
        @Override // android.os.Parcelable.Creator
        public final RspCollectionTopic createFromParcel(Parcel parcel) {
            return new RspCollectionTopic(parcel.readInt() == 0 ? null : CollectionTopicTab.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CollectionTopicList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CollectionTagList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RspCollectionTopic[] newArray(int i7) {
            return new RspCollectionTopic[i7];
        }
    }

    public RspCollectionTopic() {
        this(null, null, null, 7, null);
    }

    public RspCollectionTopic(@Nullable CollectionTopicTab collectionTopicTab, @Nullable CollectionTopicList collectionTopicList, @Nullable CollectionTagList collectionTagList) {
        this.tab = collectionTopicTab;
        this.topicList = collectionTopicList;
        this.tagList = collectionTagList;
    }

    public /* synthetic */ RspCollectionTopic(CollectionTopicTab collectionTopicTab, CollectionTopicList collectionTopicList, CollectionTagList collectionTagList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : collectionTopicTab, (i7 & 2) != 0 ? null : collectionTopicList, (i7 & 4) != 0 ? null : collectionTagList);
    }

    public static /* synthetic */ RspCollectionTopic copy$default(RspCollectionTopic rspCollectionTopic, CollectionTopicTab collectionTopicTab, CollectionTopicList collectionTopicList, CollectionTagList collectionTagList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            collectionTopicTab = rspCollectionTopic.tab;
        }
        if ((i7 & 2) != 0) {
            collectionTopicList = rspCollectionTopic.topicList;
        }
        if ((i7 & 4) != 0) {
            collectionTagList = rspCollectionTopic.tagList;
        }
        return rspCollectionTopic.copy(collectionTopicTab, collectionTopicList, collectionTagList);
    }

    @Nullable
    public final CollectionTopicTab component1() {
        return this.tab;
    }

    @Nullable
    public final CollectionTopicList component2() {
        return this.topicList;
    }

    @Nullable
    public final CollectionTagList component3() {
        return this.tagList;
    }

    @NotNull
    public final RspCollectionTopic copy(@Nullable CollectionTopicTab collectionTopicTab, @Nullable CollectionTopicList collectionTopicList, @Nullable CollectionTagList collectionTagList) {
        return new RspCollectionTopic(collectionTopicTab, collectionTopicList, collectionTagList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RspCollectionTopic)) {
            return false;
        }
        RspCollectionTopic rspCollectionTopic = (RspCollectionTopic) obj;
        return Intrinsics.areEqual(this.tab, rspCollectionTopic.tab) && Intrinsics.areEqual(this.topicList, rspCollectionTopic.topicList) && Intrinsics.areEqual(this.tagList, rspCollectionTopic.tagList);
    }

    @Nullable
    public final List<CollectionTopicItem> getItems(@Nullable String str) {
        List<CollectionTopicItem> items;
        if (Intrinsics.areEqual(str, "new_topic")) {
            CollectionTopicList collectionTopicList = this.topicList;
            items = null;
            if (collectionTopicList != null) {
                items = collectionTopicList.getItems();
            }
        } else {
            items = null;
            if (Intrinsics.areEqual(str, "tag")) {
                CollectionTagList collectionTagList = this.tagList;
                items = null;
                if (collectionTagList != null) {
                    items = collectionTagList.getItems();
                }
            }
        }
        return items;
    }

    @Nullable
    public final Integer getPageIndex(@Nullable String str) {
        Integer numValueOf;
        if (Intrinsics.areEqual(str, "new_topic")) {
            CollectionTopicList collectionTopicList = this.topicList;
            numValueOf = null;
            if (collectionTopicList != null) {
                PageInfo pageInfo = collectionTopicList.getPageInfo();
                numValueOf = null;
                if (pageInfo != null) {
                    numValueOf = Integer.valueOf(pageInfo.getCurPageNum());
                }
            }
        } else {
            numValueOf = null;
            if (Intrinsics.areEqual(str, "tag")) {
                CollectionTagList collectionTagList = this.tagList;
                numValueOf = null;
                if (collectionTagList != null) {
                    PageInfo pageInfo2 = collectionTagList.getPageInfo();
                    numValueOf = null;
                    if (pageInfo2 != null) {
                        numValueOf = Integer.valueOf(pageInfo2.getCurPageNum());
                    }
                }
            }
        }
        return numValueOf;
    }

    @Nullable
    public final CollectionTopicTab getTab() {
        return this.tab;
    }

    @Nullable
    public final CollectionTagList getTagList() {
        return this.tagList;
    }

    @Nullable
    public final CollectionTopicList getTopicList() {
        return this.topicList;
    }

    public int hashCode() {
        CollectionTopicTab collectionTopicTab = this.tab;
        int iHashCode = 0;
        int iHashCode2 = collectionTopicTab == null ? 0 : collectionTopicTab.hashCode();
        CollectionTopicList collectionTopicList = this.topicList;
        int iHashCode3 = collectionTopicList == null ? 0 : collectionTopicList.hashCode();
        CollectionTagList collectionTagList = this.tagList;
        if (collectionTagList != null) {
            iHashCode = collectionTagList.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setTab(@Nullable CollectionTopicTab collectionTopicTab) {
        this.tab = collectionTopicTab;
    }

    public final void setTagList(@Nullable CollectionTagList collectionTagList) {
        this.tagList = collectionTagList;
    }

    public final void setTopicList(@Nullable CollectionTopicList collectionTopicList) {
        this.topicList = collectionTopicList;
    }

    @NotNull
    public String toString() {
        return "RspCollectionTopic(tab=" + this.tab + ", topicList=" + this.topicList + ", tagList=" + this.tagList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        CollectionTopicTab collectionTopicTab = this.tab;
        if (collectionTopicTab == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collectionTopicTab.writeToParcel(parcel, i7);
        }
        CollectionTopicList collectionTopicList = this.topicList;
        if (collectionTopicList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collectionTopicList.writeToParcel(parcel, i7);
        }
        CollectionTagList collectionTagList = this.tagList;
        if (collectionTagList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collectionTagList.writeToParcel(parcel, i7);
        }
    }
}
