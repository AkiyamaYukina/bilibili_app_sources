package com.bilibili.pegasus.components.videomode;

import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/h.class */
public final /* synthetic */ class h implements Function1 {
    public final Object invoke(Object obj) {
        ((MutableBundleLike) obj).put("recommend_page_jump_from", "recommend_page_jump_from_video_guidance");
        return Unit.INSTANCE;
    }
}
