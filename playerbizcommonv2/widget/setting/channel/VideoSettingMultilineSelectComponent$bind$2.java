package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.app.Activity;
import android.content.Context;
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
import com.bilibili.playerbizcommonv2.widget.setting.channel.o;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import java.util.ArrayList;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
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
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingMultilineSelectComponent$bind$2.class */
final class VideoSettingMultilineSelectComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Dr0.r $binding;
    private Object L$0;
    int label;
    final o this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingMultilineSelectComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingMultilineSelectComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final AppCompatImageView $icon;
        int label;
        final o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppCompatImageView appCompatImageView, o oVar, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$icon = appCompatImageView;
            this.this$0 = oVar;
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
                String str = this.this$0.f83260a.f83294b;
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
            this.$icon.setImageDrawable(com.bilibili.playerbizcommon.utils.n.a(ContextCompat.getColor(this.$context, this.this$0.f83260a.f83302k), drawable));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingMultilineSelectComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingMultilineSelectComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final o this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingMultilineSelectComponent$bind$2$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingMultilineSelectComponent$bind$2$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final o this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(o oVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = oVar;
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
                o oVar = this.this$0;
                o.a aVar = oVar.f83261b;
                List<String> list = oVar.f83260a.f83299g;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i8 = 0;
                for (Object obj2 : list) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new o.a.C0554a((String) obj2, i8 == i7));
                    i8++;
                }
                aVar.getClass();
                ArrayList arrayList2 = new ArrayList(aVar.f83262a);
                ((ArrayList) aVar.f83262a).clear();
                ((ArrayList) aVar.f83262a).addAll(arrayList);
                DiffUtil.calculateDiff(new p(arrayList2, aVar, arrayList)).dispatchUpdatesTo(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(o oVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = this.this$0;
                StateFlow<Integer> stateFlow = oVar.f83260a.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(oVar, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingMultilineSelectComponent$bind$2(Dr0.r rVar, o oVar, Continuation<? super VideoSettingMultilineSelectComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = rVar;
        this.this$0 = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(o oVar, RecyclerView recyclerView) {
        int size = oVar.f83260a.f83299g.size();
        if (size > 0) {
            int width = recyclerView.getWidth() / size;
            o.a aVar = oVar.f83261b;
            aVar.f83267f = width;
            aVar.notifyDataSetChanged();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSettingMultilineSelectComponent$bind$2 videoSettingMultilineSelectComponent$bind$2 = new VideoSettingMultilineSelectComponent$bind$2(this.$binding, this.this$0, continuation);
        videoSettingMultilineSelectComponent$bind$2.L$0 = obj;
        return videoSettingMultilineSelectComponent$bind$2;
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
        ConstraintLayout constraintLayout = this.$binding.f3135a;
        Context context = constraintLayout.getContext();
        Dr0.r rVar = this.$binding;
        AppCompatTextView appCompatTextView = rVar.f3140f;
        AppCompatImageView appCompatImageView = rVar.f3137c;
        final RecyclerView recyclerView = rVar.f3139e;
        FrameLayout frameLayout = rVar.f3138d;
        View view = rVar.f3136b;
        if (this.this$0.f83260a.f83294b.length() > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(appCompatImageView, this.this$0, context, null), 3, (Object) null);
        } else {
            t.b bVar = this.this$0.f83260a;
            appCompatImageView.setImageDrawable(IconFont.getIconDrawable(bVar.f83295c, ContextCompat.getColor(context, bVar.f83302k)));
        }
        appCompatTextView.setText(this.this$0.f83260a.f83293a);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, this.this$0.f83260a.f83302k));
        VideoSettingType videoSettingType = this.this$0.f83260a.f83309r;
        int i7 = 8;
        if (videoSettingType == VideoSettingType.BOTTOM || videoSettingType == VideoSettingType.TOP_BOTTOM) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setAlpha(0.7f);
            view.setBackgroundResource(this.this$0.f83260a.f83304m);
        }
        t.b bVar2 = this.this$0.f83260a;
        constraintLayout.setBackground(n.a(ContextCompat.getColor(context, bVar2.f83303l), bVar2.f83309r));
        t.b bVar3 = this.this$0.f83260a;
        boolean z6 = bVar3.f83310s;
        int i8 = z6 ? 33 : 36;
        if (z6) {
            i7 = 10;
        }
        int color = ContextCompat.getColor(context, bVar3.f83308q);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(DimenUtilsKt.dpToPx(i7));
        frameLayout.setBackground(gradientDrawable);
        o oVar = this.this$0;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        t.b bVar4 = oVar.f83260a;
        if (!bVar4.f83310s) {
            marginLayoutParams.rightMargin = DimenUtilsKt.dpToPx(bVar4.f83297e);
            marginLayoutParams.leftMargin = DimenUtilsKt.dpToPx(16);
        }
        marginLayoutParams.height = DimenUtilsKt.dpToPx(i8);
        frameLayout.setLayoutParams(marginLayoutParams);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.this$0.f83261b);
        o oVar2 = this.this$0;
        o.a aVar = oVar2.f83261b;
        aVar.f83266e = oVar2.f83260a.f83301j;
        aVar.f83268g = DimenUtilsKt.dpToPx(i8);
        o oVar3 = this.this$0;
        o.a aVar2 = oVar3.f83261b;
        int color2 = ContextCompat.getColor(context, oVar3.f83260a.f83305n);
        int color3 = ContextCompat.getColor(context, this.this$0.f83260a.f83306o);
        int color4 = ContextCompat.getColor(context, this.this$0.f83260a.f83307p);
        aVar2.f83263b = color2;
        aVar2.f83264c = color3;
        aVar2.f83265d = color4;
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.$binding.f3135a.getContext());
        if (activityFindActivityOrNull != null) {
            o oVar4 = this.this$0;
            oVar4.f83261b.f83267f = (activityFindActivityOrNull.getWindow().getDecorView().getWidth() - NewPlayerUtilsKt.toPx(64)) / Math.max(1, oVar4.f83260a.f83299g.size());
        }
        final o oVar5 = this.this$0;
        recyclerView.post(new Runnable(oVar5, recyclerView) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f83277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RecyclerView f83278b;

            {
                this.f83277a = oVar5;
                this.f83278b = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoSettingMultilineSelectComponent$bind$2.invokeSuspend$lambda$2(this.f83277a, this.f83278b);
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
        if (((Number) this.this$0.f83260a.h.getValue()).intValue() < RangesKt.coerceAtLeast((this.this$0.f83260a.f83299g.size() / 2) - 1, 0)) {
            recyclerView.scrollToPosition(0);
        } else {
            recyclerView.scrollToPosition(this.this$0.f83260a.f83299g.size() - 1);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new VideoSettingMultilineSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1(null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
