package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.ugc.intro.ugcseason.d;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4.class */
final class UgcFineSeasonComponent$bind$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ImageView $arrowImg;
    final Context $context;
    final RecyclerView $episodeRecycler;
    final RecyclerView $sectionRecycler;
    final TextView $title;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ImageView $arrowImg;
        final TextView $title;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$1$1.class */
        public static final class C08641 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ImageView $arrowImg;
            final TextView $title;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08641(TextView textView, ImageView imageView, Continuation<? super C08641> continuation) {
                super(2, continuation);
                this.$title = textView;
                this.$arrowImg = imageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08641 c08641 = new C08641(this.$title, this.$arrowImg, continuation);
                c08641.I$0 = ((Number) obj).intValue();
                return c08641;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                TextView textView = this.$title;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iDpToPx;
                textView.setLayoutParams(marginLayoutParams);
                ImageView imageView = this.$arrowImg;
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.rightMargin = iDpToPx - DimenUtilsKt.dpToPx(10);
                imageView.setLayoutParams(marginLayoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, TextView textView, ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$title = textView;
            this.$arrowImg = imageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, this.$arrowImg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f97471b;
                C08641 c08641 = new C08641(this.$title, this.$arrowImg, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08641, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Z, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(d dVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Z z6, Continuation<? super Unit> continuation) {
                return create(z6, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Z z6 = (Z) this.L$0;
                if (z6 == null) {
                    return Unit.INSTANCE;
                }
                d dVar = this.this$0;
                d.c cVar = dVar.f97473d;
                List<Z> listB = dVar.f97470a.b();
                cVar.f97481a.clear();
                cVar.f97481a.addAll(listB);
                cVar.notifyDataSetChanged();
                d.a aVar = this.this$0.f97472c;
                List<C6355q> list = z6.f101648d;
                aVar.f97475a.clear();
                aVar.f97475a.addAll(list);
                aVar.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
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
                d dVar = this.this$0;
                MutableStateFlow<Z> mutableStateFlow = dVar.f97474e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final RecyclerView $episodeRecycler;
        final RecyclerView $sectionRecycler;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final Context $context;
            final RecyclerView $episodeRecycler;
            final RecyclerView $sectionRecycler;
            int I$0;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$3$1$a.class */
            public static final class a extends DividerItemDecoration {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f97446e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f97447f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Context context, int i7, int i8) {
                    super(context, 0);
                    this.f97446e = i7;
                    this.f97447f = i8;
                }

                @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int i7 = 0;
                    int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
                    int i8 = this.f97446e;
                    if (childAdapterPosition == 0) {
                        i7 = i8;
                    }
                    rect.left = i7;
                    if (childAdapterPosition != itemCount - 1) {
                        i8 = this.f97447f;
                    }
                    rect.right = i8;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(tv.danmaku.bili.widget.RecyclerView recyclerView, tv.danmaku.bili.widget.RecyclerView recyclerView2, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$episodeRecycler = recyclerView;
                this.$sectionRecycler = recyclerView2;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeRecycler, this.$sectionRecycler, this.$context, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                Throwable th;
                a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = new a(this.$context, DimenUtilsKt.dpToPx(this.I$0), DimenUtilsKt.dpToPx(8.0f));
                    aVar.setDrawable(new ColorDrawable(0));
                    this.$episodeRecycler.addItemDecoration(aVar);
                    this.$sectionRecycler.addItemDecoration(aVar);
                    try {
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        this.$episodeRecycler.removeItemDecoration(aVar2);
                        this.$sectionRecycler.removeItemDecoration(aVar2);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar3 = (a) this.L$0;
                    aVar2 = aVar3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        this.$episodeRecycler.removeItemDecoration(aVar2);
                        this.$sectionRecycler.removeItemDecoration(aVar2);
                        throw th;
                    }
                }
                aVar2 = aVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, tv.danmaku.bili.widget.RecyclerView recyclerView, tv.danmaku.bili.widget.RecyclerView recyclerView2, Context context, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$episodeRecycler = recyclerView;
            this.$sectionRecycler = recyclerView2;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$episodeRecycler, this.$sectionRecycler, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f97471b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeRecycler, this.$sectionRecycler, this.$context, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcFineSeasonComponent$bind$4$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcFineSeasonComponent$bind$4$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(d dVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f97470a.f97490a.element = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcFineSeasonComponent$bind$4(d dVar, TextView textView, ImageView imageView, tv.danmaku.bili.widget.RecyclerView recyclerView, tv.danmaku.bili.widget.RecyclerView recyclerView2, Context context, Continuation<? super UgcFineSeasonComponent$bind$4> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$title = textView;
        this.$arrowImg = imageView;
        this.$episodeRecycler = recyclerView;
        this.$sectionRecycler = recyclerView2;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcFineSeasonComponent$bind$4 ugcFineSeasonComponent$bind$4 = new UgcFineSeasonComponent$bind$4(this.this$0, this.$title, this.$arrowImg, this.$episodeRecycler, this.$sectionRecycler, this.$context, continuation);
        ugcFineSeasonComponent$bind$4.L$0 = obj;
        return ugcFineSeasonComponent$bind$4;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, this.$arrowImg, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$episodeRecycler, this.$sectionRecycler, this.$context, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
