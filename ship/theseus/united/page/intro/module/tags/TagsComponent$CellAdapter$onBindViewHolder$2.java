package com.bilibili.ship.theseus.united.page.intro.module.tags;

import android.text.TextUtils;
import android.view.View;
import com.bilibili.playerbizcommonv2.view.CustomMarqueeTextView;
import com.bilibili.ship.theseus.united.page.intro.module.tags.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$CellAdapter$onBindViewHolder$2.class */
final class TagsComponent$CellAdapter$onBindViewHolder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $position;
    final CustomMarqueeTextView $title;
    int label;
    final f.a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$CellAdapter$onBindViewHolder$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$CellAdapter$onBindViewHolder$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final int $position;
        final CustomMarqueeTextView $title;
        int I$0;
        int label;
        final f.a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$CellAdapter$onBindViewHolder$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$CellAdapter$onBindViewHolder$2$1$a.class */
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f.a f101910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f101911b;

            public a(f.a aVar, int i7) {
                this.f101910a = aVar;
                this.f101911b = i7;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                boolean z6;
                view.removeOnLayoutChangeListener(this);
                CustomMarqueeTextView customMarqueeTextView = view instanceof CustomMarqueeTextView ? (CustomMarqueeTextView) view : null;
                if (customMarqueeTextView == null) {
                    return;
                }
                synchronized (this.f101910a) {
                    boolean z7 = customMarqueeTextView.getWidth() >= this.f101911b;
                    f.a aVar = this.f101910a;
                    z6 = false;
                    if (!aVar.f101964e) {
                        z6 = false;
                        if (z7) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        aVar.f101964e = true;
                    }
                }
                customMarqueeTextView.setCustomMarqueeEnable(z6);
                customMarqueeTextView.setEllipsize(z6 ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, f.a aVar, CustomMarqueeTextView customMarqueeTextView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$position = i7;
            this.this$0 = aVar;
            this.$title = customMarqueeTextView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, this.this$0, this.$title, continuation);
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
            boolean z6;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            defpackage.a.b("[theseus-united-TagsComponent$CellAdapter$onBindViewHolder$2$1-invokeSuspend] ", G.f.a(this.$position, i7, "CellAdapter onBindViewHolder position=", ", width="), "TagsComponent$CellAdapter$onBindViewHolder$2$1-invokeSuspend");
            if (this.$position == 0) {
                f.a aVar = this.this$0;
                synchronized (aVar) {
                    aVar.f101964e = false;
                    Unit unit = Unit.INSTANCE;
                }
            }
            this.$title.setMaxWidth(i7);
            CustomMarqueeTextView customMarqueeTextView = this.$title;
            f.a aVar2 = this.this$0;
            if (!customMarqueeTextView.isLaidOut() || customMarqueeTextView.isLayoutRequested()) {
                customMarqueeTextView.addOnLayoutChangeListener(new a(aVar2, i7));
            } else {
                synchronized (aVar2) {
                    boolean z7 = customMarqueeTextView.getWidth() >= i7;
                    z6 = false;
                    if (!aVar2.f101964e) {
                        z6 = false;
                        if (z7) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        aVar2.f101964e = true;
                    }
                }
                customMarqueeTextView.setCustomMarqueeEnable(z6);
                customMarqueeTextView.setEllipsize(z6 ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END);
            }
            if (this.$title.isInLayout() || !this.$title.isLayoutRequested()) {
                final CustomMarqueeTextView customMarqueeTextView2 = this.$title;
                Boxing.boxBoolean(customMarqueeTextView2.post(new Runnable(customMarqueeTextView2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.tags.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CustomMarqueeTextView f101954a;

                    {
                        this.f101954a = customMarqueeTextView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f101954a.requestLayout();
                    }
                }));
            } else {
                this.$title.requestLayout();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsComponent$CellAdapter$onBindViewHolder$2(f.a aVar, int i7, CustomMarqueeTextView customMarqueeTextView, Continuation<? super TagsComponent$CellAdapter$onBindViewHolder$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = i7;
        this.$title = customMarqueeTextView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagsComponent$CellAdapter$onBindViewHolder$2(this.this$0, this.$position, this.$title, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f.a aVar = this.this$0;
            MutableStateFlow<Integer> mutableStateFlow = aVar.f101965f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, aVar, this.$title, null);
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
