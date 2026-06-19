package com.bilibili.search2.result.holder.chatgpt.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.bapis.bilibili.polymer.app.search.v1.Disclaimer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/Disclaimers.class */
@StabilityInferred(parameters = 0)
public final class Disclaimers implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f87975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<DisclaimerItem> f87976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f87977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f87978d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/Disclaimers$a.class */
    public static final class a implements Parcelable.Creator<Disclaimers> {
        @Override // android.os.Parcelable.Creator
        public final Disclaimers createFromParcel(Parcel parcel) {
            return new Disclaimers(parcel.readString(), parcel.createTypedArrayList(DisclaimerItem.CREATOR), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Disclaimers[] newArray(int i7) {
            return new Disclaimers[i7];
        }
    }

    public Disclaimers() {
        this(null, null, null, null);
    }

    public Disclaimers(@NotNull Disclaimer disclaimer) {
        this(null, null, null, null);
        this.f87975a = disclaimer.getTitle();
        ArrayList arrayList = new ArrayList();
        for (Disclaimer.Item item : disclaimer.getListList()) {
            arrayList.add(new DisclaimerItem(item.getIcon(), item.getText()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f87976b = arrayList;
    }

    public Disclaimers(@Nullable String str, @Nullable List<DisclaimerItem> list, @Nullable String str2, @Nullable String str3) {
        this.f87975a = str;
        this.f87976b = list;
        this.f87977c = str2;
        this.f87978d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Disclaimers)) {
            return false;
        }
        Disclaimers disclaimers = (Disclaimers) obj;
        return Intrinsics.areEqual(this.f87975a, disclaimers.f87975a) && Intrinsics.areEqual(this.f87976b, disclaimers.f87976b) && Intrinsics.areEqual(this.f87977c, disclaimers.f87977c) && Intrinsics.areEqual(this.f87978d, disclaimers.f87978d);
    }

    public final int hashCode() {
        String str = this.f87975a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<DisclaimerItem> list = this.f87976b;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.f87977c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f87978d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return A.a(this.f87977c, ", iconNight=", this.f87978d, ")", I01.b.b("Disclaimers(title=", this.f87975a, ", list=", ", iconLight=", this.f87976b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f87975a);
        parcel.writeTypedList(this.f87976b);
        parcel.writeString(this.f87977c);
        parcel.writeString(this.f87978d);
    }
}
