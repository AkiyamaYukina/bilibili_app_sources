package com.bilibili.studio.videoeditor.loader;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.lib.dd.DeviceDecision;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/ImageItem.class */
@Keep
public class ImageItem implements Serializable {
    public static final String MIME_TYPE_IMAGE_PREFIX = "image";
    public static final String MIME_TYPE_VIDEO_PREFIX = "video";
    public String _id;
    public long addTime;
    public long cropHead;
    public long cropTail;
    private long duration;

    @Nullable
    public HashMap<String, Object> extras;
    public boolean haveProblem;
    public int height;
    public boolean isHDRVideo;
    public boolean isShow;
    public String mimeType;
    public long modifyTime;
    public String name;
    public String parentName;
    public String parentPath;
    public String path;
    public long pickTime;
    public long size;
    public String uri;
    public int width;

    public ImageItem() {
        this.pickTime = Long.MAX_VALUE;
        this.isShow = true;
        this.isHDRVideo = false;
        this.cropHead = 0L;
        this.cropTail = 0L;
    }

    public ImageItem(String str) {
        this.pickTime = Long.MAX_VALUE;
        this.isShow = true;
        this.isHDRVideo = false;
        this.cropHead = 0L;
        this.cropTail = 0L;
        this._id = str;
    }

    public ImageItem(String str, String str2, String str3, long j7, int i7, int i8, String str4, long j8) {
        this(str);
        this.name = str2;
        this.path = str3;
        this.size = j7;
        this.width = i7;
        this.height = i8;
        this.mimeType = str4;
        this.addTime = j8;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ImageItem m10468clone() {
        ImageItem imageItem = new ImageItem();
        imageItem._id = this._id;
        imageItem.name = this.name;
        imageItem.path = this.path;
        imageItem.size = this.size;
        imageItem.width = this.width;
        imageItem.height = this.height;
        imageItem.mimeType = this.mimeType;
        imageItem.addTime = this.addTime;
        imageItem.duration = this.duration;
        imageItem.haveProblem = this.haveProblem;
        imageItem.uri = this.uri;
        imageItem.isShow = this.isShow;
        imageItem.cropHead = this.cropHead;
        imageItem.cropTail = this.cropTail;
        if (this.extras != null) {
            imageItem.extras = new HashMap<>(this.extras);
        }
        return imageItem;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageItem)) {
            return super.equals(obj);
        }
        ImageItem imageItem = (ImageItem) obj;
        return this.path.equalsIgnoreCase(imageItem.path) && this.addTime == imageItem.addTime;
    }

    public long getDuration() {
        Long l7;
        if (this.duration <= 0) {
            Lazy lazy = zw0.b.f130950a;
            if (DeviceDecision.INSTANCE.getBoolean("uper.enable_album_skip_sync_video_duration", true)) {
                String str = this.path;
                VideoDurationCache videoDurationCache = VideoDurationCache.f109773a;
                long jLongValue = (str == null || StringsKt.isBlank(str) || (l7 = VideoDurationCache.f109774b.get(str)) == null) ? 0L : l7.longValue();
                if (jLongValue > 0) {
                    this.duration = jLongValue;
                }
                return this.duration;
            }
        }
        return this.duration;
    }

    public String getPlayPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j7 = this.addTime;
        return (iHashCode * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public boolean isImage() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("image");
    }

    public boolean isVideo() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("video");
    }

    public void setDuration(long j7) {
        this.duration = j7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageItem{id='");
        sb.append(this._id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', path='");
        sb.append(this.path);
        sb.append("', size=");
        sb.append(this.size);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append("', addTime=");
        sb.append(this.addTime);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", haveProblem=");
        sb.append(this.haveProblem);
        sb.append(", uri='");
        sb.append(this.uri);
        sb.append("', isShow=");
        return O4.a.b(sb, this.isShow, '}');
    }
}
