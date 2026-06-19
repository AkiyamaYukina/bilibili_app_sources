package com.bilibili.playerbizcommonv2.history;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.playerdb.basic.IPlayerDBData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonVideoPlayerDBData.class */
public class CommonVideoPlayerDBData implements IPlayerDBData {
    public static final Parcelable.Creator<CommonVideoPlayerDBData> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f81780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f81781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f81783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f81784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81786g;
    public int h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonVideoPlayerDBData$a.class */
    public final class a implements Parcelable.Creator<CommonVideoPlayerDBData> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.playerbizcommonv2.history.CommonVideoPlayerDBData, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final CommonVideoPlayerDBData createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f81780a = parcel.readLong();
            obj.f81781b = parcel.readLong();
            obj.f81782c = parcel.readInt();
            obj.f81783d = parcel.readString();
            obj.f81784e = parcel.readString();
            obj.f81785f = parcel.readInt();
            obj.f81786g = parcel.readString();
            obj.h = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final CommonVideoPlayerDBData[] newArray(int i7) {
            return new CommonVideoPlayerDBData[i7];
        }
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final String L0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", (Object) Long.valueOf(this.f81780a));
        jSONObject.put("cid", (Object) Long.valueOf(this.f81781b));
        jSONObject.put("vtp", (Object) Integer.valueOf(this.f81782c));
        jSONObject.put("pg", (Object) Integer.valueOf(this.f81785f));
        jSONObject.put("pgn", (Object) this.f81786g);
        jSONObject.put("pgcnt", (Object) Integer.valueOf(this.h));
        return jSONObject.toJSONString();
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final void V0(String str) throws JSONException {
        JSONObject object = JSON.parseObject(str);
        this.f81780a = object.getLong("aid").longValue();
        this.f81781b = object.getLong("cid").longValue();
        this.f81782c = object.getInteger("vtp").intValue();
        this.f81785f = object.getInteger("pg").intValue();
        this.f81786g = object.getString("pgn");
        int intValue = object.getIntValue("pgcnt");
        this.h = intValue;
        if (intValue == 0) {
            this.h = Integer.MAX_VALUE;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final void k(@Nullable String str) throws JSONException {
        JSONObject object = JSON.parseObject(str);
        this.f81783d = object.getString("tt");
        this.f81784e = object.getString("cv");
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final String l() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tt", (Object) this.f81783d);
        jSONObject.put("cv", (Object) this.f81784e);
        return jSONObject.toJSONString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f81780a);
        parcel.writeLong(this.f81781b);
        parcel.writeInt(this.f81782c);
        parcel.writeString(this.f81783d);
        parcel.writeString(this.f81784e);
        parcel.writeInt(this.f81785f);
        parcel.writeString(this.f81786g);
        parcel.writeInt(this.h);
    }
}
