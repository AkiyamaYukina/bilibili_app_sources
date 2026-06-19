package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.compose.foundation.gestures.o0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.paging.Y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7.class */
final class PlaylistUIComponent$bind$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BottomSheetBehavior<View> $behavior;
    final Pu0.e $binding;
    final Context $context;
    final Pu0.a $header;
    final ConstraintLayout $headerView;
    final View.OnLayoutChangeListener $layoutChangeListener;
    final View $maskView;
    final PlaylistRecyclerView $recycler;
    final CoordinatorLayout $root;
    final Pu0.l $titleLayout;
    private Object L$0;
    int label;
    final D this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlaylistRecyclerView $recycler;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$1$1.class */
        public static final class C08031 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final PlaylistRecyclerView $recycler;
            Object L$0;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08031(PlaylistRecyclerView playlistRecyclerView, D d7, Continuation<? super C08031> continuation) {
                super(2, continuation);
                this.$recycler = playlistRecyclerView;
                this.this$0 = d7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(D d7, int i7) {
                d7.f95939o.f96049c = i7;
                GridLayoutManager gridLayoutManager = d7.f95927b;
                GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                if (gridLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                    gridLayoutManager2 = null;
                }
                gridLayoutManager2.setSpanCount(i7);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08031 c08031 = new C08031(this.$recycler, this.this$0, continuation);
                c08031.L$0 = obj;
                return c08031;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                int i7 = (com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass) || com.bilibili.ship.theseus.united.page.screensize.b.b(windowSizeClass)) ? 3 : 2;
                RecyclerView.ItemAnimator itemAnimator = this.$recycler.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.endAnimations();
                }
                this.$recycler.stopScroll();
                if (this.$recycler.isComputingLayout()) {
                    PlaylistRecyclerView playlistRecyclerView = this.$recycler;
                    final D d7 = this.this$0;
                    final int i8 = i7;
                    Boxing.boxBoolean(playlistRecyclerView.post(new Runnable(d7, i8) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.G

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final D f95993a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f95994b;

                        {
                            this.f95993a = d7;
                            this.f95994b = i8;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            PlaylistUIComponent$bind$7.AnonymousClass1.C08031.invokeSuspend$lambda$0(this.f95993a, this.f95994b);
                        }
                    }));
                } else {
                    D d8 = this.this$0;
                    d8.f95939o.f96049c = i7;
                    GridLayoutManager gridLayoutManager = d8.f95927b;
                    GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                    if (gridLayoutManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                        gridLayoutManager2 = null;
                    }
                    gridLayoutManager2.setSpanCount(i7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(D d7, PlaylistRecyclerView playlistRecyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$recycler = playlistRecyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$recycler, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                D d7 = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = d7.f95926a.f95962f;
                C08031 c08031 = new C08031(this.$recycler, d7, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08031, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.l $titleLayout;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$10$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$10$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.f.f95950a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Pu0.l lVar, D d7, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.$titleLayout = lVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.$titleLayout, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$titleLayout.f19379f);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BottomSheetBehavior<View> $behavior;
        final View $maskView;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$11$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$11$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<E.b, Continuation<? super Unit>, Object> {
            final BottomSheetBehavior<View> $behavior;
            final View $maskView;
            Object L$0;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, View view, BottomSheetBehavior<View> bottomSheetBehavior, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
                this.$maskView = view;
                this.$behavior = bottomSheetBehavior;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$maskView, this.$behavior, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(E.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                E.b bVar = (E.b) this.L$0;
                if (Intrinsics.areEqual(bVar, E.b.a.f94960a)) {
                    D d7 = this.this$0;
                    View view = this.$maskView;
                    BottomSheetBehavior<View> bottomSheetBehavior = this.$behavior;
                    int i7 = D.f95925p;
                    d7.getClass();
                    view.setVisibility(0);
                    bottomSheetBehavior.setState(3);
                } else {
                    if (!Intrinsics.areEqual(bVar, E.b.C0762b.f94961a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    D d8 = this.this$0;
                    View view2 = this.$maskView;
                    BottomSheetBehavior<View> bottomSheetBehavior2 = this.$behavior;
                    int i8 = D.f95925p;
                    d8.getClass();
                    view2.setAlpha(0.0f);
                    view2.setVisibility(8);
                    bottomSheetBehavior2.setState(5);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(D d7, View view, BottomSheetBehavior<View> bottomSheetBehavior, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$maskView = view;
            this.$behavior = bottomSheetBehavior;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, this.$maskView, this.$behavior, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                D d7 = this.this$0;
                StateFlow<E.b> stateFlow = d7.f95926a.f95960d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(d7, this.$maskView, this.$behavior, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final Pu0.a $header;
        final Pu0.l $titleLayout;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$12$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$12$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<D.g.a, Continuation<? super Unit>, Object> {
            final Context $context;
            final Pu0.a $header;
            final Pu0.l $titleLayout;
            Object L$0;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Pu0.l lVar, Context context, Pu0.a aVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
                this.$titleLayout = lVar;
                this.$context = context;
                this.$header = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$titleLayout, this.$context, this.$header, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(D.g.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                D.g.a aVar = (D.g.a) this.L$0;
                D d7 = this.this$0;
                Pu0.l lVar = this.$titleLayout;
                Context context = this.$context;
                int i7 = D.f95925p;
                d7.getClass();
                lVar.f19381i.setText(aVar.f95965a);
                String str = aVar.f95966b;
                boolean z6 = str == null || str.length() == 0;
                TintTextView tintTextView = lVar.f19382j;
                if (z6) {
                    tintTextView.setVisibility(8);
                } else {
                    tintTextView.setVisibility(0);
                    tintTextView.setText(str);
                }
                int i8 = aVar.f95982s ? 0 : 8;
                TintTextView tintTextView2 = lVar.f19383k;
                tintTextView2.setVisibility(i8);
                Resources resources = context.getResources();
                int i9 = aVar.f95967c;
                tintTextView2.setText(resources.getQuantityString(2131689808, i9, Integer.valueOf(i9)));
                D.g.c cVar = aVar.f95976m;
                TintTextView tintTextView3 = lVar.f19381i;
                String str2 = cVar.f95986a;
                boolean z7 = aVar.f95977n;
                boolean z8 = aVar.f95983t;
                if (z8) {
                    lVar.f19379f.setVisibility(8);
                    tintTextView2.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = tintTextView3.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.weight = 1.0f;
                    tintTextView3.setLayoutParams(layoutParams2);
                    tintTextView3.setMaxWidth(Integer.MAX_VALUE);
                    Space space = lVar.h;
                    ViewGroup.LayoutParams layoutParams3 = space.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.weight = 0.0f;
                    space.setLayoutParams(layoutParams4);
                } else {
                    lVar.f19379f.setVisibility(!aVar.f95981r ? 0 : 8);
                    lVar.f19379f.setEnabled(z7);
                    lVar.f19378e.setText(str2);
                    lVar.f19380g.setImageDrawable(cVar.f95987b);
                    tintTextView2.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams5 = tintTextView3.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    layoutParams6.width = -2;
                    layoutParams6.weight = 0.0f;
                    tintTextView3.setLayoutParams(layoutParams6);
                    tintTextView3.setMaxWidth(DimenUtilsKt.dpToPx(!z6 ? 100.0f : 170.0f));
                    Space space2 = lVar.h;
                    ViewGroup.LayoutParams layoutParams7 = space2.getLayoutParams();
                    if (layoutParams7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.weight = 1.0f;
                    space2.setLayoutParams(layoutParams8);
                }
                lVar.f19375b.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context, R$color.Graph_bg_regular_float), 0.0f, 12, 0));
                D d8 = this.this$0;
                Pu0.a aVar2 = this.$header;
                Context context2 = this.$context;
                d8.getClass();
                if (z8) {
                    aVar2.h.setVisibility(0);
                    aVar2.f19302m.setText(context2.getResources().getQuantityString(2131689806, i9, Integer.valueOf(i9)));
                    aVar2.f19292b.setText(aVar.f95968d);
                    aVar2.f19294d.setVisibility(!aVar.f95978o ? 4 : 0);
                    aVar2.f19294d.setImageDrawable(aVar.f95970f ? IconFont.getIconDrawable("hand-thumbsup-fill@500", ContextCompat.getColor(context2, R$color.Pi5)) : IconFont.getIconDrawable("hand-thumbsup-line@500", ContextCompat.getColor(context2, R$color.Text1)));
                    aVar2.f19294d.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context2, R$color.Graph_bg_regular_float), 0.0f, 12, 0));
                    aVar2.f19300k.setVisibility(aVar.f95979p ? 0 : 8);
                    if (aVar.h) {
                        aVar2.f19299j.setTextColor(ContextCompat.getColor(context2, R$color.Text3));
                        aVar2.f19299j.setText(aVar.f95974k);
                        aVar2.f19301l.setImageDrawable(IconFont.getIconDrawable("star-favorite-fill@500", ContextCompat.getColor(context2, R$color.Text3)));
                        aVar2.f19300k.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context2, R$color.Graph_bg_thick), 0.0f, 12, 0));
                    } else {
                        aVar2.f19299j.setTextColor(ContextCompat.getColor(context2, R$color.Text_white));
                        aVar2.f19299j.setText(aVar.f95975l);
                        aVar2.f19301l.setImageDrawable(IconFont.getIconDrawable("star-favorite-line@500", ContextCompat.getColor(context2, R$color.Text_white)));
                        aVar2.f19300k.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context2, R$color.Pi5), 0.0f, 12, 0));
                    }
                    aVar2.f19298i.setVisibility(aVar.f95980q ? 0 : 8);
                    aVar2.f19298i.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context2, R$color.Graph_bg_regular_float), 0.0f, 12, 0));
                    aVar2.f19295e.setEnabled(z7);
                    aVar2.f19296f.setText(str2);
                    aVar2.f19297g.setImageDrawable(cVar.f95987b);
                } else {
                    aVar2.h.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(D d7, Pu0.l lVar, Context context, Pu0.a aVar, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$titleLayout = lVar;
            this.$context = context;
            this.$header = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, this.$titleLayout, this.$context, this.$header, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                D d7 = this.this$0;
                Flow<D.g.a> flow = d7.f95926a.f95957a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(d7, this.$titleLayout, this.$context, this.$header, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$13, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$13.class */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$13$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$13$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends D.g.b>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<D.g.b> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    C6260i c6260i = this.this$0.f95939o;
                    this.label = 1;
                    if (c6260i.N(list, this) == coroutine_suspended) {
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
        public AnonymousClass13(D d7, Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass13(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                D d7 = this.this$0;
                Flow<List<D.g.b>> flow = d7.f95926a.f95958b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(d7, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$14, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$14.class */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.e $binding;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$14$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$14$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlaylistRepository.b, Continuation<? super Unit>, Object> {
            final Pu0.e $binding;
            Object L$0;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Pu0.e eVar, D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = eVar;
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlaylistRepository.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaylistRepository.b bVar = (PlaylistRepository.b) this.L$0;
                this.$binding.f19321g.f96006a = bVar;
                this.this$0.f95939o.f96051e.setValue(bVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(D d7, Pu0.e eVar, Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$binding = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass14(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                D d7 = this.this$0;
                StateFlow<PlaylistRepository.b> stateFlow = d7.f95926a.f95959c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, d7, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$15, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$15.class */
    public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $headerView;
        final PlaylistRecyclerView $recycler;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$15$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$15$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f96012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlaylistRecyclerView f96013b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ConstraintLayout f96014c;

            public a(D d7, PlaylistRecyclerView playlistRecyclerView, ConstraintLayout constraintLayout) {
                this.f96012a = d7;
                this.f96013b = playlistRecyclerView;
                this.f96014c = constraintLayout;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int i7 = D.f95925p;
                D d7 = this.f96012a;
                d7.getClass();
                this.f96013b.post(new com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.u(1, d7, this.f96014c));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(D d7, PlaylistRecyclerView playlistRecyclerView, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass15> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$recycler = playlistRecyclerView;
            this.$headerView = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass15(this.this$0, this.$recycler, this.$headerView, continuation);
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
                D d7 = this.this$0;
                SharedFlow<Unit> sharedFlow = d7.f95926a.f95961e;
                a aVar = new a(d7, this.$recycler, this.$headerView);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$16, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$16.class */
    public static final class AnonymousClass16 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CoordinatorLayout $root;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(CoordinatorLayout coordinatorLayout, Continuation<? super AnonymousClass16> continuation) {
            super(2, continuation);
            this.$root = coordinatorLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Ref.ObjectRef objectRef, CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            Integer num;
            Object obj = objectRef.element;
            if (obj != null && ((num = (Integer) obj) == null || i10 != num.intValue())) {
                coordinatorLayout.requestLayout();
            }
            objectRef.element = Integer.valueOf(i10);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(this.$root, continuation);
            anonymousClass16.L$0 = obj;
            return anonymousClass16;
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
            ViewParent parent = this.$root.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final CoordinatorLayout coordinatorLayout = this.$root;
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(objectRef, coordinatorLayout) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.H

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f95995a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CoordinatorLayout f95996b;

                {
                    this.f95995a = objectRef;
                    this.f95996b = coordinatorLayout;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    PlaylistUIComponent$bind$7.AnonymousClass16.invokeSuspend$lambda$0(this.f95995a, this.f95996b, view, i7, i8, i9, i10, i11, i12, i13, i14);
                }
            };
            if (viewGroup != null) {
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistUIComponent$bind$7$16$invokeSuspend$$inlined$awaitCancel$1(null, viewGroup, onLayoutChangeListener), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$17, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$17.class */
    public static final class AnonymousClass17 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.l $titleLayout;
        int label;
        final D this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(D d7, Pu0.l lVar, Continuation<? super AnonymousClass17> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$titleLayout = lVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass17(this.this$0, this.$titleLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<D.f> mutableSharedFlow = this.this$0.f95937m;
                D.f.a aVar = new D.f.a(this.$titleLayout.f19377d);
                this.label = 1;
                if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.e $binding;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final LinearLayout $container;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LinearLayout linearLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$container = linearLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$container, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 12);
                LinearLayout linearLayout = this.$container;
                linearLayout.setPadding(iDpToPx, linearLayout.getPaddingTop(), iDpToPx, this.$container.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Pu0.e eVar, D d7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = eVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                LinearLayout linearLayout = this.$binding.f19320f;
                StateFlow<Integer> stateFlow = this.this$0.f95926a.f95963g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(linearLayout, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BottomSheetBehavior<View> $behavior;
        final View $maskView;
        Object L$0;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$3$a.class */
        public static final class a extends BottomSheetBehavior.BottomSheetCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f96015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.BooleanRef f96016b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final View f96017c;

            public a(D d7, Ref.BooleanRef booleanRef, View view) {
                this.f96015a = d7;
                this.f96016b = booleanRef;
                this.f96017c = view;
            }

            public final void onSlide(View view, float f7) {
                this.f96017c.setAlpha((f7 + 1) / 2);
            }

            public final void onStateChanged(View view, int i7) {
                D d7 = this.f96015a;
                Ref.BooleanRef booleanRef = this.f96016b;
                if (i7 == 5) {
                    d7.f95935k.tryEmit(new D.d.a(E.b.C0762b.f94961a, booleanRef.element));
                    booleanRef.element = false;
                }
                if (i7 == 3) {
                    d7.f95935k.tryEmit(new D.d.a(E.b.a.f94960a, booleanRef.element));
                    booleanRef.element = false;
                }
                if (i7 == 1) {
                    booleanRef.element = true;
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$3$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$3$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BottomSheetBehavior f96018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f96019b;

            public b(BottomSheetBehavior bottomSheetBehavior, a aVar) {
                this.f96018a = bottomSheetBehavior;
                this.f96019b = aVar;
            }

            public final void invoke() {
                this.f96018a.removeBottomSheetCallback(this.f96019b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BottomSheetBehavior<View> bottomSheetBehavior, D d7, View view, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$behavior = bottomSheetBehavior;
            this.this$0 = d7;
            this.$maskView = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$behavior, this.this$0, this.$maskView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j bVar;
            com.bilibili.lib.coroutineextension.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.BooleanRef booleanRefA = Y.a(obj);
                this.$behavior.setSkipCollapsed(true);
                BottomSheetBehavior<View> bottomSheetBehavior = this.$behavior;
                a aVar = new a(this.this$0, booleanRefA, this.$maskView);
                bottomSheetBehavior.addBottomSheetCallback(aVar);
                bVar = new b(bottomSheetBehavior, aVar);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar2;
                } catch (Throwable th2) {
                    bVar = jVar;
                    th = th2;
                    bVar.invoke();
                    throw th;
                }
            }
            com.bilibili.lib.coroutineextension.j jVar3 = bVar;
            jVar = bVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BottomSheetBehavior<View> $behavior;
        final View $maskView;
        final Pu0.l $titleLayout;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final BottomSheetBehavior<View> $behavior;
            final View $maskView;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, View view, BottomSheetBehavior<View> bottomSheetBehavior, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
                this.$maskView = view;
                this.$behavior = bottomSheetBehavior;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$maskView, this.$behavior, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.d.f95948a);
                D d7 = this.this$0;
                View view = this.$maskView;
                BottomSheetBehavior<View> bottomSheetBehavior = this.$behavior;
                d7.getClass();
                view.setAlpha(0.0f);
                view.setVisibility(8);
                bottomSheetBehavior.setState(5);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(D d7, Pu0.l lVar, View view, BottomSheetBehavior<View> bottomSheetBehavior, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = d7;
            this.$titleLayout = lVar;
            this.$maskView = view;
            this.$behavior = bottomSheetBehavior;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$titleLayout, this.$maskView, this.$behavior, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f95926a.f95964i) {
                    Flow flowA = UIComponentExtKt.a(this.$titleLayout.f19374a);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$maskView, this.$behavior, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.a $header;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.e.f95949a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Pu0.a aVar, D d7, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$header = aVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$header, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$header.f19294d);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.a $header;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.C0801c.f95947a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Pu0.a aVar, D d7, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$header = aVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$header, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$header.f19300k);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.a $header;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.g.f95951a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Pu0.a aVar, D d7, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$header = aVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$header, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$header.f19298i);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.a $header;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$8$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$8$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95930e.tryEmit(D.c.f.f95950a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Pu0.a aVar, D d7, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.$header = aVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.$header, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$header.f19296f);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.a $header;
        int label;
        final D this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistUIComponent$bind$7$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistUIComponent$bind$7$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastDescClickTime;
            int label;
            final D this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.LongRef longRef, D d7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastDescClickTime = longRef;
                this.this$0 = d7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$lastDescClickTime, this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ref.LongRef longRef = this.$lastDescClickTime;
                if (jCurrentTimeMillis - longRef.element < 500) {
                    return Unit.INSTANCE;
                }
                longRef.element = jCurrentTimeMillis;
                this.this$0.f95930e.tryEmit(D.c.b.f95946a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Pu0.a aVar, D d7, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.$header = aVar;
            this.this$0 = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.$header, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.LongRef longRefB = o0.b(obj);
                Flow flowA = UIComponentExtKt.a(this.$header.f19293c);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(longRefB, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
    public PlaylistUIComponent$bind$7(D d7, PlaylistRecyclerView playlistRecyclerView, Pu0.e eVar, BottomSheetBehavior<View> bottomSheetBehavior, View view, Pu0.l lVar, Pu0.a aVar, Context context, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, View.OnLayoutChangeListener onLayoutChangeListener, Continuation<? super PlaylistUIComponent$bind$7> continuation) {
        super(2, continuation);
        this.this$0 = d7;
        this.$recycler = playlistRecyclerView;
        this.$binding = eVar;
        this.$behavior = bottomSheetBehavior;
        this.$maskView = view;
        this.$titleLayout = lVar;
        this.$header = aVar;
        this.$context = context;
        this.$headerView = constraintLayout;
        this.$root = coordinatorLayout;
        this.$layoutChangeListener = onLayoutChangeListener;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistUIComponent$bind$7 playlistUIComponent$bind$7 = new PlaylistUIComponent$bind$7(this.this$0, this.$recycler, this.$binding, this.$behavior, this.$maskView, this.$titleLayout, this.$header, this.$context, this.$headerView, this.$root, this.$layoutChangeListener, continuation);
        playlistUIComponent$bind$7.L$0 = obj;
        return playlistUIComponent$bind$7;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$recycler, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$behavior, this.this$0, this.$maskView, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$titleLayout, this.$maskView, this.$behavior, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.$header, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.$header, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.$header, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this.$header, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this.$header, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this.$titleLayout, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this.this$0, this.$maskView, this.$behavior, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this.this$0, this.$titleLayout, this.$context, this.$header, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass13(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass14(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass15(this.this$0, this.$recycler, this.$headerView, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass16(this.$root, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass17(this.this$0, this.$titleLayout, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistUIComponent$bind$7$invokeSuspend$$inlined$awaitCancel$1(null, this.$recycler, this.$layoutChangeListener), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
