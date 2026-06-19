package com.bilibili.ogv.review.reviewpublish;

import KS0.y;
import Vh0.InterfaceC2953a;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareResult;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.ogv.pub.community.Area;
import com.bilibili.ogv.pub.review.bean.MediaEpisodeIndex;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import com.bilibili.ogv.review.reviewpublish.ReviewShareFragment;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment.class */
@StabilityInferred(parameters = 0)
public final class ReviewShareFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReviewShareData f72466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f72467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f72468d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f72472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Al0.a f72473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f72474k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public PinnedBottomScrollingBehavior f72476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public File f72477n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final KProperty<Object>[] f72465q = {new PropertyReference1Impl(ReviewShareFragment.class, "background", "getBackground()Lcom/bilibili/lib/image2/view/BiliImageView;", 0), new PropertyReference1Impl(ReviewShareFragment.class, "posterImage", "getPosterImage()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl(ReviewShareFragment.class, "bottomBar", "getBottomBar()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f72464p = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Map<String, String> f72469e = MapsKt.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72470f = 2131297134;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f72471g = 2131309182;
    public final int h = 2131311176;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public Function0<Boolean> f72475l = new y(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final b f72478o = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$b.class */
    public static final class b extends ShareHelper.SimpleCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReviewShareFragment f72479a;

        public b(ReviewShareFragment reviewShareFragment) {
            this.f72479a = reviewShareFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.os.Bundle getShareContent(java.lang.String r8) {
            /*
                Method dump skipped, instruction units count: 383
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.ReviewShareFragment.b.getShareContent(java.lang.String):android.os.Bundle");
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final void onShareFail(String str, ShareResult shareResult) {
            super.onShareFail(str, shareResult);
            ToastHelper.showToastLong(this.f72479a.requireContext(), 2131857121);
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.SimpleCallback, com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final void onShareSuccess(String str, ShareResult shareResult) {
            super.onShareSuccess(str, shareResult);
            ToastHelper.showToastLong(this.f72479a.requireContext(), 2131857149);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$c.class */
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f72480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReviewShareFragment f72481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f72482c;

        public c(View view, ReviewShareFragment reviewShareFragment, View view2) {
            this.f72480a = view;
            this.f72481b = reviewShareFragment;
            this.f72482c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f72480a.removeOnAttachStateChangeListener(this);
            this.f72481b.f72476m = Ll0.a.a(this.f72482c);
            ReviewShareFragment reviewShareFragment = this.f72481b;
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = reviewShareFragment.f72476m;
            if (pinnedBottomScrollingBehavior != null) {
                int i7 = reviewShareFragment.h;
                KProperty<Object> kProperty = ReviewShareFragment.f72465q[2];
                pinnedBottomScrollingBehavior.addPinnedView(Dj0.a.a(i7, reviewShareFragment));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object hf(com.bilibili.ogv.review.reviewpublish.ReviewShareFragment r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.ReviewShareFragment.hf(com.bilibili.ogv.review.reviewpublish.ReviewShareFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f72467c = requireArguments().getBoolean("is_newly_published_review", false);
        String string = requireArguments().getString("page_name");
        String str = string;
        if (string == null) {
            str = "pgc.pgc-video-detail-text";
        }
        this.f72468d = str;
        this.f72466b = (ReviewShareData) requireArguments().getParcelable("data");
        this.f72474k = requireArguments().getBoolean("should_show_background", false);
        ReviewShareData reviewShareData = this.f72466b;
        ReviewShareData reviewShareData2 = reviewShareData;
        if (reviewShareData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData2 = null;
        }
        Pair pair = TuplesKt.to("season_id", String.valueOf(reviewShareData2.f71746m));
        ReviewShareData reviewShareData3 = this.f72466b;
        ReviewShareData reviewShareData4 = reviewShareData3;
        if (reviewShareData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData4 = null;
        }
        this.f72469e = MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("season_type", String.valueOf(reviewShareData4.f71747n))});
        ReviewShareData reviewShareData5 = this.f72466b;
        ReviewShareData reviewShareData6 = reviewShareData5;
        if (reviewShareData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData6 = null;
        }
        String str2 = reviewShareData6.f71735a;
        ReviewShareData reviewShareData7 = this.f72466b;
        ReviewShareData reviewShareData8 = reviewShareData7;
        if (reviewShareData7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData8 = null;
        }
        float f7 = reviewShareData8.f71741g;
        ReviewShareData reviewShareData9 = this.f72466b;
        if (reviewShareData9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData9 = null;
        }
        this.f72472i = new i(str2, reviewShareData9.f71736b, f7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499854, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = this.f72476m;
        if (pinnedBottomScrollingBehavior != null) {
            int i7 = this.h;
            KProperty<Object> kProperty = f72465q[2];
            pinnedBottomScrollingBehavior.removePinnedView(Dj0.a.a(i7, this));
        }
        this.f72476m = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Bitmap bitmapA;
        super.onViewCreated(view, bundle);
        if (view.isAttachedToWindow()) {
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorA = Ll0.a.a(view);
            this.f72476m = pinnedBottomScrollingBehaviorA;
            if (pinnedBottomScrollingBehaviorA != null) {
                int i7 = this.h;
                KProperty<Object> kProperty = f72465q[2];
                pinnedBottomScrollingBehaviorA.addPinnedView(Dj0.a.a(i7, this));
            }
        } else {
            view.addOnAttachStateChangeListener(new c(view, this, view));
        }
        int i8 = this.f72470f;
        KProperty<Object>[] kPropertyArr = f72465q;
        KProperty<Object> kProperty2 = kPropertyArr[0];
        Dj0.a.a(i8, this).getLayoutParams().height = requireContext().getResources().getDisplayMetrics().heightPixels;
        view.findViewById(2131311173).setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ogv.review.reviewpublish.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReviewShareFragment f72527a;

            {
                this.f72527a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewShareFragment reviewShareFragment = this.f72527a;
                String str = reviewShareFragment.f72468d;
                if (str != null && reviewShareFragment.f72467c) {
                    Neurons.reportClick(false, str.concat(".short-review.share.click"), reviewShareFragment.f72469e);
                }
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(reviewShareFragment), (CoroutineContext) null, (CoroutineStart) null, new ReviewShareFragment$onViewCreated$2$1(reviewShareFragment, null), 3, (Object) null);
            }
        });
        ((CheckBox) view.findViewById(2131296786)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.ogv.review.reviewpublish.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReviewShareFragment f72528a;

            {
                this.f72528a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                ReviewShareFragment reviewShareFragment = this.f72528a;
                ReviewShareFragment.a aVar = ReviewShareFragment.f72464p;
                AccountInfo accountInfoFromCache = com.bilibili.ogv.infra.account.a.f67851a.getAccountInfoFromCache();
                boolean z7 = false;
                if (accountInfoFromCache != null) {
                    ReviewShareData reviewShareData = reviewShareFragment.f72466b;
                    ReviewShareData reviewShareData2 = reviewShareData;
                    if (reviewShareData == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        reviewShareData2 = null;
                    }
                    z7 = false;
                    if (reviewShareData2.f71744k == accountInfoFromCache.getMid()) {
                        z7 = true;
                    }
                }
                if (!z6) {
                    i iVar = reviewShareFragment.f72472i;
                    i iVar2 = iVar;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        iVar2 = null;
                    }
                    ReviewShareData reviewShareData3 = reviewShareFragment.f72466b;
                    ReviewShareData reviewShareData4 = reviewShareData3;
                    if (reviewShareData3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        reviewShareData4 = null;
                    }
                    iVar2.m(reviewShareData4.f71742i);
                } else if (z7) {
                    i iVar3 = reviewShareFragment.f72472i;
                    i iVar4 = iVar3;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        iVar4 = null;
                    }
                    iVar4.m(reviewShareFragment.getString(2131844630));
                } else {
                    i iVar5 = reviewShareFragment.f72472i;
                    i iVar6 = iVar5;
                    if (iVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        iVar6 = null;
                    }
                    iVar6.m(reviewShareFragment.getString(2131857172));
                }
                reviewShareFragment.f72477n = null;
            }
        });
        View viewFindViewById = view.findViewById(2131298371);
        viewFindViewById.setVisibility(0);
        final int i9 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this, i9) { // from class: com.bilibili.ogv.review.reviewpublish.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f72529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f72530b;

            {
                this.f72529a = i9;
                this.f72530b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentActivity fragmentActivityP3;
                switch (this.f72529a) {
                    case 0:
                        ReviewShareFragment reviewShareFragment = (ReviewShareFragment) this.f72530b;
                        if (!((Boolean) reviewShareFragment.f72475l.invoke()).booleanValue() && (fragmentActivityP3 = reviewShareFragment.p3()) != null) {
                            fragmentActivityP3.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        uf1.f fVar = (uf1.f) this.f72530b;
                        fVar.getClass();
                        Boolean boolValueOf = uf1.f.i == null ? Boolean.FALSE : Boolean.valueOf(!r0.booleanValue());
                        uf1.f.i = boolValueOf;
                        fVar.v0(boolValueOf.booleanValue());
                        break;
                }
            }
        });
        ReviewShareData reviewShareData = this.f72466b;
        ReviewShareData reviewShareData2 = reviewShareData;
        if (reviewShareData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData2 = null;
        }
        String str = reviewShareData2.f71737c;
        i iVar = this.f72472i;
        i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            iVar2 = null;
        }
        ReviewShareData reviewShareData3 = this.f72466b;
        ReviewShareData reviewShareData4 = reviewShareData3;
        if (reviewShareData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData4 = null;
        }
        iVar2.m(reviewShareData4.f71742i);
        int i10 = this.f72471g;
        KProperty<Object> kProperty3 = kPropertyArr[1];
        Al0.a aVarBind = Al0.a.bind(((ViewGroup) Dj0.a.a(i10, this)).getChildAt(0));
        this.f72473j = aVarBind;
        Al0.a aVar = aVarBind;
        if (aVarBind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("posterViewBinding");
            aVar = null;
        }
        aVar.f341z.setBackground(new com.bilibili.ogv.review.reviewpublish.a());
        Al0.a aVar2 = this.f72473j;
        Al0.a aVar3 = aVar2;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("posterViewBinding");
            aVar3 = null;
        }
        aVar3.q(iVar2);
        if (!Intrinsics.areEqual(str, iVar2.f72535d)) {
            iVar2.f72535d = str;
            iVar2.notifyPropertyChanged(134);
        }
        if (this.f72474k) {
            ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(this).url(str);
            int i11 = this.f72470f;
            KProperty<Object> kProperty4 = kPropertyArr[0];
            imageRequestBuilderUrl.into(Dj0.a.a(i11, this));
        }
        ReviewShareData reviewShareData5 = this.f72466b;
        ReviewShareData reviewShareData6 = reviewShareData5;
        if (reviewShareData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData6 = null;
        }
        String str2 = reviewShareData6.f71743j;
        if (!Intrinsics.areEqual(str2, iVar2.f72536e)) {
            iVar2.f72536e = str2;
            iVar2.notifyPropertyChanged(28);
        }
        ReviewShareData reviewShareData7 = this.f72466b;
        ReviewShareData reviewShareData8 = reviewShareData7;
        if (reviewShareData7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData8 = null;
        }
        CharSequence charSequenceA = com.bilibili.ogv.infra.util.i.a(reviewShareData8.f71748o);
        ReviewShareData reviewShareData9 = this.f72466b;
        ReviewShareData reviewShareData10 = reviewShareData9;
        if (reviewShareData9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData10 = null;
        }
        Area area = (Area) CollectionsKt.firstOrNull(reviewShareData10.f71745l);
        CharSequence charSequenceA2 = com.bilibili.ogv.infra.util.i.a(area != null ? area.f71487b : null);
        ReviewShareData reviewShareData11 = this.f72466b;
        ReviewShareData reviewShareData12 = reviewShareData11;
        if (reviewShareData11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData12 = null;
        }
        CharSequence charSequenceA3 = com.bilibili.ogv.infra.util.i.a(CollectionsKt.p(reviewShareData12.f71739e, " ", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        ReviewShareData reviewShareData13 = this.f72466b;
        ReviewShareData reviewShareData14 = reviewShareData13;
        if (reviewShareData13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData14 = null;
        }
        MediaEpisodeIndex mediaEpisodeIndex = reviewShareData14.f71749p;
        String strP = CollectionsKt.p(CollectionsKt.listOfNotNull(new String[]{charSequenceA, charSequenceA2, charSequenceA3, com.bilibili.ogv.infra.util.i.a(mediaEpisodeIndex != null ? mediaEpisodeIndex.a() : null)}), " | ", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
        if (!Intrinsics.areEqual(strP, iVar2.f72537f)) {
            iVar2.f72537f = strP;
            iVar2.notifyPropertyChanged(160);
        }
        ReviewShareData reviewShareData15 = this.f72466b;
        ReviewShareData reviewShareData16 = reviewShareData15;
        if (reviewShareData15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData16 = null;
        }
        String str3 = reviewShareData16.f71738d;
        if (str3.length() > 0) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, 42.0f, getResources().getDisplayMetrics());
            InterfaceC2953a interfaceC2953a = (InterfaceC2953a) BLRouter.INSTANCE.get(InterfaceC2953a.class, "default");
            if (interfaceC2953a == null) {
                BLog.e("QRCodeGenerator-generateQRCode", "[ogv-glue-QRCodeGenerator-generateQRCode] QRCode service not available.", (Throwable) null);
                bitmapA = null;
            } else {
                bitmapA = interfaceC2953a.a(Math.max(iApplyDimension, 0), Math.max(iApplyDimension, 0), -14606047, str3);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapA);
            if (!Intrinsics.areEqual(bitmapDrawable, iVar2.f72538g)) {
                iVar2.f72538g = bitmapDrawable;
                iVar2.notifyPropertyChanged(465);
            }
        }
        ReviewShareData reviewShareData17 = this.f72466b;
        ReviewShareData reviewShareData18 = reviewShareData17;
        if (reviewShareData17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData18 = null;
        }
        String str4 = reviewShareData18.f71740f;
        if (!Intrinsics.areEqual(str4, iVar2.f72540j)) {
            iVar2.f72540j = str4;
            iVar2.notifyPropertyChanged(490);
        }
        ReviewShareData reviewShareData19 = this.f72466b;
        ReviewShareData reviewShareData20 = reviewShareData19;
        if (reviewShareData19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            reviewShareData20 = null;
        }
        float f7 = reviewShareData20.h;
        if (f7 > 0.0f) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f7)}, 1)));
            spannableString.setSpan(new AbsoluteSizeSpan(MathKt.roundToInt(Uj0.c.c(18, requireContext()))), 0, spannableString.length(), 0);
            spannableString.setSpan(new Gj0.a((Typeface) Uj0.e.f24761a.getValue()), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString);
            SpannableString spannableString2 = new SpannableString(getString(2131857171));
            spannableString.setSpan(new AbsoluteSizeSpan(MathKt.roundToInt(Uj0.c.c(10, requireContext()))), 0, spannableString2.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString2);
            if (!Intrinsics.areEqual(spannableStringBuilder, iVar2.f72539i)) {
                iVar2.f72539i = spannableStringBuilder;
                iVar2.notifyPropertyChanged(524);
            }
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new ReviewShareFragment$preparePictures$1(iVar2, this, null), 3, (Object) null);
        String str5 = this.f72468d;
        if (str5 == null || !this.f72467c) {
            return;
        }
        Neurons.reportExposure$default(false, str5.concat(".short-review.share.show"), this.f72469e, (List) null, 8, (Object) null);
    }
}
