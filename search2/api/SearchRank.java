package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.paging.M;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchRank.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchRank {
    public static final int $stable = 8;

    @JvmField
    @JSONField(name = "holderMeta")
    @NotNull
    public HolderMeta holderMeta;

    @JvmField
    @JSONField(name = "exp_str")
    @Nullable
    public String mExpStr;

    @JvmField
    @JSONField(name = "goto")
    @Nullable
    public String mGoto;

    @JvmField
    @JSONField(name = "icon")
    @Nullable
    public String mIconUrl;

    @JvmField
    @JSONField(name = "keyword")
    @Nullable
    public String mKeyword;

    @JvmField
    @JSONField(name = "module_id")
    public int mModuleId;

    @JvmField
    @JSONField(name = "position")
    public int mPosition;

    @JvmField
    @JSONField(name = "show_name")
    @Nullable
    public String mShowName;

    @JvmField
    @JSONField(name = "track_id")
    @Nullable
    public String mTrackId;

    @JvmField
    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    public String mUri;

    @JvmField
    @JSONField(name = "show_live_icon")
    public boolean nShowLiveIcon;

    @JvmField
    @JSONField(name = "word_type")
    public int wordType;

    public SearchRank() {
        this(null, null, 0, null, null, null, 0, 0, null, null, false, null, 4095, null);
    }

    public SearchRank(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8, int i9, @Nullable String str6, @Nullable String str7, boolean z6, @NotNull HolderMeta holderMeta) {
        this.mShowName = str;
        this.mKeyword = str2;
        this.wordType = i7;
        this.mIconUrl = str3;
        this.mGoto = str4;
        this.mUri = str5;
        this.mPosition = i8;
        this.mModuleId = i9;
        this.mTrackId = str6;
        this.mExpStr = str7;
        this.nShowLiveIcon = z6;
        this.holderMeta = holderMeta;
    }

    public /* synthetic */ SearchRank(String str, String str2, int i7, String str3, String str4, String str5, int i8, int i9, String str6, String str7, boolean z6, HolderMeta holderMeta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? 0 : i8, (i10 & 128) != 0 ? 0 : i9, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? false : z6, (i10 & 2048) != 0 ? new HolderMeta(0) : holderMeta);
    }

    public static /* synthetic */ SearchRank copy$default(SearchRank searchRank, String str, String str2, int i7, String str3, String str4, String str5, int i8, int i9, String str6, String str7, boolean z6, HolderMeta holderMeta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchRank.mShowName;
        }
        if ((i10 & 2) != 0) {
            str2 = searchRank.mKeyword;
        }
        if ((i10 & 4) != 0) {
            i7 = searchRank.wordType;
        }
        if ((i10 & 8) != 0) {
            str3 = searchRank.mIconUrl;
        }
        if ((i10 & 16) != 0) {
            str4 = searchRank.mGoto;
        }
        if ((i10 & 32) != 0) {
            str5 = searchRank.mUri;
        }
        if ((i10 & 64) != 0) {
            i8 = searchRank.mPosition;
        }
        if ((i10 & 128) != 0) {
            i9 = searchRank.mModuleId;
        }
        if ((i10 & 256) != 0) {
            str6 = searchRank.mTrackId;
        }
        if ((i10 & 512) != 0) {
            str7 = searchRank.mExpStr;
        }
        if ((i10 & 1024) != 0) {
            z6 = searchRank.nShowLiveIcon;
        }
        if ((i10 & 2048) != 0) {
            holderMeta = searchRank.holderMeta;
        }
        return searchRank.copy(str, str2, i7, str3, str4, str5, i8, i9, str6, str7, z6, holderMeta);
    }

    @Nullable
    public final String component1() {
        return this.mShowName;
    }

    @Nullable
    public final String component10() {
        return this.mExpStr;
    }

    public final boolean component11() {
        return this.nShowLiveIcon;
    }

    @NotNull
    public final HolderMeta component12() {
        return this.holderMeta;
    }

    @Nullable
    public final String component2() {
        return this.mKeyword;
    }

    public final int component3() {
        return this.wordType;
    }

    @Nullable
    public final String component4() {
        return this.mIconUrl;
    }

    @Nullable
    public final String component5() {
        return this.mGoto;
    }

    @Nullable
    public final String component6() {
        return this.mUri;
    }

    public final int component7() {
        return this.mPosition;
    }

    public final int component8() {
        return this.mModuleId;
    }

    @Nullable
    public final String component9() {
        return this.mTrackId;
    }

    @NotNull
    public final SearchRank copy(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8, int i9, @Nullable String str6, @Nullable String str7, boolean z6, @NotNull HolderMeta holderMeta) {
        return new SearchRank(str, str2, i7, str3, str4, str5, i8, i9, str6, str7, z6, holderMeta);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRank)) {
            return false;
        }
        SearchRank searchRank = (SearchRank) obj;
        return Intrinsics.areEqual(this.mShowName, searchRank.mShowName) && Intrinsics.areEqual(this.mKeyword, searchRank.mKeyword) && this.wordType == searchRank.wordType && Intrinsics.areEqual(this.mIconUrl, searchRank.mIconUrl) && Intrinsics.areEqual(this.mGoto, searchRank.mGoto) && Intrinsics.areEqual(this.mUri, searchRank.mUri) && this.mPosition == searchRank.mPosition && this.mModuleId == searchRank.mModuleId && Intrinsics.areEqual(this.mTrackId, searchRank.mTrackId) && Intrinsics.areEqual(this.mExpStr, searchRank.mExpStr) && this.nShowLiveIcon == searchRank.nShowLiveIcon && Intrinsics.areEqual(this.holderMeta, searchRank.holderMeta);
    }

    public int hashCode() {
        String str = this.mShowName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mKeyword;
        int iA = I.a(this.wordType, ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.mIconUrl;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mGoto;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.mUri;
        int iA2 = I.a(this.mModuleId, I.a(this.mPosition, (((((iA + iHashCode2) * 31) + iHashCode3) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.mTrackId;
        int iHashCode4 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.mExpStr;
        return this.holderMeta.hashCode() + z.a((((iA2 + iHashCode4) * 31) + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.nShowLiveIcon);
    }

    @NotNull
    public String toString() {
        String str = this.mShowName;
        String str2 = this.mKeyword;
        int i7 = this.wordType;
        String str3 = this.mIconUrl;
        String str4 = this.mGoto;
        String str5 = this.mUri;
        int i8 = this.mPosition;
        int i9 = this.mModuleId;
        String str6 = this.mTrackId;
        String str7 = this.mExpStr;
        boolean z6 = this.nShowLiveIcon;
        HolderMeta holderMeta = this.holderMeta;
        StringBuilder sbA = G0.b.a("SearchRank(mShowName=", str, ", mKeyword=", str2, ", wordType=");
        M.a(i7, ", mIconUrl=", str3, ", mGoto=", sbA);
        B.a(str4, ", mUri=", str5, ", mPosition=", sbA);
        C4690e.a(i8, i9, ", mModuleId=", ", mTrackId=", sbA);
        B.a(str6, ", mExpStr=", str7, ", nShowLiveIcon=", sbA);
        sbA.append(z6);
        sbA.append(", holderMeta=");
        sbA.append(holderMeta);
        sbA.append(")");
        return sbA.toString();
    }
}
