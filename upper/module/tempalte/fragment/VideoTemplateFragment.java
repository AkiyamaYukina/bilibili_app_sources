package com.bilibili.upper.module.tempalte.fragment;

import Hr.k;
import II0.n;
import II0.s;
import KI0.d;
import OC0.h;
import TE0.b;
import WI0.C2995j0;
import Xz0.j;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import bF0.C5023o;
import bF0.H1;
import com.bilibili.bililive.biz.interact.chatroom.widget.label.LabelSaveConfirmDialog;
import com.bilibili.bililive.liveaudio.data.LiveAudioConfig;
import com.bilibili.bililive.mixstream.rtc3.engine.audio.LiveRTCAudioService;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.moduleservice.upper.ICenterPlusContainer;
import com.bilibili.studio.centerplus.dialog.AlbumQuitDialog;
import com.bilibili.studio.centerplus.util.g;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.manager.hdr.a;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.api.bean.videotemplate.VideoTemplateCategory;
import com.bilibili.upper.api.bean.videotemplate.VideoTemplatePreBean;
import com.bilibili.upper.module.contribute.picker.ui.MaterialPreviewOfPlusActivityV1;
import com.bilibili.upper.module.tempalte.fragment.VideoTemplateFragment;
import com.bilibili.upper.widget.BiliTabLayout;
import com.bilibili.upper.widget.UpperGeneralPageView;
import com.mall.data.page.home.bean.plantseeds.MallHomePageFeedsBean;
import eJ0.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.DigitsUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/VideoTemplateFragment.class */
@StabilityInferred(parameters = 0)
public class VideoTemplateFragment extends BaseFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113974g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public VideoTemplatePreBean f113978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public a.a f113979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public H1 f113980n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Integer> f113969b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f113970c = "contribute";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f113971d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113972e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113973f = -1;
    public boolean h = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f113981o = LazyKt.lazy(new n(this, 0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113982p = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/VideoTemplateFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113983a;

        public a(Function1 function1) {
            this.f113983a = function1;
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
            return this.f113983a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113983a.invoke(obj);
        }
    }

    public final d jf() {
        return (d) this.f113981o.getValue();
    }

    public final void kf(int i7, boolean z6) {
        List list;
        BiliTabLayout biliTabLayout;
        VideoTemplatePreBean videoTemplatePreBean = this.f113978l;
        if (videoTemplatePreBean == null || (list = videoTemplatePreBean.templateCategories) == null) {
            return;
        }
        int size = list.size();
        while (i7 < size) {
            H1 h12 = this.f113980n;
            Boolean boolValueOf = null;
            BiliTabLayout.c cVarG = (h12 == null || (biliTabLayout = h12.f54815z) == null) ? null : biliTabLayout.g(i7);
            if (cVarG != null) {
                boolValueOf = Boolean.valueOf(cVarG.getLocalVisibleRect(new Rect()));
            }
            if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                return;
            }
            if (cVarG != null && !((ArrayList) this.f113969b).contains(Integer.valueOf(i7))) {
                ((ArrayList) this.f113969b).add(Integer.valueOf(i7));
                b bVar = b.f24088a;
                String str = ((VideoTemplateCategory) list.get(i7)).name;
                long j7 = ((VideoTemplateCategory) list.get(i7)).id;
                HashMap mapA = VF0.b.a(bVar);
                k.a(i7, "tab_position", "tab_name", str, mapA);
                mapA.put("tab_id", String.valueOf(j7));
                mapA.put("if_user_show", "1");
                mapA.put("abtest", z6 ? "a" : "b");
                mapA.put("first_entrance", j.a("first_entrance"));
                Neurons.reportExposure$default(false, "creation.creation-template-selection.top-partition.0.show", mapA, (List) null, 8, (Object) null);
            }
            i7++;
        }
    }

    public final void lf(int i7) {
        UpperGeneralPageView upperGeneralPageView;
        UpperGeneralPageView upperGeneralPageView2;
        H1 h12;
        UpperGeneralPageView upperGeneralPageView3;
        if (i7 == 0) {
            H1 h13 = this.f113980n;
            if (h13 == null || (upperGeneralPageView = h13.f54814y) == null) {
                return;
            }
            upperGeneralPageView.l0(3);
            return;
        }
        if (i7 != 1) {
            if (i7 != 2 || (h12 = this.f113980n) == null || (upperGeneralPageView3 = h12.f54814y) == null) {
                return;
            }
            upperGeneralPageView3.l0(1);
            return;
        }
        H1 h14 = this.f113980n;
        if (h14 == null || (upperGeneralPageView2 = h14.f54814y) == null) {
            return;
        }
        upperGeneralPageView2.l0(0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        H1 h1Inflate;
        C2995j0 c2995j0 = C2995j0.f26756a;
        Context contextRequireContext = requireContext();
        c2995j0.getClass();
        C2995j0.c(contextRequireContext);
        C2995j0.b(contextRequireContext);
        NullPointerException nullPointerException = null;
        for (Context context : C2995j0.a(c2995j0, contextRequireContext)) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, contextRequireContext.getTheme());
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            Iterator it = CollectionsKt.listOf(new LayoutInflater[]{layoutInflaterFrom, layoutInflaterFrom.cloneInContext(contextThemeWrapper), LayoutInflater.from(contextThemeWrapper)}).iterator();
            NullPointerException nullPointerException2 = nullPointerException;
            while (true) {
                nullPointerException = nullPointerException2;
                if (it.hasNext()) {
                    LayoutInflater layoutInflater2 = (LayoutInflater) it.next();
                    try {
                        h1Inflate = H1.inflate(layoutInflater2, viewGroup, false);
                    } catch (Throwable th) {
                        if (nullPointerException2 == null) {
                            nullPointerException2 = th;
                        }
                    }
                    if (h1Inflate != null) {
                        this.f113980n = h1Inflate;
                        return h1Inflate.getRoot();
                    }
                    if (nullPointerException2 == null) {
                        nullPointerException2 = new NullPointerException("inflate returned null for " + layoutInflater2.getContext().getClass().getName());
                    }
                }
            }
        }
        throw new IllegalStateException("No inflater candidate could inflate upper split content", nullPointerException);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a.a aVar = this.f113979m;
        if (aVar != null) {
            aVar.a();
        }
        d dVarJf = jf();
        BiliTemplateEngineManager biliTemplateEngineManager = dVarJf.f12774b;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
        dVarJf.f12774b = null;
        j.d("video_template");
        j.d("templates_abtest");
        j.d("templates_up_from");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        UpperGeneralPageView upperGeneralPageView;
        ImageView imageView;
        int iIntValue;
        long j7;
        long j8;
        super.onViewCreated(view, bundle);
        j.c("send_channel", "视频模板");
        j.c("templates_abtest", "a");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f113970c = CH0.a.b(arguments);
            Object obj = arguments.get("JUMP_PARAMS");
            Object obj2 = obj;
            if (obj == null) {
                obj2 = "";
            }
            this.f113971d = obj2.toString();
            Object obj3 = arguments.get("key_material_source_from");
            Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Number number = null;
                if (obj3 instanceof Number) {
                    number = (Number) obj3;
                }
                iIntValue = number != null ? number.intValue() : obj3 instanceof String ? DigitsUtil.parseInt((CharSequence) obj3, -1) : -1;
            }
            this.f113972e = iIntValue;
            try {
                j7 = Long.parseLong(N.a(this.f113971d, "rhythm_id_v2"));
            } catch (Exception e7) {
                j7 = -1;
            }
            this.f113973f = j7;
            if (j7 == -1) {
                try {
                    j8 = Long.parseLong(N.a(this.f113971d, "rhythm_id"));
                } catch (Exception e8) {
                    j8 = -1;
                }
                this.f113973f = j8;
            }
            this.f113976j = Intrinsics.areEqual("1", N.a(this.f113971d, "is_need_auto_download"));
            boolean z6 = arguments.getBoolean("is_new_ui", false);
            this.f113977k = z6;
            if (!z6) {
                this.f113977k = Intrinsics.areEqual("1", N.a(this.f113971d, "is_new_ui"));
            }
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            h.x(fragmentActivityP3);
        }
        H1 h12 = this.f113980n;
        if (h12 != null && (imageView = h12.f54813x) != null) {
            final int i7 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: II0.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f10247a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f10248b;

                {
                    this.f10247a = i7;
                    this.f10248b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ImageItem imageItem;
                    switch (this.f10247a) {
                        case 0:
                            VideoTemplateFragment videoTemplateFragment = (VideoTemplateFragment) this.f10248b;
                            if (AlbumQuitDialog.f105100e.f105109f) {
                                Map<String, String> map = ABManager.f105341a;
                                if (!ABManager.e(com.bilibili.studio.comm.ab.d.f105350a)) {
                                    androidx.core.content.g gVarP3 = videoTemplateFragment.p3();
                                    ICenterPlusContainer iCenterPlusContainer = gVarP3 instanceof ICenterPlusContainer ? (ICenterPlusContainer) gVarP3 : null;
                                    if (iCenterPlusContainer != null) {
                                        iCenterPlusContainer.switchTab(2, null);
                                    }
                                }
                            }
                            FragmentActivity fragmentActivityP32 = videoTemplateFragment.p3();
                            if (fragmentActivityP32 != null) {
                                fragmentActivityP32.finish();
                            }
                            break;
                        case 1:
                            ((LabelSaveConfirmDialog) this.f10248b).dismissAllowingStateLoss();
                            break;
                        default:
                            MaterialPreviewOfPlusActivityV1 materialPreviewOfPlusActivityV1 = (MaterialPreviewOfPlusActivityV1) this.f10248b;
                            C5023o c5023o = materialPreviewOfPlusActivityV1.P;
                            if (c5023o != null) {
                                TintTextView tintTextView = c5023o.f55872l;
                                ImageItem imageItem2 = materialPreviewOfPlusActivityV1.E;
                                if (imageItem2 != null && (imageItem = (ImageItem) CollectionsKt.getOrNull(materialPreviewOfPlusActivityV1.x, materialPreviewOfPlusActivityV1.z)) != null) {
                                    if (Intrinsics.areEqual(imageItem2.path, imageItem.path)) {
                                        tintTextView.setVisibility(8);
                                        materialPreviewOfPlusActivityV1.E = null;
                                        break;
                                    } else if (materialPreviewOfPlusActivityV1.R6()) {
                                        Lazy<com.bilibili.studio.comm.manager.hdr.a> lazy = com.bilibili.studio.comm.manager.hdr.a.f105396e;
                                        boolean zF = a.C1185a.a().f(imageItem.path);
                                        if (imageItem.isVideo() && !zF) {
                                            com.bilibili.upper.module.contribute.picker.v3.report.c.c("HDR素材");
                                            eJ0.t.c(2131851108, materialPreviewOfPlusActivityV1);
                                        } else {
                                            tintTextView.setVisibility(0);
                                            materialPreviewOfPlusActivityV1.E = imageItem;
                                            materialPreviewOfPlusActivityV1.onBackPressed();
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
        }
        H1 h13 = this.f113980n;
        if (h13 != null && (upperGeneralPageView = h13.f54814y) != null) {
            int i8 = UpperGeneralPageView.f114439r;
            final int i9 = 0;
            upperGeneralPageView.f114448m.put(2131297933, new Function1(this, i9) { // from class: II0.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f10249a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f10250b;

                {
                    this.f10249a = i9;
                    this.f10250b = this;
                }

                public final Object invoke(Object obj4) {
                    switch (this.f10249a) {
                        case 0:
                            ((Integer) obj4).getClass();
                            VideoTemplateFragment videoTemplateFragment = (VideoTemplateFragment) this.f10250b;
                            videoTemplateFragment.lf(1);
                            videoTemplateFragment.jf().I0(videoTemplateFragment.p3(), videoTemplateFragment.f113973f);
                            break;
                        case 1:
                            ((LiveRTCAudioService.b) obj4).onAudioPlayRestart((LiveAudioConfig) this.f10250b);
                            break;
                        default:
                            ((TextView) obj4).setText(((MallHomePageFeedsBean) this.f10250b).getTitle());
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        int iB = 1;
        lf(1);
        jf().getClass();
        jf().f12773a = new s(this, 0);
        final int i10 = 0;
        jf().f12775c.observe(getViewLifecycleOwner(), new a(new Function1(this, i10) { // from class: II0.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f10253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f10254b;

            {
                this.f10253a = i10;
                this.f10254b = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r12) throws kotlin.NoWhenBranchMatchedException {
                /*
                    Method dump skipped, instruction units count: 1054
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: II0.t.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i11 = 0;
        jf().f12776d.observe(getViewLifecycleOwner(), new a(new Function1(this, i11) { // from class: II0.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f10255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f10256b;

            {
                this.f10255a = i11;
                this.f10256b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:174:0x05de
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            public final java.lang.Object invoke(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 1506
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: II0.u.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        d dVarJf = jf();
        FragmentActivity fragmentActivityP32 = p3();
        Bundle arguments2 = getArguments();
        dVarJf.getClass();
        if (arguments2 != null) {
            iB = g.b(arguments2);
        }
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(iB);
        biliTemplateEngineManager.i(fragmentActivityP32);
        dVarJf.f12774b = biliTemplateEngineManager;
        jf().I0(p3(), this.f113973f);
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: II0.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoTemplateFragment f10246a;

            {
                this.f10246a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj4) {
                FragmentActivity fragmentActivityP33 = this.f10246a.p3();
                if (fragmentActivityP33 != null) {
                    fragmentActivityP33.finish();
                }
            }
        };
        aVarA.getClass();
        this.f113979m = lB0.a.b(EventFinishEdit.class, a_b);
    }
}
