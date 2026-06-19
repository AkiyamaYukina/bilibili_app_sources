package com.bilibili.search2.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import androidx.room.B;
import cf.n;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.widget.search.ISearchTag;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchReferral.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchReferral {
    public static final int $stable = 8;

    @JSONField(name = "exp_str")
    @Nullable
    private String expStr;

    @JSONField(name = "list")
    @Nullable
    private List<Guess> list;

    @JSONField(name = "pages")
    private int pages;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "trackid")
    @Nullable
    private String trackId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchReferral$Guess.class */
    @StabilityInferred(parameters = 0)
    @Parcelize
    @Keep
    public static final class Guess implements Parcelable, ISearchTag {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<Guess> CREATOR = new Object();

        @JvmField
        @JSONField(name = "abtestId")
        @Nullable
        public String abtestId;

        @JvmField
        @JSONField(name = "cover")
        @Nullable
        public String cover;

        @JvmField
        @JSONField(name = "from")
        public int from;

        @JvmField
        @JSONField(name = "holderMeta")
        @NotNull
        public HolderMeta holderMeta;

        @JvmField
        @JSONField(name = "icon")
        @Nullable
        public String icon;

        @JvmField
        @JSONField(name = "icon_night")
        @Nullable
        public String iconNight;

        @JvmField
        @JSONField(name = "icon_type")
        public long iconTypeLong;

        @JvmField
        @JSONField(name = "isSelected")
        public boolean isSelected;

        @JvmField
        @JSONField(name = "keyword")
        @Nullable
        public String keyword;

        @JvmField
        @JSONField(name = "param")
        @Nullable
        public String param;

        @JvmField
        @JSONField(name = "position")
        public int position;

        @JvmField
        @JSONField(name = "recommend_reason")
        @Nullable
        public String rcmdReason;

        @JvmField
        @JSONField(name = "show_name")
        @Nullable
        public String showName;

        @JvmField
        @JSONField(name = "trackId")
        @Nullable
        public String trackId;

        @JvmField
        @JSONField(name = "type")
        @Nullable
        public String type;

        @JvmField
        @JSONField(name = "title")
        @Nullable
        public String word;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchReferral$Guess$a.class */
        public static final class a implements Parcelable.Creator<Guess> {
            @Override // android.os.Parcelable.Creator
            public final Guess createFromParcel(Parcel parcel) {
                return new Guess(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), HolderMeta.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Guess[] newArray(int i7) {
                return new Guess[i7];
            }
        }

        public Guess() {
            this(null, null, null, null, 0, null, null, null, 0L, null, null, null, null, false, 0, null, 65535, null);
        }

        public Guess(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z6, int i8, @NotNull HolderMeta holderMeta) {
            this.param = str;
            this.word = str2;
            this.type = str3;
            this.trackId = str4;
            this.position = i7;
            this.abtestId = str5;
            this.icon = str6;
            this.iconNight = str7;
            this.iconTypeLong = j7;
            this.rcmdReason = str8;
            this.showName = str9;
            this.keyword = str10;
            this.cover = str11;
            this.isSelected = z6;
            this.from = i8;
            this.holderMeta = holderMeta;
        }

        public /* synthetic */ Guess(String str, String str2, String str3, String str4, int i7, String str5, String str6, String str7, long j7, String str8, String str9, String str10, String str11, boolean z6, int i8, HolderMeta holderMeta, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : str4, (i9 & 16) != 0 ? 0 : i7, (i9 & 32) != 0 ? null : str5, (i9 & 64) != 0 ? null : str6, (i9 & 128) != 0 ? null : str7, (i9 & 256) != 0 ? 0L : j7, (i9 & 512) != 0 ? null : str8, (i9 & 1024) != 0 ? null : str9, (i9 & 2048) != 0 ? null : str10, (i9 & 4096) != 0 ? null : str11, (i9 & 8192) != 0 ? false : z6, (i9 & 16384) != 0 ? 0 : i8, (i9 & 32768) != 0 ? new HolderMeta(0) : holderMeta);
        }

        public static /* synthetic */ Guess copy$default(Guess guess, String str, String str2, String str3, String str4, int i7, String str5, String str6, String str7, long j7, String str8, String str9, String str10, String str11, boolean z6, int i8, HolderMeta holderMeta, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = guess.param;
            }
            if ((i9 & 2) != 0) {
                str2 = guess.word;
            }
            if ((i9 & 4) != 0) {
                str3 = guess.type;
            }
            if ((i9 & 8) != 0) {
                str4 = guess.trackId;
            }
            if ((i9 & 16) != 0) {
                i7 = guess.position;
            }
            if ((i9 & 32) != 0) {
                str5 = guess.abtestId;
            }
            if ((i9 & 64) != 0) {
                str6 = guess.icon;
            }
            if ((i9 & 128) != 0) {
                str7 = guess.iconNight;
            }
            if ((i9 & 256) != 0) {
                j7 = guess.iconTypeLong;
            }
            if ((i9 & 512) != 0) {
                str8 = guess.rcmdReason;
            }
            if ((i9 & 1024) != 0) {
                str9 = guess.showName;
            }
            if ((i9 & 2048) != 0) {
                str10 = guess.keyword;
            }
            if ((i9 & 4096) != 0) {
                str11 = guess.cover;
            }
            if ((i9 & 8192) != 0) {
                z6 = guess.isSelected;
            }
            if ((i9 & 16384) != 0) {
                i8 = guess.from;
            }
            if ((i9 & 32768) != 0) {
                holderMeta = guess.holderMeta;
            }
            return guess.copy(str, str2, str3, str4, i7, str5, str6, str7, j7, str8, str9, str10, str11, z6, i8, holderMeta);
        }

        @Nullable
        public final String component1() {
            return this.param;
        }

        @Nullable
        public final String component10() {
            return this.rcmdReason;
        }

        @Nullable
        public final String component11() {
            return this.showName;
        }

        @Nullable
        public final String component12() {
            return this.keyword;
        }

        @Nullable
        public final String component13() {
            return this.cover;
        }

        public final boolean component14() {
            return this.isSelected;
        }

        public final int component15() {
            return this.from;
        }

        @NotNull
        public final HolderMeta component16() {
            return this.holderMeta;
        }

        @Nullable
        public final String component2() {
            return this.word;
        }

        @Nullable
        public final String component3() {
            return this.type;
        }

        @Nullable
        public final String component4() {
            return this.trackId;
        }

        public final int component5() {
            return this.position;
        }

        @Nullable
        public final String component6() {
            return this.abtestId;
        }

        @Nullable
        public final String component7() {
            return this.icon;
        }

        @Nullable
        public final String component8() {
            return this.iconNight;
        }

        public final long component9() {
            return this.iconTypeLong;
        }

        @NotNull
        public final Guess copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z6, int i8, @NotNull HolderMeta holderMeta) {
            return new Guess(str, str2, str3, str4, i7, str5, str6, str7, j7, str8, str9, str10, str11, z6, i8, holderMeta);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Guess)) {
                return false;
            }
            Guess guess = (Guess) obj;
            return Intrinsics.areEqual(this.param, guess.param) && Intrinsics.areEqual(this.word, guess.word) && Intrinsics.areEqual(this.type, guess.type) && Intrinsics.areEqual(this.trackId, guess.trackId) && this.position == guess.position && Intrinsics.areEqual(this.abtestId, guess.abtestId) && Intrinsics.areEqual(this.icon, guess.icon) && Intrinsics.areEqual(this.iconNight, guess.iconNight) && this.iconTypeLong == guess.iconTypeLong && Intrinsics.areEqual(this.rcmdReason, guess.rcmdReason) && Intrinsics.areEqual(this.showName, guess.showName) && Intrinsics.areEqual(this.keyword, guess.keyword) && Intrinsics.areEqual(this.cover, guess.cover) && this.isSelected == guess.isSelected && this.from == guess.from && Intrinsics.areEqual(this.holderMeta, guess.holderMeta);
        }

        @NotNull
        public final String getIconType() {
            return String.valueOf(this.iconTypeLong);
        }

        @Nullable
        public String getIconUrl() {
            return null;
        }

        @Nullable
        public String getTagName() {
            return this.word;
        }

        @Nullable
        public String getUri() {
            return null;
        }

        public int getWordType() {
            return 0;
        }

        public int hashCode() {
            String str = this.param;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.word;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.type;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.trackId;
            int iA = I.a(this.position, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            String str5 = this.abtestId;
            int iHashCode4 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.icon;
            int iHashCode5 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.iconNight;
            int iA2 = C3554n0.a((((((iA + iHashCode4) * 31) + iHashCode5) * 31) + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.iconTypeLong);
            String str8 = this.rcmdReason;
            int iHashCode6 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.showName;
            int iHashCode7 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.keyword;
            int iHashCode8 = str10 == null ? 0 : str10.hashCode();
            String str11 = this.cover;
            return this.holderMeta.hashCode() + I.a(this.from, z.a((((((((iA2 + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.isSelected), 31);
        }

        @NotNull
        public String toString() {
            String str = this.param;
            String str2 = this.word;
            String str3 = this.type;
            String str4 = this.trackId;
            int i7 = this.position;
            String str5 = this.abtestId;
            String str6 = this.icon;
            String str7 = this.iconNight;
            long j7 = this.iconTypeLong;
            String str8 = this.rcmdReason;
            String str9 = this.showName;
            String str10 = this.keyword;
            String str11 = this.cover;
            boolean z6 = this.isSelected;
            int i8 = this.from;
            HolderMeta holderMeta = this.holderMeta;
            StringBuilder sbA = G0.b.a("Guess(param=", str, ", word=", str2, ", type=");
            B.a(str3, ", trackId=", str4, ", position=", sbA);
            M.a(i7, ", abtestId=", str5, ", icon=", sbA);
            B.a(str6, ", iconNight=", str7, ", iconTypeLong=", sbA);
            G0.d.a(j7, ", rcmdReason=", str8, sbA);
            B.a(", showName=", str9, ", keyword=", str10, sbA);
            n.a(", cover=", str11, ", isSelected=", sbA, z6);
            sbA.append(", from=");
            sbA.append(i8);
            sbA.append(", holderMeta=");
            sbA.append(holderMeta);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeString(this.param);
            parcel.writeString(this.word);
            parcel.writeString(this.type);
            parcel.writeString(this.trackId);
            parcel.writeInt(this.position);
            parcel.writeString(this.abtestId);
            parcel.writeString(this.icon);
            parcel.writeString(this.iconNight);
            parcel.writeLong(this.iconTypeLong);
            parcel.writeString(this.rcmdReason);
            parcel.writeString(this.showName);
            parcel.writeString(this.keyword);
            parcel.writeString(this.cover);
            parcel.writeInt(this.isSelected ? 1 : 0);
            parcel.writeInt(this.from);
            this.holderMeta.writeToParcel(parcel, i7);
        }
    }

    @Nullable
    public final String getExpStr() {
        return this.expStr;
    }

    @Nullable
    public final List<Guess> getList() {
        return this.list;
    }

    public final int getPages() {
        return this.pages;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    public final void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    public final void setList(@Nullable List<Guess> list) {
        this.list = list;
    }

    public final void setPages(int i7) {
        this.pages = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }
}
