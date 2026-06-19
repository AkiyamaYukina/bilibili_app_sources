package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import android.view.View;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.app.screen.adjust.widget.q;
import com.bilibili.app.screen.adjust.widget.t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1.class */
public final class InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final CoroutineScope $$this$launch;
    final Ref.ObjectRef<Function0<Unit>> $cleanupCallback;
    final View $contentView;
    final Ref.ObjectRef<q> $screenAdjustDialog;
    int label;
    final InteractiveSettingsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<Function0<Unit>> $cleanupCallback;
        final View $contentView;
        final q $dialog;
        Object L$0;
        int label;
        final InteractiveSettingsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1$1$1.class */
        public static final /* synthetic */ class C09891 extends FunctionReferenceImpl implements Function0<Unit> {
            public C09891(Object obj) {
                super(0, obj, q.class, "dismiss", "dismiss()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m9447invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m9447invoke() {
                ((q) ((CallableReference) this).receiver).a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<Function0<Unit>> objectRef, InteractiveSettingsService interactiveSettingsService, View view, q qVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cleanupCallback = objectRef;
            this.this$0 = interactiveSettingsService;
            this.$contentView = view;
            this.$dialog = qVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cleanupCallback, this.this$0, this.$contentView, this.$dialog, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objA;
            Ref.ObjectRef<Function0<Unit>> objectRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef<Function0<Unit>> objectRef2 = this.$cleanupCallback;
                b bVar = (b) this.this$0.f99794n.getValue();
                View view = this.$contentView;
                C09891 c09891 = new C09891(this.$dialog);
                this.L$0 = objectRef2;
                this.label = 1;
                objA = bVar.a(view, c09891, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                objA = obj;
            }
            objectRef.element = objA;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1(InteractiveSettingsService interactiveSettingsService, View view, Ref.ObjectRef<q> objectRef, CoroutineScope coroutineScope, Ref.ObjectRef<Function0<Unit>> objectRef2, Continuation<? super InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = interactiveSettingsService;
        this.$contentView = view;
        this.$screenAdjustDialog = objectRef;
        this.$$this$launch = coroutineScope;
        this.$cleanupCallback = objectRef2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$1(this.this$0, this.$contentView, this.$screenAdjustDialog, this.$$this$launch, this.$cleanupCallback, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InteractiveSettingsService interactiveSettingsService = this.this$0;
            q qVar = new q(interactiveSettingsService.f99783b, this.$contentView, G.b.a, "", 0.5f, true, true, 3, a.b.a, interactiveSettingsService.f99796p, 0, 12576);
            this.$screenAdjustDialog.element = qVar;
            BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$cleanupCallback, this.this$0, this.$contentView, qVar, null), 3, (Object) null);
            this.label = 1;
            if (t.b(qVar, this) == coroutine_suspended) {
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
