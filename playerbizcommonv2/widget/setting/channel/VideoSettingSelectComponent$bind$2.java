package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2.class */
final class VideoSettingSelectComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Dr0.p $binding;
    private Object L$0;
    int label;
    final t this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSelectComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final AppCompatImageView $icon;
        int label;
        final t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppCompatImageView appCompatImageView, t tVar, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$icon = appCompatImageView;
            this.this$0 = tVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$icon, this.this$0, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView = this.$icon;
                String str = this.this$0.f83281a.f83294b;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(appCompatImageView).useOrigin().asDrawable().url(str).submit().subscribe(new ci1.e(cancellableContinuationImpl, 1));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Drawable drawable = (Drawable) obj;
            if (drawable == null) {
                return Unit.INSTANCE;
            }
            this.$icon.setImageDrawable(com.bilibili.playerbizcommon.utils.n.a(ContextCompat.getColor(this.$context, this.this$0.f83281a.f83302k), drawable));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSelectComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final t this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSelectComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final t this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(t tVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = tVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                int i7 = this.I$0;
                t tVar = this.this$0;
                t.a aVar = tVar.f83282b;
                List<String> list = tVar.f83281a.f83299g;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i8 = 0;
                for (Object obj2 : list) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new t.a.C0555a((String) obj2, i8 == i7));
                    i8++;
                }
                aVar.getClass();
                ArrayList arrayList2 = new ArrayList(aVar.f83283a);
                ((ArrayList) aVar.f83283a).clear();
                ((ArrayList) aVar.f83283a).addAll(arrayList);
                DiffUtil.calculateDiff(new u(arrayList2, aVar, arrayList)).dispatchUpdatesTo(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(t tVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar = this.this$0;
                StateFlow<Integer> stateFlow = tVar.f83281a.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(tVar, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2$a.class */
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f83218a;

        public a(t tVar) {
            this.f83218a = tVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (childLayoutPosition == 0) {
                rect.left = DimenUtilsKt.dpToPx(32.0f);
                rect.right = DimenUtilsKt.dpToPx(10.0f);
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || childLayoutPosition != layoutManager.getItemCount() - 1) {
                rect.right = DimenUtilsKt.dpToPx(10.0f);
            } else {
                rect.right = DimenUtilsKt.dpToPx(this.f83218a.f83281a.f83298f + 10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingSelectComponent$bind$2(Dr0.p pVar, t tVar, Continuation<? super VideoSettingSelectComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = pVar;
        this.this$0 = tVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSettingSelectComponent$bind$2 videoSettingSelectComponent$bind$2 = new VideoSettingSelectComponent$bind$2(this.$binding, this.this$0, continuation);
        videoSettingSelectComponent$bind$2.L$0 = obj;
        return videoSettingSelectComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ConstraintLayout constraintLayout = this.$binding.f3125a;
        Context context = constraintLayout.getContext();
        Dr0.p pVar = this.$binding;
        AppCompatTextView appCompatTextView = pVar.f3131g;
        AppCompatImageView appCompatImageView = pVar.f3127c;
        View view = pVar.f3129e;
        RecyclerView recyclerView = pVar.f3130f;
        FrameLayout frameLayout = pVar.f3128d;
        View view2 = pVar.f3126b;
        if (this.this$0.f83281a.f83294b.length() > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(appCompatImageView, this.this$0, context, null), 3, (Object) null);
        } else {
            t.b bVar = this.this$0.f83281a;
            appCompatImageView.setImageDrawable(IconFont.getIconDrawable(bVar.f83295c, ContextCompat.getColor(context, bVar.f83302k)));
        }
        appCompatTextView.setText(this.this$0.f83281a.f83293a);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, this.this$0.f83281a.f83302k));
        VideoSettingType videoSettingType = this.this$0.f83281a.f83309r;
        if (videoSettingType == VideoSettingType.BOTTOM || videoSettingType == VideoSettingType.TOP_BOTTOM) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
            view2.setAlpha(0.7f);
            view2.setBackgroundResource(this.this$0.f83281a.f83304m);
        }
        t.b bVar2 = this.this$0.f83281a;
        constraintLayout.setBackground(n.a(ContextCompat.getColor(context, bVar2.f83303l), bVar2.f83309r));
        if (this.this$0.f83281a.f83296d) {
            Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
            view.setVisibility(0);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(context, this.this$0.f83281a.f83303l), 0});
            gradientDrawable.setGradientType(0);
            view.setBackground(gradientDrawable);
        } else {
            Lazy lazy2 = com.bilibili.playerbizcommonv2.utils.p.f81943a;
            view.setVisibility(8);
        }
        t tVar = this.this$0;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = DimenUtilsKt.dpToPx(tVar.f83281a.f83297e);
        frameLayout.setLayoutParams(marginLayoutParams);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.this$0.f83282b);
        t tVar2 = this.this$0;
        t.a aVar = tVar2.f83282b;
        t.b bVar3 = tVar2.f83281a;
        aVar.f83287e = bVar3.f83301j;
        aVar.f83288f = DimenUtilsKt.dpToPx(RangesKt.coerceAtLeast(bVar3.f83300i - 10, 0));
        t tVar3 = this.this$0;
        t.a aVar2 = tVar3.f83282b;
        int color = ContextCompat.getColor(context, tVar3.f83281a.f83305n);
        int color2 = ContextCompat.getColor(context, this.this$0.f83281a.f83306o);
        int color3 = ContextCompat.getColor(context, this.this$0.f83281a.f83307p);
        aVar2.f83284b = color;
        aVar2.f83285c = color2;
        aVar2.f83286d = color3;
        a aVar3 = new a(this.this$0);
        recyclerView.addItemDecoration(aVar3);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        if (((Number) this.this$0.f83281a.h.getValue()).intValue() < RangesKt.coerceAtLeast((this.this$0.f83281a.f83299g.size() / 2) - 1, 0)) {
            recyclerView.scrollToPosition(0);
        } else {
            recyclerView.scrollToPosition(this.this$0.f83281a.f83299g.size() - 1);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new VideoSettingSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1(null, recyclerView, aVar3), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
