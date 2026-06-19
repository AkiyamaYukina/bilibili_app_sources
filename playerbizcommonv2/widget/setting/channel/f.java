package com.bilibili.playerbizcommonv2.widget.setting.channel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/f.class */
public final class f implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83235a;

    public f(List list) {
        this.f83235a = list;
    }

    public final Object invoke(Object obj) {
        ((ArrayList) this.f83235a).get(((Number) obj).intValue());
        return null;
    }
}
