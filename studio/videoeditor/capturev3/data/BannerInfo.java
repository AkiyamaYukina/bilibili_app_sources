package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BannerInfo.class */
@Keep
public final class BannerInfo implements Serializable {

    @Nullable
    private List<String> img;
    private boolean isShow;

    @Nullable
    private String link;

    @Nullable
    public final List<String> getImg() {
        return this.img;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setImg(@Nullable List<String> list) {
        this.img = list;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setShow(boolean z6) {
        this.isShow = z6;
    }
}
