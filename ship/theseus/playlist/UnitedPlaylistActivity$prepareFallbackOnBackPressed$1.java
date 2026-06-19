package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/UnitedPlaylistActivity$prepareFallbackOnBackPressed$1.class */
final class UnitedPlaylistActivity$prepareFallbackOnBackPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final UnitedPlaylistActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedPlaylistActivity$prepareFallbackOnBackPressed$1(UnitedPlaylistActivity unitedPlaylistActivity, Continuation<? super UnitedPlaylistActivity$prepareFallbackOnBackPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedPlaylistActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UnitedPlaylistActivity unitedPlaylistActivity) {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onBackPressed();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedPlaylistActivity$prepareFallbackOnBackPressed$1 unitedPlaylistActivity$prepareFallbackOnBackPressed$1 = new UnitedPlaylistActivity$prepareFallbackOnBackPressed$1(this.this$0, continuation);
        unitedPlaylistActivity$prepareFallbackOnBackPressed$1.L$0 = obj;
        return unitedPlaylistActivity$prepareFallbackOnBackPressed$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        a.S0 s02 = this.this$0.f95178F;
        a.S0 s03 = s02;
        if (s02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s03 = null;
        }
        BackActionRepository backActionRepository = (BackActionRepository) s03.L0.get();
        final UnitedPlaylistActivity unitedPlaylistActivity = this.this$0;
        backActionRepository.f99048c = new Function0(unitedPlaylistActivity) { // from class: com.bilibili.ship.theseus.playlist.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedPlaylistActivity f94982a;

            {
                this.f94982a = unitedPlaylistActivity;
            }

            public final Object invoke() {
                return UnitedPlaylistActivity$prepareFallbackOnBackPressed$1.invokeSuspend$lambda$0(this.f94982a);
            }
        };
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UnitedPlaylistActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1(null, unitedPlaylistActivity), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
