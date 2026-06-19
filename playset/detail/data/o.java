package com.bilibili.playset.detail.data;

import kntr.common.comment.card.model.DecoratedCard;
import kotlin.jvm.functions.Function1;
import os0.C8259e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/o.class */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84554a;

    public final Object invoke(Object obj) {
        switch (this.f84554a) {
            case 0:
                return Boolean.valueOf(((com.bilibili.playset.api.a) obj) instanceof C8259e);
            default:
                return new h51.a(((DecoratedCard) obj).a.a());
        }
    }
}
