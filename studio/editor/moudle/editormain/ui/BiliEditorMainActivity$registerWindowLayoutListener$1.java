package com.bilibili.studio.editor.moudle.editormain.ui;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.window.layout.WindowInfoTrackerImpl;
import androidx.window.layout.c;
import com.bilibili.base.BiliContext;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity$registerWindowLayoutListener$1.class */
final class BiliEditorMainActivity$registerWindowLayoutListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliEditorMainActivity this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity$registerWindowLayoutListener$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity$registerWindowLayoutListener$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BiliEditorMainActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity$registerWindowLayoutListener$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/BiliEditorMainActivity$registerWindowLayoutListener$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorMainActivity f106287a;

            public a(BiliEditorMainActivity biliEditorMainActivity) {
                this.f106287a = biliEditorMainActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                dz0.c cVar;
                Application application;
                for (androidx.window.layout.a aVar : ((androidx.window.layout.h) obj).f53375a) {
                    if ((aVar instanceof androidx.window.layout.c) && (cVar = ((Yv0.b) this.f106287a).B) != null) {
                        c.C0289c state = ((androidx.window.layout.c) aVar).getState();
                        cVar.e.s.getClass();
                        boolean z6 = Intrinsics.areEqual(state, c.C0289c.f53361b) || Intrinsics.areEqual(state, c.C0289c.f53362c);
                        if (!fA0.g.a && (application = BiliContext.application()) != null) {
                            SharedPreferences.Editor editorEdit = j.a(application).a.edit();
                            editorEdit.putBoolean("editor_key_device_fold_state", z6);
                            editorEdit.apply();
                            fA0.g.a = true;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliEditorMainActivity biliEditorMainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliEditorMainActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Activity, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend(Object obj) {
            Flow<androidx.window.layout.h> flowA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r02 = this.this$0;
                WindowInfoTrackerImpl windowInfoTrackerImpl = r02.f106281U;
                if (windowInfoTrackerImpl != 0 && (flowA = windowInfoTrackerImpl.a(r02)) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorMainActivity$registerWindowLayoutListener$1(BiliEditorMainActivity biliEditorMainActivity, Continuation<? super BiliEditorMainActivity$registerWindowLayoutListener$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorMainActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorMainActivity$registerWindowLayoutListener$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
