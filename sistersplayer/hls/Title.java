package com.bilibili.sistersplayer.hls;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Title.class */
public final class Title {

    @Nullable
    private Long crc;

    @Nullable
    private Integer size;

    public Title(@NotNull String str) {
        try {
            if (str.length() > 0) {
                List listSplit = new Regex("(?<!\\\\)\\|").split(str, 0);
                String str2 = (String) CollectionsKt.getOrNull(listSplit, 0);
                this.size = str2 != null ? Integer.valueOf(Integer.parseInt(str2, CharsKt.checkRadix(16))) : null;
                String str3 = (String) CollectionsKt.getOrNull(listSplit, 1);
                this.crc = str3 != null ? Long.valueOf(Long.parseLong(str3, CharsKt.checkRadix(16))) : null;
            }
        } catch (Exception e7) {
        }
    }

    @Nullable
    public final Long getCrc() {
        return this.crc;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public final void setCrc(@Nullable Long l7) {
        this.crc = l7;
    }

    public final void setSize(@Nullable Integer num) {
        this.size = num;
    }

    @NotNull
    public String toString() {
        return "Title(size=" + this.size + ", crc=" + this.crc + ")";
    }
}
