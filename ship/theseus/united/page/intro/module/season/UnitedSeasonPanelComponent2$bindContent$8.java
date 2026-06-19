package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ogv.infra.coroutine.StateFlowTransformKt;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6360w;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8.class */
final class UnitedSeasonPanelComponent2$bindContent$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UnitedSeasonClockInWidget2 $clockIn;
    final AppCompatImageView $close;
    final com.bilibili.ship.theseus.united.page.videolist.b $color;
    final Context $context;
    final TextView $desc;
    final TextView $descArrow;
    final ConstraintLayout $headLayout;
    final TextView $info;
    final RecyclerView $selectList;
    final TextView $sort;
    final AppCompatImageView $sortImage;
    final LinearLayout $sortLayout;
    final TextView $subscribe;
    final LinearLayout $subscribeContainer;
    final ImageView $subscribeIcon;
    final RecyclerView $tabList;
    final TextView $tabTitle;
    final TextView $title;
    private Object L$0;
    int label;
    final C6360w this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedSeasonClockInWidget2 $clockIn;
        final AppCompatImageView $close;
        final TextView $info;
        final RecyclerView $selectList;
        final LinearLayout $sortLayout;
        final LinearLayout $subscribeContainer;
        final TextView $tabTitle;
        final TextView $title;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$1$1.class */
        public static final class C10511 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final UnitedSeasonClockInWidget2 $clockIn;
            final AppCompatImageView $close;
            final TextView $info;
            final RecyclerView $selectList;
            final LinearLayout $sortLayout;
            final LinearLayout $subscribeContainer;
            final TextView $tabTitle;
            final TextView $title;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10511(TextView textView, LinearLayout linearLayout, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, TextView textView2, LinearLayout linearLayout2, TextView textView3, AppCompatImageView appCompatImageView, RecyclerView recyclerView, Continuation<? super C10511> continuation) {
                super(2, continuation);
                this.$info = textView;
                this.$subscribeContainer = linearLayout;
                this.$clockIn = unitedSeasonClockInWidget2;
                this.$tabTitle = textView2;
                this.$sortLayout = linearLayout2;
                this.$title = textView3;
                this.$close = appCompatImageView;
                this.$selectList = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10511 c10511 = new C10511(this.$info, this.$subscribeContainer, this.$clockIn, this.$tabTitle, this.$sortLayout, this.$title, this.$close, this.$selectList, continuation);
                c10511.I$0 = ((Number) obj).intValue();
                return c10511;
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
                TextView textView = this.$info;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iDpToPx;
                textView.setLayoutParams(marginLayoutParams);
                LinearLayout linearLayout = this.$subscribeContainer;
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.rightMargin = iDpToPx;
                linearLayout.setLayoutParams(marginLayoutParams2);
                UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.$clockIn;
                ViewGroup.LayoutParams layoutParams3 = unitedSeasonClockInWidget2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.rightMargin = iDpToPx;
                marginLayoutParams3.leftMargin = iDpToPx;
                unitedSeasonClockInWidget2.setLayoutParams(marginLayoutParams3);
                TextView textView2 = this.$tabTitle;
                ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.leftMargin = iDpToPx;
                textView2.setLayoutParams(marginLayoutParams4);
                LinearLayout linearLayout2 = this.$sortLayout;
                ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams5.rightMargin = iDpToPx;
                linearLayout2.setLayoutParams(marginLayoutParams5);
                TextView textView3 = this.$title;
                ViewGroup.LayoutParams layoutParams6 = textView3.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                marginLayoutParams6.leftMargin = iDpToPx;
                textView3.setLayoutParams(marginLayoutParams6);
                AppCompatImageView appCompatImageView = this.$close;
                ViewGroup.LayoutParams layoutParams7 = appCompatImageView.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                marginLayoutParams7.rightMargin = iDpToPx;
                appCompatImageView.setLayoutParams(marginLayoutParams7);
                int iDpToPx2 = iDpToPx - DimenUtilsKt.dpToPx(12);
                RecyclerView recyclerView = this.$selectList;
                recyclerView.setPadding(iDpToPx2, recyclerView.getPaddingTop(), iDpToPx2, this.$selectList.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6360w c6360w, TextView textView, LinearLayout linearLayout, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, TextView textView2, LinearLayout linearLayout2, TextView textView3, AppCompatImageView appCompatImageView, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$info = textView;
            this.$subscribeContainer = linearLayout;
            this.$clockIn = unitedSeasonClockInWidget2;
            this.$tabTitle = textView2;
            this.$sortLayout = linearLayout2;
            this.$title = textView3;
            this.$close = appCompatImageView;
            this.$selectList = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$info, this.$subscribeContainer, this.$clockIn, this.$tabTitle, this.$sortLayout, this.$title, this.$close, this.$selectList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f101711n;
                C10511 c10511 = new C10511(this.$info, this.$subscribeContainer, this.$clockIn, this.$tabTitle, this.$sortLayout, this.$title, this.$close, this.$selectList, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10511, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.page.videolist.b $color;
        final ConstraintLayout $headLayout;
        final RecyclerView $selectList;
        final RecyclerView $tabList;
        final TextView $tabTitle;
        private Object L$0;
        int label;
        final C6360w this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6360w c6360w, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, com.bilibili.ship.theseus.united.page.videolist.b bVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$tabTitle = textView;
            this.$tabList = recyclerView;
            this.$selectList = recyclerView2;
            this.$color = bVar;
            this.$headLayout = constraintLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(C6360w c6360w, WindowSizeClass windowSizeClass) {
            return c6360w.f101710m.g() || c6360w.f101710m.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(C6360w c6360w, final RecyclerView recyclerView, final ConstraintLayout constraintLayout, final int i7) {
            int i8 = C6360w.f101708A;
            c6360w.getClass();
            recyclerView.stopScroll();
            defpackage.a.b("[theseus-united-UnitedSeasonPanelComponent2-scrollToCurrent] ", "Need to scroll to position: " + i7, "UnitedSeasonPanelComponent2-scrollToCurrent");
            if (c6360w.f101723z) {
                float translationY = i7 == 0 ? constraintLayout.getTranslationY() : DimenUtilsKt.dpToPx(40.0f) + constraintLayout.getTranslationY();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i7, MathKt.roundToInt(translationY));
                }
            } else {
                c6360w.f101723z = true;
                recyclerView.post(new Runnable(i7, constraintLayout, recyclerView) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f101705a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ConstraintLayout f101706b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView f101707c;

                    {
                        this.f101705a = i7;
                        this.f101706b = constraintLayout;
                        this.f101707c = recyclerView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9 = this.f101705a;
                        ConstraintLayout constraintLayout2 = this.f101706b;
                        RecyclerView recyclerView2 = this.f101707c;
                        float translationY2 = i9 == 0 ? constraintLayout2.getTranslationY() : constraintLayout2.getTranslationY() + DimenUtilsKt.dpToPx(40.0f);
                        RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                        if (linearLayoutManager2 != null) {
                            linearLayoutManager2.scrollToPositionWithOffset(i9, MathKt.roundToInt(translationY2));
                        }
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$2(ConstraintLayout constraintLayout) {
            return constraintLayout.getHeight() - Math.abs(MathKt.roundToInt(constraintLayout.getTranslationY()));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$tabTitle, this.$tabList, this.$selectList, this.$color, this.$headLayout, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C6360w.b bVar = this.this$0.f101709l;
                boolean z6 = bVar.f101731f;
                int i8 = ((List) bVar.f101733i.getValue()).size() > 1 ? 122 : 20;
                final C6360w c6360w = this.this$0;
                C6360w.b bVar2 = c6360w.f101709l;
                MutableStateFlow mutableStateFlow = bVar2.f101733i;
                StateFlow stateFlowA = StateFlowTransformKt.a(c6360w.f101710m.f102939c, coroutineScope, new Function1(c6360w) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6360w f101739a;

                    {
                        this.f101739a = c6360w;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass2.invokeSuspend$lambda$0(this.f101739a, (WindowSizeClass) obj2));
                    }
                });
                final C6360w c6360w2 = this.this$0;
                I i9 = c6360w2.f101718u;
                AbstractC6342d abstractC6342d = c6360w2.f101709l.f101738n;
                TextView textView = this.$tabTitle;
                RecyclerView recyclerView = this.$tabList;
                final RecyclerView recyclerView2 = this.$selectList;
                com.bilibili.ship.theseus.united.page.videolist.b bVar3 = this.$color;
                final ConstraintLayout constraintLayout = this.$headLayout;
                Function1 function1 = new Function1(c6360w2, recyclerView2, constraintLayout) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6360w f101740a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final RecyclerView f101741b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final ConstraintLayout f101742c;

                    {
                        this.f101740a = c6360w2;
                        this.f101741b = recyclerView2;
                        this.f101742c = constraintLayout;
                    }

                    public final Object invoke(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass2.invokeSuspend$lambda$1(this.f101740a, this.f101741b, this.f101742c, iIntValue);
                    }
                };
                Function0 function0 = new Function0(constraintLayout) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ConstraintLayout f101743a;

                    {
                        this.f101743a = constraintLayout;
                    }

                    public final Object invoke() {
                        return Integer.valueOf(UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass2.invokeSuspend$lambda$2(this.f101743a));
                    }
                };
                this.label = 1;
                if (com.bilibili.ship.theseus.united.page.videolist.w.a(textView, recyclerView, recyclerView2, z6, false, i8, mutableStateFlow, bVar2.f101734j, bVar2.f101735k, bVar3, stateFlowA, c6360w2.f101719v, i9, c6360w2.f101720w, function1, function0, abstractC6342d, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final TextView $sort;
        final AppCompatImageView $sortImage;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Context $context;
            final TextView $sort;
            final AppCompatImageView $sortImage;
            boolean Z$0;
            int label;
            final C6360w this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6360w c6360w, AppCompatImageView appCompatImageView, Context context, TextView textView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6360w;
                this.$sortImage = appCompatImageView;
                this.$context = context;
                this.$sort = textView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sortImage, this.$context, this.$sort, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                if (!this.this$0.f101709l.f101730e) {
                    return Unit.INSTANCE;
                }
                if (z6) {
                    this.$sortImage.setImageDrawable(IconFont.getIconDrawable("list_sort_line@500", ContextCompat.getColor(this.$context, R$color.Text3)));
                    this.$sort.setText(this.$context.getString(2131851588));
                } else {
                    this.$sortImage.setImageDrawable(IconFont.getIconDrawable("list_sort_positive_line", ContextCompat.getColor(this.$context, R$color.Text3)));
                    this.$sort.setText(this.$context.getString(2131851587));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C6360w c6360w, AppCompatImageView appCompatImageView, Context context, TextView textView, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$sortImage = appCompatImageView;
            this.$context = context;
            this.$sort = textView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$sortImage, this.$context, this.$sort, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6360w c6360w = this.this$0;
                MutableStateFlow mutableStateFlow = c6360w.f101709l.f101737m;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6360w, this.$sortImage, this.$context, this.$sort, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RecyclerView $tabList;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final RecyclerView $tabList;
            Object L$0;
            int label;
            final C6360w this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6360w c6360w, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6360w;
                this.$tabList = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tabList, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                if (com.bilibili.ship.theseus.united.page.screensize.b.a((WindowSizeClass) this.L$0)) {
                    this.this$0.f().setCustomNestedScrollerChild(this.$tabList);
                } else {
                    this.this$0.f().setCustomNestedScrollerChild(null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6360w c6360w, RecyclerView recyclerView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$tabList = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$tabList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6360w c6360w = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = c6360w.f101710m.f102939c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6360w, this.$tabList, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final TextView $subscribe;
        final LinearLayout $subscribeContainer;
        final ImageView $subscribeIcon;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Context $context;
            final TextView $subscribe;
            final LinearLayout $subscribeContainer;
            final ImageView $subscribeIcon;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextView textView, Context context, ImageView imageView, LinearLayout linearLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$subscribe = textView;
                this.$context = context;
                this.$subscribeIcon = imageView;
                this.$subscribeContainer = linearLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscribe, this.$context, this.$subscribeIcon, this.$subscribeContainer, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.$subscribe.setTextColor(ContextCompat.getColor(this.$context, R$color.Text3));
                    this.$subscribe.setText(this.$context.getString(2131845725));
                    this.$subscribeIcon.setImageDrawable(IconFont.getIconDrawable("star-favorite-fill@500", ContextCompat.getColor(this.$context, R$color.Text3)));
                    this.$subscribeContainer.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(this.$context, R$color.Graph_bg_thick), 0.0f, 12, 0));
                } else {
                    this.$subscribe.setTextColor(ContextCompat.getColor(this.$context, R$color.Text_white));
                    this.$subscribe.setText(this.$context.getString(2131846948));
                    this.$subscribeIcon.setImageDrawable(IconFont.getIconDrawable("star-favorite-line@500", ContextCompat.getColor(this.$context, R$color.Text_white)));
                    this.$subscribeContainer.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(this.$context, R$color.Pi5), 0.0f, 12, 0));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6360w c6360w, TextView textView, Context context, ImageView imageView, LinearLayout linearLayout, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$subscribe = textView;
            this.$context = context;
            this.$subscribeIcon = imageView;
            this.$subscribeContainer = linearLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$subscribe, this.$context, this.$subscribeIcon, this.$subscribeContainer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f101709l.f101736l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscribe, this.$context, this.$subscribeIcon, this.$subscribeContainer, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedSeasonClockInWidget2 $clockIn;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UnitedSeasonActivity, Continuation<? super Unit>, Object> {
            final UnitedSeasonClockInWidget2 $clockIn;
            Object L$0;
            int label;
            final C6360w this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, C6360w c6360w, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$clockIn = unitedSeasonClockInWidget2;
                this.this$0 = c6360w;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(C6360w c6360w, UnitedSeasonActivity unitedSeasonActivity) {
                c6360w.f101716s.invoke(unitedSeasonActivity);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clockIn, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(UnitedSeasonActivity unitedSeasonActivity, Continuation<? super Unit> continuation) {
                return create(unitedSeasonActivity, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UnitedSeasonActivity unitedSeasonActivity = (UnitedSeasonActivity) this.L$0;
                if (unitedSeasonActivity != null) {
                    this.$clockIn.setVisibility(0);
                    UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.$clockIn;
                    C6360w.b bVar = this.this$0.f101709l;
                    unitedSeasonClockInWidget2.f101534A = bVar.f101726a;
                    unitedSeasonClockInWidget2.f101535B = bVar.f101727b;
                    unitedSeasonClockInWidget2.f101536C = bVar.f101728c;
                    unitedSeasonClockInWidget2.setVisibility(0);
                    unitedSeasonClockInWidget2.i(unitedSeasonActivity, false);
                    this.$clockIn.setClockStateChangedListener(new A(this.this$0));
                    this.$clockIn.k();
                } else {
                    this.this$0.f101716s.invoke((Object) null);
                    this.$clockIn.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(C6360w c6360w, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = c6360w;
            this.$clockIn = unitedSeasonClockInWidget2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$clockIn, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6360w c6360w = this.this$0;
                MutableStateFlow mutableStateFlow = c6360w.f101709l.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clockIn, c6360w, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedSeasonClockInWidget2 $clockIn;
        final TextView $desc;
        final TextView $descArrow;
        final ConstraintLayout $headLayout;
        final RecyclerView $selectList;
        Object L$0;
        Object L$1;
        int label;
        final C6360w this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$7$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$7$a.class */
        public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f101579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextView f101580b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C6360w f101581c;

            public a(TextView textView, TextView textView2, C6360w c6360w) {
                this.f101579a = textView;
                this.f101580b = textView2;
                this.f101581c = c6360w;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
            /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View$OnClickListener, java.lang.Object] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onGlobalLayout() {
                /*
                    Method dump skipped, instruction units count: 219
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass7.a.onGlobalLayout():void");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$7$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$7$b.class */
        public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConstraintLayout f101582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RecyclerView f101583b;

            public b(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
                this.f101582a = constraintLayout;
                this.f101583b = recyclerView;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f101582a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RecyclerView recyclerView = this.f101583b;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f101582a.getHeight(), this.f101583b.getPaddingRight(), this.f101583b.getPaddingBottom());
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8$7$c */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelComponent2$bindContent$8$7$c.class */
        public static final class c extends RecyclerView.OnScrollListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6360w f101584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ConstraintLayout f101585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final UnitedSeasonClockInWidget2 f101586c;

            public c(C6360w c6360w, ConstraintLayout constraintLayout, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
                this.f101584a = c6360w;
                this.f101585b = constraintLayout;
                this.f101586c = unitedSeasonClockInWidget2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                View childAt;
                super.onScrolled(recyclerView, i7, i8);
                boolean z6 = false;
                ConstraintLayout constraintLayout = this.f101585b;
                C6360w c6360w = this.f101584a;
                if (i8 != 0) {
                    UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.f101586c;
                    UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = unitedSeasonClockInWidget2.f101552n;
                    if ((unitedSeasonClockExpandableLayout2 != null ? unitedSeasonClockExpandableLayout2.f101529g : false) || unitedSeasonClockInWidget2.f101559u) {
                        z6 = true;
                    }
                    if (z6) {
                        return;
                    }
                    int i9 = C6360w.f101708A;
                    c6360w.m(i8, constraintLayout);
                    return;
                }
                int i10 = C6360w.f101708A;
                c6360w.getClass();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (childAt = linearLayoutManager.getChildAt(0)) == null || linearLayoutManager.getChildCount() <= 0) {
                    return;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                int top = childAt.getTop();
                float height = constraintLayout.getHeight() - Math.abs(constraintLayout.getTranslationY());
                if (top <= height || childAdapterPosition != 0) {
                    return;
                }
                c6360w.m(((int) height) - top, constraintLayout);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, C6360w c6360w, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, TextView textView2, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$headLayout = constraintLayout;
            this.$selectList = recyclerView;
            this.$desc = textView;
            this.this$0 = c6360w;
            this.$clockIn = unitedSeasonClockInWidget2;
            this.$descArrow = textView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(RecyclerView recyclerView, ConstraintLayout constraintLayout, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            int i15 = i14 - i12;
            int i16 = i10 - i8;
            if (i15 != i16) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), constraintLayout.getHeight(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = unitedSeasonClockInWidget2.f101552n;
                if ((unitedSeasonClockExpandableLayout2 != null ? unitedSeasonClockExpandableLayout2.f101529g : false) || unitedSeasonClockInWidget2.f101559u) {
                    recyclerView.scrollBy(0, i15 - i16);
                }
            }
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$headLayout, this.$selectList, this.$desc, this.this$0, this.$clockIn, this.$descArrow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            c cVar;
            c cVar2;
            c cVar3;
            b bVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ConstraintLayout constraintLayout = this.$headLayout;
                bVar = new b(constraintLayout, this.$selectList);
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
                c cVar4 = new c(this.this$0, this.$headLayout, this.$clockIn);
                final RecyclerView recyclerView = this.$selectList;
                final ConstraintLayout constraintLayout2 = this.$headLayout;
                final UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.$clockIn;
                constraintLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(recyclerView, constraintLayout2, unitedSeasonClockInWidget2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.B

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final RecyclerView f101442a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ConstraintLayout f101443b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final UnitedSeasonClockInWidget2 f101444c;

                    {
                        this.f101442a = recyclerView;
                        this.f101443b = constraintLayout2;
                        this.f101444c = unitedSeasonClockInWidget2;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                        UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass7.invokeSuspend$lambda$0(this.f101442a, this.f101443b, this.f101444c, view, i8, i9, i10, i11, i12, i13, i14, i15);
                    }
                });
                this.$selectList.addOnScrollListener(cVar4);
                this.$desc.getViewTreeObserver().addOnGlobalLayoutListener(new a(this.$desc, this.$descArrow, this.this$0));
                try {
                    this.L$0 = bVar;
                    this.L$1 = cVar4;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar2 = cVar4;
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar4;
                    this.$headLayout.getViewTreeObserver().removeOnGlobalLayoutListener(bVar);
                    this.$selectList.removeOnScrollListener(cVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = (c) this.L$1;
                b bVar3 = (b) this.L$0;
                cVar3 = cVar2;
                bVar2 = bVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = bVar3;
                } catch (Throwable th2) {
                    cVar = cVar3;
                    bVar = bVar2;
                    th = th2;
                    this.$headLayout.getViewTreeObserver().removeOnGlobalLayoutListener(bVar);
                    this.$selectList.removeOnScrollListener(cVar);
                    throw th;
                }
            }
            cVar3 = cVar2;
            bVar2 = bVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelComponent2$bindContent$8(C6360w c6360w, TextView textView, LinearLayout linearLayout, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, TextView textView2, LinearLayout linearLayout2, TextView textView3, AppCompatImageView appCompatImageView, RecyclerView recyclerView, RecyclerView recyclerView2, com.bilibili.ship.theseus.united.page.videolist.b bVar, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, Context context, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, TextView textView7, Continuation<? super UnitedSeasonPanelComponent2$bindContent$8> continuation) {
        super(2, continuation);
        this.this$0 = c6360w;
        this.$info = textView;
        this.$subscribeContainer = linearLayout;
        this.$clockIn = unitedSeasonClockInWidget2;
        this.$tabTitle = textView2;
        this.$sortLayout = linearLayout2;
        this.$title = textView3;
        this.$close = appCompatImageView;
        this.$selectList = recyclerView;
        this.$tabList = recyclerView2;
        this.$color = bVar;
        this.$headLayout = constraintLayout;
        this.$sortImage = appCompatImageView2;
        this.$context = context;
        this.$sort = textView4;
        this.$subscribe = textView5;
        this.$subscribeIcon = imageView;
        this.$desc = textView6;
        this.$descArrow = textView7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedSeasonPanelComponent2$bindContent$8 unitedSeasonPanelComponent2$bindContent$8 = new UnitedSeasonPanelComponent2$bindContent$8(this.this$0, this.$info, this.$subscribeContainer, this.$clockIn, this.$tabTitle, this.$sortLayout, this.$title, this.$close, this.$selectList, this.$tabList, this.$color, this.$headLayout, this.$sortImage, this.$context, this.$sort, this.$subscribe, this.$subscribeIcon, this.$desc, this.$descArrow, continuation);
        unitedSeasonPanelComponent2$bindContent$8.L$0 = obj;
        return unitedSeasonPanelComponent2$bindContent$8;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$info, this.$subscribeContainer, this.$clockIn, this.$tabTitle, this.$sortLayout, this.$title, this.$close, this.$selectList, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$tabTitle, this.$tabList, this.$selectList, this.$color, this.$headLayout, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$sortImage, this.$context, this.$sort, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$tabList, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$subscribe, this.$context, this.$subscribeIcon, this.$subscribeContainer, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$clockIn, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.$headLayout, this.$selectList, this.$desc, this.this$0, this.$clockIn, this.$descArrow, null), 3, (Object) null);
    }
}
