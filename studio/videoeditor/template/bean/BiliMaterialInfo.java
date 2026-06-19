package com.bilibili.studio.videoeditor.template.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.f0;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliMaterialInfo.class */
@Keep
public class BiliMaterialInfo implements Parcelable {
    public static final Parcelable.Creator<BiliMaterialInfo> CREATOR = new Object();
    public List<String> audioId;
    public List<String> sticker;
    public List<String> textId;
    public List<String> videoId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliMaterialInfo$a.class */
    public final class a implements Parcelable.Creator<BiliMaterialInfo> {
        @Override // android.os.Parcelable.Creator
        public final BiliMaterialInfo createFromParcel(Parcel parcel) {
            return new BiliMaterialInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiliMaterialInfo[] newArray(int i7) {
            return new BiliMaterialInfo[i7];
        }
    }

    public BiliMaterialInfo() {
    }

    public BiliMaterialInfo(Parcel parcel) {
        this.audioId = parcel.createStringArrayList();
        this.sticker = parcel.createStringArrayList();
        this.textId = parcel.createStringArrayList();
        this.videoId = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliMaterialInfo{audioId=");
        sb.append(this.audioId);
        sb.append(", sticker=");
        sb.append(this.sticker);
        sb.append(", textId=");
        sb.append(this.textId);
        sb.append(", videoId=");
        return f0.a(sb, this.videoId, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.audioId);
        parcel.writeStringList(this.sticker);
        parcel.writeStringList(this.textId);
        parcel.writeStringList(this.videoId);
    }
}
