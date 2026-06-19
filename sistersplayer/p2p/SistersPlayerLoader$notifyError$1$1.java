package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.p2p.SistersPlayerLoader;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$notifyError$1$1.class */
public final /* synthetic */ class SistersPlayerLoader$notifyError$1$1 extends FunctionReferenceImpl implements Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> {
    public SistersPlayerLoader$notifyError$1$1(Object obj) {
        super(2, obj, SistersPlayerLoader.class, "innerEvent", "innerEvent(Lcom/bilibili/sistersplayer/p2p/SistersPlayerLoader$IEvent$EventType;Ljava/util/HashMap;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((SistersPlayerLoader.IEvent.EventType) obj, (HashMap<String, Object>) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(SistersPlayerLoader.IEvent.EventType eventType, HashMap<String, Object> map) {
        ((SistersPlayerLoader) ((CallableReference) this).receiver).innerEvent(eventType, map);
    }
}
