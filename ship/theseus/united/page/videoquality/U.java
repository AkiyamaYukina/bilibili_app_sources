package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.lib.media.resource.PlayIndex;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/U.class */
public final /* synthetic */ class U implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((PlayIndex) obj).mQuality, ((PlayIndex) obj2).mQuality));
    }
}
