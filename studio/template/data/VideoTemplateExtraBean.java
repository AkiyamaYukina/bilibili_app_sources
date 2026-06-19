package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateExtraBean.class */
@Keep
public class VideoTemplateExtraBean implements Parcelable {
    public static final Parcelable.Creator<VideoTemplateExtraBean> CREATOR = new Object();

    @JSONField(name = "all_clips_v2")
    public List<VideoTemplateClip> all_clips_v2;

    @JSONField(name = "apply_for")
    public int apply_for;

    @JSONField(name = "aspect_ratio")
    public float aspectRatio;

    @JSONField(name = "clips")
    public List<VideoTemplateClip> clips;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "template_desc")
    public String desc;

    @JSONField(name = "img_cnt")
    public int imageCount;

    @JSONField(name = "is_matting")
    public int is_matting;

    @JSONField(name = "max_cnt")
    public long maxCount;

    @JSONField(name = "min_cnt")
    public long minCount;

    @JSONField(name = "playlist")
    public List<VideoTemplateMusicBean> musics;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "pop_preview_url")
    public String popPreviewUrl;

    @JSONField(name = "preview_url")
    public String preview_url;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @JSONField(name = "staticCover")
    public String staticCover;

    @JSONField(name = "template_from")
    public String template_from;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "video_cnt")
    public int videoCount;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateExtraBean$a.class */
    public final class a implements Parcelable.Creator<VideoTemplateExtraBean> {
        @Override // android.os.Parcelable.Creator
        public final VideoTemplateExtraBean createFromParcel(Parcel parcel) {
            return new VideoTemplateExtraBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTemplateExtraBean[] newArray(int i7) {
            return new VideoTemplateExtraBean[i7];
        }
    }

    public VideoTemplateExtraBean() {
    }

    public VideoTemplateExtraBean(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.clips = arrayList;
        parcel.readList(arrayList, VideoTemplateClip.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.all_clips_v2 = arrayList2;
        parcel.readList(arrayList2, VideoTemplateClip.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.musics = arrayList3;
        parcel.readList(arrayList3, VideoTemplateMusicBean.class.getClassLoader());
        this.desc = parcel.readString();
        this.aspectRatio = parcel.readFloat();
        this.maxCount = parcel.readLong();
        this.minCount = parcel.readLong();
        this.popPreviewUrl = parcel.readString();
        this.name = parcel.readString();
        this.cover = parcel.readString();
        this.rank = parcel.readInt();
        this.apply_for = parcel.readInt();
        this.staticCover = parcel.readString();
        this.template_from = parcel.readString();
        this.type = parcel.readInt();
        this.preview_url = parcel.readString();
        this.is_matting = parcel.readInt();
        this.imageCount = parcel.readInt();
        this.videoCount = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.clips = arrayList;
        parcel.readList(arrayList, VideoTemplateClip.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.all_clips_v2 = arrayList2;
        parcel.readList(arrayList2, VideoTemplateClip.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.musics = arrayList3;
        parcel.readList(arrayList3, VideoTemplateMusicBean.class.getClassLoader());
        this.desc = parcel.readString();
        this.aspectRatio = parcel.readFloat();
        this.maxCount = parcel.readLong();
        this.minCount = parcel.readLong();
        this.popPreviewUrl = parcel.readString();
        this.name = parcel.readString();
        this.cover = parcel.readString();
        this.rank = parcel.readInt();
        this.apply_for = parcel.readInt();
        this.staticCover = parcel.readString();
        this.template_from = parcel.readString();
        this.type = parcel.readInt();
        this.preview_url = parcel.readString();
        this.is_matting = parcel.readInt();
        this.imageCount = parcel.readInt();
        this.videoCount = parcel.readInt();
    }

    public String toJSONString() {
        try {
            return JSON.toJSONString(this);
        } catch (JSONException e7) {
            e7.printStackTrace();
            return "";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.clips);
        parcel.writeList(this.all_clips_v2);
        parcel.writeList(this.musics);
        parcel.writeString(this.desc);
        parcel.writeFloat(this.aspectRatio);
        parcel.writeLong(this.maxCount);
        parcel.writeLong(this.minCount);
        parcel.writeString(this.popPreviewUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.cover);
        parcel.writeInt(this.rank);
        parcel.writeInt(this.apply_for);
        parcel.writeString(this.staticCover);
        parcel.writeString(this.template_from);
        parcel.writeInt(this.type);
        parcel.writeString(this.preview_url);
        parcel.writeInt(this.is_matting);
        parcel.writeInt(this.imageCount);
        parcel.writeInt(this.videoCount);
    }
}
