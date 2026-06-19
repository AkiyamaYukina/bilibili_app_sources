package com.bilibili.pegasus.components;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/c.class */
public final /* synthetic */ class C5594c implements Function1 {
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        return Boolean.valueOf(iIntValue == 0 || (iIntValue & 4) == 4);
    }
}
