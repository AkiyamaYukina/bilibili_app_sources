package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.lib.media.resource.LanguageItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuAiAudioDialogViewHelper$1.class */
final class MenuAiAudioDialogViewHelper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final C6424h this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuAiAudioDialogViewHelper$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuAiAudioDialogViewHelper$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final C6424h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6424h c6424h, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6424h;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(LanguageItem languageItem, Continuation<? super Unit> continuation) {
            return create(languageItem, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r4
                int r0 = r0.label
                if (r0 != 0) goto Lbb
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r4
                java.lang.Object r0 = r0.L$0
                com.bilibili.lib.media.resource.LanguageItem r0 = (com.bilibili.lib.media.resource.LanguageItem) r0
                r9 = r0
                r0 = 0
                r7 = r0
                r0 = r9
                if (r0 == 0) goto L28
                r0 = r9
                java.lang.String r0 = r0.c()
                r5 = r0
                goto L2a
            L28:
                r0 = 0
                r5 = r0
            L2a:
                r0 = r5
                if (r0 == 0) goto L35
                r0 = r5
                int r0 = r0.length()
                if (r0 != 0) goto L49
            L35:
                r0 = r4
                com.bilibili.ship.theseus.united.page.toolbar.h r0 = r0.this$0
                androidx.fragment.app.FragmentActivity r0 = r0.f103391b
                android.app.Activity r0 = kntr.base.android.legacy.context.ContextUtilKt.findActivityOrNull(r0)
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L49
                r0 = r5
                boolean r0 = r0.isDestroyed()
            L49:
                r0 = r4
                com.bilibili.ship.theseus.united.page.toolbar.h r0 = r0.this$0
                kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.lib.media.resource.LanguageItem> r0 = r0.f103393d
                r1 = r9
                r0.setValue(r1)
                r0 = r4
                com.bilibili.ship.theseus.united.page.toolbar.h r0 = r0.this$0
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r0 = r0.f103394e
                r10 = r0
                r0 = r9
                if (r0 == 0) goto L74
                r0 = r9
                java.lang.String r0 = r0.getTitle()
                r8 = r0
                r0 = r8
                r5 = r0
                r0 = r8
                if (r0 != 0) goto L77
            L74:
                java.lang.String r0 = ""
                r5 = r0
            L77:
                r0 = r10
                r1 = r5
                r0.setValue(r1)
                r0 = r4
                com.bilibili.ship.theseus.united.page.toolbar.h r0 = r0.this$0
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f103395f
                r8 = r0
                r0 = r7
                r5 = r0
                r0 = r9
                if (r0 == 0) goto L95
                r0 = r9
                java.lang.String r0 = r0.c()
                r5 = r0
            L95:
                r0 = r5
                if (r0 == 0) goto La8
                r0 = r5
                int r0 = r0.length()
                if (r0 != 0) goto La3
                goto La8
            La3:
                r0 = 0
                r6 = r0
                goto Laa
            La8:
                r0 = 1
                r6 = r0
            Laa:
                r0 = r8
                r1 = 1
                r2 = r6
                r1 = r1 ^ r2
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                r0.setValue(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            Lbb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuAiAudioDialogViewHelper$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuAiAudioDialogViewHelper$1(C6424h c6424h, Continuation<? super MenuAiAudioDialogViewHelper$1> continuation) {
        super(2, continuation);
        this.this$0 = c6424h;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuAiAudioDialogViewHelper$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlowB0;
        Flow flowDrop;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.playerbizcommonv2.service.ai.a aVar = this.this$0.f103392c;
            if (aVar != null && (mutableStateFlowB0 = aVar.b0()) != null && (flowDrop = FlowKt.drop(mutableStateFlowB0, 1)) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
