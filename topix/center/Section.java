package com.bilibili.topix.center;

import android.content.res.Resources;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/Section.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Section implements n {
    public static final int $stable = 8;

    @Nullable
    private TopixCenterItemType childType;

    @Nullable
    private String moreLink;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/Section$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f112370a;

        static {
            int[] iArr = new int[TopixCenterItemType.values().length];
            try {
                iArr[TopixCenterItemType.TOPIC_HOT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TopixCenterItemType.TOPIC_COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[TopixCenterItemType.TOPIC_IP.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f112370a = iArr;
        }
    }

    public Section() {
        this(null, null, 3, null);
    }

    public Section(@Nullable TopixCenterItemType topixCenterItemType, @Nullable String str) {
        this.childType = topixCenterItemType;
        this.moreLink = str;
    }

    public /* synthetic */ Section(TopixCenterItemType topixCenterItemType, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : topixCenterItemType, (i7 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ Section copy$default(Section section, TopixCenterItemType topixCenterItemType, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            topixCenterItemType = section.childType;
        }
        if ((i7 & 2) != 0) {
            str = section.moreLink;
        }
        return section.copy(topixCenterItemType, str);
    }

    @Nullable
    public final TopixCenterItemType component1() {
        return this.childType;
    }

    @Nullable
    public final String component2() {
        return this.moreLink;
    }

    @NotNull
    public final Section copy(@Nullable TopixCenterItemType topixCenterItemType, @Nullable String str) {
        return new Section(topixCenterItemType, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(Section.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Section section = (Section) obj;
        return this.childType == section.childType && Intrinsics.areEqual(this.moreLink, section.moreLink);
    }

    @Nullable
    public final TopixCenterItemType getChildType() {
        return this.childType;
    }

    @Nullable
    public final String getMoreLink() {
        return this.moreLink;
    }

    @NotNull
    public final String getSectionTitle(@NotNull Resources resources) {
        TopixCenterItemType topixCenterItemType = this.childType;
        int i7 = topixCenterItemType == null ? -1 : a.f112370a[topixCenterItemType.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(2131836463) : resources.getString(2131854651) : resources.getString(2131854663) : resources.getString(2131842699);
    }

    @Override // com.bilibili.topix.center.n
    @NotNull
    public TopixCenterItemType getType() {
        return TopixCenterItemType.TOPIC_SECTION;
    }

    public int hashCode() {
        TopixCenterItemType topixCenterItemType = this.childType;
        int iHashCode = 0;
        int iHashCode2 = topixCenterItemType != null ? topixCenterItemType.hashCode() : 0;
        String str = this.moreLink;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setChildType(@Nullable TopixCenterItemType topixCenterItemType) {
        this.childType = topixCenterItemType;
    }

    public final void setMoreLink(@Nullable String str) {
        this.moreLink = str;
    }

    @NotNull
    public String toString() {
        return "Section(childType=" + this.childType + ", moreLink=" + this.moreLink + ")";
    }
}
