package com.bilibili.search2.api;

import I1.C2157f0;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.O;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.FoldingTimeLine;
import com.bapis.bilibili.polymer.app.search.v1.VideoTextItem;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchTimeAxisItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchTimeAxisItem {
    public static final int $stable = 8;

    @JSONField(name = "color")
    private int color;
    private int containerHeight;

    @JSONField(name = "end_second")
    private long endSecond;
    private int hangStyleSignal;
    private int hasImgUrl;
    private boolean hasMeasured;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @Nullable
    private String iconNight;

    @JSONField(name = "init_position")
    private int initPosition;
    private boolean isFolded;

    @JSONField(name = "items")
    @Nullable
    private List<VideoTimeAxisItem> items;

    @Nullable
    private String leftTitle;
    private int recyclerViewHeight;

    @Nullable
    private String rightTitle;
    private int scrollHorizontalOffset;

    @JSONField(name = "segment")
    private int segment;

    @JSONField(name = "start_second")
    private long startSecond;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "type")
    private int type;

    public SearchTimeAxisItem() {
        this(0, 0L, 0L, null, null, null, null, 0, 0, 0, 0, null, null, 0, 0, false, 0, 0, false, 524287, null);
    }

    public SearchTimeAxisItem(int i7, long j7, long j8, @Nullable String str, @Nullable String str2, @Nullable List<VideoTimeAxisItem> list, @Nullable String str3, int i8, int i9, int i10, int i11, @Nullable String str4, @Nullable String str5, int i12, int i13, boolean z6, int i14, int i15, boolean z7) {
        this.color = i7;
        this.startSecond = j7;
        this.endSecond = j8;
        this.icon = str;
        this.iconNight = str2;
        this.items = list;
        this.title = str3;
        this.type = i8;
        this.segment = i9;
        this.initPosition = i10;
        this.scrollHorizontalOffset = i11;
        this.leftTitle = str4;
        this.rightTitle = str5;
        this.hangStyleSignal = i12;
        this.hasImgUrl = i13;
        this.hasMeasured = z6;
        this.containerHeight = i14;
        this.recyclerViewHeight = i15;
        this.isFolded = z7;
    }

    public /* synthetic */ SearchTimeAxisItem(int i7, long j7, long j8, String str, String str2, List list, String str3, int i8, int i9, int i10, int i11, String str4, String str5, int i12, int i13, boolean z6, int i14, int i15, boolean z7, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i7, (i16 & 2) != 0 ? 0L : j7, (i16 & 4) != 0 ? 0L : j8, (i16 & 8) != 0 ? null : str, (i16 & 16) != 0 ? null : str2, (i16 & 32) != 0 ? CollectionsKt.emptyList() : list, (i16 & 64) != 0 ? null : str3, (i16 & 128) != 0 ? 0 : i8, (i16 & 256) != 0 ? 3 : i9, (i16 & 512) != 0 ? 0 : i10, (i16 & 1024) != 0 ? 0 : i11, (i16 & 2048) != 0 ? null : str4, (i16 & 4096) != 0 ? null : str5, (i16 & 8192) != 0 ? 0 : i12, (i16 & 16384) != 0 ? 2 : i13, (i16 & 32768) != 0 ? false : z6, (i16 & 65536) != 0 ? 0 : i14, (i16 & 131072) != 0 ? 0 : i15, (i16 & 262144) != 0 ? false : z7);
    }

    public SearchTimeAxisItem(@NotNull FoldingTimeLine foldingTimeLine) {
        this(0, 0L, 0L, null, null, null, null, 0, 0, 0, 0, null, null, 0, 0, false, 0, 0, false, 524287, null);
        this.startSecond = foldingTimeLine.getStartSecond();
        this.endSecond = foldingTimeLine.getEndSecond();
        this.icon = foldingTimeLine.getIcon();
        this.iconNight = foldingTimeLine.getIconNight();
        this.leftTitle = foldingTimeLine.getLeftTitle();
        this.rightTitle = foldingTimeLine.getRightTitle();
        this.type = foldingTimeLine.getType();
        this.hangStyleSignal = foldingTimeLine.getHangStyleSinal();
        this.hasImgUrl = foldingTimeLine.getHasImgUrl();
        this.initPosition = foldingTimeLine.getInitPosition();
        ArrayList arrayList = new ArrayList();
        Iterator it = foldingTimeLine.getItemsList().iterator();
        while (it.hasNext()) {
            VideoTimeAxisItem videoTimeAxisItem = new VideoTimeAxisItem((VideoTextItem) it.next());
            videoTimeAxisItem.setHasImgUrl(this.hasImgUrl);
            arrayList.add(videoTimeAxisItem);
        }
        if (!arrayList.isEmpty()) {
            this.items = arrayList;
        }
        int i7 = this.hangStyleSignal;
        this.isFolded = i7 != 1 ? i7 == 2 : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTimeAxisItem copy$default(SearchTimeAxisItem searchTimeAxisItem, int i7, long j7, long j8, String str, String str2, List list, String str3, int i8, int i9, int i10, int i11, String str4, String str5, int i12, int i13, boolean z6, int i14, int i15, boolean z7, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i7 = searchTimeAxisItem.color;
        }
        if ((i16 & 2) != 0) {
            j7 = searchTimeAxisItem.startSecond;
        }
        if ((i16 & 4) != 0) {
            j8 = searchTimeAxisItem.endSecond;
        }
        if ((i16 & 8) != 0) {
            str = searchTimeAxisItem.icon;
        }
        if ((i16 & 16) != 0) {
            str2 = searchTimeAxisItem.iconNight;
        }
        if ((i16 & 32) != 0) {
            list = searchTimeAxisItem.items;
        }
        if ((i16 & 64) != 0) {
            str3 = searchTimeAxisItem.title;
        }
        if ((i16 & 128) != 0) {
            i8 = searchTimeAxisItem.type;
        }
        if ((i16 & 256) != 0) {
            i9 = searchTimeAxisItem.segment;
        }
        if ((i16 & 512) != 0) {
            i10 = searchTimeAxisItem.initPosition;
        }
        if ((i16 & 1024) != 0) {
            i11 = searchTimeAxisItem.scrollHorizontalOffset;
        }
        if ((i16 & 2048) != 0) {
            str4 = searchTimeAxisItem.leftTitle;
        }
        if ((i16 & 4096) != 0) {
            str5 = searchTimeAxisItem.rightTitle;
        }
        if ((i16 & 8192) != 0) {
            i12 = searchTimeAxisItem.hangStyleSignal;
        }
        if ((i16 & 16384) != 0) {
            i13 = searchTimeAxisItem.hasImgUrl;
        }
        if ((i16 & 32768) != 0) {
            z6 = searchTimeAxisItem.hasMeasured;
        }
        if ((i16 & 65536) != 0) {
            i14 = searchTimeAxisItem.containerHeight;
        }
        if ((i16 & 131072) != 0) {
            i15 = searchTimeAxisItem.recyclerViewHeight;
        }
        if ((i16 & 262144) != 0) {
            z7 = searchTimeAxisItem.isFolded;
        }
        return searchTimeAxisItem.copy(i7, j7, j8, str, str2, list, str3, i8, i9, i10, i11, str4, str5, i12, i13, z6, i14, i15, z7);
    }

    public final void changeFoldStatus() {
        this.isFolded = !this.isFolded;
    }

    public final int component1() {
        return this.color;
    }

    public final int component10() {
        return this.initPosition;
    }

    public final int component11() {
        return this.scrollHorizontalOffset;
    }

    @Nullable
    public final String component12() {
        return this.leftTitle;
    }

    @Nullable
    public final String component13() {
        return this.rightTitle;
    }

    public final int component14() {
        return this.hangStyleSignal;
    }

    public final int component15() {
        return this.hasImgUrl;
    }

    public final boolean component16() {
        return this.hasMeasured;
    }

    public final int component17() {
        return this.containerHeight;
    }

    public final int component18() {
        return this.recyclerViewHeight;
    }

    public final boolean component19() {
        return this.isFolded;
    }

    public final long component2() {
        return this.startSecond;
    }

    public final long component3() {
        return this.endSecond;
    }

    @Nullable
    public final String component4() {
        return this.icon;
    }

    @Nullable
    public final String component5() {
        return this.iconNight;
    }

    @Nullable
    public final List<VideoTimeAxisItem> component6() {
        return this.items;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    public final int component8() {
        return this.type;
    }

    public final int component9() {
        return this.segment;
    }

    @NotNull
    public final SearchTimeAxisItem copy(int i7, long j7, long j8, @Nullable String str, @Nullable String str2, @Nullable List<VideoTimeAxisItem> list, @Nullable String str3, int i8, int i9, int i10, int i11, @Nullable String str4, @Nullable String str5, int i12, int i13, boolean z6, int i14, int i15, boolean z7) {
        return new SearchTimeAxisItem(i7, j7, j8, str, str2, list, str3, i8, i9, i10, i11, str4, str5, i12, i13, z6, i14, i15, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTimeAxisItem)) {
            return false;
        }
        SearchTimeAxisItem searchTimeAxisItem = (SearchTimeAxisItem) obj;
        return this.color == searchTimeAxisItem.color && this.startSecond == searchTimeAxisItem.startSecond && this.endSecond == searchTimeAxisItem.endSecond && Intrinsics.areEqual(this.icon, searchTimeAxisItem.icon) && Intrinsics.areEqual(this.iconNight, searchTimeAxisItem.iconNight) && Intrinsics.areEqual(this.items, searchTimeAxisItem.items) && Intrinsics.areEqual(this.title, searchTimeAxisItem.title) && this.type == searchTimeAxisItem.type && this.segment == searchTimeAxisItem.segment && this.initPosition == searchTimeAxisItem.initPosition && this.scrollHorizontalOffset == searchTimeAxisItem.scrollHorizontalOffset && Intrinsics.areEqual(this.leftTitle, searchTimeAxisItem.leftTitle) && Intrinsics.areEqual(this.rightTitle, searchTimeAxisItem.rightTitle) && this.hangStyleSignal == searchTimeAxisItem.hangStyleSignal && this.hasImgUrl == searchTimeAxisItem.hasImgUrl && this.hasMeasured == searchTimeAxisItem.hasMeasured && this.containerHeight == searchTimeAxisItem.containerHeight && this.recyclerViewHeight == searchTimeAxisItem.recyclerViewHeight && this.isFolded == searchTimeAxisItem.isFolded;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    public final long getEndSecond() {
        return this.endSecond;
    }

    public final int getFoldingCurOffset(@NotNull Context context) {
        List<VideoTimeAxisItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        if (getFoldingSegment(context) > this.items.size()) {
            return Integer.MAX_VALUE;
        }
        int px = ListExtentionsKt.toPx(8) + ((int) ((com.bilibili.search2.component.e.e(ScreenUtil.getScreenWidth(context), context) - ListExtentionsKt.toPx((((int) getFoldingSegment(context)) * 8) + 32)) / getFoldingSegment(context)));
        return isFoldingToEnd(context) ? (int) (((this.items.size() - getFoldingSegment(context)) * px) + ListExtentionsKt.toPx(4)) : getValidInitPosition() * px;
    }

    public final float getFoldingSegment(@NotNull Context context) {
        int iE = com.bilibili.search2.component.e.e(ScreenUtil.getScreenWidth(context), context);
        return (iE < 0 || iE >= ListExtentionsKt.toPx(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_MAX_SIZE)) ? 4.5f : 3.5f;
    }

    public final int getFoldingStartPosition(@NotNull Context context) {
        int validInitPosition = getValidInitPosition();
        List<VideoTimeAxisItem> list = this.items;
        return Math.max(0, Math.min(validInitPosition, (list != null ? list.size() : 0) - ((int) getFoldingSegment(context))));
    }

    public final int getHangStyleSignal() {
        return this.hangStyleSignal;
    }

    public final int getHasImgUrl() {
        return this.hasImgUrl;
    }

    public final boolean getHasMeasured() {
        return this.hasMeasured;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    public final int getInitPosition() {
        return this.initPosition;
    }

    @Nullable
    public final List<VideoTimeAxisItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getLeftTitle() {
        return this.leftTitle;
    }

    public final int getRecyclerViewHeight() {
        return this.recyclerViewHeight;
    }

    @Nullable
    public final String getRightTitle() {
        return this.rightTitle;
    }

    public final int getScrollHorizontalOffset() {
        return this.scrollHorizontalOffset;
    }

    public final int getSegment() {
        return this.segment;
    }

    public final long getStartSecond() {
        return this.startSecond;
    }

    @NotNull
    public final String getTimeLineType() {
        int i7 = 1;
        if (this.hasImgUrl != 1) {
            i7 = 2;
        }
        return String.valueOf(i7);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValidInitPosition() {
        int i7 = this.initPosition;
        List<VideoTimeAxisItem> list = this.items;
        return Math.max(0, Math.min(i7, (list != null ? list.size() : 1) - 1));
    }

    public int hashCode() {
        int iA = C3554n0.a(C3554n0.a(Integer.hashCode(this.color) * 31, 31, this.startSecond), 31, this.endSecond);
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.iconNight;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<VideoTimeAxisItem> list = this.items;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str3 = this.title;
        int iA2 = I.a(this.scrollHorizontalOffset, I.a(this.initPosition, I.a(this.segment, I.a(this.type, (((((((iA + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31);
        String str4 = this.leftTitle;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rightTitle;
        return Boolean.hashCode(this.isFolded) + I.a(this.recyclerViewHeight, I.a(this.containerHeight, z.a(I.a(this.hasImgUrl, I.a(this.hangStyleSignal, (((iA2 + iHashCode4) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31), 31, this.hasMeasured), 31), 31);
    }

    public final boolean isFolded() {
        return this.isFolded;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isFoldingToEnd(@org.jetbrains.annotations.NotNull android.content.Context r6) {
        /*
            r5 = this;
            r0 = r5
            java.util.List<com.bilibili.search2.api.VideoTimeAxisItem> r0 = r0.items
            java.util.Collection r0 = (java.util.Collection) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            goto L3b
        L1b:
            r0 = r5
            int r0 = r0.initPosition
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = r5
            java.util.List<com.bilibili.search2.api.VideoTimeAxisItem> r1 = r1.items
            int r1 = r1.size()
            r2 = r5
            r3 = r6
            float r2 = r2.getFoldingSegment(r3)
            int r2 = (int) r2
            int r1 = r1 - r2
            if (r0 <= r1) goto L3b
            goto L3d
        L3b:
            r0 = 0
            r8 = r0
        L3d:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchTimeAxisItem.isFoldingToEnd(android.content.Context):boolean");
    }

    public final boolean isFoldingValid() {
        List<VideoTimeAxisItem> list;
        return (this.endSecond == 0 || (list = this.items) == null || list.isEmpty()) ? false : true;
    }

    public final boolean needFoldingShowFull(@NotNull Context context) {
        boolean z6 = false;
        if (getFoldingSegment(context) > (this.items != null ? r0.size() : 0)) {
            z6 = true;
        }
        return z6;
    }

    public final void setColor(int i7) {
        this.color = i7;
    }

    public final void setContainerHeight(int i7) {
        this.containerHeight = i7;
    }

    public final void setEndSecond(long j7) {
        this.endSecond = j7;
    }

    public final void setFolded(boolean z6) {
        this.isFolded = z6;
    }

    public final void setHangStyleSignal(int i7) {
        this.hangStyleSignal = i7;
    }

    public final void setHasImgUrl(int i7) {
        this.hasImgUrl = i7;
    }

    public final void setHasMeasured(boolean z6) {
        this.hasMeasured = z6;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIconNight(@Nullable String str) {
        this.iconNight = str;
    }

    public final void setInitPosition(int i7) {
        this.initPosition = i7;
    }

    public final void setItems(@Nullable List<VideoTimeAxisItem> list) {
        this.items = list;
    }

    public final void setLeftTitle(@Nullable String str) {
        this.leftTitle = str;
    }

    public final void setRecyclerViewHeight(int i7) {
        this.recyclerViewHeight = i7;
    }

    public final void setRightTitle(@Nullable String str) {
        this.rightTitle = str;
    }

    public final void setScrollHorizontalOffset(int i7) {
        this.scrollHorizontalOffset = i7;
    }

    public final void setSegment(int i7) {
        this.segment = i7;
    }

    public final void setStartSecond(long j7) {
        this.startSecond = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.color;
        long j7 = this.startSecond;
        long j8 = this.endSecond;
        String str = this.icon;
        String str2 = this.iconNight;
        List<VideoTimeAxisItem> list = this.items;
        String str3 = this.title;
        int i8 = this.type;
        int i9 = this.segment;
        int i10 = this.initPosition;
        int i11 = this.scrollHorizontalOffset;
        String str4 = this.leftTitle;
        String str5 = this.rightTitle;
        int i12 = this.hangStyleSignal;
        int i13 = this.hasImgUrl;
        boolean z6 = this.hasMeasured;
        int i14 = this.containerHeight;
        int i15 = this.recyclerViewHeight;
        boolean z7 = this.isFolded;
        StringBuilder sbA = C2157f0.a(i7, j7, "SearchTimeAxisItem(color=", ", startSecond=");
        J1.z.a(j8, ", endSecond=", ", icon=", sbA);
        B.a(str, ", iconNight=", str2, ", items=", sbA);
        O.b(", title=", str3, ", type=", sbA, list);
        C4690e.a(i8, i9, ", segment=", ", initPosition=", sbA);
        C4690e.a(i10, i11, ", scrollHorizontalOffset=", ", leftTitle=", sbA);
        B.a(str4, ", rightTitle=", str5, ", hangStyleSignal=", sbA);
        C4690e.a(i12, i13, ", hasImgUrl=", ", hasMeasured=", sbA);
        C3353d.b(", containerHeight=", ", recyclerViewHeight=", i14, z6, sbA);
        sbA.append(i15);
        sbA.append(", isFolded=");
        sbA.append(z7);
        sbA.append(")");
        return sbA.toString();
    }
}
