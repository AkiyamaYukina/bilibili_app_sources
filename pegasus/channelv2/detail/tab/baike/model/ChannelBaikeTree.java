package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C;
import cf.b;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeTree.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class ChannelBaikeTree implements Parcelable {

    @JSONField(name = "content_title")
    @Nullable
    private String contentTitle;

    @JSONField(name = "part")
    @Nullable
    private List<ChannelBaikeTreePart> treePart;

    @NotNull
    public static final Parcelable.Creator<ChannelBaikeTree> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeTree$a.class */
    public static final class a implements Parcelable.Creator<ChannelBaikeTree> {
        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeTree createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int iA = 0;
                while (true) {
                    int i8 = iA;
                    if (i8 == i7) {
                        break;
                    }
                    iA = b.a(ChannelBaikeTreePart.CREATOR, parcel, arrayList2, i8, 1);
                }
                arrayList = arrayList2;
            }
            return new ChannelBaikeTree(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeTree[] newArray(int i7) {
            return new ChannelBaikeTree[i7];
        }
    }

    public ChannelBaikeTree() {
        this(null, null, 3, null);
    }

    public ChannelBaikeTree(@Nullable String str, @Nullable List<ChannelBaikeTreePart> list) {
        this.contentTitle = str;
        this.treePart = list;
    }

    public /* synthetic */ ChannelBaikeTree(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelBaikeTree copy$default(ChannelBaikeTree channelBaikeTree, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelBaikeTree.contentTitle;
        }
        if ((i7 & 2) != 0) {
            list = channelBaikeTree.treePart;
        }
        return channelBaikeTree.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.contentTitle;
    }

    @Nullable
    public final List<ChannelBaikeTreePart> component2() {
        return this.treePart;
    }

    @NotNull
    public final ChannelBaikeTree copy(@Nullable String str, @Nullable List<ChannelBaikeTreePart> list) {
        return new ChannelBaikeTree(str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeTree)) {
            return false;
        }
        ChannelBaikeTree channelBaikeTree = (ChannelBaikeTree) obj;
        return Intrinsics.areEqual(this.contentTitle, channelBaikeTree.contentTitle) && Intrinsics.areEqual(this.treePart, channelBaikeTree.treePart);
    }

    @Nullable
    public final String getContentTitle() {
        return this.contentTitle;
    }

    @Nullable
    public final List<ChannelBaikeTreePart> getTreePart() {
        return this.treePart;
    }

    public int hashCode() {
        String str = this.contentTitle;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<ChannelBaikeTreePart> list = this.treePart;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setContentTitle(@Nullable String str) {
        this.contentTitle = str;
    }

    public final void setTreePart(@Nullable List<ChannelBaikeTreePart> list) {
        this.treePart = list;
    }

    @NotNull
    public String toString() {
        return C.a("ChannelBaikeTree(contentTitle=", this.contentTitle, ", treePart=", ")", this.treePart);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.contentTitle);
        List<ChannelBaikeTreePart> list = this.treePart;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((ChannelBaikeTreePart) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
