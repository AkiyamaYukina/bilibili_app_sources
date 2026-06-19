package com.bilibili.pegasus.channelv2.alllist;

import Vn0.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllActivity$setupSideList$1.class */
final /* synthetic */ class ChannelAllActivity$setupSideList$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public ChannelAllActivity$setupSideList$1(Object obj) {
        super(1, obj, ChannelAllActivity.class, "selectTabOfIndex", "selectTabOfIndex(I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i7) {
        c cVar = ((ChannelAllActivity) ((CallableReference) this).receiver).f74941L;
        if (cVar != null) {
            cVar.N0(i7);
        }
    }
}
