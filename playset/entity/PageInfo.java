package com.bilibili.playset.entity;

import Vn.A;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/entity/PageInfo.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class PageInfo implements Parcelable {

    @JSONField(name = "cur_page_num")
    private int curPageNum;

    @JSONField(name = "has_more")
    private boolean hasMore;
    private int offset;

    @NotNull
    public static final Parcelable.Creator<PageInfo> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/entity/PageInfo$a.class */
    public static final class a implements Parcelable.Creator<PageInfo> {
        @Override // android.os.Parcelable.Creator
        public final PageInfo createFromParcel(Parcel parcel) {
            return new PageInfo(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PageInfo[] newArray(int i7) {
            return new PageInfo[i7];
        }
    }

    public PageInfo() {
        this(0, 0, false, 7, null);
    }

    public PageInfo(int i7, int i8, boolean z6) {
        this.curPageNum = i7;
        this.offset = i8;
        this.hasMore = z6;
    }

    public /* synthetic */ PageInfo(int i7, int i8, boolean z6, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? false : z6);
    }

    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = pageInfo.curPageNum;
        }
        if ((i9 & 2) != 0) {
            i8 = pageInfo.offset;
        }
        if ((i9 & 4) != 0) {
            z6 = pageInfo.hasMore;
        }
        return pageInfo.copy(i7, i8, z6);
    }

    public final int component1() {
        return this.curPageNum;
    }

    public final int component2() {
        return this.offset;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    @NotNull
    public final PageInfo copy(int i7, int i8, boolean z6) {
        return new PageInfo(i7, i8, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageInfo)) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) obj;
        return this.curPageNum == pageInfo.curPageNum && this.offset == pageInfo.offset && this.hasMore == pageInfo.hasMore;
    }

    public final int getCurPageNum() {
        return this.curPageNum;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasMore) + I.a(this.offset, Integer.hashCode(this.curPageNum) * 31, 31);
    }

    public final void setCurPageNum(int i7) {
        this.curPageNum = i7;
    }

    public final void setHasMore(boolean z6) {
        this.hasMore = z6;
    }

    public final void setOffset(int i7) {
        this.offset = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.curPageNum;
        int i8 = this.offset;
        return i.a(A.b(i7, i8, "PageInfo(curPageNum=", ", offset=", ", hasMore="), this.hasMore, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.curPageNum);
        parcel.writeInt(this.offset);
        parcel.writeInt(this.hasMore ? 1 : 0);
    }
}
