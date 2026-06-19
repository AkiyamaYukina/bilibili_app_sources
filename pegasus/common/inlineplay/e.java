package com.bilibili.pegasus.common.inlineplay;

import bilibili.live.app.service.resolver.LiveResolveParams;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.lib.media.resource.MediaResource;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayer.preload.repository.PreloadResolverKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/e.class */
public final class e implements Function2<IResolveParams, Boolean, MediaResource> {
    public final Object invoke(Object obj, Object obj2) {
        IResolveParams iResolveParams = (IResolveParams) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue && (iResolveParams instanceof LiveResolveParams)) {
            ((LiveResolveParams) iResolveParams).setLink(null);
        }
        return PreloadResolverKt.resolveMediaResource(iResolveParams, !zBooleanValue);
    }
}
