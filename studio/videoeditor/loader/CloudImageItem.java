package com.bilibili.studio.videoeditor.loader;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/CloudImageItem.class */
@Keep
public class CloudImageItem extends ImageItem implements Serializable {

    @NotNull
    private CloudInfo cloudInfo = new CloudInfo();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/CloudImageItem$CloudInfo.class */
    @Keep
    public static final class CloudInfo implements Serializable {

        @Nullable
        private String category;

        @Nullable
        private String cover;
        private int expire;
        private boolean manual;
        private int maxCount;
        private int maxSize;

        @Nullable
        private String tag;

        @Nullable
        private String url;

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        public final int getExpire() {
            return this.expire;
        }

        public final boolean getManual() {
            return this.manual;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getMaxSize() {
            return this.maxSize;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setExpire(int i7) {
            this.expire = i7;
        }

        public final void setManual(boolean z6) {
            this.manual = z6;
        }

        public final void setMaxCount(int i7) {
            this.maxCount = i7;
        }

        public final void setMaxSize(int i7) {
            this.maxSize = i7;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @Override // com.bilibili.studio.videoeditor.loader.ImageItem
    @NotNull
    /* JADX INFO: renamed from: clone */
    public ImageItem m10468clone() {
        CloudImageItem cloudImageItem = new CloudImageItem();
        cloudImageItem._id = this._id;
        cloudImageItem.name = this.name;
        cloudImageItem.path = this.path;
        cloudImageItem.size = this.size;
        cloudImageItem.width = this.width;
        cloudImageItem.height = this.height;
        cloudImageItem.mimeType = this.mimeType;
        cloudImageItem.addTime = this.addTime;
        cloudImageItem.setDuration(getDuration());
        cloudImageItem.haveProblem = this.haveProblem;
        cloudImageItem.uri = this.uri;
        cloudImageItem.isShow = this.isShow;
        if (this.extras != null) {
            cloudImageItem.extras = new HashMap<>(this.extras);
        }
        cloudImageItem.cloudInfo = this.cloudInfo;
        return cloudImageItem;
    }

    @Override // com.bilibili.studio.videoeditor.loader.ImageItem
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CloudImageItem) {
            return Intrinsics.areEqual(getUrl(), ((CloudImageItem) obj).getUrl());
        }
        return false;
    }

    @NotNull
    public final CloudInfo getCloudInfo() {
        return this.cloudInfo;
    }

    @NotNull
    public final String getCover() {
        String cover = this.cloudInfo.getCover();
        String str = cover;
        if (cover == null) {
            str = "";
        }
        return str;
    }

    @Override // com.bilibili.studio.videoeditor.loader.ImageItem
    @NotNull
    public String getPlayPath() {
        String str;
        if (TextUtils.isEmpty(this.path)) {
            String url = this.cloudInfo.getUrl();
            str = url;
            if (url == null) {
                str = "";
            }
        } else {
            str = this.path;
        }
        return str;
    }

    @NotNull
    public final String getUrl() {
        String url = this.cloudInfo.getUrl();
        String str = url;
        if (url == null) {
            str = "";
        }
        return str;
    }

    @Override // com.bilibili.studio.videoeditor.loader.ImageItem
    public int hashCode() {
        return this.cloudInfo.hashCode() + (super.hashCode() * 31);
    }

    public final void setCloudInfo(@NotNull CloudInfo cloudInfo) {
        this.cloudInfo = cloudInfo;
    }
}
