package com.bilibili.studio.editor.moudle.intelligence.media.cache;

import androidx.annotation.Keep;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/cache/MediaLabelBean.class */
@Keep
public class MediaLabelBean {

    @Keep
    public String cacheKey;

    @Keep
    public String filePath;

    @Keep
    public String label;

    @Keep
    public String modVersion;

    @Keep
    public String sdkVersion;

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaLabelBean{cacheKey='");
        sb.append(this.cacheKey);
        sb.append("', label='");
        sb.append(this.label);
        sb.append("', modVersion='");
        sb.append(this.modVersion);
        sb.append("', sdkVersion='");
        sb.append(this.sdkVersion);
        sb.append("', filePath='");
        return C8770a.a(sb, this.filePath, "'}");
    }
}
