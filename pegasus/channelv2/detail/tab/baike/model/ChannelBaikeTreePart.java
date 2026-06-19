package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import X1.C3081k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import si.c;
import si.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeTreePart.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class ChannelBaikeTreePart extends c<ChannelBaikeTreePart> implements Parcelable, h {

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private String catalogueTitle;

    @JSONField(name = "part")
    @Nullable
    private List<ChannelBaikeTreePart> childPart;

    @JSONField(name = "nid")
    private long nid;

    @JSONField(name = "position")
    private int position;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @NotNull
    public static final Parcelable.Creator<ChannelBaikeTreePart> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeTreePart$a.class */
    public static final class a implements Parcelable.Creator<ChannelBaikeTreePart> {
        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeTreePart createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            String string = parcel.readString();
            long j7 = parcel.readLong();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : ChannelBaikeTreePart.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ChannelBaikeTreePart(i7, string, j7, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeTreePart[] newArray(int i7) {
            return new ChannelBaikeTreePart[i7];
        }
    }

    public ChannelBaikeTreePart() {
        this(0, null, 0L, null, null, 31, null);
    }

    public ChannelBaikeTreePart(int i7, @Nullable String str, long j7, @Nullable List<ChannelBaikeTreePart> list, @Nullable String str2) {
        this.position = i7;
        this.title = str;
        this.nid = j7;
        this.childPart = list;
        this.catalogueTitle = str2;
    }

    public /* synthetic */ ChannelBaikeTreePart(int i7, String str, long j7, List list, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 0L : j7, (i8 & 8) != 0 ? null : list, (i8 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelBaikeTreePart copy$default(ChannelBaikeTreePart channelBaikeTreePart, int i7, String str, long j7, List list, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = channelBaikeTreePart.position;
        }
        if ((i8 & 2) != 0) {
            str = channelBaikeTreePart.title;
        }
        if ((i8 & 4) != 0) {
            j7 = channelBaikeTreePart.nid;
        }
        if ((i8 & 8) != 0) {
            list = channelBaikeTreePart.childPart;
        }
        if ((i8 & 16) != 0) {
            str2 = channelBaikeTreePart.catalogueTitle;
        }
        return channelBaikeTreePart.copy(i7, str, j7, list, str2);
    }

    public final int component1() {
        return this.position;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.nid;
    }

    @Nullable
    public final List<ChannelBaikeTreePart> component4() {
        return this.childPart;
    }

    @Nullable
    public final String component5() {
        return this.catalogueTitle;
    }

    @NotNull
    public final ChannelBaikeTreePart copy(int i7, @Nullable String str, long j7, @Nullable List<ChannelBaikeTreePart> list, @Nullable String str2) {
        return new ChannelBaikeTreePart(i7, str, j7, list, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeTreePart)) {
            return false;
        }
        ChannelBaikeTreePart channelBaikeTreePart = (ChannelBaikeTreePart) obj;
        return this.position == channelBaikeTreePart.position && Intrinsics.areEqual(this.title, channelBaikeTreePart.title) && this.nid == channelBaikeTreePart.nid && Intrinsics.areEqual(this.childPart, channelBaikeTreePart.childPart) && Intrinsics.areEqual(this.catalogueTitle, channelBaikeTreePart.catalogueTitle);
    }

    @Nullable
    public final String getCatalogueTitle() {
        return this.catalogueTitle;
    }

    @Nullable
    public final List<ChannelBaikeTreePart> getChildPart() {
        return this.childPart;
    }

    public int getItemCount() {
        List<ChannelBaikeTreePart> list = this.childPart;
        return list != null ? list.size() : 0;
    }

    @Nullable
    public List<ChannelBaikeTreePart> getItems() {
        return this.childPart;
    }

    public final long getNid() {
        return this.nid;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.position);
        String str = this.title;
        int iHashCode2 = 0;
        int iA = C3554n0.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.nid);
        List<ChannelBaikeTreePart> list = this.childPart;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.catalogueTitle;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return ((iA + iHashCode3) * 31) + iHashCode2;
    }

    public final void setCatalogueTitle(@Nullable String str) {
        this.catalogueTitle = str;
    }

    public final void setChildPart(@Nullable List<ChannelBaikeTreePart> list) {
        this.childPart = list;
    }

    public final void setNid(long j7) {
        this.nid = j7;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.position;
        String str = this.title;
        long j7 = this.nid;
        List<ChannelBaikeTreePart> list = this.childPart;
        String str2 = this.catalogueTitle;
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "ChannelBaikeTreePart(position=", ", title=", str, ", nid=");
        C3081k.c(sbB, j7, ", childPart=", list);
        return D.a(", catalogueTitle=", str2, ")", sbB);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.position);
        parcel.writeString(this.title);
        parcel.writeLong(this.nid);
        List<ChannelBaikeTreePart> list = this.childPart;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ChannelBaikeTreePart channelBaikeTreePart = (ChannelBaikeTreePart) itA.next();
                if (channelBaikeTreePart == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    channelBaikeTreePart.writeToParcel(parcel, i7);
                }
            }
        }
        parcel.writeString(this.catalogueTitle);
    }
}
