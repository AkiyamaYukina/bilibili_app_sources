package com.bilibili.ship.theseus.ugc.weblayer;

import androidx.paging.Y;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1$1$3.class */
public final class NoteFloatLayerService$showNoteEditPanel$2$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Job> $coverJob;
    final TheseusFloatLayerService.a $layerConfig;
    final com.bilibili.playerbizcommon.utils.l $ugcSoftKeyBoardHelper;
    final TheseusWebUIComponent $uiComponent;
    final boolean $useWindowInsetsKeyboardHeight;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2$1$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1$1$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<Job> $coverJob;
        final Ref.BooleanRef $lastNormal;
        final TheseusFloatLayerService.a $layerConfig;
        final Ref.ObjectRef<WindowSizeClass> $screenSize;
        final com.bilibili.playerbizcommon.utils.l $ugcSoftKeyBoardHelper;
        final TheseusWebUIComponent $uiComponent;
        final boolean $useWindowInsetsKeyboardHeight;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final NoteFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, Ref.BooleanRef booleanRef, TheseusFloatLayerService.a aVar, Ref.ObjectRef<WindowSizeClass> objectRef, boolean z6, com.bilibili.playerbizcommon.utils.l lVar, Ref.ObjectRef<Job> objectRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
            this.$uiComponent = theseusWebUIComponent;
            this.$lastNormal = booleanRef;
            this.$layerConfig = aVar;
            this.$screenSize = objectRef;
            this.$useWindowInsetsKeyboardHeight = z6;
            this.$ugcSoftKeyBoardHelper = lVar;
            this.$coverJob = objectRef2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uiComponent, this.$lastNormal, this.$layerConfig, this.$screenSize, this.$useWindowInsetsKeyboardHeight, this.$ugcSoftKeyBoardHelper, this.$coverJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01f1  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2$1$1$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteEditPanel$2$1$1$3(NoteFloatLayerService noteFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, boolean z6, com.bilibili.playerbizcommon.utils.l lVar, Ref.ObjectRef<Job> objectRef, Continuation<? super NoteFloatLayerService$showNoteEditPanel$2$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = noteFloatLayerService;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar;
        this.$useWindowInsetsKeyboardHeight = z6;
        this.$ugcSoftKeyBoardHelper = lVar;
        this.$coverJob = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NoteFloatLayerService$showNoteEditPanel$2$1$1$3(this.this$0, this.$uiComponent, this.$layerConfig, this.$useWindowInsetsKeyboardHeight, this.$ugcSoftKeyBoardHelper, this.$coverJob, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = Y.a(obj);
            booleanRefA.element = this.this$0.f98606l.i() || this.this$0.f98606l.f();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = this.this$0.f98606l.b();
            NoteFloatLayerService noteFloatLayerService = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = noteFloatLayerService.f98606l.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(noteFloatLayerService, this.$uiComponent, booleanRefA, this.$layerConfig, objectRef, this.$useWindowInsetsKeyboardHeight, this.$ugcSoftKeyBoardHelper, this.$coverJob, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
