package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBeanV5;
import im.setting.U;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81004a;

    public /* synthetic */ b(int i7) {
        this.f81004a = i7;
    }

    public final Object invoke(Object obj) {
        switch (this.f81004a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                String str = ((UpperTagBeanV5) obj).tagText;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                return str2;
            default:
                return Boolean.valueOf(((U) obj).f != null);
        }
    }
}
