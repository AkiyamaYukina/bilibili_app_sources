package com.bilibili.ship.theseus.united.page.videolist;

import Yt0.O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.text.C3591b1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.infra.trace.LiveReporter;
import com.bilibili.bililive.room.ui.common.user.card.LiveFeedRoomAnchorCardFragment;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.intro.module.season.AbstractC6342d;
import com.bilibili.ship.theseus.united.page.intro.module.season.W;
import com.bilibili.ship.theseus.united.page.intro.module.season.X;
import com.bilibili.ship.theseus.united.page.videolist.VideoSelectorFunctionWidget2;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2.class */
@StabilityInferred(parameters = 0)
public final class VideoSelectorFunctionWidget2 extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f103565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f103566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f103567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f103568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f103569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f103570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f103571g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f103574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f103575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f103576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f103577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final W f103578g;

        @NotNull
        public final X h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final O f103579i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final C3591b1 f103580j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Function1<Continuation<? super Unit>, Object> f103581k;

        public a(boolean z6, boolean z7, @NotNull MutableStateFlow mutableStateFlow, @NotNull MutableStateFlow mutableStateFlow2, @NotNull MutableStateFlow mutableStateFlow3, @NotNull MutableStateFlow mutableStateFlow4, @NotNull W w7, @NotNull X x6, @NotNull O o7, @NotNull C3591b1 c3591b1, @NotNull Function1 function1) {
            this.f103572a = z6;
            this.f103573b = z7;
            this.f103574c = mutableStateFlow;
            this.f103575d = mutableStateFlow2;
            this.f103576e = mutableStateFlow3;
            this.f103577f = mutableStateFlow4;
            this.f103578g = w7;
            this.h = x6;
            this.f103579i = o7;
            this.f103580j = c3591b1;
            this.f103581k = function1;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectorFunctionWidget2$onWidgetShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2$onWidgetShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final b $color;
        final AbsFunctionWidget.Configuration $configuration;
        int label;
        final VideoSelectorFunctionWidget2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoSelectorFunctionWidget2 videoSelectorFunctionWidget2, AbsFunctionWidget.Configuration configuration, b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = videoSelectorFunctionWidget2;
            this.$configuration = configuration;
            this.$color = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(VideoSelectorFunctionWidget2 videoSelectorFunctionWidget2, int i7) {
            RecyclerView recyclerView = videoSelectorFunctionWidget2.f103568d;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectList");
                recyclerView2 = null;
            }
            recyclerView2.stopScroll();
            RecyclerView recyclerView3 = videoSelectorFunctionWidget2.f103568d;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectList");
                recyclerView3 = null;
            }
            ((LinearLayoutManager) recyclerView3.getLayoutManager()).scrollToPositionWithOffset(i7, DimenUtilsKt.dpToPx(50.0f));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1() {
            return 0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$configuration, this.$color, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TextView textView = this.this$0.f103566b;
                RecyclerView recyclerView = null;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabTitle");
                    textView2 = null;
                }
                RecyclerView recyclerView2 = this.this$0.f103567c;
                RecyclerView recyclerView3 = recyclerView2;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabList");
                    recyclerView3 = null;
                }
                RecyclerView recyclerView4 = this.this$0.f103568d;
                if (recyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectList");
                } else {
                    recyclerView = recyclerView4;
                }
                a aVar = (a) this.$configuration;
                boolean z6 = aVar.f103572a;
                int i8 = ((List) aVar.f103574c.getValue()).size() > 1 ? 82 : 20;
                a aVar2 = (a) this.$configuration;
                MutableStateFlow mutableStateFlow = aVar2.f103574c;
                MutableStateFlow mutableStateFlow2 = aVar2.f103575d;
                MutableStateFlow mutableStateFlow3 = aVar2.f103576e;
                b bVar = this.$color;
                MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
                a aVar3 = (a) this.$configuration;
                O o7 = aVar3.f103579i;
                X x6 = aVar3.h;
                W w7 = aVar3.f103578g;
                final VideoSelectorFunctionWidget2 videoSelectorFunctionWidget2 = this.this$0;
                Function1 function1 = new Function1(videoSelectorFunctionWidget2) { // from class: com.bilibili.ship.theseus.united.page.videolist.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final VideoSelectorFunctionWidget2 f103666a;

                    {
                        this.f103666a = videoSelectorFunctionWidget2;
                    }

                    public final Object invoke(Object obj2) {
                        return VideoSelectorFunctionWidget2.AnonymousClass1.invokeSuspend$lambda$0(this.f103666a, ((Integer) obj2).intValue());
                    }
                };
                ?? obj2 = new Object();
                this.label = 1;
                if (w.a(textView2, recyclerView3, recyclerView, z6, true, i8, mutableStateFlow, mutableStateFlow2, mutableStateFlow3, bVar, MutableStateFlow, o7, x6, w7, function1, obj2, AbstractC6342d.b.f101652a, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectorFunctionWidget2$onWidgetShow$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2$onWidgetShow$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AbsFunctionWidget.Configuration $configuration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbsFunctionWidget.Configuration configuration, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$configuration = configuration;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$configuration, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = ((a) this.$configuration).f103581k;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectorFunctionWidget2$onWidgetShow$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2$onWidgetShow$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AbsFunctionWidget.Configuration $configuration;
        int label;
        final VideoSelectorFunctionWidget2 this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectorFunctionWidget2$onWidgetShow$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectorFunctionWidget2$onWidgetShow$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final VideoSelectorFunctionWidget2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VideoSelectorFunctionWidget2 videoSelectorFunctionWidget2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = videoSelectorFunctionWidget2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                    AppCompatImageView appCompatImageView = this.this$0.f103569e;
                    AppCompatImageView appCompatImageView2 = appCompatImageView;
                    if (appCompatImageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sortImage");
                        appCompatImageView2 = null;
                    }
                    appCompatImageView2.setImageDrawable(IconFont.getIconDrawable("list_sort_line@500", ContextCompat.getColor(this.this$0.f103565a, R$color.Text3)));
                    TextView textView = this.this$0.f103570f;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sort");
                        textView = null;
                    }
                    textView.setText(this.this$0.f103565a.getString(2131851588));
                } else {
                    AppCompatImageView appCompatImageView3 = this.this$0.f103569e;
                    AppCompatImageView appCompatImageView4 = appCompatImageView3;
                    if (appCompatImageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sortImage");
                        appCompatImageView4 = null;
                    }
                    appCompatImageView4.setImageDrawable(IconFont.getIconDrawable("list_sort_positive_line", ContextCompat.getColor(this.this$0.f103565a, R$color.Text3)));
                    TextView textView2 = this.this$0.f103570f;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sort");
                        textView2 = null;
                    }
                    textView2.setText(this.this$0.f103565a.getString(2131851587));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbsFunctionWidget.Configuration configuration, VideoSelectorFunctionWidget2 videoSelectorFunctionWidget2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$configuration = configuration;
            this.this$0 = videoSelectorFunctionWidget2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$configuration, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = ((a) this.$configuration).f103577f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    public VideoSelectorFunctionWidget2(@NotNull Context context) {
        super(context);
        this.f103565a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View$OnClickListener, java.lang.Object] */
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
    @NotNull
    public final View createContentView(@NotNull Context context) {
        xk.b bVarInflate = xk.b.inflate(LayoutInflater.from(context));
        this.f103566b = bVarInflate.g;
        this.f103567c = bVarInflate.f;
        this.f103568d = bVarInflate.b;
        this.f103569e = bVarInflate.d;
        this.f103570f = bVarInflate.c;
        this.f103571g = bVarInflate.e;
        ?? obj = new Object();
        ConstraintLayout constraintLayout = bVarInflate.a;
        constraintLayout.setOnClickListener(obj);
        return constraintLayout;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return "VideoSelectorFunctionWidget2";
    }

    public final void onRelease() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        View view = this.f103571g;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortLayout");
            view2 = null;
        }
        view2.setOnClickListener(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWidgetShow(@Nullable final AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        if (configuration instanceof a) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, configuration, new b(ContextCompat.getColor(this.f103565a, R$color.Text_white), ContextCompat.getColor(this.f103565a, R$color.Pi5_u), ContextCompat.getColor(this.f103565a, R$color.Ga5_u), ContextCompat.getColor(this.f103565a, R$color.Ga3_u), ContextCompat.getColor(this.f103565a, R$color.Pi5_u), ContextCompat.getColor(this.f103565a, 2131104486), com.bilibili.playerbizcommonv2.utils.p.c(this.f103565a, R$color.Ga2_u, 0.15f)), null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(configuration, null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(configuration, this, null), 3, (Object) null);
            View view = this.f103571g;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortLayout");
                view2 = null;
            }
            view2.setVisibility(((a) configuration).f103573b ? 0 : 8);
            View view3 = this.f103571g;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortLayout");
                view3 = null;
            }
            final int i7 = 0;
            view3.setOnClickListener(new View.OnClickListener(configuration, i7) { // from class: com.bilibili.ship.theseus.united.page.videolist.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f103664a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f103665b;

                {
                    this.f103664a = i7;
                    this.f103665b = configuration;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    switch (this.f103664a) {
                        case 0:
                            ((VideoSelectorFunctionWidget2.a) ((AbsFunctionWidget.Configuration) this.f103665b)).f103580j.invoke();
                            break;
                        default:
                            LiveFeedRoomAnchorCardFragment liveFeedRoomAnchorCardFragment = (LiveFeedRoomAnchorCardFragment) this.f103665b;
                            LiveFeedRoomAnchorCardFragment.a aVar = liveFeedRoomAnchorCardFragment.B;
                            String str = aVar != null ? aVar.b.guardH5Url : null;
                            if (str != null && str.length() != 0) {
                                zH.a aVar2 = liveFeedRoomAnchorCardFragment.x;
                                if (aVar2 != null) {
                                    LiveReporter.reportClick$default("live.live-room-detail.upcard.guard.click", qI.c.a(aVar2.a, new HashMap()), false, 4, (Object) null);
                                }
                                if (((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) liveFeedRoomAnchorCardFragment.of()).a.a()) {
                                    liveFeedRoomAnchorCardFragment.of().J9(new sI.l(38, 0, 0, 14, str));
                                }
                                liveFeedRoomAnchorCardFragment.dismissAllowingStateLoss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
