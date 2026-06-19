package com.bilibili.biligame.api;

import I.E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchSurprise.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class BiligameSearchSurprise implements Parcelable {

    @NotNull
    private String description;

    @JSONField(name = "gif_ending")
    private int gifEndResult;

    @JSONField(name = "play_count")
    private int gifRepeatCount;

    @NotNull
    private String image;

    @NotNull
    private String link;

    @NotNull
    private String title;
    private int type;

    @NotNull
    public static final Parcelable.Creator<BiligameSearchSurprise> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchSurprise$a.class */
    public static final class a implements Parcelable.Creator<BiligameSearchSurprise> {
        @Override // android.os.Parcelable.Creator
        public final BiligameSearchSurprise createFromParcel(Parcel parcel) {
            return new BiligameSearchSurprise(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BiligameSearchSurprise[] newArray(int i7) {
            return new BiligameSearchSurprise[i7];
        }
    }

    public BiligameSearchSurprise() {
        this(0, null, 0, 0, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public BiligameSearchSurprise(int i7, @NotNull String str, int i8, int i9, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.type = i7;
        this.image = str;
        this.gifEndResult = i8;
        this.gifRepeatCount = i9;
        this.link = str2;
        this.title = str3;
        this.description = str4;
    }

    public /* synthetic */ BiligameSearchSurprise(int i7, String str, int i8, int i9, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1 : i7, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? 1 : i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? "" : str4);
    }

    public static /* synthetic */ BiligameSearchSurprise copy$default(BiligameSearchSurprise biligameSearchSurprise, int i7, String str, int i8, int i9, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = biligameSearchSurprise.type;
        }
        if ((i10 & 2) != 0) {
            str = biligameSearchSurprise.image;
        }
        if ((i10 & 4) != 0) {
            i8 = biligameSearchSurprise.gifEndResult;
        }
        if ((i10 & 8) != 0) {
            i9 = biligameSearchSurprise.gifRepeatCount;
        }
        if ((i10 & 16) != 0) {
            str2 = biligameSearchSurprise.link;
        }
        if ((i10 & 32) != 0) {
            str3 = biligameSearchSurprise.title;
        }
        if ((i10 & 64) != 0) {
            str4 = biligameSearchSurprise.description;
        }
        return biligameSearchSurprise.copy(i7, str, i8, i9, str2, str3, str4);
    }

    public final int component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.image;
    }

    public final int component3() {
        return this.gifEndResult;
    }

    public final int component4() {
        return this.gifRepeatCount;
    }

    @NotNull
    public final String component5() {
        return this.link;
    }

    @NotNull
    public final String component6() {
        return this.title;
    }

    @NotNull
    public final String component7() {
        return this.description;
    }

    @NotNull
    public final BiligameSearchSurprise copy(int i7, @NotNull String str, int i8, int i9, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        return new BiligameSearchSurprise(i7, str, i8, i9, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameSearchSurprise)) {
            return false;
        }
        BiligameSearchSurprise biligameSearchSurprise = (BiligameSearchSurprise) obj;
        return this.type == biligameSearchSurprise.type && Intrinsics.areEqual(this.image, biligameSearchSurprise.image) && this.gifEndResult == biligameSearchSurprise.gifEndResult && this.gifRepeatCount == biligameSearchSurprise.gifRepeatCount && Intrinsics.areEqual(this.link, biligameSearchSurprise.link) && Intrinsics.areEqual(this.title, biligameSearchSurprise.title) && Intrinsics.areEqual(this.description, biligameSearchSurprise.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getGifEndResult() {
        return this.gifEndResult;
    }

    public final int getGifRepeatCount() {
        return this.gifRepeatCount;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + E.a(E.a(I.a(this.gifRepeatCount, I.a(this.gifEndResult, E.a(Integer.hashCode(this.type) * 31, 31, this.image), 31), 31), 31, this.link), 31, this.title);
    }

    public final void setDescription(@NotNull String str) {
        this.description = str;
    }

    public final void setGifEndResult(int i7) {
        this.gifEndResult = i7;
    }

    public final void setGifRepeatCount(int i7) {
        this.gifRepeatCount = i7;
    }

    public final void setImage(@NotNull String str) {
        this.image = str;
    }

    public final void setLink(@NotNull String str) {
        this.link = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.image;
        int i8 = this.gifEndResult;
        int i9 = this.gifRepeatCount;
        String str2 = this.link;
        String str3 = this.title;
        String str4 = this.description;
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "BiligameSearchSurprise(type=", ", image=", str, ", gifEndResult=");
        C4690e.a(i8, i9, ", gifRepeatCount=", ", link=", sbB);
        B.a(str2, ", title=", str3, ", description=", sbB);
        return C8770a.a(sbB, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.type);
        parcel.writeString(this.image);
        parcel.writeInt(this.gifEndResult);
        parcel.writeInt(this.gifRepeatCount);
        parcel.writeString(this.link);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
