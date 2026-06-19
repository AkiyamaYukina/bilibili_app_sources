package com.bilibili.search2.main;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.search2.main.ogv.OgvThemeState;
import com.bilibili.search2.main.ogv.e;
import com.bilibili.search2.result.ogv.weight.OgvRelativeLayout;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3.class */
final class BiliMainSearchCoreFragment$initOgvThemeReducer$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliMainSearchCoreFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final BiliMainSearchCoreFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$1.class */
        public static final class C05811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final BiliMainSearchCoreFragment this$0;

            /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliMainSearchCoreFragment f86677a;

                public a(BiliMainSearchCoreFragment biliMainSearchCoreFragment) {
                    this.f86677a = biliMainSearchCoreFragment;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws kotlin.NoWhenBranchMatchedException {
                    /*
                        Method dump skipped, instruction units count: 579
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3.AnonymousClass1.C05811.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05811(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super C05811> continuation) {
                super(2, continuation);
                this.this$0 = biliMainSearchCoreFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05811(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                StateFlow<OgvThemeState> stateFlow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BiliMainSearchCoreFragment biliMainSearchCoreFragment = this.this$0;
                    com.bilibili.search2.main.ogv.g gVar = biliMainSearchCoreFragment.f86666r;
                    if (gVar == null || (stateFlow = gVar.f86893g) == null) {
                        return Unit.INSTANCE;
                    }
                    a aVar = new a(biliMainSearchCoreFragment);
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

        /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final BiliMainSearchCoreFragment this$0;

            /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initOgvThemeReducer$3$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliMainSearchCoreFragment f86678a;

                public a(BiliMainSearchCoreFragment biliMainSearchCoreFragment) {
                    this.f86678a = biliMainSearchCoreFragment;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    com.bilibili.search2.main.ogv.e eVar = (com.bilibili.search2.main.ogv.e) obj;
                    BiliMainSearchCoreFragment biliMainSearchCoreFragment = this.f86678a;
                    biliMainSearchCoreFragment.getClass();
                    if (eVar instanceof e.h) {
                        OgvRelativeLayout ogvRelativeLayout = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout != null) {
                            Bitmap bitmap = ((e.h) eVar).f86882a;
                            ogvRelativeLayout.f88468e = bitmap;
                            ogvRelativeLayout.d(bitmap);
                            ogvRelativeLayout.f88467d = false;
                            ogvRelativeLayout.f88466c = true;
                            ogvRelativeLayout.invalidate();
                        }
                    } else if (eVar instanceof e.i) {
                        OgvRelativeLayout ogvRelativeLayout2 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout2 != null) {
                            int i7 = ((e.i) eVar).f86883a;
                            ogvRelativeLayout2.f88467d = true;
                            ogvRelativeLayout2.f88466c = false;
                            ogvRelativeLayout2.f88470g.setColor(i7);
                            ogvRelativeLayout2.invalidate();
                        }
                    } else if (eVar instanceof e.C0583e) {
                        OgvRelativeLayout ogvRelativeLayout3 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout3 != null) {
                            Bitmap bitmap2 = ((e.C0583e) eVar).f86879a;
                            ogvRelativeLayout3.f88468e = bitmap2;
                            if (bitmap2 != null) {
                                ogvRelativeLayout3.d(bitmap2);
                            }
                            ogvRelativeLayout3.f88466c = true;
                            ogvRelativeLayout3.f88467d = false;
                            ogvRelativeLayout3.invalidate();
                        }
                    } else if (eVar instanceof e.f) {
                        OgvRelativeLayout ogvRelativeLayout4 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout4 != null) {
                            ogvRelativeLayout4.f88466c = false;
                            ogvRelativeLayout4.f88467d = true;
                            ogvRelativeLayout4.invalidate();
                        }
                    } else if (eVar instanceof e.a) {
                        OgvRelativeLayout ogvRelativeLayout5 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout5 != null) {
                            ogvRelativeLayout5.f88466c = false;
                            ogvRelativeLayout5.f88467d = false;
                            ogvRelativeLayout5.invalidate();
                        }
                    } else if (eVar instanceof e.b) {
                        OgvRelativeLayout ogvRelativeLayout6 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout6 != null) {
                            e.b bVar = (e.b) eVar;
                            ogvRelativeLayout6.a(bVar.f86876b, bVar.f86875a);
                        }
                    } else if (eVar instanceof e.c) {
                        OgvRelativeLayout ogvRelativeLayout7 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout7 != null) {
                            ogvRelativeLayout7.f88472j = 0;
                            ogvRelativeLayout7.f88468e = null;
                        }
                    } else if (eVar instanceof e.d) {
                        OgvRelativeLayout ogvRelativeLayout8 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout8 != null) {
                            ogvRelativeLayout8.f88472j = 0;
                        }
                    } else {
                        if (!(eVar instanceof e.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OgvRelativeLayout ogvRelativeLayout9 = biliMainSearchCoreFragment.f86662n;
                        if (ogvRelativeLayout9 != null) {
                            ogvRelativeLayout9.setMaxShowDistanceExtra(((e.g) eVar).f86881a);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = biliMainSearchCoreFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Flow<com.bilibili.search2.main.ogv.e> flow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BiliMainSearchCoreFragment biliMainSearchCoreFragment = this.this$0;
                    com.bilibili.search2.main.ogv.g gVar = biliMainSearchCoreFragment.f86666r;
                    if (gVar != null && (flow = gVar.f86894i) != null) {
                        a aVar = new a(biliMainSearchCoreFragment);
                        this.label = 1;
                        if (flow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliMainSearchCoreFragment;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05811(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliMainSearchCoreFragment$initOgvThemeReducer$3(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super BiliMainSearchCoreFragment$initOgvThemeReducer$3> continuation) {
        super(2, continuation);
        this.this$0 = biliMainSearchCoreFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliMainSearchCoreFragment$initOgvThemeReducer$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
