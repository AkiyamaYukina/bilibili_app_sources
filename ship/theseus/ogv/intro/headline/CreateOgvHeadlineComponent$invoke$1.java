package com.bilibili.ship.theseus.ogv.intro.headline;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.DrawableAcquireRequestBuilder;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.ship.theseus.ogv.intro.headline.i;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1.class */
public final class CreateOgvHeadlineComponent$invoke$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final OgvHeadlineData $data;
    final i.a $headlineVm;
    final MutableState<Painter> $titleImageState;
    final String $titleImageUrl;
    int label;
    final CreateOgvHeadlineComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final OgvHeadlineData $data;
        final i.a $headlineVm;
        final MutableState<Painter> $titleImageState;
        final String $titleImageUrl;
        private Object L$0;
        int label;
        final CreateOgvHeadlineComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$1.class */
        public static final class C07031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final OgvHeadlineData $data;
            final MutableState<Painter> $titleImageState;
            final String $titleImageUrl;
            Object L$0;
            int label;
            final CreateOgvHeadlineComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07031(MutableState<Painter> mutableState, CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData, String str, Continuation<? super C07031> continuation) {
                super(2, continuation);
                this.$titleImageState = mutableState;
                this.this$0 = createOgvHeadlineComponent;
                this.$data = ogvHeadlineData;
                this.$titleImageUrl = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07031(this.$titleImageState, this.this$0, this.$data, this.$titleImageUrl, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                MutableState<Painter> mutableState;
                Object objA;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableState = this.$titleImageState;
                    BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
                    CreateOgvHeadlineComponent createOgvHeadlineComponent = this.this$0;
                    ImageDataSource imageDataSourceSubmit = DrawableAcquireRequestBuilder.enableAnimatable$default(biliImageLoader.acquire(createOgvHeadlineComponent.f93094b, createOgvHeadlineComponent.h).useOrigin().asDrawable(), this.$data.d(), (Boolean) null, 2, (Object) null).url(this.$titleImageUrl).submit();
                    this.L$0 = mutableState;
                    this.label = 1;
                    objA = com.bilibili.ogv.infra.biliimage.c.a(imageDataSourceSubmit, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objA = ((Result) obj).unbox-impl();
                }
                Object obj2 = objA;
                if (Result.isFailure-impl(objA)) {
                    obj2 = null;
                }
                DrawableHolder drawableHolder = (DrawableHolder) obj2;
                DrawablePainter drawablePainter = null;
                if (drawableHolder != null) {
                    Drawable drawable = drawableHolder.get();
                    drawablePainter = null;
                    if (drawable != null) {
                        drawablePainter = new DrawablePainter(drawable);
                    }
                }
                mutableState.setValue(drawablePainter);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final OgvHeadlineData $data;
            final i.a $headlineVm;
            int label;
            final CreateOgvHeadlineComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData, i.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = createOgvHeadlineComponent;
                this.$data = ogvHeadlineData;
                this.$headlineVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, this.$headlineVm, continuation);
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
                    long j7 = this.this$0.f93097e.f94449a;
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                    com.bilibili.community.follow.b bVar2 = bVar;
                    if (bVar == null) {
                        bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                    }
                    if (bVar2.a || !this.$data.c()) {
                        return Unit.INSTANCE;
                    }
                    CreateOgvHeadlineComponent createOgvHeadlineComponent = this.this$0;
                    i.a aVar = this.$headlineVm;
                    long j8 = createOgvHeadlineComponent.f93097e.f94449a;
                    this.label = 1;
                    if (CreateOgvHeadlineComponent.a(createOgvHeadlineComponent, aVar, j8, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final i.a $headlineVm;
            int label;
            final CreateOgvHeadlineComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i.a f93100a;

                public a(i.a aVar) {
                    this.f93100a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    i.a aVar = this.f93100a;
                    if (iIntValue != aVar.f93149l) {
                        aVar.f93149l = iIntValue;
                        aVar.notifyPropertyChanged(519);
                    }
                    int i7 = iIntValue - 12;
                    if (i7 != aVar.f93150m) {
                        aVar.f93150m = i7;
                        aVar.notifyPropertyChanged(518);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CreateOgvHeadlineComponent createOgvHeadlineComponent, i.a aVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = createOgvHeadlineComponent;
                this.$headlineVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$headlineVm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93096d.f100020a;
                    a aVar = new a(this.$headlineVm);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final i.a $headlineVm;
            int label;
            final CreateOgvHeadlineComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent$invoke$1$1$4$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/CreateOgvHeadlineComponent$invoke$1$1$4$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CreateOgvHeadlineComponent f93101a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i.a f93102b;

                public a(CreateOgvHeadlineComponent createOgvHeadlineComponent, i.a aVar) {
                    this.f93101a = createOgvHeadlineComponent;
                    this.f93102b = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    CreateOgvHeadlineComponent createOgvHeadlineComponent = this.f93101a;
                    boolean zE = createOgvHeadlineComponent.f93097e.f94455g.e();
                    com.bilibili.ogv.pub.season.a aVarC = createOgvHeadlineComponent.f93097e.c();
                    createOgvHeadlineComponent.d(this.f93102b, ((com.bilibili.community.follow.b) obj).a, aVarC, zE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(CreateOgvHeadlineComponent createOgvHeadlineComponent, i.a aVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createOgvHeadlineComponent;
                this.$headlineVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$headlineVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.this$0.f93097e.f94449a;
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    MutableStateFlow mutableStateFlowB = com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7));
                    a aVar = new a(this.this$0, this.$headlineVm);
                    this.label = 1;
                    Object objCollect = mutableStateFlowB.collect(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1.2(aVar), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                    if (objCollect == coroutine_suspended) {
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
        public AnonymousClass1(String str, MutableState<Painter> mutableState, CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData, i.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$titleImageUrl = str;
            this.$titleImageState = mutableState;
            this.this$0 = createOgvHeadlineComponent;
            this.$data = ogvHeadlineData;
            this.$headlineVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$titleImageUrl, this.$titleImageState, this.this$0, this.$data, this.$headlineVm, continuation);
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
            String str = this.$titleImageUrl;
            if (str != null && str.length() != 0) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07031(this.$titleImageState, this.this$0, this.$data, this.$titleImageUrl, null), 3, (Object) null);
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, this.$headlineVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$headlineVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$headlineVm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvHeadlineComponent$invoke$1(String str, MutableState<Painter> mutableState, CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData, i.a aVar, Continuation<? super CreateOgvHeadlineComponent$invoke$1> continuation) {
        super(1, continuation);
        this.$titleImageUrl = str;
        this.$titleImageState = mutableState;
        this.this$0 = createOgvHeadlineComponent;
        this.$data = ogvHeadlineData;
        this.$headlineVm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CreateOgvHeadlineComponent$invoke$1(this.$titleImageUrl, this.$titleImageState, this.this$0, this.$data, this.$headlineVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$titleImageUrl, this.$titleImageState, this.this$0, this.$data, this.$headlineVm, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
