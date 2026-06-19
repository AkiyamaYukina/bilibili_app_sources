package com.bilibili.tgwt.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.b;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo.class */
@StabilityInferred(parameters = 0)
@Bson
@Parcelize
public final class FilmSelectionPageTabVo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FilmSelectionPageTabVo> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("tab_type")
    @Nullable
    private String f110829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private String f110830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("child")
    @Nullable
    private List<FilmSelectionPageChildTabVo> f110831c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo$FilmSelectionPageChildTabVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    @Parcelize
    public static final class FilmSelectionPageChildTabVo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FilmSelectionPageChildTabVo> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("tab_type")
        @Nullable
        private String f110832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("title")
        @Nullable
        private String f110833b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo$FilmSelectionPageChildTabVo$a.class */
        public static final class a implements Parcelable.Creator<FilmSelectionPageChildTabVo> {
            @Override // android.os.Parcelable.Creator
            public final FilmSelectionPageChildTabVo createFromParcel(Parcel parcel) {
                return new FilmSelectionPageChildTabVo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FilmSelectionPageChildTabVo[] newArray(int i7) {
                return new FilmSelectionPageChildTabVo[i7];
            }
        }

        public FilmSelectionPageChildTabVo() {
            this(null, null, 3);
        }

        public FilmSelectionPageChildTabVo(@Nullable String str, @Nullable String str2) {
            this.f110832a = str;
            this.f110833b = str2;
        }

        public /* synthetic */ FilmSelectionPageChildTabVo(String str, String str2, int i7) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
        }

        @Nullable
        public final String a() {
            return this.f110832a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getTitle() {
            return this.f110833b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeString(this.f110832a);
            parcel.writeString(this.f110833b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo$a.class */
    public static final class a implements Parcelable.Creator<FilmSelectionPageTabVo> {
        @Override // android.os.Parcelable.Creator
        public final FilmSelectionPageTabVo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
                    iA = b.a(FilmSelectionPageChildTabVo.CREATOR, parcel, arrayList2, i8, 1);
                }
                arrayList = arrayList2;
            }
            return new FilmSelectionPageTabVo(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FilmSelectionPageTabVo[] newArray(int i7) {
            return new FilmSelectionPageTabVo[i7];
        }
    }

    public FilmSelectionPageTabVo() {
        this(7, null, null, null);
    }

    public /* synthetic */ FilmSelectionPageTabVo(int i7, String str, List list, String str2) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list);
    }

    public FilmSelectionPageTabVo(@Nullable String str, @Nullable String str2, @Nullable List<FilmSelectionPageChildTabVo> list) {
        this.f110829a = str;
        this.f110830b = str2;
        this.f110831c = list;
    }

    @Nullable
    public final List<FilmSelectionPageChildTabVo> a() {
        return this.f110831c;
    }

    @Nullable
    public final String b() {
        return this.f110829a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getTitle() {
        return this.f110830b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f110829a);
        parcel.writeString(this.f110830b);
        List<FilmSelectionPageChildTabVo> list = this.f110831c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((FilmSelectionPageChildTabVo) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
