package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActorInfoFragment f92825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92826b;

    public /* synthetic */ b(OgvActorInfoFragment ogvActorInfoFragment, long j7) {
        this.f92825a = ogvActorInfoFragment;
        this.f92826b = j7;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OgvActorInfoFragment ogvActorInfoFragment = this.f92825a;
        d dVar = ogvActorInfoFragment.f92819f;
        dVar.f92911d = iIntValue;
        dVar.f92912e = 1;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ogvActorInfoFragment), (CoroutineContext) null, (CoroutineStart) null, new OgvActorInfoFragment$loadWorksData$2$2$1(ogvActorInfoFragment, this.f92826b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
