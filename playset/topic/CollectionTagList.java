package com.bilibili.playset.topic;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.b;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playset.entity.PageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTagList.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class CollectionTagList implements Parcelable {

    @JSONField(name = "tag_items")
    @Nullable
    private List<CollectionTopicItem> items;

    @JSONField(name = "page_info")
    @Nullable
    private PageInfo pageInfo;

    @NotNull
    public static final Parcelable.Creator<CollectionTagList> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTagList$a.class */
    public static final class a implements Parcelable.Creator<CollectionTagList> {
        @Override // android.os.Parcelable.Creator
        public final CollectionTagList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int iA = 0;
                while (true) {
                    int i8 = iA;
                    arrayList = arrayList2;
                    if (i8 == i7) {
                        break;
                    }
                    iA = b.a(CollectionTopicItem.CREATOR, parcel, arrayList2, i8, 1);
                }
            } else {
                arrayList = null;
            }
            return new CollectionTagList(arrayList, parcel.readInt() == 0 ? null : PageInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionTagList[] newArray(int i7) {
            return new CollectionTagList[i7];
        }
    }

    public CollectionTagList() {
        this(null, null, 3, null);
    }

    public CollectionTagList(@Nullable List<CollectionTopicItem> list, @Nullable PageInfo pageInfo) {
        this.items = list;
        this.pageInfo = pageInfo;
    }

    public /* synthetic */ CollectionTagList(List list, PageInfo pageInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : pageInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectionTagList copy$default(CollectionTagList collectionTagList, List list, PageInfo pageInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = collectionTagList.items;
        }
        if ((i7 & 2) != 0) {
            pageInfo = collectionTagList.pageInfo;
        }
        return collectionTagList.copy(list, pageInfo);
    }

    @Nullable
    public final List<CollectionTopicItem> component1() {
        return this.items;
    }

    @Nullable
    public final PageInfo component2() {
        return this.pageInfo;
    }

    @NotNull
    public final CollectionTagList copy(@Nullable List<CollectionTopicItem> list, @Nullable PageInfo pageInfo) {
        return new CollectionTagList(list, pageInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionTagList)) {
            return false;
        }
        CollectionTagList collectionTagList = (CollectionTagList) obj;
        return Intrinsics.areEqual(this.items, collectionTagList.items) && Intrinsics.areEqual(this.pageInfo, collectionTagList.pageInfo);
    }

    @Nullable
    public final List<CollectionTopicItem> getItems() {
        return this.items;
    }

    @Nullable
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public int hashCode() {
        List<CollectionTopicItem> list = this.items;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo != null) {
            iHashCode = pageInfo.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setItems(@Nullable List<CollectionTopicItem> list) {
        this.items = list;
    }

    public final void setPageInfo(@Nullable PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @NotNull
    public String toString() {
        return "CollectionTagList(items=" + this.items + ", pageInfo=" + this.pageInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        List<CollectionTopicItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((CollectionTopicItem) itA.next()).writeToParcel(parcel, i7);
            }
        }
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageInfo.writeToParcel(parcel, i7);
        }
    }
}
