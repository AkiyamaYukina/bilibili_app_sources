package com.bilibili.socialize.share.core.shareparam;

import Pv0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/BaseShareParam.class */
public abstract class BaseShareParam implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f104998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f104999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f105000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f105001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f105002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f105003f;

    public BaseShareParam() {
        this.f105001d = new HashMap();
        this.f105002e = new HashMap();
    }

    public BaseShareParam(Parcel parcel) {
        HashMap map = new HashMap();
        this.f105001d = map;
        HashMap map2 = new HashMap();
        this.f105002e = map2;
        this.f104998a = parcel.readString();
        this.f104999b = parcel.readString();
        this.f105000c = parcel.readString();
        try {
            parcel.readMap(map, Map.class.getClassLoader());
            parcel.readMap(map2, Map.class.getClassLoader());
        } catch (Exception e7) {
            b.a("BaseShareParam", "BaseShareParam read map from parcel error");
        }
    }

    public BaseShareParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f105001d = new HashMap();
        this.f105002e = new HashMap();
        this.f104998a = str;
        this.f104999b = str2;
        this.f105000c = str3;
    }

    public final void a(String str) {
        ((HashMap) this.f105002e).put(ThirdPartyExtraBuilder.META_INFO_SPMID, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f104998a);
        parcel.writeString(this.f104999b);
        parcel.writeString(this.f105000c);
        try {
            parcel.writeMap(this.f105001d);
            parcel.writeMap(this.f105002e);
        } catch (Exception e7) {
            b.a("BaseShareParam", "BaseShareParam write map to parcel error");
        }
    }
}
