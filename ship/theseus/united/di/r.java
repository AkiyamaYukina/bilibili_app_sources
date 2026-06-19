package com.bilibili.ship.theseus.united.di;

import com.bilibili.app.comm.restrict.RestrictedMode;
import com.bilibili.app.comm.restrict.RestrictedType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/r.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.LessonsModeFlow", "com.bilibili.ship.theseus.united.di.PageCoroutineScope"})
public final class r implements Factory<StateFlow<Boolean>> {
    public static StateFlow<Boolean> a(CoroutineScope coroutineScope) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(RestrictedMode.isEnable(RestrictedType.LESSONS, "player")));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ExternalClassProvider$provideLessonMode$1(MutableStateFlow, null), 3, (Object) null);
        return (StateFlow) Preconditions.checkNotNullFromProvides(FlowKt.asStateFlow(MutableStateFlow));
    }
}
