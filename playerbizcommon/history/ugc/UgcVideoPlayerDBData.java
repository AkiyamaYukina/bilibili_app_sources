package com.bilibili.playerbizcommon.history.ugc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.playerdb.basic.IPlayerDBData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/UgcVideoPlayerDBData.class */
public class UgcVideoPlayerDBData implements IPlayerDBData {
    public static final Parcelable.Creator<UgcVideoPlayerDBData> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f80086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f80087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f80089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f80090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f80092g;
    public int h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/UgcVideoPlayerDBData$a.class */
    public final class a implements Parcelable.Creator<UgcVideoPlayerDBData> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.playerbizcommon.history.ugc.UgcVideoPlayerDBData, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final UgcVideoPlayerDBData createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f80086a = parcel.readLong();
            obj.f80087b = parcel.readLong();
            obj.f80088c = parcel.readInt();
            obj.f80089d = parcel.readString();
            obj.f80090e = parcel.readString();
            obj.f80091f = parcel.readInt();
            obj.f80092g = parcel.readString();
            obj.h = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final UgcVideoPlayerDBData[] newArray(int i7) {
            return new UgcVideoPlayerDBData[i7];
        }
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final String L0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", (Object) Long.valueOf(this.f80086a));
        jSONObject.put("cid", (Object) Long.valueOf(this.f80087b));
        jSONObject.put("vtp", (Object) Integer.valueOf(this.f80088c));
        jSONObject.put("pg", (Object) Integer.valueOf(this.f80091f));
        jSONObject.put("pgn", (Object) this.f80092g);
        jSONObject.put("pgcnt", (Object) Integer.valueOf(this.h));
        return jSONObject.toJSONString();
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final void V0(String str) throws JSONException {
        JSONObject object = JSON.parseObject(str);
        this.f80086a = object.getLong("aid").longValue();
        this.f80087b = object.getLong("cid").longValue();
        this.f80088c = object.getInteger("vtp").intValue();
        this.f80091f = object.getInteger("pg").intValue();
        this.f80092g = object.getString("pgn");
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
        this.f80089d = object.getString("tt");
        this.f80090e = object.getString("cv");
    }

    @Override // com.bilibili.playerdb.basic.IPlayerDBData
    public final String l() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tt", (Object) this.f80089d);
        jSONObject.put("cv", (Object) this.f80090e);
        return jSONObject.toJSONString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f80086a);
        parcel.writeLong(this.f80087b);
        parcel.writeInt(this.f80088c);
        parcel.writeString(this.f80089d);
        parcel.writeString(this.f80090e);
        parcel.writeInt(this.f80091f);
        parcel.writeString(this.f80092g);
        parcel.writeInt(this.h);
    }
}
