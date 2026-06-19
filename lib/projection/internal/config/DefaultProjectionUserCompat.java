package com.bilibili.lib.projection.internal.config;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import ne0.InterfaceC8086b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/config/DefaultProjectionUserCompat.class */
public final class DefaultProjectionUserCompat implements InterfaceC8086b, Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63016b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63019e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f63017c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f63018d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public ArrayList<String> f63020f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public ArrayList<String> f63021g = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/config/DefaultProjectionUserCompat$a.class */
    public static final class a implements Parcelable.Creator<DefaultProjectionUserCompat> {
        @Override // android.os.Parcelable.Creator
        public final DefaultProjectionUserCompat createFromParcel(Parcel parcel) {
            DefaultProjectionUserCompat defaultProjectionUserCompat = new DefaultProjectionUserCompat();
            defaultProjectionUserCompat.f63015a = parcel.readInt();
            defaultProjectionUserCompat.f63016b = parcel.readByte() != 0;
            String string = parcel.readString();
            String str = string;
            if (string == null) {
                str = "";
            }
            defaultProjectionUserCompat.f63017c = str;
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            defaultProjectionUserCompat.f63018d = string2;
            defaultProjectionUserCompat.f63019e = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayList = arrayListCreateStringArrayList;
            if (arrayListCreateStringArrayList == null) {
                arrayList = new ArrayList<>();
            }
            defaultProjectionUserCompat.f63020f = arrayList;
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayList2 = arrayListCreateStringArrayList2;
            if (arrayListCreateStringArrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            defaultProjectionUserCompat.f63021g = arrayList2;
            return defaultProjectionUserCompat;
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultProjectionUserCompat[] newArray(int i7) {
            return new DefaultProjectionUserCompat[i7];
        }
    }

    @Override // ne0.InterfaceC8086b
    public final int a() {
        return this.f63015a;
    }

    @Override // ne0.InterfaceC8086b
    public final int b() {
        return this.f63019e;
    }

    @Override // ne0.InterfaceC8086b
    @NotNull
    public final ArrayList<String> c() {
        return this.f63021g;
    }

    @Override // ne0.InterfaceC8086b
    @NotNull
    public final String d() {
        return this.f63018d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ne0.InterfaceC8086b
    @NotNull
    public final String h() {
        return this.f63017c;
    }

    @Override // ne0.InterfaceC8086b
    @NotNull
    public final ArrayList<String> i() {
        return this.f63020f;
    }

    @Override // ne0.InterfaceC8086b
    public final boolean isConnected() {
        return this.f63016b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f63015a);
        parcel.writeByte(this.f63016b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f63017c);
        parcel.writeString(this.f63018d);
        parcel.writeInt(this.f63019e);
        parcel.writeStringList(CollectionsKt.toList(this.f63020f));
        parcel.writeStringList(CollectionsKt.toList(this.f63021g));
    }
}
