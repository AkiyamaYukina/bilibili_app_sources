package com.bilibili.upper.module.template.fragment;

import ES0.p1;
import ES0.q1;
import Hx.n;
import M8.r;
import NI0.a;
import Xz0.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.text.C3774u0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bF0.E1;
import bF0.E2;
import com.bilibili.app.comment3.ui.i;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5788h;
import com.bilibili.ship.theseus.united.page.intro.module.season.J;
import com.bilibili.studio.centerplus.util.k;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.studio.videoeditor.H;
import com.bilibili.upper.module.template.dialog.UpperDownloadProgressDialog;
import com.bilibili.upper.module.template.vm.TemplateDetailViewModel;
import eJ0.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/TemplateDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class TemplateDetailFragment extends BaseFragment implements a.InterfaceC0095a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113992b = LazyKt.lazy(new p1(this, 3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f113993c = LazyKt.lazy(new q1(this, 5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public E1 f113994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.template.fragment.a f113995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public UpperDownloadProgressDialog f113996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113997g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/TemplateDetailFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113998a;

        public a(Function1 function1) {
            this.f113998a = function1;
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
            return this.f113998a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113998a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void jf(TemplateDetailFragment templateDetailFragment, int i7) {
        for (Fragment fragment : templateDetailFragment.getChildFragmentManager().getFragments()) {
            if ((fragment instanceof com.bilibili.upper.module.template.fragment.a) && Intrinsics.areEqual(fragment.getTag(), templateDetailFragment.lf(i7))) {
                if (Intrinsics.areEqual(templateDetailFragment.f113995e, fragment)) {
                    return;
                }
                com.bilibili.upper.module.template.fragment.a aVar = templateDetailFragment.f113995e;
                if (aVar != null) {
                    aVar.pause();
                }
                com.bilibili.upper.module.template.fragment.a aVar2 = (com.bilibili.upper.module.template.fragment.a) fragment;
                aVar2.replay();
                templateDetailFragment.f113995e = aVar2;
                return;
            }
        }
    }

    @Override // NI0.a.InterfaceC0095a
    public final void Ad(int i7, @NotNull List<? extends VideoTemplateBean> list) {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            nf().f114020b.setValue(CollectionsKt.toMutableList(list));
            return;
        }
        List<VideoTemplateBean> value = nf().f114020b.getValue();
        if (value != null) {
            value.addAll(list);
        }
        E1 e12 = this.f113994d;
        if (e12 == null || (viewPager2 = e12.f54716f) == null || (adapter = viewPager2.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    public final void kf() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            E1 e12 = this.f113994d;
            intent.putExtra("pos", e12 != null ? Integer.valueOf(e12.f54716f.getCurrentItem()) : null);
            Unit unit = Unit.INSTANCE;
            fragmentActivityP3.setResult(11, intent);
        }
        Map<Long, a.b> map = NI0.a.f17097a;
        NI0.a.d(nf().I0(), this);
        nf().f114022d.setValue(0L);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.finish();
        }
    }

    public final String lf(int i7) {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        E1 e12 = this.f113994d;
        return i.a((e12 == null || (viewPager2 = e12.f54716f) == null || (adapter = viewPager2.getAdapter()) == null) ? null : Long.valueOf(adapter.getItemId(i7)), "f");
    }

    public final com.bilibili.upper.module.template.vm.g mf() {
        return (com.bilibili.upper.module.template.vm.g) this.f113993c.getValue();
    }

    @NotNull
    public final TemplateDetailViewModel nf() {
        return (TemplateDetailViewModel) this.f113992b.getValue();
    }

    public final void of() {
        VideoTemplateBean videoTemplateBean;
        E1 e12 = this.f113994d;
        int iIntValue = (e12 != null ? Integer.valueOf(e12.f54716f.getCurrentItem()) : null).intValue();
        List<VideoTemplateBean> value = nf().f114020b.getValue();
        if (value == null || (videoTemplateBean = (VideoTemplateBean) CollectionsKt.getOrNull(value, iIntValue)) == null) {
            return;
        }
        String str = EA0.b.b(videoTemplateBean) != 0 ? "ugc" : "图文";
        HashMap<String, String> map = j.f28473a;
        String str2 = nf().f114028k;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        j.c("video_template", str3);
        j.c("template_name", videoTemplateBean.name);
        j.c("templates_abtest", "a");
        j.c("templates_up_from", str);
        j.c("send_channel", "视频模板");
        if (!EA0.b.g(videoTemplateBean)) {
            if (EA0.b.h(videoTemplateBean)) {
                mf().L0(videoTemplateBean, getContext());
                return;
            }
            return;
        }
        final com.bilibili.upper.module.template.vm.g gVarMf = mf();
        gVarMf.f114051f = videoTemplateBean;
        H.a().f108867b = 4;
        gVarMf.f114049d.setValue(-1);
        Bundle bundleJ0 = gVarMf.J0(0, videoTemplateBean.id);
        bundleJ0.putBoolean("bbs_key_template_sdk_montage", true);
        gVarMf.N0();
        gVarMf.K0(String.valueOf(videoTemplateBean.id), videoTemplateBean, bundleJ0, new Function2(gVarMf) { // from class: com.bilibili.upper.module.template.vm.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f114041a;

            {
                this.f114041a = gVarMf;
            }

            public final Object invoke(Object obj, Object obj2) {
                int iIntValue2 = ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                this.f114041a.f114049d.postValue(Integer.valueOf(((int) (iIntValue2 * 0.7f)) + 20));
                return Unit.INSTANCE;
            }
        }, new J(1, gVarMf, bundleJ0), new r(gVarMf, 4), new C5788h(gVarMf, 1));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        E1 e1Inflate = E1.inflate(getLayoutInflater(), viewGroup, false);
        this.f113994d = e1Inflate;
        return e1Inflate != null ? e1Inflate.f54711a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j.d("video_template");
        j.d("template_name");
        j.d("templates_abtest");
        j.d("templates_up_from");
        ZF0.a.f29540a.evictAll();
        Map<Long, a.b> map = NI0.a.f17097a;
        NI0.a.d(nf().I0(), this);
        nf().f114022d.setValue(0L);
        super.onDestroy();
    }

    @Override // NI0.a.InterfaceC0095a
    public final void onError(int i7) {
        Context context;
        if (!isVisible() || (context = getContext()) == null) {
            return;
        }
        t.c(2131849890, context);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.bilibili.upper.module.template.fragment.a aVar = this.f113995e;
        if (aVar != null) {
            aVar.pause();
        }
        com.bilibili.upper.module.template.fragment.a aVar2 = this.f113995e;
        if (aVar2 != null) {
            aVar2.setEnable(false);
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 21) {
            if (k.b(getContext())) {
                of();
                return;
            }
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 == null || fragmentActivityP3.isFinishing()) {
                return;
            }
            new AlertDialog.Builder(fragmentActivityP3).setCancelable(false).setMessage(Build.VERSION.SDK_INT >= 33 ? 2131850965 : 2131851347).setPositiveButton(2131841578, (DialogInterface.OnClickListener) new Object()).setNegativeButton(2131851368, (DialogInterface.OnClickListener) new Object()).show();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        com.bilibili.upper.module.template.fragment.a aVar = this.f113995e;
        if (aVar != null) {
            aVar.setEnable(true);
        }
        com.bilibili.upper.module.template.fragment.a aVar2 = this.f113995e;
        if (aVar2 != null) {
            aVar2.resume();
        }
        super.onResume();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        E1 e12 = this.f113994d;
        (e12 != null ? e12.f54714d : null).f54718b.setOnClickListener(new GL.a(this, 3));
        E1 e13 = this.f113994d;
        if (e13 != null) {
            e13.f54715e.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.a(this, 2));
        }
        E1 e14 = this.f113994d;
        if (e14 != null) {
            e14.f54712b.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.b(this, 2));
        }
        final Jn0.a aVar = new Jn0.a(this, 2);
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new View.OnKeyListener(aVar) { // from class: EA0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f3907a;

                {
                    this.f3907a = aVar;
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view3, int i7, KeyEvent keyEvent) {
                    boolean z6;
                    Function0 function0 = this.f3907a;
                    if (keyEvent.getAction() == 0 && i7 == 4) {
                        function0.invoke();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
        nf().f114022d.observe(getViewLifecycleOwner(), new a(new com.bilibili.topix.center.i(this, 1)));
        nf().f114020b.observe(getViewLifecycleOwner(), new a(new Function1(this) { // from class: com.bilibili.upper.module.template.fragment.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TemplateDetailFragment f114002a;

            {
                this.f114002a = this;
            }

            public final Object invoke(Object obj) {
                Object next;
                List list = (List) obj;
                TemplateDetailFragment templateDetailFragment = this.f114002a;
                templateDetailFragment.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((VideoTemplateBean) next).id == templateDetailFragment.nf().f114023e) {
                        break;
                    }
                }
                VideoTemplateBean videoTemplateBean = (VideoTemplateBean) next;
                if (videoTemplateBean != null) {
                    videoTemplateBean.correspondingForceBind = templateDetailFragment.nf().f114029l;
                }
                if (list != null && !list.isEmpty()) {
                    E1 e15 = templateDetailFragment.f113994d;
                    if (e15 != null) {
                        e15.f54716f.setAdapter(new e(templateDetailFragment, list));
                    }
                    E1 e16 = templateDetailFragment.f113994d;
                    if (e16 != null) {
                        e16.f54716f.registerOnPageChangeCallback(new f(templateDetailFragment, list));
                    }
                    E1 e17 = templateDetailFragment.f113994d;
                    if (e17 != null) {
                        ViewPager2 viewPager2 = e17.f54716f;
                        TemplateDetailViewModel templateDetailViewModelNf = templateDetailFragment.nf();
                        long j7 = templateDetailFragment.nf().f114023e;
                        templateDetailViewModelNf.getClass();
                        Iterator it2 = list.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (((VideoTemplateBean) it2.next()).id == j7) {
                                break;
                            }
                            i7++;
                        }
                        viewPager2.setCurrentItem(i7, false);
                    }
                    E1 e18 = templateDetailFragment.f113994d;
                    int iIntValue = (e18 != null ? Integer.valueOf(e18.f54716f.getCurrentItem()) : null).intValue();
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = 10;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(templateDetailFragment), (CoroutineContext) null, (CoroutineStart) null, new TemplateDetailFragment$scheduleToStartPlaying$1(intRef, templateDetailFragment, iIntValue, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }));
        nf().f114021c.observe(getViewLifecycleOwner(), new a(new C3774u0(this, 1)));
        mf().f114049d.observe(getViewLifecycleOwner(), new a(new n(this, 2)));
        mf().f114050e.observe(getViewLifecycleOwner(), new a(new GK.c(this, 3)));
        TemplateDetailViewModel templateDetailViewModelNf = nf();
        Bundle arguments = getArguments();
        templateDetailViewModelNf.getClass();
        if (arguments != null) {
            long j7 = arguments.getLong(EditCustomizeSticker.TAG_TEMPLATE_ID);
            if (j7 > 0) {
                templateDetailViewModelNf.f114023e = j7;
            }
            long j8 = arguments.getLong("videoTemplateCategoryId");
            if (j8 > 0) {
                templateDetailViewModelNf.f114022d.setValue(Long.valueOf(j8));
            }
            String string = arguments.getString("JUMP_PARAMS", "");
            templateDetailViewModelNf.f114024f = string;
            if (string.length() > 0 && j7 == 0) {
                Uri uri = Uri.parse(templateDetailViewModelNf.f114024f);
                String queryParameter = uri.getQueryParameter("rhythm_id_v2");
                Long longOrNull = queryParameter != null ? StringsKt.toLongOrNull(queryParameter) : null;
                Long longOrNull2 = longOrNull;
                if (longOrNull == null) {
                    String queryParameter2 = uri.getQueryParameter("rhythm_id");
                    longOrNull2 = queryParameter2 != null ? StringsKt.toLongOrNull(queryParameter2) : null;
                }
                if (longOrNull2 != null) {
                    templateDetailViewModelNf.f114023e = longOrNull2.longValue();
                    Intrinsics.areEqual(uri.getQueryParameter("is_need_auto_download"), "1");
                }
            }
            templateDetailViewModelNf.f114025g = arguments.getBoolean("is_new_ui");
            templateDetailViewModelNf.f114028k = arguments.getString("template_category_name");
            templateDetailViewModelNf.f114026i = arguments.getInt("key_material_source_from");
            templateDetailViewModelNf.f114029l = arguments.getBoolean("template_corresponding_id_force_bind");
            templateDetailViewModelNf.h = CH0.a.b(arguments);
        }
        com.bilibili.upper.module.template.vm.g gVarMf = mf();
        int i7 = nf().f114026i;
        gVarMf.getClass();
        mf().h = nf().f114025g;
        mf().f114052g = nf().f114024f;
        mf().f114053i = nf().h;
        if (!Pw0.a.a(getContext())) {
            E1 e15 = this.f113994d;
            if (e15 != null) {
                e15.f54713c.setVisibility(8);
            }
            E1 e16 = this.f113994d;
            E2 e22 = null;
            if (e16 != null) {
                e22 = e16.f54714d;
            }
            e22.f54717a.setVisibility(0);
            return;
        }
        if (nf().I0() <= 0) {
            nf().J0();
            return;
        }
        E1 e17 = this.f113994d;
        if (e17 != null) {
            e17.f54713c.setVisibility(0);
        }
        E1 e18 = this.f113994d;
        E2 e23 = null;
        if (e18 != null) {
            e23 = e18.f54714d;
        }
        e23.f54717a.setVisibility(8);
    }
}
