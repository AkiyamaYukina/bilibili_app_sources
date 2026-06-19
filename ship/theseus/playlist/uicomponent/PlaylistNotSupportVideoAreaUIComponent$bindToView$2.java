package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2;
import com.bilibili.ship.theseus.playlist.uicomponent.z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2.class */
final class PlaylistNotSupportVideoAreaUIComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final UIComponent.b<ComposeView> $viewEntry;
    private Object L$0;
    int label;
    final z this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final z this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z zVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = zVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            this.this$0.f96113f.start();
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistNotSupportVideoAreaUIComponent$bindToView$2$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final z this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f96005a;

            public a(z zVar) {
                this.f96005a = zVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                z zVar = this.f96005a;
                zVar.f96113f.cancel();
                zVar.f96112e.setValue(Boxing.boxInt(-1));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(z zVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = zVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                z zVar = this.this$0;
                Flow<Unit> flow = zVar.f96109b;
                a aVar = new a(zVar);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final UIComponent.b<ComposeView> $viewEntry;
        int label;
        final z this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent$bindToView$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistNotSupportVideoAreaUIComponent$bindToView$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final Context $context;
            final UIComponent.b<ComposeView> $viewEntry;
            int I$0;
            int label;
            final z this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(z zVar, Context context, UIComponent.b<ComposeView> bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = zVar;
                this.$context = context;
                this.$viewEntry = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public static final Unit invokeSuspend$lambda$0(z zVar, String str, Composer composer, int i7) {
                if (composer.shouldExecute((i7 & 3) != 2, 1 & i7)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(353235447, i7, -1, "com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent.bindToView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlaylistNotSupportVideoAreaUIComponent.kt:74)");
                    }
                    int i8 = z.f96107g;
                    zVar.a(composer, 0, str);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, this.$viewEntry, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                z.a aVar = this.this$0.f96108a;
                final String strA = C8770a.a(new StringBuilder(), aVar.f96114a, i7 < 0 ? aVar.f96117d : this.$context.getString(2131851647, Boxing.boxInt(i7 + 1)));
                ComposeView composeView = (ComposeView) this.$viewEntry.a;
                final z zVar = this.this$0;
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(353235447, true, new Function2(zVar, strA) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.A

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final z f95919a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f95920b;

                    {
                        this.f95919a = zVar;
                        this.f95920b = strA;
                    }

                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return PlaylistNotSupportVideoAreaUIComponent$bindToView$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(this.f95919a, this.f95920b, (Composer) obj2, iIntValue);
                    }
                }));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(z zVar, Context context, UIComponent.b<ComposeView> bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = zVar;
            this.$context = context;
            this.$viewEntry = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$context, this.$viewEntry, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                z zVar = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = zVar.f96112e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(zVar, this.$context, this.$viewEntry, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistNotSupportVideoAreaUIComponent$bindToView$2(z zVar, Context context, UIComponent.b<ComposeView> bVar, Continuation<? super PlaylistNotSupportVideoAreaUIComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = zVar;
        this.$context = context;
        this.$viewEntry = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistNotSupportVideoAreaUIComponent$bindToView$2 playlistNotSupportVideoAreaUIComponent$bindToView$2 = new PlaylistNotSupportVideoAreaUIComponent$bindToView$2(this.this$0, this.$context, this.$viewEntry, continuation);
        playlistNotSupportVideoAreaUIComponent$bindToView$2.L$0 = obj;
        return playlistNotSupportVideoAreaUIComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$context, this.$viewEntry, null), 3, (Object) null);
    }
}
