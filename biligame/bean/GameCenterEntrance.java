package com.bilibili.biligame.bean;

import W60.F;
import androidx.annotation.Keep;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCenterEntrance.class */
@Keep
public final class GameCenterEntrance {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private boolean f35default;

    @Nullable
    private String icon;
    private long id;
    private int red_dot;

    @Nullable
    private String title;
    private int type;

    @Nullable
    private String url;

    @NotNull
    public final GameCenterEntrance clone() {
        GameCenterEntrance gameCenterEntrance = new GameCenterEntrance();
        gameCenterEntrance.id = this.id;
        gameCenterEntrance.title = this.title;
        gameCenterEntrance.icon = this.icon;
        gameCenterEntrance.url = this.url;
        gameCenterEntrance.red_dot = this.red_dot;
        return gameCenterEntrance;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(GameCenterEntrance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        GameCenterEntrance gameCenterEntrance = (GameCenterEntrance) obj;
        return this.id == gameCenterEntrance.id && Intrinsics.areEqual(this.title, gameCenterEntrance.title) && Intrinsics.areEqual(this.icon, gameCenterEntrance.icon) && Intrinsics.areEqual(this.url, gameCenterEntrance.url) && this.red_dot == gameCenterEntrance.red_dot && this.type == gameCenterEntrance.type && this.f35default == gameCenterEntrance.f35default;
    }

    public final boolean getDefault() {
        return this.f35default;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRed_dot() {
        return this.red_dot;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.title;
        int iHashCode2 = 0;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.icon;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.url;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return Boolean.hashCode(this.f35default) + (((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + this.red_dot) * 31) + this.type) * 31);
    }

    public final void setDefault(boolean z6) {
        this.f35default = z6;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setRed_dot(int i7) {
        this.red_dot = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.title;
        String str2 = this.icon;
        String str3 = this.url;
        int i7 = this.red_dot;
        int i8 = this.type;
        boolean z6 = this.f35default;
        StringBuilder sbA = n.a(j7, "GameCenterEntrance(id=", ", title=", str);
        B.a(", icon=", str2, ", url=", str3, sbA);
        F.b(i7, i8, ", red_dot=", ", type=", sbA);
        sbA.append(", default=");
        sbA.append(z6);
        sbA.append(")");
        return sbA.toString();
    }
}
