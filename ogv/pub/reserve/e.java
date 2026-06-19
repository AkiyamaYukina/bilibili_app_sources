package com.bilibili.ogv.pub.reserve;

import com.bilibili.api.utils.GsonInstance;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/e.class */
public final class e {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/e$a.class */
    public static final class a extends TypeToken<ReserveEpisode> {
    }

    @Nullable
    public static ReserveEpisode a(@Nullable String str) {
        ReserveEpisode reserveEpisode;
        if (str == null) {
            return null;
        }
        try {
            reserveEpisode = (ReserveEpisode) GsonInstance.globalGson.fromJson(str, new a().getType());
        } catch (JsonSyntaxException e7) {
            reserveEpisode = null;
        }
        return reserveEpisode;
    }
}
