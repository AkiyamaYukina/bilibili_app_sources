package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2.class */
final class OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2 extends SuspendLambda implements Function2<Fragment, Continuation<? super Unit>, Object> {
    final Function0<Unit> $onDismissRequest;
    final d.a $vm;
    Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        final Function0<Unit> $onDismissRequest;
        final d.a $vm;
        private Object L$0;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$1.class */
        public static final class C06981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            final Function0<Unit> $onDismissRequest;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0<Unit> f92976a;

                public a(Function0<Unit> function0) {
                    this.f92976a = function0;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    this.f92976a.invoke();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06981(Fragment fragment, Function0<Unit> function0, Continuation<? super C06981> continuation) {
                super(2, continuation);
                this.$fragment = fragment;
                this.$onDismissRequest = function0;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06981(this.$fragment, this.$onDismissRequest, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlowS = ((wl0.b) this.$fragment).s();
                    a aVar = new a(this.$onDismissRequest);
                    this.label = 1;
                    if (mutableSharedFlowS.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            int label;
            final b this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f92977a;

                public a(b bVar) {
                    this.f92977a = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    UIComponent dVar;
                    ReviewPublishInfo reviewPublishInfo = (ReviewPublishInfo) obj;
                    b bVar = this.f92977a;
                    com.bilibili.ship.theseus.ogv.intro.floatlayer.service.a aVar = bVar.f92988d;
                    aVar.getClass();
                    d.a aVar2 = new d.a(null);
                    aVar2.m(false);
                    if (true != aVar2.f99748f) {
                        aVar2.f99748f = true;
                        aVar2.notifyPropertyChanged(687);
                    }
                    Qj0.d dVarA = Qj0.c.a("bilibili://bangumi/review/review-publish-success");
                    if (dVarA == null) {
                        dVar = null;
                    } else {
                        Class<? extends Fragment> cls = dVarA.f19963a;
                        Bundle bundle = new Bundle();
                        bundle.putString("page_name", "pgc.pgc-video-detail-text");
                        bundle.putParcelable("data", reviewPublishInfo);
                        Unit unit = Unit.INSTANCE;
                        dVar = new com.bilibili.ship.theseus.united.page.floatlayer.d(aVar2, new com.bilibili.ship.theseus.united.page.floatlayer.e(aVar.f92984a, cls, bundle, null));
                    }
                    if (dVar != null) {
                        BuildersKt.launch$default(bVar.f92985a, (CoroutineContext) null, (CoroutineStart) null, new OgvShortReviewPublishLayerService$showReviewPublishSuccessLayer$1(bVar, dVar, null), 3, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Fragment fragment, b bVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$fragment = fragment;
                this.this$0 = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$fragment, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlowS1 = ((wl0.b) this.$fragment).s1();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (mutableSharedFlowS1.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            final d.a $vm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.a f92978a;

                public a(d.a aVar) {
                    this.f92978a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    this.f92978a.n((String) obj);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Fragment fragment, d.a aVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$fragment = fragment;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$fragment, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlowA = ((wl0.b) this.$fragment).A();
                    a aVar = new a(this.$vm);
                    this.label = 1;
                    if (mutableSharedFlowA.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(Fragment fragment, Function0<Unit> function0, b bVar, d.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$onDismissRequest = function0;
            this.this$0 = bVar;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, this.$onDismissRequest, this.this$0, this.$vm, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06981(this.$fragment, this.$onDismissRequest, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$fragment, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$fragment, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2(Function0<Unit> function0, b bVar, d.a aVar, Continuation<? super OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2> continuation) {
        super(2, continuation);
        this.$onDismissRequest = function0;
        this.this$0 = bVar;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2 ogvShortReviewPublishLayerService$newShortReviewPublishLayer$2 = new OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2(this.$onDismissRequest, this.this$0, this.$vm, continuation);
        ogvShortReviewPublishLayerService$newShortReviewPublishLayer$2.L$0 = obj;
        return ogvShortReviewPublishLayerService$newShortReviewPublishLayer$2;
    }

    public final Object invoke(Fragment fragment, Continuation<? super Unit> continuation) {
        return create(fragment, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Fragment fragment = (Fragment) this.L$0;
            if (fragment instanceof wl0.b) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment, this.$onDismissRequest, this.this$0, this.$vm, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
