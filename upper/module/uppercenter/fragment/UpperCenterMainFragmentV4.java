package com.bilibili.upper.module.uppercenter.fragment;

import EV.t;
import F3.C1745h4;
import GA0.a;
import TE0.b;
import VI0.p;
import WI0.C2989g0;
import WI0.C2991h0;
import WI0.H;
import WI0.I;
import YI0.e;
import YI0.f;
import YI0.g;
import ZI0.g;
import aJ0.d;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bJ0.C5096a;
import bJ0.C5097b;
import com.alibaba.fastjson.JSON;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.gemini.ui.UIComponentDialog;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.bililive.biz.rights.combo.LiveComboController;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.common.hilowebview.utils.TimeLineTag;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.player.tangram.playercore.C5774b;
import com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityInfoUIComponent;
import com.bilibili.playerbizcommonv2.widget.quality.HDRType;
import com.bilibili.playerbizcommonv2.widget.quality.QualityDolbyInfoComponent;
import com.bilibili.playerbizcommonv2.widget.quality.j0;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.C6625x;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.api.bean.Convention;
import com.bilibili.upper.api.bean.centerv4.UpperCenterIndexResV4;
import com.bilibili.upper.api.bean.centerv4.UpperMainUpInfoBean;
import com.bilibili.upper.feat.gamefactory.manager.GameFactoryManager;
import com.bilibili.upper.module.contribute.picker.v3.AlbumFolder;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumChooseContainerFragment;
import com.bilibili.upper.module.uppercenter.fragment.UpperCenterMainFragmentV4;
import com.bilibili.upper.module.uppercenter.model.UpperCenterViewModel;
import com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient;
import com.bilibili.video.story.player.quality.StoryQualityListDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kntr.app.article.publish.core.g0;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.splash.event.Action;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;
import yW.h;
import yW.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterMainFragmentV4.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterMainFragmentV4 extends BaseSwipeRecyclerViewFragmentWithGradient {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f114089m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public UpperCenterIndexResV4 f114092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f114093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public d f114094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f114095s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f114097u;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f114090n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final p f114091o = new p();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f114096t = LazyKt.lazy(new g(this, 0));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterMainFragmentV4$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f114098a;

        public a(Function1 function1) {
            this.f114098a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f114098a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f114098a.invoke(obj);
        }
    }

    @Override // com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient
    public final void jf() {
        b bVar = b.f24088a;
        int i7 = lf().f114112d;
        bVar.getClass();
        String str = i7 == 1 ? "creation.creation-new-first.convention.0.click" : "creation.creation-new-subsequent.convention.0.click";
        HashMap map = new HashMap();
        map.put("up_type", String.valueOf(i7));
        Neurons.reportClick(false, str, map);
    }

    @Override // com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient
    public final void kf() {
        b bVar = b.f24088a;
        int i7 = lf().f114112d;
        bVar.getClass();
        String str = i7 == 1 ? "creation.creation-new-first.notice.0.click" : "creation.creation-new-subsequent.notice.0.click";
        HashMap map = new HashMap();
        map.put("up_type", String.valueOf(i7));
        Neurons.reportClick(false, str, map);
    }

    public final UpperCenterViewModel lf() {
        return (UpperCenterViewModel) this.f114096t.getValue();
    }

    public final boolean mf() {
        Bundle arguments = getArguments();
        boolean z6 = false;
        if (arguments != null) {
            z6 = arguments.getBoolean("isEmbedded", false);
        }
        return z6;
    }

    public final void nf(boolean z6) {
        if (z6) {
            LoadingImageView loadingImageView = this.f114304c;
            if (loadingImageView != null) {
                loadingImageView.hideRefreshError();
                loadingImageView.setVisibility(8);
            }
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f114309i;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            RecyclerView recyclerView = this.f114306e;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        LoadingImageView loadingImageView2 = this.f114304c;
        if (loadingImageView2 != null) {
            loadingImageView2.setVisibility(0);
            loadingImageView2.setRefreshError();
        }
        ImageView imageView3 = this.h;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f114309i;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.f114306e;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean of(com.bilibili.upper.api.bean.OpenScreen r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenter.fragment.UpperCenterMainFragmentV4.of(com.bilibili.upper.api.bean.OpenScreen):boolean");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        ConcurrentHashMap concurrentHashMap = j.a;
        h hVarA = j.a(UUID.randomUUID().toString());
        this.f114093q = hVarA;
        hVarA.c((Long) null, TimeLineTag.ActivityCreate.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f114095s) {
            Intent intent = new Intent("finish_uper_transparent_web_act_action");
            Context context = getContext();
            intent.setPackage(context != null ? context.getPackageName() : null);
            Context context2 = getContext();
            if (context2 != null) {
                context2.sendBroadcast(intent);
            }
        }
        ZI0.g.f29597a.cancel();
        BLog.e("TaskCenterJsBehavior", "is fragment destroy ,object is " + this);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            fragmentActivityP3 = null;
        }
        if (fragmentActivityP3 != null && Intrinsics.areEqual(C5096a.f56466f, fragmentActivityP3)) {
            BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = C5096a.f56461a;
            if (biliWebViewConfigHolderV2 != null) {
                biliWebViewConfigHolderV2.destroyWebView();
            }
            if (C5096a.f56466f != null) {
                C5096a.f56466f = null;
            }
            C5096a.f56465e = 2;
            C5096a.f56467g = 0L;
            C5096a.f56463c = 0;
            C5096a.f56464d = false;
        }
        C2989g0 c2989g0 = this.f114091o.f25515e;
        if (c2989g0 != null) {
            c2989g0.itemView.removeOnLayoutChangeListener(c2989g0.f26738n);
            c2989g0.f26733i = null;
            c2989g0.f26734j = false;
            c2989g0.f26735k = false;
            ((LinkedHashMap) c2989g0.f26736l).clear();
            FrameLayout frameLayout = c2989g0.h;
            if (frameLayout != null) {
                ?? obj = new Object();
                ?? obj2 = new Object();
                BiliTemplateEngineManager biliTemplateEngineManager = c2989g0.f26737m;
                biliTemplateEngineManager.getClass();
                biliTemplateEngineManager.e(false, true, new C6625x(obj2, obj, biliTemplateEngineManager, frameLayout));
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        h hVar = this.f114093q;
        h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeLine");
            hVar2 = null;
        }
        hVar2.f("upper.timeline.native", MapsKt.mapOf(TuplesKt.to("page_name", "upper_centermain")), (Function0) null);
        ConcurrentHashMap concurrentHashMap = j.a;
        h hVar3 = this.f114093q;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeLine");
            hVar3 = null;
        }
        j.a.remove(hVar3.a);
        super.onDetach();
    }

    @Override // com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient
    public final void onRefresh() {
        super.onRefresh();
        lf().K0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        d dVar = this.f114094r;
        if (dVar != null && dVar.f31134i) {
            dVar.dismiss();
            this.f114094r = null;
        }
        if (this.f114089m) {
            b bVar = b.f24088a;
            int i7 = lf().f114112d;
            bVar.getClass();
            String str = i7 == 1 ? "creation.creation-new-first.0.0.pv" : "creation.creation-new-subsequent.0.0.pv";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("up_type", String.valueOf(i7));
            Neurons.reportPageView(false, str, "", 0, 0L, linkedHashMap, 0L, 0L);
        }
    }

    @Override // com.bilibili.upper.widget.BaseSwipeRecyclerViewFragmentWithGradient
    public final void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
        View view;
        View viewFindViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f114091o);
        Context context = getContext();
        recyclerView.setBackground(context != null ? ContextCompat.getDrawable(context, 2131104104) : null);
        recyclerView.setClipToPadding(false);
        PaddingUtilsKt.setPaddingBottom(recyclerView, mf() ? GarbManager.getCurBottomTabHeight(recyclerView.getContext()) : bG0.g.a(16, getContext()));
        TintSwipeRefreshLayout tintSwipeRefreshLayout = this.f114305d;
        if (tintSwipeRefreshLayout != null) {
            tintSwipeRefreshLayout.post(new t(this, 1));
        }
        this.f114308g = false;
        TextView textView = this.f114310j;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f114310j;
        if (textView2 != null) {
            textView2.setTextSize(18.0f);
        }
        ImageView imageView = this.f114309i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (mf() && (view = getView()) != null && (viewFindViewById = view.findViewById(2131302849)) != null) {
            viewFindViewById.setVisibility(8);
        }
        BLog.e("TaskCenterJsBehavior", "is fragment view created,isEmbedded=" + mf() + ", object is " + this);
        FragmentActivity fragmentActivityP3 = p3();
        C5096a.f56466f = fragmentActivityP3;
        C5096a.f56465e = 2;
        C5096a.f56463c = AdExtensions.getToPx(200);
        C5096a.h = new com.bilibili.upper.module.uppercenterlocal.service.d(new WeakReference(C5096a.f56466f));
        BiliWebView biliWebView = new BiliWebView(fragmentActivityP3);
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(biliWebView, (ProgressBar) null);
        C5096a.f56461a = biliWebViewConfigHolderV2;
        biliWebViewConfigHolderV2.configBiliWebSettings(Uri.parse("https://member.bilibili.com/york/create-home-page/mission-center/"), Foundation.Companion.instance().getApps().getVersionCode(), false);
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV22 = C5096a.f56461a;
        if (biliWebViewConfigHolderV22 != null) {
            biliWebViewConfigHolderV22.configBiliWebCookie();
        }
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV23 = C5096a.f56461a;
        if (biliWebViewConfigHolderV23 != null) {
            biliWebViewConfigHolderV23.enableWebContentDebug(false);
        }
        biliWebView.setWebChromeClient(new BiliWebViewConfigHolderV2.BiliWebChromeClient(biliWebViewConfigHolderV2));
        BiliWebViewConfigHolderV2.BiliWebViewClient biliWebViewClient = new BiliWebViewConfigHolderV2.BiliWebViewClient(biliWebViewConfigHolderV2);
        biliWebViewClient.f56468b = true;
        biliWebView.setWebViewClient(biliWebViewClient);
        com.bilibili.upper.module.uppercenterlocal.service.d dVar = C5096a.h;
        if (dVar != null) {
            biliWebView.registerPrivacyController(Reflection.getOrCreateKotlinClass(com.bilibili.upper.module.uppercenterlocal.service.a.class), dVar);
        }
        biliWebView.registerGlobalGetContainerInfoBehavior(new C5097b(fragmentActivityP3));
        biliWebView.loadUrl("https://member.bilibili.com/york/create-home-page/mission-center/");
        C5096a.f56467g = System.currentTimeMillis();
        b.f24088a.getClass();
        b.q(0L, "start");
        C5096a.f56462b = biliWebView;
        p pVar = this.f114091o;
        pVar.f25512b = new e(this, 0);
        pVar.f25514d = getViewLifecycleOwner().getLifecycle();
        if (getParentFragment() instanceof UpperCenterContainerFragment) {
            p pVar2 = this.f114091o;
            Fragment parentFragment = getParentFragment();
            UpperCenterContainerFragment upperCenterContainerFragment = parentFragment instanceof UpperCenterContainerFragment ? (UpperCenterContainerFragment) parentFragment : null;
            f fVar = null;
            if (upperCenterContainerFragment != null) {
                fVar = new f(upperCenterContainerFragment, 0);
            }
            pVar2.f25513c = fVar;
        }
        this.f114092p = lf().f114111c.getValue();
        final int i7 = 0;
        lf().f114111c.observe(getViewLifecycleOwner(), new a(new Function1(this, i7) { // from class: YI0.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28694b;

            {
                this.f28693a = i7;
                this.f28694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v278, types: [WI0.I, WI0.h0, java.lang.Object] */
            public final Object invoke(Object obj) {
                String strDd;
                Context context2;
                String link;
                Context context3;
                TextView textView3;
                UpperCenterIndexResV4.UpperHonorData upperHonorData;
                List honorBalls;
                Object next;
                UpperCenterIndexResV4.UpperHonorData upperHonorData2;
                List honorBalls2;
                UpperMainUpInfoBean.RatingInfo ratingInfo;
                final ImageView imageView2;
                Unit unit;
                Unit unit2;
                View viewRequireView;
                AlbumFolder albumFolder;
                String name;
                Object obj2 = this.f28694b;
                switch (this.f28693a) {
                    case 0:
                        UpperCenterIndexResV4 upperCenterIndexResV4 = (UpperCenterIndexResV4) obj;
                        final UpperCenterMainFragmentV4 upperCenterMainFragmentV4 = (UpperCenterMainFragmentV4) obj2;
                        upperCenterMainFragmentV4.setRefreshCompleted();
                        if (upperCenterIndexResV4 == null) {
                            upperCenterMainFragmentV4.nf(false);
                            yW.h hVar = upperCenterMainFragmentV4.f114093q;
                            if (hVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("timeLine");
                                hVar = null;
                            }
                            hVar.h = false;
                        } else {
                            if (upperCenterIndexResV4 == upperCenterMainFragmentV4.f114092p) {
                                upperCenterMainFragmentV4.f114092p = null;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                            upperCenterMainFragmentV4.f114092p = null;
                            upperCenterMainFragmentV4.f114089m = true;
                            final Convention convention = upperCenterIndexResV4.getConvention();
                            if (convention != null && (imageView2 = upperCenterMainFragmentV4.h) != null && imageView2.getVisibility() != 0) {
                                imageView2.setVisibility(0);
                                imageView2.setOnClickListener(new View.OnClickListener(imageView2, convention, upperCenterMainFragmentV4) { // from class: com.bilibili.upper.widget.b

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final ImageView f114479a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final Convention f114480b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final BaseSwipeRecyclerViewFragmentWithGradient f114481c;

                                    {
                                        this.f114479a = imageView2;
                                        this.f114480b = convention;
                                        this.f114481c = upperCenterMainFragmentV4;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        ImageView imageView3 = this.f114479a;
                                        Convention convention2 = this.f114480b;
                                        BaseSwipeRecyclerViewFragmentWithGradient baseSwipeRecyclerViewFragmentWithGradient = this.f114481c;
                                        a.C0040a.b(GA0.a.f6978a, imageView3.getContext(), convention2.url);
                                        baseSwipeRecyclerViewFragmentWithGradient.jf();
                                    }
                                });
                            }
                            upperCenterMainFragmentV4.nf(true);
                            UpperCenterIndexResV4.EstablishConnection establishCon = upperCenterIndexResV4.getEstablishCon();
                            if (establishCon == null || !establishCon.showEstablishEnter()) {
                                ImageView imageView3 = upperCenterMainFragmentV4.f114311k;
                                if (imageView3 != null) {
                                    imageView3.setVisibility(8);
                                }
                                ImageView imageView4 = upperCenterMainFragmentV4.f114311k;
                                if (imageView4 != null) {
                                    imageView4.setOnClickListener(null);
                                }
                            } else {
                                ImageView imageView5 = upperCenterMainFragmentV4.f114311k;
                                if (imageView5 != null) {
                                    imageView5.setVisibility(0);
                                }
                                ImageView imageView6 = upperCenterMainFragmentV4.f114311k;
                                if (imageView6 != null) {
                                    imageView6.setOnClickListener(new View.OnClickListener(0, upperCenterMainFragmentV4, establishCon) { // from class: YI0.j

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final int f28697a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final Object f28698b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final Object f28699c;

                                        {
                                            this.f28697a = i;
                                            this.f28698b = upperCenterMainFragmentV4;
                                            this.f28699c = establishCon;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (this.f28697a) {
                                                case 0:
                                                    UpperCenterMainFragmentV4 upperCenterMainFragmentV42 = (UpperCenterMainFragmentV4) this.f28698b;
                                                    UpperCenterIndexResV4.EstablishConnection establishConnection = (UpperCenterIndexResV4.EstablishConnection) this.f28699c;
                                                    if (!V.c()) {
                                                        TE0.b.f24088a.getClass();
                                                        Neurons.reportClick(false, "creation.creation-new-subsequent.personal-information.exclusive-helper.click", new HashMap());
                                                        Context context4 = upperCenterMainFragmentV42.getContext();
                                                        if (context4 != null) {
                                                            UpperCenterViewModel upperCenterViewModelLf = upperCenterMainFragmentV42.lf();
                                                            String permanentUrl = establishConnection.getPermanentUrl();
                                                            upperCenterViewModelLf.getClass();
                                                            UpperCenterViewModel.J0(context4, permanentUrl);
                                                            upperCenterMainFragmentV42.f114095s = true;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    Context context5 = (Context) this.f28698b;
                                                    StoryQualityListDialog storyQualityListDialog = (StoryQualityListDialog) this.f28699c;
                                                    if (com.bilibili.playerbizcommonv2.utils.p.b(context5)) {
                                                        KProperty<Object> kProperty = j0.f82844a[0];
                                                        PlayIndex playIndex = (PlayIndex) view2.getTag(j0.f82845b);
                                                        com.bilibili.player.tangram.basic.a aVarA = playIndex != null ? C5774b.a(playIndex) : null;
                                                        if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, SearchBangumiItem.TYPE_FULLNET_MOVIE)) {
                                                            storyQualityListDialog.getClass();
                                                            ComponentDialog componentDialog = new ComponentDialog(storyQualityListDialog.getContext(), 2131888863);
                                                            ((UIComponentDialog) componentDialog).a = new QualityDolbyInfoComponent(new com.bilibili.app.gemini.player.widget.progress.a(componentDialog, 3), new C1745h4(8), new m(1, componentDialog, storyQualityListDialog));
                                                            componentDialog.show();
                                                            storyQualityListDialog.dismiss();
                                                        } else if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY)) {
                                                            storyQualityListDialog.k(HDRType.HDR);
                                                        } else if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, 129)) {
                                                            storyQualityListDialog.k(HDRType.HDRVIVID);
                                                        } else if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, 100)) {
                                                            storyQualityListDialog.getClass();
                                                            ComponentDialog componentDialog2 = new ComponentDialog(storyQualityListDialog.getContext(), 2131888863);
                                                            ((UIComponentDialog) componentDialog2).a = new AIEnhancedQualityInfoUIComponent(new com.bilibili.video.story.player.quality.g(componentDialog2, storyQualityListDialog), new NJ0.d(componentDialog2, 3), new ExposureEntry(new com.bilibili.video.story.player.quality.c(0), new e(storyQualityListDialog, 2)));
                                                            componentDialog2.show();
                                                            storyQualityListDialog.dismiss();
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tv.danmaku.bili.ui.splash.event.b bVar = (tv.danmaku.bili.ui.splash.event.b) this.f28698b;
                                                    Action action = (Action) this.f28699c;
                                                    long jW = bVar.c.w();
                                                    if (jW > action.getInteractTime()) {
                                                        int iCoerceAtLeast = RangesKt.coerceAtLeast(action.getVideoSeekTo(), 0);
                                                        tv.danmaku.bili.ui.splash.event.a aVar = bVar.c;
                                                        aVar.seekTo(iCoerceAtLeast);
                                                        aVar.A4(action, false);
                                                    }
                                                    C0.c(jW, "on video action click current position :", "[EventSplash]ElementFactory");
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (!upperCenterMainFragmentV4.f114097u) {
                                    upperCenterMainFragmentV4.f114097u = true;
                                    Neurons.reportExposure$default(false, "creation.creation-new-subsequent.personal-information.exclusive-helper.show", VF0.b.a(TE0.b.f24088a), (List) null, 8, (Object) null);
                                }
                            }
                            UpperCenterViewModel upperCenterViewModelLf = upperCenterMainFragmentV4.lf();
                            List<UpperCenterIndexResV4.UpperCenterCard> modules = upperCenterIndexResV4.getModules();
                            upperCenterViewModelLf.getClass();
                            ArrayList arrayList = new ArrayList();
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            if (modules != null) {
                                for (UpperCenterIndexResV4.UpperCenterCard upperCenterCard : modules) {
                                    int type = upperCenterCard.getType();
                                    if (type == 1) {
                                        objectRef.element = new I(upperCenterCard.getType(), upperCenterViewModelLf.f114112d, upperCenterCard, upperCenterViewModelLf.f114114f);
                                    } else if (type != 7) {
                                        arrayList.add(new I(upperCenterCard.getType(), upperCenterViewModelLf.f114112d, upperCenterCard, null));
                                    } else {
                                        int type2 = upperCenterCard.getType();
                                        if (((Boolean) UpperFawkesDeviceDecision.f105477b.getValue()).booleanValue()) {
                                            UpperMainUpInfoBean upperMainUpInfoBean = (UpperMainUpInfoBean) JSON.parseObject(upperCenterCard.getData(), UpperMainUpInfoBean.class);
                                            if ((upperMainUpInfoBean == null || (ratingInfo = upperMainUpInfoBean.getRatingInfo()) == null) ? false : Intrinsics.areEqual(ratingInfo.getNew(), Boolean.TRUE)) {
                                                type2 = 1007;
                                            }
                                        }
                                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                        if (SI0.a.f22920a) {
                                            try {
                                                Iterator it = modules.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        if (((UpperCenterIndexResV4.UpperCenterCard) next).getType() == 100) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                UpperCenterIndexResV4.UpperCenterCard upperCenterCard2 = (UpperCenterIndexResV4.UpperCenterCard) next;
                                                if (upperCenterCard2 != null) {
                                                    UpperCenterIndexResV4.UpperHonorData upperHonorData3 = (UpperCenterIndexResV4.UpperHonorData) JSON.parseObject(upperCenterCard2.getData(), UpperCenterIndexResV4.UpperHonorData.class);
                                                    if (upperHonorData3 != null) {
                                                        String url = upperCenterCard2.getUrl();
                                                        String str = url;
                                                        if (url == null) {
                                                            str = "";
                                                        }
                                                        upperHonorData3.setJumpUrl(str);
                                                        upperHonorData2 = upperHonorData3;
                                                    } else {
                                                        upperHonorData2 = null;
                                                    }
                                                    objectRef2.element = upperHonorData2;
                                                }
                                            } catch (Exception e7) {
                                                e7.printStackTrace();
                                            }
                                        }
                                        UpperCenterIndexResV4.UpperHonorData upperHonorData4 = (UpperCenterIndexResV4.UpperHonorData) objectRef2.element;
                                        int i8 = type2;
                                        if ((upperHonorData4 == null || (honorBalls2 = upperHonorData4.getHonorBalls()) == null || !(honorBalls2.isEmpty() ^ true)) ? false : true) {
                                            i8 = type2 != 7 ? type2 != 1007 ? type2 : 2008 : 2007;
                                        }
                                        ?? i9 = new I(i8, upperCenterViewModelLf.f114112d, upperCenterCard, upperCenterViewModelLf.f114114f);
                                        i9.f26750e = upperHonorData4;
                                        objectRef.element = i9;
                                    }
                                }
                            }
                            I i10 = (I) objectRef.element;
                            if (i10 != null) {
                                arrayList.add(0, i10);
                            }
                            Object objFirst = CollectionsKt.first(arrayList);
                            C2991h0 c2991h0 = objFirst instanceof C2991h0 ? (C2991h0) objFirst : null;
                            if (((c2991h0 == null || (upperHonorData = c2991h0.f26750e) == null || (honorBalls = upperHonorData.getHonorBalls()) == null || !(honorBalls.isEmpty() ^ true)) ? false : true) && (textView3 = upperCenterMainFragmentV4.f114310j) != null) {
                                textView3.setTextColor(Color.parseColor("#18191C"));
                            }
                            g.a aVar = ZI0.g.f29597a;
                            UpperCenterViewModel upperCenterViewModelLf2 = upperCenterMainFragmentV4.lf();
                            if (C5096a.f56465e == 2) {
                                g.a aVar2 = ZI0.g.f29597a;
                                aVar2.cancel();
                                aVar2.start();
                                ZI0.g.f29598b = upperCenterViewModelLf2;
                            }
                            RecyclerView recyclerView2 = upperCenterMainFragmentV4.f114306e;
                            if (recyclerView2 != null) {
                                recyclerView2.setItemViewCacheSize(arrayList.size());
                            }
                            VI0.p pVar3 = upperCenterMainFragmentV4.f114091o;
                            ((ArrayList) pVar3.f25511a).clear();
                            ((ArrayList) pVar3.f25511a).addAll(arrayList);
                            Lazy lazy = zw0.b.f130950a;
                            DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
                            if (deviceDecision.getBoolean("uper.uper_createtive_center_rating", true)) {
                                int i11 = H.f26607l;
                                Application application = BiliContext.application();
                                if (application != null) {
                                    long jOptLong = BiliGlobalPreferenceHelper.getInstance(application).optLong("PREF_KEY_UPPER_CENTER_RATE_CLOSE_TIME", 0L);
                                    if (jOptLong != 0 && (strDd = deviceDecision.dd("uper.uper_user_rating_cooldown_seconds", "2592000")) != null) {
                                        if (System.currentTimeMillis() - jOptLong < Long.parseLong(strDd) * ((long) 1000)) {
                                            pVar3.N();
                                        }
                                    }
                                }
                            } else {
                                pVar3.N();
                            }
                            pVar3.notifyDataSetChanged();
                            List creativePopupList = upperCenterIndexResV4.getCreativePopupList();
                            if (!upperCenterMainFragmentV4.mf()) {
                                Lazy lazy2 = UpperFawkesDeviceDecision.f105475a;
                                if (deviceDecision.getBoolean("uper.creation_center_new_popup_enable", false) && creativePopupList != null) {
                                    SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(upperCenterMainFragmentV4.getContext(), "upper.create_center");
                                    Iterator it2 = creativePopupList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            UpperCenterIndexResV4.CreativePopupData creativePopupData = (UpperCenterIndexResV4.CreativePopupData) it2.next();
                                            if (creativePopupData.isLocal()) {
                                                if (sharedPreferencesHelper.optInteger(creativePopupData.getPopId(), -1) < creativePopupData.getPopVersion()) {
                                                    Context context4 = upperCenterMainFragmentV4.getContext();
                                                    if (context4 != null) {
                                                        UpperCenterViewModel upperCenterViewModelLf3 = upperCenterMainFragmentV4.lf();
                                                        String jumpUrl = creativePopupData.getJumpUrl();
                                                        upperCenterViewModelLf3.getClass();
                                                        UpperCenterViewModel.J0(context4, jumpUrl);
                                                        sharedPreferencesHelper.setInteger(creativePopupData.getPopId(), creativePopupData.getPopVersion());
                                                    }
                                                }
                                            } else if (!Intrinsics.areEqual(creativePopupData.getPopId(), "local_pop")) {
                                                Context context5 = upperCenterMainFragmentV4.getContext();
                                                if (context5 != null) {
                                                    UpperCenterViewModel upperCenterViewModelLf4 = upperCenterMainFragmentV4.lf();
                                                    String jumpUrl2 = creativePopupData.getJumpUrl();
                                                    upperCenterViewModelLf4.getClass();
                                                    UpperCenterViewModel.J0(context5, jumpUrl2);
                                                }
                                            } else if (upperCenterMainFragmentV4.of(upperCenterIndexResV4.getOpenScreen())) {
                                            }
                                        }
                                    }
                                } else if (!upperCenterMainFragmentV4.of(upperCenterIndexResV4.getOpenScreen())) {
                                    UpperCenterIndexResV4.EstablishConnection establishCon2 = upperCenterIndexResV4.getEstablishCon();
                                    if (establishCon2 == null || (context3 = upperCenterMainFragmentV4.getContext()) == null || !establishCon2.showEstablishDialog()) {
                                        UpperCenterIndexResV4.ElectricityPopInfo electricityPopInfo = upperCenterIndexResV4.getElectricityPopInfo();
                                        if (electricityPopInfo != null && (context2 = upperCenterMainFragmentV4.getContext()) != null && ((Boolean) UpperFawkesDeviceDecision.f105477b.getValue()).booleanValue() && (link = electricityPopInfo.getLink()) != null && link.length() != 0) {
                                            UpperCenterViewModel upperCenterViewModelLf5 = upperCenterMainFragmentV4.lf();
                                            String link2 = electricityPopInfo.getLink();
                                            if (link2 == null) {
                                                link2 = "";
                                            }
                                            upperCenterViewModelLf5.getClass();
                                            UpperCenterViewModel.J0(context2, link2);
                                            upperCenterMainFragmentV4.f114095s = true;
                                        }
                                    } else {
                                        UpperCenterViewModel upperCenterViewModelLf6 = upperCenterMainFragmentV4.lf();
                                        String popupUrl = establishCon2.getPopupUrl();
                                        upperCenterViewModelLf6.getClass();
                                        UpperCenterViewModel.J0(context3, popupUrl);
                                        upperCenterMainFragmentV4.f114095s = true;
                                    }
                                }
                            }
                            yW.h hVar2 = upperCenterMainFragmentV4.f114093q;
                            yW.h hVar3 = hVar2;
                            if (hVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("timeLine");
                                hVar3 = null;
                            }
                            hVar3.h = upperCenterMainFragmentV4.f114090n;
                            yW.h hVar4 = upperCenterMainFragmentV4.f114093q;
                            yW.h hVar5 = hVar4;
                            if (hVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("timeLine");
                                hVar5 = null;
                            }
                            hVar5.c((Long) null, TimeLineTag.BonesReady.getValue());
                            upperCenterMainFragmentV4.f114090n = false;
                        }
                        unit = Unit.INSTANCE;
                        return unit;
                    case 1:
                        sI.a aVar3 = (sI.a) obj;
                        LiveLog.Companion companion = LiveLog.Companion;
                        com.bilibili.bililive.room.ui.roomv3.vertical.business.r rVar = (com.bilibili.bililive.room.ui.roomv3.vertical.business.r) obj2;
                        String logTag = rVar.getLogTag();
                        if (companion.isDebug()) {
                            BLog.d(logTag, "on receive local combo msg");
                            LiveLogDelegate logDelegate = companion.getLogDelegate();
                            if (logDelegate != null) {
                                LiveLogDelegate.onLog$default(logDelegate, 4, logTag, "on receive local combo msg", (Throwable) null, 8, (Object) null);
                            }
                        } else if (companion.matchLevel(4) && companion.matchLevel(3)) {
                            LiveLogDelegate logDelegate2 = companion.getLogDelegate();
                            if (logDelegate2 != null) {
                                LiveLogDelegate.onLog$default(logDelegate2, 3, logTag, "on receive local combo msg", (Throwable) null, 8, (Object) null);
                            }
                            BLog.i(logTag, "on receive local combo msg");
                        }
                        rVar.J0();
                        LiveComboController liveComboController = rVar.z;
                        if (liveComboController != null) {
                            liveComboController.add(aVar3.a);
                        }
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj;
                        AlbumChooseContainerFragment albumChooseContainerFragment = (AlbumChooseContainerFragment) obj2;
                        if (!albumChooseContainerFragment.isDetached() && albumChooseContainerFragment.isAdded() && num != null) {
                            List list = (List) albumChooseContainerFragment.nf().J.getValue();
                            if (list != null && (albumFolder = (AlbumFolder) CollectionsKt.getOrNull(list, num.intValue())) != null && (name = albumFolder.getName()) != null) {
                                ((ArrayList) albumChooseContainerFragment.e).set(0, name);
                            }
                            if (albumChooseContainerFragment.nf().R0() == null && albumChooseContainerFragment.nf().D) {
                                GameFactoryManager gameFactoryManager = GameFactoryManager.a;
                                if (GameFactoryManager.d() && albumChooseContainerFragment.uf()) {
                                    try {
                                        viewRequireView = albumChooseContainerFragment.requireView();
                                    } catch (Exception e8) {
                                        BLog.e("AlbumChooseContainerFragment", e8);
                                        viewRequireView = null;
                                    }
                                    if (viewRequireView != null) {
                                        viewRequireView.post(new com.bilibili.upper.module.contribute.picker.v3.fragment.f(albumChooseContainerFragment));
                                    }
                                }
                            }
                            Collection collection = (Collection) albumChooseContainerFragment.nf().J.getValue();
                            albumChooseContainerFragment.pf(!(collection == null || collection.isEmpty()));
                            unit2 = Unit.INSTANCE;
                            break;
                        } else {
                            unit2 = Unit.INSTANCE;
                        }
                        return unit2;
                }
            }
        }));
        final int i8 = 0;
        lf().f114115g.observe(getViewLifecycleOwner(), new a(new Function1(this, i8) { // from class: YI0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28696b;

            {
                this.f28695a = i8;
                this.f28696b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f28695a) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            ((UpperCenterMainFragmentV4) this.f28696b).f114091o.notifyDataSetChanged();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        return ((g0) this.f28696b).e.d;
                    default:
                        ((MutableIntState) this.f28696b).setIntValue((int) (((IntSize) obj).m3976unboximpl() >> 32));
                        return Unit.INSTANCE;
                }
            }
        }));
        lf().K0();
    }
}
