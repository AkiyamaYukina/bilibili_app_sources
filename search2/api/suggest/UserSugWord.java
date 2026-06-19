package com.bilibili.search2.api.suggest;

import Rs0.a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchOfficialVerify;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/suggest/UserSugWord.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UserSugWord extends a {
    public static final int $stable = 8;

    @JSONField(name = "archives")
    private int archives;

    @JSONField(name = "fans")
    private int fans;

    @JSONField(name = "is_senior_member")
    private boolean isSeniorMember;

    @JSONField(name = "level")
    private int level;

    @JSONField(name = "official_verify")
    @Nullable
    private SearchOfficialVerify mOfficial;

    public final int getArchives() {
        return this.archives;
    }

    public final int getFans() {
        return this.fans;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final SearchOfficialVerify getMOfficial() {
        return this.mOfficial;
    }

    public final boolean isSeniorMember() {
        return this.isSeniorMember;
    }

    public final void setArchives(int i7) {
        this.archives = i7;
    }

    public final void setFans(int i7) {
        this.fans = i7;
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setMOfficial(@Nullable SearchOfficialVerify searchOfficialVerify) {
        this.mOfficial = searchOfficialVerify;
    }

    public final void setSeniorMember(boolean z6) {
        this.isSeniorMember = z6;
    }
}
