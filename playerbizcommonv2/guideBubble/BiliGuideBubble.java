package com.bilibili.playerbizcommonv2.guideBubble;

import Ec.r;
import Ec.s;
import GS0.D;
import GS0.E;
import Pb.F;
import Pb.G;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Px;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bilibili.app.authorspace.ui.I1;
import com.bilibili.bililive.room.ui.roomv3.player.container.A;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import com.mall.ui.page.create2.OrderGameInfoSelectionDialogFragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/BiliGuideBubble.class */
@StabilityInferred(parameters = 0)
public final class BiliGuideBubble extends PopupWindow {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public final BiliImageView f81732A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public final View f81733B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public final View f81734C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f81735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrowPosition f81737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f81739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f81740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f81741g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f81742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f81743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f81744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AnimatorSet f81745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final View f81746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public a f81747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f81748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public A f81749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f81750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.bilibili.bplus.followinglist.inline.panel.a f81751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Rect f81752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.guideBubble.b f81753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public d f81754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f81755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<PopupWindow.OnDismissListener> f81756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final TextView f81757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final ConstraintLayout f81758y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final ConstraintLayout f81759z;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/BiliGuideBubble$7.class */
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final BiliGuideBubble this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(BiliGuideBubble biliGuideBubble, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = biliGuideBubble;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new BiliGuideBubble$7$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/BiliGuideBubble$ArrowPosition.class */
    public static final class ArrowPosition {
        private static final EnumEntries $ENTRIES;
        private static final ArrowPosition[] $VALUES;
        public static final ArrowPosition LeftAndTop = new ArrowPosition("LeftAndTop", 0);
        public static final ArrowPosition Top = new ArrowPosition("Top", 1);
        public static final ArrowPosition RightAndTop = new ArrowPosition("RightAndTop", 2);
        public static final ArrowPosition Right = new ArrowPosition(TextSource.STR_ALIGN_RIGHT, 3);
        public static final ArrowPosition RightAndBottom = new ArrowPosition("RightAndBottom", 4);
        public static final ArrowPosition Bottom = new ArrowPosition("Bottom", 5);
        public static final ArrowPosition LeftAndBottom = new ArrowPosition("LeftAndBottom", 6);
        public static final ArrowPosition Left = new ArrowPosition(TextSource.STR_ALIGN_LEFT, 7);

        private static final /* synthetic */ ArrowPosition[] $values() {
            return new ArrowPosition[]{LeftAndTop, Top, RightAndTop, Right, RightAndBottom, Bottom, LeftAndBottom, Left};
        }

        static {
            ArrowPosition[] arrowPositionArr$values = $values();
            $VALUES = arrowPositionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(arrowPositionArr$values);
        }

        private ArrowPosition(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ArrowPosition> getEntries() {
            return $ENTRIES;
        }

        public static ArrowPosition valueOf(String str) {
            return (ArrowPosition) Enum.valueOf(ArrowPosition.class, str);
        }

        public static ArrowPosition[] values() {
            return (ArrowPosition[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/BiliGuideBubble$a.class */
    public interface a {
        void onClick();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/BiliGuideBubble$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81760a;

        static {
            int[] iArr = new int[ArrowPosition.values().length];
            try {
                iArr[ArrowPosition.LeftAndTop.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ArrowPosition.Top.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ArrowPosition.RightAndTop.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ArrowPosition.Right.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ArrowPosition.RightAndBottom.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[ArrowPosition.Bottom.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[ArrowPosition.LeftAndBottom.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[ArrowPosition.Left.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            f81760a = iArr;
        }
    }

    @JvmOverloads
    public BiliGuideBubble() {
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public BiliGuideBubble(String str, View view, boolean z6, boolean z7, ArrowPosition arrowPosition, int i7, boolean z8, Context context, Function0 function0, int i8, String str2, int i9, int i10, int i11) throws NoWhenBranchMatchedException {
        IGenericProperties genericProperties;
        super(context);
        Function0 function02 = (i11 & 512) != 0 ? null : function0;
        i8 = (i11 & 1024) != 0 ? -1 : i8;
        String str3 = (i11 & 2048) != 0 ? null : str2;
        i9 = (i11 & 4096) != 0 ? -1 : i9;
        i10 = (i11 & 8192) != 0 ? -1 : i10;
        boolean z9 = (i11 & 16384) != 0;
        this.f81735a = view;
        this.f81736b = z7;
        this.f81737c = arrowPosition;
        this.f81738d = i7;
        this.f81739e = context;
        this.f81740f = function02;
        Lazy lazy = LazyKt.lazy(new r(this, 7));
        this.f81741g = lazy;
        this.h = LazyKt.lazy(new s(this, 5));
        this.f81742i = LazyKt.lazy(new D(this, 1));
        Lazy lazy2 = LazyKt.lazy(new E(this, 1));
        this.f81743j = lazy2;
        this.f81748o = 5000L;
        this.f81755v = -1;
        this.f81756w = new CopyOnWriteArrayList<>();
        setOutsideTouchable(true);
        View viewInflate = LayoutInflater.from(context).inflate(2131501167, (ViewGroup) null, false);
        final int i12 = 0;
        viewInflate.setOnClickListener(new View.OnClickListener(this, i12) { // from class: com.bilibili.playerbizcommonv2.guideBubble.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f81762b;

            {
                this.f81761a = i12;
                this.f81762b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f81761a) {
                    case 0:
                        BiliGuideBubble.a aVar = ((BiliGuideBubble) this.f81762b).f81747n;
                        if (aVar != null) {
                            aVar.onClick();
                        }
                        break;
                    default:
                        ((OrderGameInfoSelectionDialogFragment) this.f81762b).dismissAllowingStateLoss();
                        break;
                }
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(2131312912);
        this.f81757x = textView;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(2131297134);
        this.f81758y = constraintLayout;
        ImageView imageView = (ImageView) viewInflate.findViewById(2131317447);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(2131296867);
        BiliImageView biliImageViewFindViewById = viewInflate.findViewById(2131301546);
        this.f81732A = biliImageViewFindViewById;
        if (i8 > 0 && constraintLayout != null) {
            constraintLayout.getLayoutParams().height = i8;
        }
        if (str3 == null || str3.length() == 0) {
            Drawable drawable = ContextCompat.getDrawable(context, 2131242039);
            if (drawable != null && biliImageViewFindViewById != null && (genericProperties = biliImageViewFindViewById.getGenericProperties()) != null) {
                genericProperties.setImage(drawable);
            }
        } else if (biliImageViewFindViewById != null) {
            com.bilibili.ad.adview.videodetail.relate.card92.c.a(BiliImageLoader.INSTANCE, context, str3, biliImageViewFindViewById);
        }
        if (i9 > 0 && biliImageViewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = biliImageViewFindViewById.getLayoutParams();
            layoutParams.width = i9;
            layoutParams.height = i9;
        }
        if (i10 > 0 && textView != null) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i10);
            }
            textView.setLayoutParams(marginLayoutParams);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(2131317453);
        this.f81759z = constraintLayout2;
        ImageView imageView3 = (ImageView) viewInflate.findViewById(2131298371);
        View viewFindViewById = viewInflate.findViewById(2131302531);
        this.f81733B = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131302533);
        this.f81734C = viewFindViewById2;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new com.bilibili.bililive.room.ui.roomv3.player.controller.widget.d(this, 1));
        }
        if (!StringsKt.isBlank(str) && textView != null) {
            textView.setText(str);
        }
        if (z8) {
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(context, R$color.Ga10_u));
            }
            if (constraintLayout != null) {
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Wh0_u)));
            }
            if (imageView != null) {
                imageView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Wh0_u)));
            }
            if (imageView2 != null) {
                imageView2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Wh0_u)));
            }
            if (imageView3 != null) {
                imageView3.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Text3)));
            }
        } else {
            if (textView != null) {
                textView.setTextColor(ContextCompat.getColor(context, R$color.Wh0_u));
            }
            if (constraintLayout != null) {
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Ga9_u)));
            }
            if (imageView != null) {
                imageView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Ga9_u)));
            }
            if (imageView2 != null) {
                imageView2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Ga9_u)));
            }
            if (constraintLayout != null) {
                constraintLayout.setAlpha(0.9f);
            }
            if (imageView != null) {
                imageView.setAlpha(0.9f);
            }
            if (imageView2 != null) {
                imageView2.setAlpha(0.9f);
            }
            if (imageView3 != null) {
                imageView3.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.Wh0_u)));
            }
        }
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f81750q = true;
        this.f81746m = viewInflate;
        if (constraintLayout != null && imageView != null && viewFindViewById != null && viewFindViewById2 != null) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
            switch (b.f81760a[arrowPosition.ordinal()]) {
                case 1:
                    imageView.setScaleY(-1.0f);
                    layoutParams3.endToEnd = -1;
                    layoutParams3.topToBottom = -1;
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) constraintLayout.getLayoutParams();
                    layoutParams4.topToTop = -1;
                    layoutParams4.topToBottom = imageView.getId();
                    constraintLayout.setLayoutParams(layoutParams4);
                    layoutParams3.bottomToTop = constraintLayout.getId();
                    layoutParams3.setMarginStart(((Integer) lazy2.getValue()).intValue());
                    if (z9 && z6) {
                        b();
                    }
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 2:
                    imageView.setScaleY(-1.0f);
                    layoutParams3.topToBottom = -1;
                    ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) constraintLayout.getLayoutParams();
                    layoutParams5.topToTop = -1;
                    layoutParams5.topToBottom = imageView.getId();
                    constraintLayout.setLayoutParams(layoutParams5);
                    layoutParams3.bottomToTop = constraintLayout.getId();
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 3:
                    imageView.setScaleY(-1.0f);
                    layoutParams3.topToBottom = -1;
                    layoutParams3.startToStart = -1;
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) constraintLayout.getLayoutParams();
                    layoutParams6.topToTop = -1;
                    layoutParams6.topToBottom = imageView.getId();
                    constraintLayout.setLayoutParams(layoutParams6);
                    layoutParams3.bottomToTop = constraintLayout.getId();
                    layoutParams3.setMarginEnd(((Integer) lazy2.getValue()).intValue());
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 4:
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 5:
                    layoutParams3.startToStart = -1;
                    layoutParams3.setMarginEnd(((Integer) lazy2.getValue()).intValue());
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 6:
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 7:
                    layoutParams3.endToEnd = -1;
                    layoutParams3.setMarginStart(((Integer) lazy2.getValue()).intValue());
                    if (z9 && z6) {
                        b();
                    }
                    imageView.setLayoutParams(layoutParams3);
                    break;
                case 8:
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        imageView2.setScaleX(-1.0f);
                        ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) imageView2.getLayoutParams();
                        layoutParams7.startToEnd = -1;
                        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) constraintLayout.getLayoutParams();
                        layoutParams8.startToStart = -1;
                        layoutParams8.endToEnd = 0;
                        layoutParams8.startToEnd = imageView2.getId();
                        constraintLayout.setLayoutParams(layoutParams8);
                        layoutParams7.endToStart = viewFindViewById.getId();
                        imageView.setVisibility(8);
                        imageView2.setLayoutParams(layoutParams7);
                    }
                    imageView.setLayoutParams(layoutParams3);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (constraintLayout2 != null && constraintLayout2.getVisibility() == 0) {
            constraintLayout2.setVisibility(8);
            ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
            if (constraintLayout != null) {
                layoutParams9.endToEnd = constraintLayout.getId();
            }
            layoutParams9.setMarginEnd(((Number) lazy.getValue()).intValue());
            if (textView != null) {
                textView.setLayoutParams(layoutParams9);
            }
        }
        if (!z6) {
            if (biliImageViewFindViewById != null) {
                biliImageViewFindViewById.setVisibility(8);
            }
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
            if (constraintLayout != null) {
                layoutParams10.startToStart = constraintLayout.getId();
            }
            layoutParams10.setMarginStart(((Number) lazy.getValue()).intValue());
            if (textView != null) {
                textView.setLayoutParams(layoutParams10);
            }
        }
        viewInflate.measure(0, 0);
        if (z7) {
            viewInflate.setPivotX(viewInflate.getMeasuredWidth() - DpUtils.dp2px(context, 36.0f));
            viewInflate.setPivotY(viewInflate.getMeasuredHeight());
            viewInflate.setVisibility(8);
            viewInflate.setScaleX(0.0f);
            viewInflate.setScaleY(0.0f);
        }
        setContentView(viewInflate);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        LifecycleCoroutineScope lifecycleScope = lifecycleOwner != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner) : null;
        if (lifecycleScope != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        }
    }

    public final void a() {
        View view = this.f81746m;
        if (view == null) {
            return;
        }
        com.bilibili.bplus.followinglist.inline.panel.a aVar = this.f81751r;
        if (aVar == null) {
            aVar = new com.bilibili.bplus.followinglist.inline.panel.a(this, 1);
            this.f81751r = aVar;
        }
        view.removeCallbacks(aVar);
        view.post(aVar);
    }

    public final void b() {
        ConstraintLayout constraintLayout = this.f81759z;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        BiliImageView biliImageView = this.f81732A;
        if (biliImageView != null) {
            biliImageView.setScaleX(-1.0f);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) biliImageView.getLayoutParams();
            layoutParams.startToStart = -1;
            layoutParams.endToStart = -1;
            ConstraintLayout constraintLayout2 = this.f81758y;
            if (constraintLayout2 != null) {
                layoutParams.endToEnd = constraintLayout2.getId();
            }
            layoutParams.setMarginEnd(((Number) this.h.getValue()).intValue());
            layoutParams.setMarginStart(((Number) this.f81742i.getValue()).intValue());
            TextView textView = this.f81757x;
            if (textView != null) {
                layoutParams.startToEnd = textView.getId();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.startToEnd = -1;
                layoutParams2.startToStart = this.f81758y.getId();
                layoutParams2.endToStart = biliImageView.getId();
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(((Number) this.f81741g.getValue()).intValue());
                textView.setLayoutParams(layoutParams2);
            }
            biliImageView.setLayoutParams(layoutParams);
        }
    }

    public final void c(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        if (this.f81756w.contains(onDismissListener)) {
            return;
        }
        this.f81756w.add(onDismissListener);
    }

    public final int d(float f7) {
        return (int) I1.a(this.f81739e, 1, f7);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        if (isShowing()) {
            System.currentTimeMillis();
            View view = this.f81746m;
            if (view != null) {
                view.removeCallbacks(this.f81749p);
            }
            View view2 = this.f81746m;
            if (view2 != null) {
                view2.removeCallbacks(this.f81751r);
            }
            com.bilibili.playerbizcommonv2.guideBubble.b bVar = this.f81753t;
            if (bVar != null && (viewTreeObserver = this.f81735a.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(bVar);
            }
            d dVar = this.f81754u;
            if (dVar != null) {
                this.f81735a.getViewTreeObserver().removeOnWindowAttachListener(dVar);
            }
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                }
            }
            super.dismiss();
            Iterator<PopupWindow.OnDismissListener> it = this.f81756w.iterator();
            while (it.hasNext()) {
                it.next().onDismiss();
            }
            Function0<Unit> function0 = this.f81740f;
            if (function0 != null) {
                function0.invoke();
            }
            this.f81756w.clear();
        }
    }

    public final void e(@Px int i7, @Px int i8) {
        AnimatorSet animatorSet;
        if (this.f81746m == null) {
            return;
        }
        System.currentTimeMillis();
        this.f81744k = 6160L;
        Rect rect = new Rect();
        if (!this.f81735a.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return;
        }
        showAsDropDown(this.f81735a, i7, i8);
        View view = this.f81746m;
        if (view != null && this.f81736b) {
            c(new PopupWindow.OnDismissListener(this) { // from class: com.bilibili.playerbizcommonv2.guideBubble.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliGuideBubble f81764a;

                {
                    this.f81764a = this;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    BiliGuideBubble biliGuideBubble = this.f81764a;
                    AnimatorSet animatorSet2 = biliGuideBubble.f81745l;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    biliGuideBubble.f81745l = null;
                }
            });
            AnimatorSet animatorSet2 = this.f81745l;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.f81745l) != null) {
                animatorSet.end();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setStartDelay(5390L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(300L);
            objectAnimatorOfFloat4.setStartDelay(5390L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(300L);
            objectAnimatorOfFloat5.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat6.setDuration(300L);
            objectAnimatorOfFloat6.setStartDelay(5390L);
            view.setVisibility(0);
            animatorSet3.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            animatorSet3.start();
            this.f81745l = animatorSet3;
        }
    }

    public final int f(@NotNull String str) {
        TextView textView = this.f81757x;
        if (textView != null) {
            return Math.min((int) textView.getPaint().measureText(str), NewPlayerUtilsKt.toPx(220));
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.ViewTreeObserver$OnScrollChangedListener, com.bilibili.playerbizcommonv2.guideBubble.b] */
    @Override // android.widget.PopupWindow
    public final void showAsDropDown(@Nullable View view, int i7, int i8, int i9) {
        super.showAsDropDown(view, i7, i8, i9);
        View view2 = this.f81746m;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = this.f81746m;
        if (view3 != null) {
            view3.getViewTreeObserver().addOnGlobalLayoutListener(new e(view3, this));
            if (this.f81750q) {
                ?? r02 = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: com.bilibili.playerbizcommonv2.guideBubble.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliGuideBubble f81763a;

                    {
                        this.f81763a = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        this.f81763a.a();
                    }
                };
                this.f81735a.getViewTreeObserver().addOnScrollChangedListener(r02);
                this.f81753t = r02;
                d dVar = new d(this);
                this.f81735a.getViewTreeObserver().addOnWindowAttachListener(dVar);
                this.f81754u = dVar;
            }
        }
        long j7 = this.f81748o;
        if (j7 > 0) {
            Runnable a7 = new A(this, 1);
            this.f81749p = a7;
            View view4 = this.f81746m;
            if (view4 != null) {
                if (this.f81736b) {
                    j7 = this.f81744k;
                }
                view4.postDelayed(a7, j7);
            }
        }
    }
}
