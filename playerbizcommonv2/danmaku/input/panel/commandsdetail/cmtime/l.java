package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/l.class */
public final class l implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f81055a;

    public l(List list) {
        this.f81055a = list;
    }

    public final Object invoke(Object obj) {
        this.f81055a.get(((Number) obj).intValue());
        return null;
    }
}
