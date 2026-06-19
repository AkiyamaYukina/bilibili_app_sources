package com.bilibili.ship.theseus.playlist;

import android.graphics.Rect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.widget.PopupBgColor;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialogKt;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2$1$1$4$2.class */
final class PlaylistService$collectMediaActionEffect$2$1$1$4$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $dismissFlow;
    final D.b $mediaAction;
    final com.bilibili.ship.theseus.playlist.uicomponent.t $state;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectMediaActionEffect$2$1$1$4$2(E e7, D.b bVar, MutableStateFlow<Boolean> mutableStateFlow, com.bilibili.ship.theseus.playlist.uicomponent.t tVar, Continuation<? super PlaylistService$collectMediaActionEffect$2$1$1$4$2> continuation) {
        super(1, continuation);
        this.this$0 = e7;
        this.$mediaAction = bVar;
        this.$dismissFlow = mutableStateFlow;
        this.$state = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$0(com.bilibili.ship.theseus.playlist.uicomponent.t r10, final com.bilibili.ship.theseus.playlist.E r11, final com.bilibili.ship.theseus.playlist.uicomponent.D.b r12, final kotlinx.coroutines.flow.MutableStateFlow r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistService$collectMediaActionEffect$2$1$1$4$2.invokeSuspend$lambda$0(com.bilibili.ship.theseus.playlist.uicomponent.t, com.bilibili.ship.theseus.playlist.E, com.bilibili.ship.theseus.playlist.uicomponent.D$b, kotlinx.coroutines.flow.MutableStateFlow, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0$0(E e7, D.b bVar) {
        e7.h.b(bVar.f95942a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$1$0(E e7, D.b bVar) {
        e7.h.a(bVar.f95942a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$2$0(E e7, D.b bVar) {
        y yVar = e7.h;
        MultiTypeMedia multiTypeMedia = bVar.f95942a;
        yVar.getClass();
        BuildersKt.launch$default(yVar.f96134a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistMediaActionService$translation$1(multiTypeMedia, yVar, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$3$0(MutableStateFlow mutableStateFlow) {
        mutableStateFlow.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlaylistService$collectMediaActionEffect$2$1$1$4$2(this.this$0, this.$mediaAction, this.$dismissFlow, this.$state, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final E e7 = this.this$0;
            FragmentActivity fragmentActivity = e7.f94948q;
            final D.b bVar = this.$mediaAction;
            Rect rect = ((D.b.C0800b) bVar).f95943b;
            final com.bilibili.ship.theseus.playlist.uicomponent.t tVar = this.$state;
            final MutableStateFlow<Boolean> mutableStateFlow = this.$dismissFlow;
            ScreenAdjustPopupDialog screenAdjustPopupDialog = new ScreenAdjustPopupDialog(fragmentActivity, rect, ComposableLambdaKt.composableLambdaInstance(-1333427343, true, new Function2(tVar, e7, bVar, mutableStateFlow) { // from class: com.bilibili.ship.theseus.playlist.L

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.ship.theseus.playlist.uicomponent.t f94976a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final E f94977b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final D.b f94978c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final MutableStateFlow f94979d;

                {
                    this.f94976a = tVar;
                    this.f94977b = e7;
                    this.f94978c = bVar;
                    this.f94979d = mutableStateFlow;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    D.b bVar2 = this.f94978c;
                    MutableStateFlow mutableStateFlow2 = this.f94979d;
                    return PlaylistService$collectMediaActionEffect$2$1$1$4$2.invokeSuspend$lambda$0(this.f94976a, this.f94977b, bVar2, mutableStateFlow2, (Composer) obj2, iIntValue);
                }
            }), 375, this.$dismissFlow, (Function0) null, (PopupBgColor) null, false, false, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (DefaultConstructorMarker) null);
            this.label = 1;
            if (ScreenAdjustPopupDialogKt.suspendShow(screenAdjustPopupDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
