package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89052a;

    public final Object invoke(Object obj) {
        switch (this.f89052a) {
            case 0:
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putInt("SELECT_TAB", 2);
                ((MutableBundleLike) obj).put("param_control", bundle);
                break;
        }
        return Unit.INSTANCE;
    }
}
