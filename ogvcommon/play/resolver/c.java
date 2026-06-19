package com.bilibili.ogvcommon.play.resolver;

import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.lib.media.resource.ExtraInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KProperty<Object>[] f73256a = {new MutablePropertyReference1Impl(c.class, "ogvClips", "getOgvClips(Lcom/bilibili/lib/media/resource/ExtraInfo;)Lcom/bilibili/ogvcommon/play/resolver/ViewInfoClips;", 1), new MutablePropertyReference1Impl(c.class, "viewInfoExtraVo", "getViewInfoExtraVo(Lcom/bilibili/lib/media/resource/ExtraInfo;)Lcom/bilibili/ogvcommon/play/resolver/ViewInfoExtraVo;", 1), new MutablePropertyReference1Impl(c.class, "dubbingInfo", "getDubbingInfo(Lcom/bilibili/lib/media/resource/ExtraInfo;)Lcom/bapis/bilibili/pgc/gateway/player/v2/PlayDubbingInfo;", 1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f73257b = new b(ViewInfoClips.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f73258c = new b(ViewInfoExtraVo.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f73259d = new b(PlayDubbingInfo.class);

    @Nullable
    public static final ViewInfoClips a(@NotNull ExtraInfo extraInfo) {
        return (ViewInfoClips) f73257b.a(extraInfo, f73256a[0]);
    }

    @Nullable
    public static final ViewInfoExtraVo b(@NotNull ExtraInfo extraInfo) {
        return (ViewInfoExtraVo) f73258c.a(extraInfo, f73256a[1]);
    }
}
