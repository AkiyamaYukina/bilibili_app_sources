package com.bilibili.studio.videoeditor.template.bean;

import Di0.C1600d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliImageTextExtra.class */
@Keep
public class BiliImageTextExtra implements Parcelable {
    public static final Parcelable.Creator<BiliImageTextExtra> CREATOR = new Object();

    @JSONField(name = "aspect_ratio")
    public float aspectRatio;

    @JSONField(name = "badge")
    public String badge;

    @JSONField(name = "bind_material_info")
    public BiliMaterialInfo bindMaterialInfo;

    @JSONField(name = "default_length")
    public long defaultLength;

    @JSONField(name = "material_fill_page")
    public int materialFillPage;

    @JSONField(name = "max_rows")
    public long maxRows;

    @JSONField(name = "max_word_count")
    public long maxWordCount;

    @JSONField(name = "max_words")
    public long maxWords;

    @JSONField(name = "min_rows")
    public long minRows;

    @JSONField(name = "min_words")
    public long minWords;

    @JSONField(name = "pop_preview_url")
    public String popPreviewUrl;

    @JSONField(name = "preview_duration")
    public Long previewDuration;

    @JSONField(name = "preview_url")
    public String previewUrl;

    @JSONField(name = "template_desc")
    public String templateDesc;

    @JSONField(name = "template_info")
    public String templateInfo;

    @JSONField(name = "template_type")
    public int templateType;

    @JSONField(name = "text_template_info")
    public String textTemplateInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliImageTextExtra$a.class */
    public final class a implements Parcelable.Creator<BiliImageTextExtra> {
        @Override // android.os.Parcelable.Creator
        public final BiliImageTextExtra createFromParcel(Parcel parcel) {
            return new BiliImageTextExtra(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiliImageTextExtra[] newArray(int i7) {
            return new BiliImageTextExtra[i7];
        }
    }

    public BiliImageTextExtra() {
        this.previewDuration = 0L;
        this.templateDesc = "";
        this.previewUrl = "";
        this.templateInfo = "";
        this.templateType = 1;
        this.defaultLength = 2000L;
        this.materialFillPage = 5;
        this.maxWordCount = 1000L;
        this.minWords = 4L;
        this.maxWords = 17L;
        this.minRows = 1L;
        this.maxRows = 2L;
    }

    public BiliImageTextExtra(Parcel parcel) {
        this.previewDuration = 0L;
        this.templateDesc = "";
        this.previewUrl = "";
        this.templateInfo = "";
        this.templateType = 1;
        this.defaultLength = 2000L;
        this.materialFillPage = 5;
        this.maxWordCount = 1000L;
        this.minWords = 4L;
        this.maxWords = 17L;
        this.minRows = 1L;
        this.maxRows = 2L;
        this.templateDesc = parcel.readString();
        this.previewUrl = parcel.readString();
        this.templateInfo = parcel.readString();
        this.templateType = parcel.readInt();
        this.defaultLength = parcel.readLong();
        this.materialFillPage = parcel.readInt();
        this.maxWordCount = parcel.readLong();
        this.minWords = parcel.readLong();
        this.maxWords = parcel.readLong();
        this.minRows = parcel.readLong();
        this.maxRows = parcel.readLong();
        this.badge = parcel.readString();
        this.bindMaterialInfo = (BiliMaterialInfo) parcel.readParcelable(BiliMaterialInfo.class.getClassLoader());
        this.popPreviewUrl = parcel.readString();
        this.textTemplateInfo = parcel.readString();
        this.aspectRatio = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliImageTextExtra{templateDesc='");
        sb.append(this.templateDesc);
        sb.append("', previewUrl='");
        sb.append(this.previewUrl);
        sb.append("', templateInfo='");
        sb.append(this.templateInfo);
        sb.append("', templateType=");
        sb.append(this.templateType);
        sb.append(", defaultLength=");
        sb.append(this.defaultLength);
        sb.append(", materialFillPage=");
        sb.append(this.materialFillPage);
        sb.append(", maxWordCount=");
        sb.append(this.maxWordCount);
        sb.append(", minWords=");
        sb.append(this.minWords);
        sb.append(", maxWords=");
        sb.append(this.maxWords);
        sb.append(", minRows=");
        sb.append(this.minRows);
        sb.append(", maxRows=");
        sb.append(this.maxRows);
        sb.append(", badge='");
        sb.append(this.badge);
        sb.append("', bindMaterialInfo=");
        sb.append(this.bindMaterialInfo);
        sb.append(", popPreviewUrl='");
        sb.append(this.popPreviewUrl);
        sb.append("', textTemplateInfo='");
        sb.append(this.textTemplateInfo);
        sb.append("', aspectRatio=");
        return C1600d.a(sb, this.aspectRatio, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.templateDesc);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.templateInfo);
        parcel.writeInt(this.templateType);
        parcel.writeLong(this.defaultLength);
        parcel.writeInt(this.materialFillPage);
        parcel.writeLong(this.maxWordCount);
        parcel.writeLong(this.minWords);
        parcel.writeLong(this.maxWords);
        parcel.writeLong(this.minRows);
        parcel.writeLong(this.maxRows);
        parcel.writeString(this.badge);
        parcel.writeParcelable(this.bindMaterialInfo, i7);
        parcel.writeString(this.popPreviewUrl);
        parcel.writeString(this.textTemplateInfo);
        parcel.writeFloat(this.aspectRatio);
    }
}
