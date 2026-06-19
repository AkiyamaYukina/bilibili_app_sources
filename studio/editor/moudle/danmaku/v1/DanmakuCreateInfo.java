package com.bilibili.studio.editor.moudle.danmaku.v1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.util.U;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuCreateInfo.class */
@Keep
public class DanmakuCreateInfo implements Parcelable {
    public static final Parcelable.Creator<DanmakuCreateInfo> CREATOR = new Object();
    public static final int TYPE_CREATE = 0;
    public static final int TYPE_MOUNT = 1;
    public String assetLic;
    public String assetPath;
    public int danmakuType;
    public int isCreate;
    public long sid;
    public String subtitle;
    public long time;
    public String title;
    public int titleLimit;
    public String trackName;
    public DanmakuTypeItem typeItem;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuCreateInfo$a.class */
    public final class a implements Parcelable.Creator<DanmakuCreateInfo> {
        @Override // android.os.Parcelable.Creator
        public final DanmakuCreateInfo createFromParcel(Parcel parcel) {
            return new DanmakuCreateInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DanmakuCreateInfo[] newArray(int i7) {
            return new DanmakuCreateInfo[i7];
        }
    }

    public DanmakuCreateInfo() {
        this.time = 0L;
    }

    public DanmakuCreateInfo(Parcel parcel) {
        this.time = 0L;
        this.danmakuType = parcel.readInt();
        this.isCreate = parcel.readInt();
        this.title = parcel.readString();
        this.time = parcel.readLong();
        this.trackName = parcel.readString();
        this.subtitle = parcel.readString();
        this.assetPath = parcel.readString();
        this.assetLic = parcel.readString();
        this.sid = parcel.readLong();
    }

    private static String convert2LocalTime(String str, long j7) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            TimeZone.setDefault(null);
            TimeZone timeZone = TimeZone.getDefault();
            TimeZone timeZone2 = DesugarTimeZone.getTimeZone("Asia/Shanghai");
            if (timeZone.getRawOffset() == timeZone2.getRawOffset()) {
                return str;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
            String strB = U.b(j7, simpleDateFormat);
            simpleDateFormat.setTimeZone(timeZone2);
            return str.replace(U.b(j7, simpleDateFormat), strB);
        } catch (Exception e7) {
            e7.printStackTrace();
            return str;
        }
    }

    public static DanmakuCreateInfo createInfo(int i7, int i8, String str, String str2, long j7, String str3, long j8, String str4, String str5, int i9, DanmakuTypeItem danmakuTypeItem) {
        DanmakuCreateInfo danmakuCreateInfo = new DanmakuCreateInfo();
        danmakuCreateInfo.isCreate = i7;
        danmakuCreateInfo.danmakuType = i8;
        danmakuCreateInfo.title = str;
        danmakuCreateInfo.subtitle = str2;
        danmakuCreateInfo.time = j7;
        danmakuCreateInfo.trackName = str3;
        danmakuCreateInfo.sid = j8;
        danmakuCreateInfo.assetPath = str4;
        danmakuCreateInfo.assetLic = str5;
        danmakuCreateInfo.titleLimit = i9;
        danmakuCreateInfo.typeItem = danmakuTypeItem;
        return danmakuCreateInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCreate() {
        return this.isCreate == 0;
    }

    public boolean isLive() {
        return this.danmakuType == 2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.isCreate);
        parcel.writeInt(this.danmakuType);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeLong(this.time);
        parcel.writeString(this.trackName);
        parcel.writeString(this.assetLic);
        parcel.writeString(this.assetPath);
        parcel.writeLong(this.sid);
    }
}
