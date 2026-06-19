package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import My0.b;
import TB0.C2883o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6554h;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$initEvent$1.class */
final class BiliEditorCaptionEditFragmentV3$initEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliEditorCaptionEditFragmentV3 this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$initEvent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$initEvent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BiliEditorCaptionEditFragmentV3 this$0;

        /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3$initEvent$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$initEvent$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106344a;

            public a(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
                this.f106344a = biliEditorCaptionEditFragmentV3;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int i7;
                int i8;
                CaptionInfo captionInfo;
                Triple<Integer, Long, Long> triple;
                b.a aVar = (b.a) obj;
                BLog.e("BiliEditorCaptionEditFragmentV2", "multiEditEventFlow collect : " + aVar);
                boolean z6 = aVar instanceof b.a.e;
                int i9 = 0;
                BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106344a;
                if (z6) {
                    long j7 = ((b.a.e) aVar).f16521a;
                    biliEditorCaptionEditFragmentV3.getClass();
                    if (FragmentExtKt.isFragmentActive(biliEditorCaptionEditFragmentV3) && !biliEditorCaptionEditFragmentV3.f106325n && (((Number) biliEditorCaptionEditFragmentV3.f106326o.getFirst()).intValue() == -1 || j7 < ((Number) biliEditorCaptionEditFragmentV3.f106326o.getSecond()).longValue() || j7 > ((Number) biliEditorCaptionEditFragmentV3.f106326o.getThird()).longValue())) {
                        Iterator<BiliEditorCaptionEditFragmentV3.b> it = biliEditorCaptionEditFragmentV3.f106322k.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                triple = new Triple<>(-1, -1L, -1L);
                                break;
                            }
                            BiliEditorCaptionEditFragmentV3.b next = it.next();
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            BiliEditorCaptionEditFragmentV3.b bVar = next;
                            if (bVar.f106342e <= j7) {
                                long j8 = bVar.f106341d;
                                if (j8 >= j7) {
                                    triple = new Triple<>(Integer.valueOf(i9), Long.valueOf(bVar.f106342e), Long.valueOf(j8));
                                    break;
                                }
                            }
                            i9++;
                        }
                        if (((Number) triple.getFirst()).intValue() != -1) {
                            biliEditorCaptionEditFragmentV3.f106326o = triple;
                            int iIntValue = ((Number) triple.getFirst()).intValue();
                            int i10 = biliEditorCaptionEditFragmentV3.f106327p;
                            if (iIntValue != i10) {
                                if (i10 != -1) {
                                    biliEditorCaptionEditFragmentV3.f106329r = null;
                                    Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar = biliEditorCaptionEditFragmentV3.f106321j;
                                    Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar2 = cVar;
                                    if (cVar == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                        cVar2 = null;
                                    }
                                    cVar2.notifyItemChanged(biliEditorCaptionEditFragmentV3.f106327p);
                                }
                                biliEditorCaptionEditFragmentV3.f106329r = biliEditorCaptionEditFragmentV3.f106322k.get(((Number) biliEditorCaptionEditFragmentV3.f106326o.getFirst()).intValue());
                                C2883o c2883o = biliEditorCaptionEditFragmentV3.f106319g;
                                C2883o c2883o2 = c2883o;
                                if (c2883o == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    c2883o2 = null;
                                }
                                c2883o2.f23890f.scrollToPosition(((Number) biliEditorCaptionEditFragmentV3.f106326o.getFirst()).intValue());
                                Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar3 = biliEditorCaptionEditFragmentV3.f106321j;
                                if (cVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                    cVar3 = null;
                                }
                                cVar3.notifyItemChanged(((Number) biliEditorCaptionEditFragmentV3.f106326o.getFirst()).intValue());
                                biliEditorCaptionEditFragmentV3.f106327p = ((Number) biliEditorCaptionEditFragmentV3.f106326o.getFirst()).intValue();
                            }
                        } else if (biliEditorCaptionEditFragmentV3.f106327p != -1) {
                            biliEditorCaptionEditFragmentV3.f106329r = null;
                            Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar4 = biliEditorCaptionEditFragmentV3.f106321j;
                            if (cVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                cVar4 = null;
                            }
                            cVar4.notifyItemChanged(biliEditorCaptionEditFragmentV3.f106327p);
                            biliEditorCaptionEditFragmentV3.f106327p = -1;
                        }
                    }
                } else if (aVar instanceof b.a.d) {
                    BiliEditorCaptionEditFragmentV3.b bVar2 = biliEditorCaptionEditFragmentV3.f106329r;
                    if (bVar2 != null && (captionInfo = bVar2.f106338a) != null) {
                        C6554h c6554hOf = biliEditorCaptionEditFragmentV3.of();
                        Ly0.t tVar = c6554hOf.f106710e;
                        tVar.F(captionInfo);
                        tVar.I(captionInfo);
                        Oy0.d dVar = c6554hOf.f106709d.f16511g;
                        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfoB = dVar.b(captionInfo);
                        if (biliEditorMaterialMultiInfoB != null) {
                            dVar.f18125b.K(biliEditorMaterialMultiInfoB);
                        }
                    }
                    biliEditorCaptionEditFragmentV3.of().f106710e.B();
                } else if (aVar instanceof b.a.C0088b) {
                    biliEditorCaptionEditFragmentV3.nf();
                } else if (aVar instanceof b.a.c) {
                    CaptionInfo captionInfo2 = ((b.a.c) aVar).f16519a;
                    Iterator<BiliEditorCaptionEditFragmentV3.b> it2 = biliEditorCaptionEditFragmentV3.f106322k.iterator();
                    int i11 = 0;
                    while (true) {
                        i7 = -1;
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().f106338a.id == captionInfo2.id) {
                            i7 = i11;
                            break;
                        }
                        i11++;
                    }
                    if (i7 >= 0 && i7 != (i8 = biliEditorCaptionEditFragmentV3.f106331t)) {
                        biliEditorCaptionEditFragmentV3.f106331t = i7;
                        biliEditorCaptionEditFragmentV3.f106329r = biliEditorCaptionEditFragmentV3.f106322k.get(i7);
                        biliEditorCaptionEditFragmentV3.f106327p = biliEditorCaptionEditFragmentV3.f106331t;
                        biliEditorCaptionEditFragmentV3.vf();
                        Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar5 = biliEditorCaptionEditFragmentV3.f106321j;
                        Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar6 = cVar5;
                        if (cVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                            cVar6 = null;
                        }
                        cVar6.notifyItemChanged(i8);
                        Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar7 = biliEditorCaptionEditFragmentV3.f106321j;
                        Xw0.c<BiliEditorCaptionEditFragmentV3.b> cVar8 = cVar7;
                        if (cVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                            cVar8 = null;
                        }
                        cVar8.notifyItemChanged(biliEditorCaptionEditFragmentV3.f106331t);
                        C2883o c2883o3 = biliEditorCaptionEditFragmentV3.f106319g;
                        if (c2883o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c2883o3 = null;
                        }
                        c2883o3.f23890f.scrollToPosition(biliEditorCaptionEditFragmentV3.f106331t);
                    }
                } else if (aVar instanceof b.a.C0087a) {
                    biliEditorCaptionEditFragmentV3.rf(3);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliEditorCaptionEditFragmentV3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<b.a> stateFlow = this.this$0.of().f106712g;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorCaptionEditFragmentV3$initEvent$1(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3, Continuation<? super BiliEditorCaptionEditFragmentV3$initEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorCaptionEditFragmentV3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorCaptionEditFragmentV3$initEvent$1(this.this$0, continuation);
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
            Lifecycle.State state = Lifecycle.State.CREATED;
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
