package com.bilibili.moduleservice.player;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/player/PlayerShareBundle.class */
public final class PlayerShareBundle<T> {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String SHARE_MEDIA_ITEM_ID = "share_media_item_id";

    @NotNull
    public static final String SHARE_MEDIA_PLAYER_CONTAINER_RECT = "share_media_player_container_rect";

    @NotNull
    public static final String SHARE_MEDIA_PLAYER_DISPLAY_RECT = "share_media_player_display_rect";

    @NotNull
    public static final String SHARE_MEDIA_PLAYER_DISPLAY_Y_OFFSET = "share_media_player_display_y_offset";

    @NotNull
    public static final String SHARE_PLAYER_ID = "bundle_key_player_shared_id";

    @NotNull
    public static final String SHARE_PLAYER_TYPE = "bundle_key_player_shared_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f66327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Bundle f66328b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/player/PlayerShareBundle$a.class */
    public static final class a {
    }

    @NotNull
    public final Bundle getBundle() {
        if (this.f66328b == null) {
            this.f66328b = new Bundle();
        }
        return this.f66328b;
    }

    @Nullable
    public final <T> T getPlayer() {
        Object obj = this.f66327a;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        return (T) obj2;
    }

    public final <T> void setPlayer(@NotNull Object obj) {
        this.f66327a = obj;
    }
}
