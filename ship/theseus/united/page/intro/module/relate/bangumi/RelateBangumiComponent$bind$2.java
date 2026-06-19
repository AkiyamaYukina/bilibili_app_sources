package com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.StringFormatter;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.Y;
import com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.RelateBangumiComponent$bind$2;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.bilibili.ship.theseus.united.utils.g;
import dv0.C6856b0;
import e8.h;
import java.util.List;
import java.util.Locale;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/RelateBangumiComponent$bind$2.class */
final class RelateBangumiComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final TintTextView $badge;
    final C6856b0 $binding;
    final Context $context;
    final BiliImageView $cover;
    final BiliImageView $coverBadge;
    final VectorTextView $follow;
    final TintTextView $info;
    final TintImageView $more;
    final VectorTextView $play;
    final TintTextView $recommend;
    final ForegroundConstraintLayout $root;
    final TextView $score;
    final TextView $scoreCount;
    final TintFixedLineSpacingTextView $title;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.RelateBangumiComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/RelateBangumiComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintFixedLineSpacingTextView $title;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.RelateBangumiComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/RelateBangumiComponent$bind$2$1$1.class */
        public static final class C10401 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final TintFixedLineSpacingTextView $title;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10401(TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Continuation<? super C10401> continuation) {
                super(2, continuation);
                this.$title = tintFixedLineSpacingTextView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10401 c10401 = new C10401(this.$title, continuation);
                c10401.L$0 = obj;
                return c10401;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$title.setText((String) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$title = tintFixedLineSpacingTextView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<String> flowA = this.this$0.f101124a.A();
                C10401 c10401 = new C10401(this.$title, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c10401, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.RelateBangumiComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/RelateBangumiComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintTextView $badge;
        final C6856b0 $binding;
        final Context $context;
        final BiliImageView $cover;
        final BiliImageView $coverBadge;
        final VectorTextView $follow;
        final TintTextView $info;
        final TintImageView $more;
        final VectorTextView $play;
        final TintTextView $recommend;
        final ForegroundConstraintLayout $root;
        final TextView $score;
        final TextView $scoreCount;
        final TintFixedLineSpacingTextView $title;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextView textView, BiliImageView biliImageView, a aVar, BiliImageView biliImageView2, VectorTextView vectorTextView, VectorTextView vectorTextView2, TintImageView tintImageView, TintTextView tintTextView, Context context, TintTextView tintTextView2, TextView textView2, TintTextView tintTextView3, ForegroundConstraintLayout foregroundConstraintLayout, C6856b0 c6856b0, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$score = textView;
            this.$cover = biliImageView;
            this.this$0 = aVar;
            this.$coverBadge = biliImageView2;
            this.$play = vectorTextView;
            this.$follow = vectorTextView2;
            this.$more = tintImageView;
            this.$info = tintTextView;
            this.$context = context;
            this.$recommend = tintTextView2;
            this.$scoreCount = textView2;
            this.$badge = tintTextView3;
            this.$root = foregroundConstraintLayout;
            this.$binding = c6856b0;
            this.$title = tintFixedLineSpacingTextView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(a aVar, TintImageView tintImageView, View view) {
            aVar.f101124a.f(Y.a(tintImageView), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(a aVar, View view) {
            aVar.f101124a.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(a aVar, TintImageView tintImageView, View view) {
            aVar.f101124a.f(Y.a(tintImageView), true);
            return true;
        }

        private static final void invokeSuspend$updateColor(a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, TintTextView tintTextView, TintImageView tintImageView, TextView textView, StatInfoData statInfoData) {
            ActivityColorRepository activityColorRepositoryD = aVar.f101124a.d();
            Integer numH = activityColorRepositoryD.h();
            tintFixedLineSpacingTextView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Ga10));
            Integer numE = activityColorRepositoryD.e();
            int iIntValue = numE != null ? numE.intValue() : ContextCompat.getColor(context, R$color.Ga5);
            vectorTextView.setTextColor(iIntValue);
            vectorTextView2.setTextColor(iIntValue);
            tintTextView.setTextColor(iIntValue);
            tintImageView.setColorFilter(iIntValue);
            textView.setTextColor(iIntValue);
            Drawable drawable = statInfoData.a() ? AppCompatResources.getDrawable(context, 2131235257) : AppCompatResources.getDrawable(context, 2131235038);
            int iDip2px = ScreenUtil.dip2px(context, 16.0f);
            rh1.a.a(vectorTextView, iDip2px, drawable, iIntValue);
            rh1.a.a(vectorTextView2, iDip2px, AppCompatResources.getDrawable(context, 2131236685), iIntValue);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$score, this.$cover, this.this$0, this.$coverBadge, this.$play, this.$follow, this.$more, this.$info, this.$context, this.$recommend, this.$scoreCount, this.$badge, this.$root, this.$binding, this.$title, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int iA;
            int iA2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$score.setTypeface((Typeface) Uj0.e.f24763c.getValue());
            InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
            BiliImageView biliImageView = this.$cover;
            C6306c c6306cI = this.this$0.f101124a.i();
            aVar.getClass();
            InterfaceC6308d.a.d(biliImageView, c6306cI);
            ImageExtentionKt.displayImage$default(this.$cover, this.this$0.f101124a.j(), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
            String strC = this.this$0.f101124a.C();
            boolean z6 = false;
            if (strC == null || StringsKt.isBlank(strC)) {
                this.$coverBadge.setVisibility(8);
            } else {
                this.$coverBadge.setVisibility(0);
                ImageExtentionKt.displayImage$default(this.$coverBadge, strC, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
            }
            StatInfoData statInfoDataE = this.this$0.f101124a.e();
            this.$play.setText(statInfoDataE.a() ? statInfoDataE.f104028b : NumberFormat_androidKt.format$default(Boxing.boxLong(statInfoDataE.f104027a), (String) null, 0, 3, (Object) null));
            this.$follow.setText(NumberFormat_androidKt.format$default(Boxing.boxLong(this.this$0.f101124a.E()), (String) null, 0, 3, (Object) null));
            this.$more.setVisibility(this.this$0.f101124a.a() ? 0 : 8);
            if (StringsKt.isBlank(this.this$0.f101124a.b())) {
                this.$info.setVisibility(8);
            } else {
                this.$info.setVisibility(0);
                this.$info.setText(this.this$0.f101124a.b());
            }
            boolean zA = Cj0.a.a(this.$context);
            C6302a c6302aB = this.this$0.f101124a.B();
            if (c6302aB == null || !c6302aB.a()) {
                this.$recommend.setVisibility(8);
            } else {
                this.$recommend.setVisibility(0);
                this.$recommend.setText(c6302aB.f101087a);
                this.$recommend.setTextColor(g.a(0, zA ? c6302aB.f101089c : c6302aB.f101088b));
                int i7 = c6302aB.h;
                if (i7 == 1 || i7 == 3) {
                    iA = g.a(0, zA ? c6302aB.f101091e : c6302aB.f101090d);
                } else {
                    iA = 0;
                }
                if (i7 == 2 || i7 == 3) {
                    iA2 = g.a(0, zA ? c6302aB.f101093g : c6302aB.f101092f);
                } else {
                    iA2 = 0;
                }
                if (iA != 0 || iA2 != 0) {
                    TintTextView tintTextView = this.$recommend;
                    GradientDrawable gradientDrawableA = h.a(0);
                    gradientDrawableA.setCornerRadius(NewPlayerUtilsKt.toFloatPx(2.0f));
                    gradientDrawableA.setColor(iA);
                    gradientDrawableA.setStroke(NewPlayerUtilsKt.toPx(0.5f), iA2);
                    tintTextView.setBackground(gradientDrawableA);
                }
            }
            VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(this.$context.getResources(), 2131236687, null);
            if (vectorDrawableCompatCreate != null) {
                DrawableCompat.setTint(vectorDrawableCompatCreate, ThemeUtils.getColorById(this.$context, R$color.Ga5));
                int iDp2px = (int) DpUtils.dp2px(this.$context, 15.0f);
                vectorDrawableCompatCreate.setBounds(0, 0, iDp2px, iDp2px);
                this.$follow.setCompoundDrawables(vectorDrawableCompatCreate, null, null, null);
            }
            int iF = this.this$0.f101124a.F();
            if (iF > 0) {
                this.$score.setVisibility(0);
                this.$scoreCount.setVisibility(0);
                Float floatOrNull = StringsKt.toFloatOrNull(this.this$0.f101124a.D());
                float fFloatValue = floatOrNull != null ? floatOrNull.floatValue() : 0.0f;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableString spannableString = new SpannableString(StringFormatter.format(Locale.US, "%1$.1f", new Object[]{Boxing.boxFloat(fFloatValue)}));
                spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, spannableString.length(), 34);
                spannableStringBuilder.append((CharSequence) spannableString);
                SpannableString spannableString2 = new SpannableString(this.$context.getString(2131845672));
                spannableString2.setSpan(new AbsoluteSizeSpan(10, true), 0, spannableString2.length(), 34);
                spannableStringBuilder.append((CharSequence) spannableString2);
                this.$score.setText(spannableStringBuilder);
                this.$scoreCount.setText(this.$context.getResources().getQuantityString(2131689613, iF, NumberFormat_androidKt.format$default(Boxing.boxInt(iF), (String) null, 0, 3, (Object) null)));
            } else {
                this.$score.setVisibility(8);
                this.$scoreCount.setVisibility(8);
            }
            String strG = this.this$0.f101124a.g();
            if (StringsKt.isBlank(strG)) {
                this.$badge.setVisibility(8);
            } else {
                this.$badge.setVisibility(0);
                this.$badge.setText(strG);
            }
            invokeSuspend$updateColor(this.this$0, this.$title, this.$context, this.$play, this.$follow, this.$info, this.$more, this.$scoreCount, statInfoDataE);
            final TintImageView tintImageView = this.$more;
            final a aVar2 = this.this$0;
            tintImageView.setOnClickListener(new View.OnClickListener(aVar2, tintImageView) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f101125a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintImageView f101126b;

                {
                    this.f101125a = aVar2;
                    this.f101126b = tintImageView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelateBangumiComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$1(this.f101125a, this.f101126b, view);
                }
            });
            ForegroundConstraintLayout foregroundConstraintLayout = this.$root;
            final a aVar3 = this.this$0;
            foregroundConstraintLayout.setOnClickListener(new View.OnClickListener(aVar3) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f101127a;

                {
                    this.f101127a = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelateBangumiComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$2(this.f101127a, view);
                }
            });
            ForegroundConstraintLayout foregroundConstraintLayout2 = this.$root;
            final a aVar4 = this.this$0;
            final TintImageView tintImageView2 = this.$more;
            foregroundConstraintLayout2.setOnLongClickListener(new View.OnLongClickListener(aVar4, tintImageView2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f101128a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintImageView f101129b;

                {
                    this.f101128a = aVar4;
                    this.f101129b = tintImageView2;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return RelateBangumiComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$3(this.f101128a, this.f101129b, view);
                }
            });
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$root, this.this$0.f101124a.c());
            ForegroundConstraintLayout foregroundConstraintLayout3 = this.$binding.f116904a;
            int iDpToPx = DimenUtilsKt.dpToPx(this.this$0.f101124a.i().f101145b);
            List listListOf = CollectionsKt.listOf(Boxing.boxInt(this.$binding.f116914l.getId()));
            List listListOf2 = CollectionsKt.listOf(new Integer[]{Boxing.boxInt(this.$binding.f116911i.getId()), Boxing.boxInt(this.$binding.f116909f.getId())});
            if (foregroundConstraintLayout3 != null) {
                int iCoerceAtLeast = RangesKt.coerceAtLeast(iDpToPx, InterfaceC6308d.a.f101175b);
                InterfaceC6308d.a aVar5 = InterfaceC6308d.a.f101174a;
                boolean zB = InterfaceC6308d.a.b(foregroundConstraintLayout3, listListOf);
                boolean zB2 = InterfaceC6308d.a.b(foregroundConstraintLayout3, listListOf2);
                if (iCoerceAtLeast < InterfaceC6308d.a.f101177d && zB && zB2) {
                    InterfaceC6308d.a.c(foregroundConstraintLayout3, listListOf);
                } else {
                    z6 = zB;
                }
                if (iCoerceAtLeast < InterfaceC6308d.a.f101176c) {
                    if (z6) {
                        InterfaceC6308d.a.c(foregroundConstraintLayout3, listListOf);
                    }
                    if (zB2) {
                        InterfaceC6308d.a.c(foregroundConstraintLayout3, listListOf2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelateBangumiComponent$bind$2(a aVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, TextView textView, BiliImageView biliImageView, BiliImageView biliImageView2, VectorTextView vectorTextView, VectorTextView vectorTextView2, TintImageView tintImageView, TintTextView tintTextView, Context context, TintTextView tintTextView2, TextView textView2, TintTextView tintTextView3, ForegroundConstraintLayout foregroundConstraintLayout, C6856b0 c6856b0, Continuation<? super RelateBangumiComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$title = tintFixedLineSpacingTextView;
        this.$score = textView;
        this.$cover = biliImageView;
        this.$coverBadge = biliImageView2;
        this.$play = vectorTextView;
        this.$follow = vectorTextView2;
        this.$more = tintImageView;
        this.$info = tintTextView;
        this.$context = context;
        this.$recommend = tintTextView2;
        this.$scoreCount = textView2;
        this.$badge = tintTextView3;
        this.$root = foregroundConstraintLayout;
        this.$binding = c6856b0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelateBangumiComponent$bind$2 relateBangumiComponent$bind$2 = new RelateBangumiComponent$bind$2(this.this$0, this.$title, this.$score, this.$cover, this.$coverBadge, this.$play, this.$follow, this.$more, this.$info, this.$context, this.$recommend, this.$scoreCount, this.$badge, this.$root, this.$binding, continuation);
        relateBangumiComponent$bind$2.L$0 = obj;
        return relateBangumiComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$score, this.$cover, this.this$0, this.$coverBadge, this.$play, this.$follow, this.$more, this.$info, this.$context, this.$recommend, this.$scoreCount, this.$badge, this.$root, this.$binding, this.$title, null), 3, (Object) null);
    }
}
