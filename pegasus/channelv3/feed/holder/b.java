package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.compose.runtime.MutableState;
import com.bilibili.ogv.misc.follow.AbsFollowMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75295b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f75294a = i7;
        this.f75295b = obj;
    }

    public final Object invoke() {
        switch (this.f75294a) {
            case 0:
                break;
            case 1:
                ((AbsFollowMainFragment) this.f75295b).jf();
                break;
            default:
                ((MutableState) this.f75295b).setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
