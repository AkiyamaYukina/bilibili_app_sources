package com.bilibili.playerbizcommonv2.web;

import com.bilibili.app.comm.aghanim.api.ContainerEvent;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/r.class */
public final class r {
    public static final String a(ContainerEvent containerEvent) {
        String simpleName = containerEvent.getClass().getSimpleName();
        String string = simpleName;
        if (StringsKt.isBlank(simpleName)) {
            string = containerEvent.toString();
        }
        return string;
    }
}
