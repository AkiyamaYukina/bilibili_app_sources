package com.bilibili.ship.theseus.united.page.intro.module.relate.live;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.authorspace.ui.I1;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createLiveComponent$contract$1;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.Y;
import com.bilibili.ship.theseus.united.page.intro.module.relate.live.RelateLiveComponent$bind$2;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.p0;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.bilibili.ship.theseus.united.utils.g;
import dv0.C6864f0;
import e8.h;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import sh1.e;
import tv.danmaku.app.AppConfig;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/live/RelateLiveComponent$bind$2.class */
final class RelateLiveComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final VectorTextView $author;
    final C6864f0 $binding;
    final ActivityColorRepository $colors;
    final Context $context;
    final BiliImageView $cover;
    final VectorTextView $infoView;
    final int $lightTextColor;
    final LottieAnimationView $liveBadge;
    final TintLinearLayout $liveBadgeLayout;
    final TextView $liveTitle;
    final TintImageView $more;
    final TintTextView $reason;
    final ForegroundConstraintLayout $root;
    final TintFixedLineSpacingTextView $title;
    final TintImageView $upIcon;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.live.RelateLiveComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/live/RelateLiveComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintFixedLineSpacingTextView $title;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.live.RelateLiveComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/live/RelateLiveComponent$bind$2$1$1.class */
        public static final class C10491 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final TintFixedLineSpacingTextView $title;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10491(TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Continuation<? super C10491> continuation) {
                super(2, continuation);
                this.$title = tintFixedLineSpacingTextView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10491 c10491 = new C10491(this.$title, continuation);
                c10491.L$0 = obj;
                return c10491;
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
        public AnonymousClass1(d dVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f101291a.f100941g);
                C10491 c10491 = new C10491(this.$title, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, c10491, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.live.RelateLiveComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/live/RelateLiveComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final VectorTextView $author;
        final C6864f0 $binding;
        final ActivityColorRepository $colors;
        final Context $context;
        final BiliImageView $cover;
        final VectorTextView $infoView;
        final int $lightTextColor;
        final LottieAnimationView $liveBadge;
        final TintLinearLayout $liveBadgeLayout;
        final TextView $liveTitle;
        final TintImageView $more;
        final TintTextView $reason;
        final ForegroundConstraintLayout $root;
        final TintFixedLineSpacingTextView $title;
        final TintImageView $upIcon;
        int label;
        final d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BiliImageView biliImageView, d dVar, VectorTextView vectorTextView, TintImageView tintImageView, Context context, VectorTextView vectorTextView2, int i7, TintLinearLayout tintLinearLayout, TextView textView, LottieAnimationView lottieAnimationView, TintTextView tintTextView, TintImageView tintImageView2, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, ActivityColorRepository activityColorRepository, ForegroundConstraintLayout foregroundConstraintLayout, C6864f0 c6864f0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$cover = biliImageView;
            this.this$0 = dVar;
            this.$author = vectorTextView;
            this.$more = tintImageView;
            this.$context = context;
            this.$infoView = vectorTextView2;
            this.$lightTextColor = i7;
            this.$liveBadgeLayout = tintLinearLayout;
            this.$liveTitle = textView;
            this.$liveBadge = lottieAnimationView;
            this.$reason = tintTextView;
            this.$upIcon = tintImageView2;
            this.$title = tintFixedLineSpacingTextView;
            this.$colors = activityColorRepository;
            this.$root = foregroundConstraintLayout;
            this.$binding = c6864f0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(d dVar, TintImageView tintImageView, View view) {
            dVar.f101291a.b(Y.a(tintImageView), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(d dVar, View view) {
            DetailRelateService$createLiveComponent$contract$1 detailRelateService$createLiveComponent$contract$1 = dVar.f101291a;
            o0 o0Var = detailRelateService$createLiveComponent$contract$1.f100935a;
            Uri uriBuild = Uri.parse(o0Var.f101318c.f101347d).buildUpon().build();
            if (uriBuild != null) {
                String str = o0Var.f101338x;
                if (AppConfig.isBiliDomain(uriBuild)) {
                    Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                    String queryParameter = uriBuild.getQueryParameter("from_spmid");
                    if ((queryParameter == null || queryParameter.length() == 0) & (!(str == null || str.length() == 0))) {
                        builderBuildUpon.appendQueryParameter("from_spmid", str);
                    }
                    String queryParameter2 = uriBuild.getQueryParameter("from_module");
                    boolean z6 = true;
                    if (queryParameter2 != null) {
                        z6 = queryParameter2.length() == 0;
                    }
                    String string = uriBuild.toString();
                    String str2 = (String) ConfigManager.Companion.config().get("following.url_from_source_reg", "(^(https?:)?//([w-]+.)?bilibili.com/blackboard/)|(bilibili://following/activity_landing/(\\d+))");
                    boolean zFind = false;
                    if (str2 != null) {
                        try {
                            zFind = Pattern.compile(str2, 2).matcher(string).find();
                        } catch (Exception e7) {
                            zFind = false;
                        }
                    }
                    if (z6 & zFind) {
                        builderBuildUpon.appendQueryParameter("from_module", "relatedvideo");
                    }
                    uriBuild = builderBuildUpon.build();
                }
                DetailRelateService detailRelateService = detailRelateService$createLiveComponent$contract$1.f100938d;
                e.c(detailRelateService.f100867b, uriBuild);
                detailRelateService.o(o0Var, "card", new HashMap<>());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$4(d dVar, TintImageView tintImageView, View view) {
            dVar.f101291a.b(Y.a(tintImageView), true);
            return true;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$cover, this.this$0, this.$author, this.$more, this.$context, this.$infoView, this.$lightTextColor, this.$liveBadgeLayout, this.$liveTitle, this.$liveBadge, this.$reason, this.$upIcon, this.$title, this.$colors, this.$root, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IconTextDrawable iconDrawable;
            int iA;
            int iA2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
            BiliImageView biliImageView = this.$cover;
            C6306c c6306cA = this.this$0.f101291a.a();
            aVar.getClass();
            InterfaceC6308d.a.d(biliImageView, c6306cA);
            BiliImageView biliImageView2 = this.$cover;
            p0 p0Var = this.this$0.f101291a.f100935a.f101318c;
            ImageExtentionKt.displayImageWithGif$default(biliImageView2, p0Var.f101346c, p0Var.f101352j, (Function0) null, (Function0) null, 0, 0, (ImageLoadingListener) null, (ImageLoadingListener) null, false, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR, (Object) null);
            this.$author.setText(this.this$0.f101291a.f100935a.f101318c.f101353k.f104061d);
            boolean z6 = false;
            this.$more.setVisibility(this.this$0.f101291a.f100935a.f101319d != null ? 0 : 8);
            C0 c02 = this.this$0.f101291a.f100936b;
            long j7 = c02.f100825b;
            String str = c02.f100824a;
            long j8 = c02.f100826c;
            long j9 = c02.f100827d;
            String str2 = NumberFormat_androidKt.format$default(Boxing.boxLong(j7), "--", 0, 2, (Object) null);
            Drawable drawable = j9 == 31 ? AppCompatResources.getDrawable(this.$context, 2131232542) : AppCompatResources.getDrawable(this.$context, 2131236663);
            d dVar = this.this$0;
            Context context = this.$context;
            VectorTextView vectorTextView = this.$infoView;
            int i7 = this.$lightTextColor;
            dVar.getClass();
            int iDip2px = ScreenUtil.dip2px(context, 16.0f);
            if (drawable != null) {
                rh1.a.a(vectorTextView, iDip2px, drawable, i7);
            }
            String str3 = str2;
            if (Intrinsics.areEqual(this.this$0.f101291a.f100936b.f100829f, "1")) {
                this.$liveBadgeLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.$context, 2131100819)));
                p0 p0Var2 = this.this$0.f101291a.f100935a.f101318c;
                TextView textView = this.$liveTitle;
                String str4 = p0Var2.f101358p;
                String string = str4;
                if (StringsKt.isBlank(str4)) {
                    string = this.$context.getString(2131846726);
                }
                textView.setText(string);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.$liveBadgeLayout.getLayoutParams();
                layoutParams.bottomToBottom = this.$cover.getId();
                layoutParams.topToTop = -1;
                int iA3 = (int) I1.a(this.$context, 1, 3.0f);
                TintLinearLayout tintLinearLayout = this.$liveBadgeLayout;
                tintLinearLayout.setPaddingRelative(tintLinearLayout.getPaddingStart(), this.$liveBadgeLayout.getPaddingTop(), iA3, 0);
                this.$liveBadgeLayout.setLayoutParams(layoutParams);
                this.$liveBadgeLayout.requestLayout();
                int iA4 = (int) I1.a(this.$context, 1, 10.0f);
                this.$liveBadge.getLayoutParams().width = iA4;
                this.$liveBadge.getLayoutParams().height = iA4;
                this.$liveBadge.requestLayout();
                C0 c03 = this.this$0.f101291a.f100936b;
                StatInfoData statInfoData = c03.f100830g;
                str3 = "--";
                if (statInfoData != null) {
                    str3 = statInfoData.f104028b;
                    if (str3 == null) {
                        str3 = "--";
                    }
                }
                String str5 = statInfoData != null ? statInfoData.f104030d : null;
                C6302a c6302a = c03.f100828e;
                boolean zA = Cj0.a.a(this.$context);
                if (c6302a == null || !c6302a.a()) {
                    this.$reason.setVisibility(8);
                    this.$upIcon.setVisibility(0);
                } else {
                    this.$reason.setVisibility(0);
                    this.$upIcon.setVisibility(this.this$0.f101291a.c() ? 0 : 8);
                    this.$reason.setText(c6302a.f101087a);
                    this.$reason.setTextColor(g.a(0, zA ? c6302a.f101089c : c6302a.f101088b));
                    int i8 = c6302a.h;
                    if (i8 == 1 || i8 == 3) {
                        iA = g.a(0, zA ? c6302a.f101091e : c6302a.f101090d);
                    } else {
                        iA = 0;
                    }
                    if (i8 == 2 || i8 == 3) {
                        iA2 = g.a(0, zA ? c6302a.f101093g : c6302a.f101092f);
                    } else {
                        iA2 = 0;
                    }
                    if (iA != 0 || iA2 != 0) {
                        TintTextView tintTextView = this.$reason;
                        GradientDrawable gradientDrawableA = h.a(0);
                        gradientDrawableA.setCornerRadius(NewPlayerUtilsKt.toFloatPx(2.0f));
                        gradientDrawableA.setColor(iA);
                        gradientDrawableA.setStroke(NewPlayerUtilsKt.toPx(0.5f), iA2);
                        tintTextView.setBackground(gradientDrawableA);
                    }
                }
                if (str5 != null) {
                    int i9 = this.$lightTextColor;
                    Context context2 = this.$context;
                    VectorTextView vectorTextView2 = this.$infoView;
                    if (!StringsKt.isBlank(str5) && (iconDrawable = IconFont.getIconDrawable(str5, i9)) != null) {
                        int iDip2px2 = ScreenUtil.dip2px(context2, 16.0f);
                        iconDrawable.setBounds(0, 0, iDip2px2, iDip2px2);
                        vectorTextView2.setVectorDrawables(iconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
            String strA = str3;
            if (!StringsKt.isBlank(str)) {
                strA = B0.a.a(str3, " · ", str);
            }
            this.$infoView.setText(strA);
            if (j8 == 1) {
                this.$liveBadgeLayout.setVisibility(0);
                this.$liveBadge.playAnimation();
                this.$liveBadge.setRepeatCount(-1);
            } else {
                this.$liveBadgeLayout.setVisibility(8);
                this.$liveBadge.cancelAnimation();
            }
            TintFixedLineSpacingTextView tintFixedLineSpacingTextView = this.$title;
            Integer numH = this.$colors.h();
            tintFixedLineSpacingTextView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(this.$context, R$color.Ga10));
            this.$infoView.setTextColor(this.$lightTextColor);
            this.$author.setTextColor(this.$lightTextColor);
            this.$more.setColorFilter(this.$lightTextColor);
            this.$upIcon.setColorFilter(this.$lightTextColor);
            final TintImageView tintImageView = this.$more;
            final d dVar2 = this.this$0;
            tintImageView.setOnClickListener(new View.OnClickListener(dVar2, tintImageView) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.live.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f101286a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintImageView f101287b;

                {
                    this.f101286a = dVar2;
                    this.f101287b = tintImageView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelateLiveComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$2(this.f101286a, this.f101287b, view);
                }
            });
            ForegroundConstraintLayout foregroundConstraintLayout = this.$root;
            final d dVar3 = this.this$0;
            foregroundConstraintLayout.setOnClickListener(new View.OnClickListener(dVar3) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.live.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f101288a;

                {
                    this.f101288a = dVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelateLiveComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$3(this.f101288a, view);
                }
            });
            ForegroundConstraintLayout foregroundConstraintLayout2 = this.$root;
            final d dVar4 = this.this$0;
            final TintImageView tintImageView2 = this.$more;
            foregroundConstraintLayout2.setOnLongClickListener(new View.OnLongClickListener(dVar4, tintImageView2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.live.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f101289a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintImageView f101290b;

                {
                    this.f101289a = dVar4;
                    this.f101290b = tintImageView2;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return RelateLiveComponent$bind$2.AnonymousClass2.invokeSuspend$lambda$4(this.f101289a, this.f101290b, view);
                }
            });
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$root, this.this$0.f101291a.f100937c);
            ForegroundConstraintLayout foregroundConstraintLayout3 = this.$binding.f116974a;
            int iDpToPx = DimenUtilsKt.dpToPx(this.this$0.f101291a.a().f101145b);
            List listListOf = CollectionsKt.listOf(Boxing.boxInt(this.$binding.f116983k.getId()));
            List listListOf2 = CollectionsKt.listOf(new Integer[]{Boxing.boxInt(this.$binding.f116978e.getId()), Boxing.boxInt(this.$binding.f116982j.getId()), Boxing.boxInt(this.$binding.f116975b.getId())});
            if (foregroundConstraintLayout3 != null) {
                int iCoerceAtLeast = RangesKt.coerceAtLeast(iDpToPx, InterfaceC6308d.a.f101175b);
                InterfaceC6308d.a aVar2 = InterfaceC6308d.a.f101174a;
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
    public RelateLiveComponent$bind$2(d dVar, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, BiliImageView biliImageView, VectorTextView vectorTextView, TintImageView tintImageView, Context context, VectorTextView vectorTextView2, int i7, TintLinearLayout tintLinearLayout, TextView textView, LottieAnimationView lottieAnimationView, TintTextView tintTextView, TintImageView tintImageView2, ActivityColorRepository activityColorRepository, ForegroundConstraintLayout foregroundConstraintLayout, C6864f0 c6864f0, Continuation<? super RelateLiveComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$title = tintFixedLineSpacingTextView;
        this.$cover = biliImageView;
        this.$author = vectorTextView;
        this.$more = tintImageView;
        this.$context = context;
        this.$infoView = vectorTextView2;
        this.$lightTextColor = i7;
        this.$liveBadgeLayout = tintLinearLayout;
        this.$liveTitle = textView;
        this.$liveBadge = lottieAnimationView;
        this.$reason = tintTextView;
        this.$upIcon = tintImageView2;
        this.$colors = activityColorRepository;
        this.$root = foregroundConstraintLayout;
        this.$binding = c6864f0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelateLiveComponent$bind$2 relateLiveComponent$bind$2 = new RelateLiveComponent$bind$2(this.this$0, this.$title, this.$cover, this.$author, this.$more, this.$context, this.$infoView, this.$lightTextColor, this.$liveBadgeLayout, this.$liveTitle, this.$liveBadge, this.$reason, this.$upIcon, this.$colors, this.$root, this.$binding, continuation);
        relateLiveComponent$bind$2.L$0 = obj;
        return relateLiveComponent$bind$2;
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
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$cover, this.this$0, this.$author, this.$more, this.$context, this.$infoView, this.$lightTextColor, this.$liveBadgeLayout, this.$liveTitle, this.$liveBadge, this.$reason, this.$upIcon, this.$title, this.$colors, this.$root, this.$binding, null), 3, (Object) null);
    }
}
