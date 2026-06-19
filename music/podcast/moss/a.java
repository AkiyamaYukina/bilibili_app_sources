package com.bilibili.music.podcast.moss;

import com.bilibili.okretro.BiliApiDataCallback;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/a.class */
public abstract class a<RESULT, RPC_RESULT> extends BiliApiDataCallback<RESULT> {
    @Nullable
    public abstract RESULT d(@Nullable RPC_RESULT rpc_result);
}
