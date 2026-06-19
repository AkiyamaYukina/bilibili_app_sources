package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchKey.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchKey implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "id")
    @Nullable
    private String id;

    @JSONField(name = "real_word")
    @Nullable
    private String realWord;

    @JSONField(name = "seq")
    @Nullable
    private String seq;

    @JSONField(name = "show_word")
    @Nullable
    private String showWord = "";

    public boolean equals(@Nullable Object obj) {
        boolean z6 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BiligameSearchKey)) {
            return false;
        }
        BiligameSearchKey biligameSearchKey = (BiligameSearchKey) obj;
        if (!Intrinsics.areEqual(biligameSearchKey.id, this.id) || !Intrinsics.areEqual(biligameSearchKey.showWord, this.showWord) || !Intrinsics.areEqual(biligameSearchKey.realWord, this.realWord) || !Intrinsics.areEqual(biligameSearchKey.seq, this.seq)) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getRealWord() {
        return this.realWord;
    }

    @Nullable
    public final String getSeq() {
        return this.seq;
    }

    @Nullable
    public final String getShowWord() {
        return this.showWord;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setRealWord(@Nullable String str) {
        this.realWord = str;
    }

    public final void setSeq(@Nullable String str) {
        this.seq = str;
    }

    public final void setShowWord(@Nullable String str) {
        this.showWord = str;
    }
}
