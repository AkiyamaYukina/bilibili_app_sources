package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.I0;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.template.bean.BiliImageTextExtra;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateBean.class */
@Keep
public class VideoTemplateBean implements Parcelable {
    public static final Parcelable.Creator<VideoTemplateBean> CREATOR = new Object();

    @JSONField(name = "author")
    public Author author;

    @JSONField(name = "ctime")
    public long cTime;

    @JSONField(name = "cat_id")
    public long catId;

    @JSONField(name = "corresponding_force_bind")
    public boolean correspondingForceBind;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "template_desc")
    public String desc;

    @JSONField(name = "download_url")
    public String downloadUrl;

    @JSONField(name = CaptureSchema.JUMP_PARAMS_EXTRA)
    public String extra;

    @JSONField(name = "extra_")
    public String extra_;

    @JSONField(name = "id")
    public long id;
    public BiliImageTextExtra imageTextExtra;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public long mRank;

    @JSONField(name = "mtime")
    public long mTime;

    @JSONField(name = "max_cnt")
    public long maxCount;

    @JSONField(name = "min_cnt")
    public long minCount;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "play_url")
    public String playUrl;

    @JSONField(name = "sdk_type")
    public String sdkType;

    @JSONField(name = "tags")
    public String tags;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "up_from")
    public int upFrom;

    @JSONField(name = "use_count")
    public long useCount;

    @JSONField(name = "sdk_tag")
    public boolean useMonSdk;
    public VideoTemplateExtraBean videoTemplateExtraBean;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateBean$a.class */
    public final class a implements Parcelable.Creator<VideoTemplateBean> {
        @Override // android.os.Parcelable.Creator
        public final VideoTemplateBean createFromParcel(Parcel parcel) {
            return new VideoTemplateBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTemplateBean[] newArray(int i7) {
            return new VideoTemplateBean[i7];
        }
    }

    public VideoTemplateBean() {
        this.correspondingForceBind = false;
        this.useMonSdk = false;
    }

    public VideoTemplateBean(Parcel parcel) {
        boolean z6 = false;
        this.correspondingForceBind = false;
        this.useMonSdk = false;
        this.id = parcel.readLong();
        this.catId = parcel.readLong();
        this.name = parcel.readString();
        this.cover = parcel.readString();
        this.mRank = parcel.readLong();
        this.type = parcel.readInt();
        this.upFrom = parcel.readInt();
        this.cTime = parcel.readLong();
        this.mTime = parcel.readLong();
        this.tags = parcel.readString();
        this.maxCount = parcel.readLong();
        this.minCount = parcel.readLong();
        this.downloadUrl = parcel.readString();
        this.playUrl = parcel.readString();
        this.useCount = parcel.readLong();
        this.extra = parcel.readString();
        this.extra_ = parcel.readString();
        this.desc = parcel.readString();
        this.topicId = parcel.readLong();
        this.imageTextExtra = (BiliImageTextExtra) parcel.readParcelable(BiliImageTextExtra.class.getClassLoader());
        this.videoTemplateExtraBean = (VideoTemplateExtraBean) parcel.readParcelable(VideoTemplateExtraBean.class.getClassLoader());
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.useMonSdk = parcel.readInt() == 1 ? true : z6;
        this.sdkType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoTemplateBean{id=");
        sb.append(this.id);
        sb.append(", catId=");
        sb.append(this.catId);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', cover='");
        sb.append(this.cover);
        sb.append("', mRank=");
        sb.append(this.mRank);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", upFrom=");
        sb.append(this.upFrom);
        sb.append(", cTime=");
        sb.append(this.cTime);
        sb.append(", mTime=");
        sb.append(this.mTime);
        sb.append(", tags='");
        sb.append(this.tags);
        sb.append("', maxCount=");
        sb.append(this.maxCount);
        sb.append(", minCount=");
        sb.append(this.minCount);
        sb.append(", downloadUrl='");
        sb.append(this.downloadUrl);
        sb.append("', playUrl='");
        sb.append(this.playUrl);
        sb.append("', useCount=");
        sb.append(this.useCount);
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append("', extra_='");
        sb.append(this.extra_);
        sb.append("', imageTextExtra=");
        sb.append(this.imageTextExtra);
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append("', topicId=");
        sb.append(this.topicId);
        sb.append("', useMonSdk=");
        sb.append(this.useMonSdk);
        sb.append(", sdkType=");
        return I0.b(sb, this.sdkType, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.catId);
        parcel.writeString(this.name);
        parcel.writeString(this.cover);
        parcel.writeLong(this.mRank);
        parcel.writeInt(this.type);
        parcel.writeInt(this.upFrom);
        parcel.writeLong(this.cTime);
        parcel.writeLong(this.mTime);
        parcel.writeString(this.tags);
        parcel.writeLong(this.maxCount);
        parcel.writeLong(this.minCount);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.playUrl);
        parcel.writeLong(this.useCount);
        parcel.writeString(this.extra);
        parcel.writeString(this.extra_);
        parcel.writeString(this.desc);
        parcel.writeLong(this.topicId);
        parcel.writeParcelable(this.imageTextExtra, i7);
        parcel.writeParcelable(this.videoTemplateExtraBean, i7);
        parcel.writeParcelable(this.author, i7);
        parcel.writeInt(this.useMonSdk ? 1 : 0);
        parcel.writeString(this.sdkType);
    }
}
