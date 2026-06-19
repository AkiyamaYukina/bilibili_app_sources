package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import J3.C2375r1;
import Vu0.E;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintProgressBar;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.videopage.common.widget.view.VerifyAvatarFrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent.class */
@StabilityInferred(parameters = 0)
public final class RecommendUpComponent extends pv0.c<n<E>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<a> f97755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97756g;

    @NotNull
    public final c70.e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.ui.minigame.more.g f97757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f97758j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<e> f97760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final RecommendUpRepository.LoadState f97761c;

        public a(@NotNull String str, @NotNull List<e> list, @NotNull RecommendUpRepository.LoadState loadState) {
            this.f97759a = str;
            this.f97760b = list;
            this.f97761c = loadState;
        }

        public static a a(a aVar, List list, RecommendUpRepository.LoadState loadState, int i7) {
            String str = aVar.f97759a;
            if ((i7 & 2) != 0) {
                list = aVar.f97760b;
            }
            if ((i7 & 4) != 0) {
                loadState = aVar.f97761c;
            }
            aVar.getClass();
            return new a(str, list, loadState);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f97759a, aVar.f97759a) && Intrinsics.areEqual(this.f97760b, aVar.f97760b) && this.f97761c == aVar.f97761c;
        }

        public final int hashCode() {
            return this.f97761c.hashCode() + e0.a(this.f97759a.hashCode() * 31, 31, this.f97760b);
        }

        @NotNull
        public final String toString() {
            List<e> list = this.f97760b;
            StringBuilder sb = new StringBuilder("ComponentState(title=");
            M6.f.a(this.f97759a, ", items=", ", loadState=", sb, list);
            sb.append(this.f97761c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$b.class */
    public static final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c70.f f97762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final com.bilibili.lib.coroutineextension.g f97763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<e> f97764c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public RecommendUpRepository.LoadState f97765d = RecommendUpRepository.LoadState.NONE;

        public b(@NotNull c70.f fVar, @NotNull com.bilibili.lib.coroutineextension.g gVar) {
            this.f97762a = fVar;
            this.f97763b = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f97764c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return i7 < this.f97764c.size() ? 1 : 0;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 762
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            RecyclerView.ViewHolder cVar;
            if (i7 == 1) {
                int i8 = d.f97774f;
                cVar = new d(p.a(viewGroup, 2131500409, viewGroup, false));
            } else {
                int i9 = c.f97770c;
                cVar = new c(p.a(viewGroup, 2131500408, viewGroup, false));
            }
            return cVar;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final RecommendUpComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecommendUpComponent recommendUpComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = recommendUpComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final TintImageView $close;
        final RecyclerView $recyclerView;
        final TextView $title;
        private Object L$0;
        int label;
        final RecommendUpComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final TintImageView $close;
            final TextView $title;
            int label;
            final RecommendUpComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$1$1.class */
            public static final class C08911 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final TintImageView $close;
                final TextView $title;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08911(TextView textView, TintImageView tintImageView, Continuation<? super C08911> continuation) {
                    super(2, continuation);
                    this.$title = textView;
                    this.$close = tintImageView;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08911 c08911 = new C08911(this.$title, this.$close, continuation);
                    c08911.I$0 = ((Number) obj).intValue();
                    return c08911;
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
                    TintImageView tintImageView = this.$close;
                    ViewGroup.LayoutParams layoutParams2 = tintImageView.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.rightMargin = iDpToPx - DimenUtilsKt.dpToPx(12);
                    tintImageView.setLayoutParams(marginLayoutParams2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecommendUpComponent recommendUpComponent, TextView textView, TintImageView tintImageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recommendUpComponent;
                this.$title = textView;
                this.$close = tintImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$title, this.$close, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.this$0.f97756g;
                    C08911 c08911 = new C08911(this.$title, this.$close, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08911, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final TextView $title;
            int label;
            final RecommendUpComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
                final TextView $title;
                Object L$0;
                int label;
                final RecommendUpComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextView textView, RecommendUpComponent recommendUpComponent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$title = textView;
                    this.this$0 = recommendUpComponent;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title, this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    TextView textView = this.$title;
                    String str = aVar.f97759a;
                    if (!Intrinsics.areEqual(textView.getText(), str)) {
                        textView.setText(str);
                    }
                    b bVar = this.this$0.f97758j;
                    List<e> list = aVar.f97760b;
                    bVar.getClass();
                    ArrayList arrayList = new ArrayList(bVar.f97764c);
                    int size = arrayList.size();
                    int size2 = list.size();
                    bVar.f97764c.clear();
                    bVar.f97764c.addAll(list);
                    DiffUtil.calculateDiff(new com.bilibili.ship.theseus.ugc.intro.uprecommend.b(size2, size, arrayList, list)).dispatchUpdatesTo(bVar);
                    b bVar2 = this.this$0.f97758j;
                    RecommendUpRepository.LoadState loadState = bVar2.f97765d;
                    RecommendUpRepository.LoadState loadState2 = aVar.f97761c;
                    if (loadState != loadState2) {
                        bVar2.f97765d = loadState2;
                        int itemCount = bVar2.getItemCount() - 1;
                        if (itemCount >= 0) {
                            bVar2.notifyItemChanged(itemCount);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RecommendUpComponent recommendUpComponent, TextView textView, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recommendUpComponent;
                this.$title = textView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$title, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RecommendUpComponent recommendUpComponent = this.this$0;
                    StateFlow<a> stateFlow = recommendUpComponent.f97755f;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title, recommendUpComponent, null);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$3.class */
        public static final class C08923 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final TintImageView $close;
            final RecyclerView $recyclerView;
            Object L$0;
            int label;
            final RecommendUpComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$bindToView$3$3$a.class */
            public static final class a extends RecyclerView.OnScrollListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f97766a = true;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public boolean f97767b = true;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f97768c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final RecommendUpComponent f97769d;

                public a(RecommendUpComponent recommendUpComponent) {
                    this.f97769d = recommendUpComponent;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                    if (i7 == 1) {
                        this.f97768c = true;
                    } else if (this.f97768c && i7 == 0) {
                        this.f97768c = false;
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                    RecyclerView.Adapter adapter;
                    final RecommendUpComponent recommendUpComponent = this.f97769d;
                    if (i7 >= 0 && this.f97768c) {
                        int childCount = recyclerView.getChildCount();
                        if (childCount > 0 && this.f97766a && (recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1)) instanceof c)) {
                            this.f97766a = false;
                            recyclerView.post(new Runnable(recommendUpComponent, this) { // from class: com.bilibili.ship.theseus.ugc.intro.uprecommend.e

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final RecommendUpComponent f97823a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final RecommendUpComponent.AnonymousClass3.C08923.a f97824b;

                                {
                                    this.f97823a = recommendUpComponent;
                                    this.f97824b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    RecommendUpComponent recommendUpComponent2 = this.f97823a;
                                    RecommendUpComponent.AnonymousClass3.C08923.a aVar = this.f97824b;
                                    recommendUpComponent2.f97757i.invoke();
                                    aVar.f97766a = true;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    defpackage.a.b("[theseus-ugc-RecommendUpComponent$bindToView$3$3$scrollListener$1-onScrolled] ", "onScrolled, ignore, dy " + i8 + ", dragged " + this.f97768c, "RecommendUpComponent$bindToView$3$3$scrollListener$1-onScrolled");
                    if (this.f97767b) {
                        this.f97767b = false;
                        int childCount2 = recyclerView.getChildCount();
                        if (childCount2 <= 0 || (adapter = recyclerView.getAdapter()) == null) {
                            return;
                        }
                        int iA = com.bilibili.app.authorspace.ui.b.a(recyclerView, childCount2, 1);
                        BLog.i("RecommendUpComponent$bindToView$3$3$scrollListener$1-onScrolled", "[theseus-ugc-RecommendUpComponent$bindToView$3$3$scrollListener$1-onScrolled] " + G.f.a(iA, adapter.getItemCount(), "onScrolled, first check, lastVisiblePosition ", ", itemCount "));
                        if (iA == adapter.getItemCount() - 1) {
                            this.f97766a = false;
                            recyclerView.post(new Runnable(recommendUpComponent, this) { // from class: com.bilibili.ship.theseus.ugc.intro.uprecommend.d

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final RecommendUpComponent f97821a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final RecommendUpComponent.AnonymousClass3.C08923.a f97822b;

                                {
                                    this.f97821a = recommendUpComponent;
                                    this.f97822b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    RecommendUpComponent recommendUpComponent2 = this.f97821a;
                                    RecommendUpComponent.AnonymousClass3.C08923.a aVar = this.f97822b;
                                    recommendUpComponent2.f97757i.invoke();
                                    aVar.f97766a = true;
                                }
                            });
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08923(RecyclerView recyclerView, TintImageView tintImageView, RecommendUpComponent recommendUpComponent, Continuation<? super C08923> continuation) {
                super(2, continuation);
                this.$recyclerView = recyclerView;
                this.$close = tintImageView;
                this.this$0 = recommendUpComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08923(this.$recyclerView, this.$close, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r7 = r0
                    r0 = r4
                    int r0 = r0.label
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L36
                    r0 = r6
                    r1 = 1
                    if (r0 == r1) goto L1c
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L1c:
                    r0 = r4
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$3$a r0 = (com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent.AnonymousClass3.C08923.a) r0
                    r8 = r0
                    r0 = r8
                    r7 = r0
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L32
                    r0 = r8
                    r5 = r0
                    goto L66
                L32:
                    r5 = move-exception
                    goto L80
                L36:
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$3$a r0 = new com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$bindToView$3$3$a
                    r1 = r0
                    r2 = r4
                    com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent r2 = r2.this$0
                    r1.<init>(r2)
                    r5 = r0
                    r0 = r4
                    androidx.recyclerview.widget.RecyclerView r0 = r0.$recyclerView     // Catch: java.lang.Throwable -> L79
                    r1 = r5
                    r0.addOnScrollListener(r1)     // Catch: java.lang.Throwable -> L79
                    r0 = r4
                    r1 = r5
                    r0.L$0 = r1     // Catch: java.lang.Throwable -> L79
                    r0 = r4
                    r1 = 1
                    r0.label = r1     // Catch: java.lang.Throwable -> L79
                    r0 = r4
                    java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L79
                    r8 = r0
                    r0 = r8
                    r1 = r7
                    if (r0 != r1) goto L66
                    r0 = r7
                    return r0
                L66:
                    r0 = r5
                    r7 = r0
                    kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L32
                    r8 = r0
                    r0 = r5
                    r7 = r0
                    r0 = r8
                    r0.<init>()     // Catch: java.lang.Throwable -> L32
                    r0 = r5
                    r7 = r0
                    r0 = r8
                    throw r0     // Catch: java.lang.Throwable -> L32
                L79:
                    r8 = move-exception
                    r0 = r5
                    r7 = r0
                    r0 = r8
                    r5 = r0
                L80:
                    r0 = r4
                    androidx.recyclerview.widget.RecyclerView r0 = r0.$recyclerView
                    r1 = r7
                    r0.removeOnScrollListener(r1)
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintImageView r0 = r0.$close
                    r1 = 0
                    r0.setOnClickListener(r1)
                    r0 = r4
                    androidx.recyclerview.widget.RecyclerView r0 = r0.$recyclerView
                    r1 = 0
                    r0.setAdapter(r1)
                    r0 = r4
                    com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent r0 = r0.this$0
                    android.animation.ValueAnimator r0 = r0.f125634e
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto La8
                    r0 = r7
                    r0.cancel()
                La8:
                    r0 = r5
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent.AnonymousClass3.C08923.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecommendUpComponent recommendUpComponent, TextView textView, TintImageView tintImageView, RecyclerView recyclerView, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = recommendUpComponent;
            this.$title = textView;
            this.$close = tintImageView;
            this.$recyclerView = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$title, this.$close, this.$recyclerView, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, this.$close, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$title, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08923(this.$recyclerView, this.$close, this.this$0, null), 3, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$c.class */
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f97770c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f97771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintProgressBar f97772b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$c$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f97773a;

            static {
                int[] iArr = new int[RecommendUpRepository.LoadState.values().length];
                try {
                    iArr[RecommendUpRepository.LoadState.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[RecommendUpRepository.LoadState.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[RecommendUpRepository.LoadState.NO_MORE.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f97773a = iArr;
            }
        }

        public c(@NotNull View view) {
            super(view);
            this.f97771a = (TextView) view.findViewById(2131308733);
            this.f97772b = (TintProgressBar) view.findViewById(2131303590);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$d.class */
    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f97774f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f97775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f97776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f97777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final VerifyAvatarFrameLayout f97778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FollowButton f97779e;

        public d(@NotNull View view) {
            super(view);
            this.f97775a = (TextView) view.findViewById(2131314892);
            this.f97776b = (TextView) view.findViewById(2131321031);
            this.f97777c = (TextView) view.findViewById(2131310359);
            this.f97778d = view.findViewById(2131316119);
            this.f97779e = (FollowButton) view.findViewById(2131301778);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpComponent$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final RecommendUp f97780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FollowButtonConfig f97781b;

        public e(@NotNull RecommendUp recommendUp, @NotNull FollowButtonConfig followButtonConfig) {
            this.f97780a = recommendUp;
            this.f97781b = followButtonConfig;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f97780a, eVar.f97780a) && Intrinsics.areEqual(this.f97781b, eVar.f97781b);
        }

        public final int hashCode() {
            return this.f97781b.hashCode() + (this.f97780a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "RecommendUpWithConfig(up=" + this.f97780a + ", config=" + this.f97781b + ")";
        }
    }

    public RecommendUpComponent(@NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull c70.e eVar, @NotNull com.bilibili.biligame.ui.minigame.more.g gVar, @NotNull c70.f fVar, @NotNull com.bilibili.lib.coroutineextension.g gVar2, @NotNull g gVar3, @NotNull C2375r1 c2375r1) {
        super(gVar3, c2375r1);
        this.f97755f = stateFlow;
        this.f97756g = stateFlow2;
        this.h = eVar;
        this.f97757i = gVar;
        this.f97758j = new b(fVar, gVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // pv0.c
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.E> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        E eInflate = E.inflate(LayoutInflater.from(context), viewGroup, false);
        RecyclerView recyclerView = eInflate.f25810c;
        f fVar = new f(DimenUtilsKt.dpToPx(((Number) this.f97756g.getValue()).intValue()), recyclerView.getContext(), DimenUtilsKt.dpToPx(8));
        fVar.setDrawable(new ColorDrawable(0));
        recyclerView.addItemDecoration(fVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        n nVar = new n(eInflate);
        b(nVar);
        return nVar;
    }
}
