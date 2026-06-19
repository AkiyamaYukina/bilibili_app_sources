package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.semantics.y;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75141a;

    public final Object invoke(Object obj) {
        switch (this.f75141a) {
            case 0:
                KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                return Boolean.valueOf(((RecyclerView.ViewHolder) obj) instanceof do0.l);
            default:
                y.o((SemanticsPropertyReceiver) obj, Role.Companion.m3477getButtono7Vup1c());
                return Unit.INSTANCE;
        }
    }
}
