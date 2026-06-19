package com.bilibili.sistersplayer.hls;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/BiLiAUX.class */
public final class BiLiAUX {

    @Nullable
    private Long crc;

    @Nullable
    private String keyframe;

    @Nullable
    private Long pts;

    @Nullable
    private Integer size;

    public BiLiAUX(@NotNull String str) {
        try {
            if (str.length() > 0) {
                List listSplit = new Regex("(?<!\\\\)\\|").split(str, 0);
                String str2 = (String) CollectionsKt.getOrNull(listSplit, 0);
                this.pts = str2 != null ? Long.valueOf(Long.parseLong(str2, CharsKt.checkRadix(16))) : null;
                this.keyframe = (String) CollectionsKt.getOrNull(listSplit, 1);
                String str3 = (String) CollectionsKt.getOrNull(listSplit, 2);
                this.size = str3 != null ? Integer.valueOf(Integer.parseInt(str3, CharsKt.checkRadix(16))) : null;
                String str4 = (String) CollectionsKt.getOrNull(listSplit, 3);
                this.crc = str4 != null ? Long.valueOf(Long.parseLong(str4, CharsKt.checkRadix(16))) : null;
            }
        } catch (Exception e7) {
        }
    }

    @Nullable
    public final Long getCrc() {
        return this.crc;
    }

    @Nullable
    public final String getKeyframe() {
        return this.keyframe;
    }

    @Nullable
    public final Long getPts() {
        return this.pts;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public final void setCrc(@Nullable Long l7) {
        this.crc = l7;
    }

    public final void setKeyframe(@Nullable String str) {
        this.keyframe = str;
    }

    public final void setPts(@Nullable Long l7) {
        this.pts = l7;
    }

    public final void setSize(@Nullable Integer num) {
        this.size = num;
    }

    @NotNull
    public String toString() {
        Long l7 = this.pts;
        String str = this.keyframe;
        Integer num = this.size;
        Long l8 = this.crc;
        StringBuilder sbA = cf.c.a("AUX:p=", ",k=", str, l7, ",s=");
        sbA.append(num);
        sbA.append(",c=");
        sbA.append(l8);
        return sbA.toString();
    }
}
