package com.bilibili.studio.upper.publish;

import com.bilibili.lib.neuron.api.Neurons;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/h.class */
public final class h {
    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2) {
        Neurons.trackT$default(false, "creation.center-plus.publish.archive_message.track_t", W.a("message_type", str, "message_result", str2), 0, (Function0) null, 24, (Object) null);
    }
}
