package com.bilibili.ship.theseus.ugc.weblayer;

import android.content.res.Configuration;
import androidx.core.util.Consumer;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService;
import com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2.class */
final class NoteFloatLayerService$showNoteEditPanel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $text;
    private Object L$0;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final Consumer<Configuration> $configurationChangeListener;
        final Ref.ObjectRef<Job> $coverJob;
        final Runnable $multiWindowNotifyRunnable;
        final NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 $softKeyBoardChangeListener;
        final com.bilibili.playerbizcommon.utils.l $ugcSoftKeyBoardHelper;
        final TheseusWebUIComponent $uiComponent;
        final boolean $useWindowInsetsKeyboardHeight;
        final Ref.BooleanRef $windowInsetsKeyboardShown;
        int label;
        final NoteFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z6, TheseusWebUIComponent theseusWebUIComponent, NoteFloatLayerService noteFloatLayerService, Ref.BooleanRef booleanRef, NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, com.bilibili.playerbizcommon.utils.l lVar, Ref.ObjectRef<Job> objectRef, Runnable runnable, Consumer<Configuration> consumer, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$useWindowInsetsKeyboardHeight = z6;
            this.$uiComponent = theseusWebUIComponent;
            this.this$0 = noteFloatLayerService;
            this.$windowInsetsKeyboardShown = booleanRef;
            this.$softKeyBoardChangeListener = noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1;
            this.$ugcSoftKeyBoardHelper = lVar;
            this.$coverJob = objectRef;
            this.$multiWindowNotifyRunnable = runnable;
            this.$configurationChangeListener = consumer;
        }

        private static final Unit invokeSuspend$lambda$0(boolean z6, TheseusWebUIComponent theseusWebUIComponent, final NoteFloatLayerService noteFloatLayerService, Ref.BooleanRef booleanRef, NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, com.bilibili.playerbizcommon.utils.l lVar, Ref.ObjectRef objectRef, Runnable runnable, Consumer consumer, com.bilibili.ogv.infra.coroutine.c cVar) {
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, 0, 0, new Function0(noteFloatLayerService) { // from class: com.bilibili.ship.theseus.ugc.weblayer.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteFloatLayerService f98696a;

                {
                    this.f98696a = noteFloatLayerService;
                }

                public final Object invoke() {
                    return Integer.valueOf(NoteFloatLayerService$showNoteEditPanel$2.AnonymousClass1.invokeSuspend$lambda$0$0(this.f98696a));
                }
            });
            cVar.b(new NoteFloatLayerService$showNoteEditPanel$2$1$1$1(noteFloatLayerService, theseusWebUIComponent, aVar, null));
            if (z6) {
                cVar.b(new NoteFloatLayerService$showNoteEditPanel$2$1$1$2(noteFloatLayerService, booleanRef, noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, null));
            }
            cVar.b(new NoteFloatLayerService$showNoteEditPanel$2$1$1$3(noteFloatLayerService, theseusWebUIComponent, aVar, z6, lVar, objectRef, null));
            cVar.a(theseusWebUIComponent.f104195o);
            cVar.b(new NoteFloatLayerService$showNoteEditPanel$2$1$1$4(runnable, noteFloatLayerService, consumer, z6, lVar, objectRef, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0$0(NoteFloatLayerService noteFloatLayerService) {
            return (noteFloatLayerService.f98606l.i() || noteFloatLayerService.f98606l.f()) ? 3 : 1;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$useWindowInsetsKeyboardHeight, this.$uiComponent, this.this$0, this.$windowInsetsKeyboardShown, this.$softKeyBoardChangeListener, this.$ugcSoftKeyBoardHelper, this.$coverJob, this.$multiWindowNotifyRunnable, this.$configurationChangeListener, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.$useWindowInsetsKeyboardHeight;
                TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                Ref.BooleanRef booleanRef = this.$windowInsetsKeyboardShown;
                NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 = this.$softKeyBoardChangeListener;
                com.bilibili.playerbizcommon.utils.l lVar = this.$ugcSoftKeyBoardHelper;
                Ref.ObjectRef<Job> objectRef = this.$coverJob;
                Runnable runnable = this.$multiWindowNotifyRunnable;
                Consumer<Configuration> consumer = this.$configurationChangeListener;
                this.label = 1;
                ArrayList arrayList = new ArrayList();
                invokeSuspend$lambda$0(z6, theseusWebUIComponent, noteFloatLayerService, booleanRef, noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, lVar, objectRef, runnable, consumer, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
    public NoteFloatLayerService$showNoteEditPanel$2(NoteFloatLayerService noteFloatLayerService, String str, Continuation<? super NoteFloatLayerService$showNoteEditPanel$2> continuation) {
        super(2, continuation);
        this.this$0 = noteFloatLayerService;
        this.$text = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$dispatchWindowInsetsKeyboardHeight(Ref.BooleanRef booleanRef, NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, int i7) {
        if (i7 <= 0) {
            if (booleanRef.element) {
                booleanRef.element = false;
                noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.keyBoardHide();
                return;
            }
            return;
        }
        if (!booleanRef.element) {
            booleanRef.element = true;
            noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.keyBoardShow(i7);
        } else {
            if (i7 <= 0) {
                noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.getClass();
                return;
            }
            noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.f98625a.j(i7);
            NoteFloatLayerService.a aVar = noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1.f98626b.f98618x;
            if (aVar != null) {
                aVar.onKeyboardEvent(true, i7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(NoteFloatLayerService noteFloatLayerService) {
        String str;
        NoteFloatLayerService.a aVar = noteFloatLayerService.f98618x;
        if (aVar == null || (str = aVar.f98622b) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        pl.h.a(0, jSONObject, "code", "message", "");
        jSONObject.put(TextSource.CFG_CONTENT, Boolean.TRUE);
        aVar.callbackToJs(new Object[]{str, jSONObject});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r5.intValue() == 5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void invokeSuspend$lambda$2(com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService r5, kotlin.jvm.internal.Ref.BooleanRef r6, boolean r7, com.bilibili.playerbizcommon.utils.l r8, java.lang.Runnable r9, android.content.res.Configuration r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2.invokeSuspend$lambda$2(com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService, kotlin.jvm.internal.Ref$BooleanRef, boolean, com.bilibili.playerbizcommon.utils.l, java.lang.Runnable, android.content.res.Configuration):void");
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NoteFloatLayerService$showNoteEditPanel$2 noteFloatLayerService$showNoteEditPanel$2 = new NoteFloatLayerService$showNoteEditPanel$2(this.this$0, this.$text, continuation);
        noteFloatLayerService$showNoteEditPanel$2.L$0 = obj;
        return noteFloatLayerService$showNoteEditPanel$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [com.bilibili.ship.theseus.ugc.weblayer.l, java.lang.Runnable] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String strB = this.this$0.h.b();
            String strL = this.this$0.h.f104050p ? StringsKt.L("https://www.bilibili.com/h5/note-app?oid=avid&pagefrom=ugcvideo&is_stein_gate=1", GameCardButton.extraAvid, strB) : StringsKt.L("https://www.bilibili.com/h5/note-app?oid=avid&pagefrom=ugcvideo&is_stein_gate=0", GameCardButton.extraAvid, strB);
            if (this.$text != null) {
                strL = G.p.a(strL, "&pub_source=comment");
                this.this$0.f98617w = this.$text;
            } else {
                this.this$0.f98617w = null;
            }
            NoteFloatLayerService noteFloatLayerService = this.this$0;
            noteFloatLayerService.f98616v = false;
            noteFloatLayerService.f98618x = new NoteFloatLayerService.a(noteFloatLayerService, new i(noteFloatLayerService));
            com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
            final NoteFloatLayerService noteFloatLayerService2 = this.this$0;
            dVar.f67876b.put("ugcvideo", new JsBridgeCallHandlerFactoryV2(noteFloatLayerService2) { // from class: com.bilibili.ship.theseus.ugc.weblayer.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteFloatLayerService f98689a;

                {
                    this.f98689a = noteFloatLayerService2;
                }

                public final JsBridgeCallHandlerV2 create() {
                    return this.f98689a.f98618x;
                }
            });
            TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(strL, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(this.this$0.f98606l.b(), 0, 1, (Object) null)), false, true, this.this$0.f98606l.f102941e, 360380), null, null, null, null, 120);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            NoteFloatLayerService noteFloatLayerService3 = this.this$0;
            NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 = new NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1(theseusWebUIComponent, noteFloatLayerService3, objectRef, coroutineScope);
            noteFloatLayerService3.f98612r.getClass();
            Lazy lazy = com.bilibili.ship.theseus.united.page.activitywindow.r.f98884a;
            final boolean zB = com.bilibili.ship.theseus.united.page.activitywindow.a.b();
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final com.bilibili.playerbizcommon.utils.l lVar = new com.bilibili.playerbizcommon.utils.l(this.this$0.f98597b, noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, false);
            if (!zB) {
                lVar.b(this.this$0.f98597b.getWindow());
            }
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            final NoteFloatLayerService noteFloatLayerService4 = this.this$0;
            final ?? r02 = new Runnable(noteFloatLayerService4) { // from class: com.bilibili.ship.theseus.ugc.weblayer.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteFloatLayerService f98690a;

                {
                    this.f98690a = noteFloatLayerService4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NoteFloatLayerService$showNoteEditPanel$2.invokeSuspend$lambda$1(this.f98690a);
                }
            };
            Consumer<Configuration> consumer = new Consumer(noteFloatLayerService4, booleanRef2, zB, lVar, r02) { // from class: com.bilibili.ship.theseus.ugc.weblayer.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteFloatLayerService f98691a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.BooleanRef f98692b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f98693c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.playerbizcommon.utils.l f98694d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final l f98695e;

                {
                    this.f98691a = noteFloatLayerService4;
                    this.f98692b = booleanRef2;
                    this.f98693c = zB;
                    this.f98694d = lVar;
                    this.f98695e = r02;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj2) {
                    Ref.BooleanRef booleanRef3 = this.f98692b;
                    com.bilibili.playerbizcommon.utils.l lVar2 = this.f98694d;
                    NoteFloatLayerService$showNoteEditPanel$2.invokeSuspend$lambda$2(this.f98691a, booleanRef3, this.f98693c, lVar2, this.f98695e, (Configuration) obj2);
                }
            };
            noteFloatLayerService4.f98597b.addOnConfigurationChangedListener(consumer);
            NoteFloatLayerService noteFloatLayerService5 = this.this$0;
            com.bilibili.ship.theseus.united.page.activitywindow.m mVar = noteFloatLayerService5.f98612r;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(zB, theseusWebUIComponent, noteFloatLayerService5, booleanRef, noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, lVar, objectRef, r02, consumer, null);
            this.label = 1;
            if (mVar.a(anonymousClass1, this) == coroutine_suspended) {
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
