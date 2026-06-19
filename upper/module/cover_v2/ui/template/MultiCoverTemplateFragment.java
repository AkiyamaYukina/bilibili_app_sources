package com.bilibili.upper.module.cover_v2.ui.template;

import ES0.t;
import GH0.c;
import HH0.h;
import KH0.e;
import KH0.i;
import QH0.a;
import QH0.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.g;
import bF0.L3;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.data.m;
import com.bilibili.upper.module.cover_v2.data.n;
import com.bilibili.upper.module.cover_v2.data.o;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplateGroup;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.mine.Q;
import w8.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/template/MultiCoverTemplateFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverTemplateFragment extends BaseFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KProperty<Object>[] f112975g = {new PropertyReference1Impl(MultiCoverTemplateFragment.class, "viewBinding", "getViewBinding()Lcom/bilibili/upper/databinding/FragmentMultiCoverTemplateBinding;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f112977c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MultiCoverDataLoader f112976b = new MultiCoverDataLoader();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public ArrayList<MultiCoverTemplateListFragment> f112978d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112979e = -10086;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f112980f = ReflectionFragmentViewBindings.viewBindingFragment(this, L3.class, CreateMethod.BIND, UtilsKt.emptyVbCallback());

    /* JADX WARN: Removed duplicated region for block: B:115:0x03ab A[EDGE_INSN: B:526:0x03ab->B:115:0x03ab BREAK  A[LOOP:2: B:68:0x0223->B:114:0x03a5], PHI: r39
  0x03ab: PHI (r39v59 java.util.Iterator) = (r39v58 java.util.Iterator), (r39v63 java.util.Iterator), (r39v74 java.util.Iterator) binds: [B:63:0x0202, B:526:0x03ab, B:66:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0dcc  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0e28  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0e32  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0e3a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0f15  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 4578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.ui.template.MultiCoverTemplateFragment.jf(com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate, boolean):void");
    }

    public final i kf() {
        g gVarP3 = p3();
        if (gVarP3 instanceof com.bilibili.upper.module.cover_v2.ui.a) {
            return ((com.bilibili.upper.module.cover_v2.ui.a) gVarP3).C3();
        }
        return null;
    }

    public final L3 lf() {
        return (L3) this.f112980f.getValue(this, f112975g[0]);
    }

    public final void mf(int i7) {
        for (MultiCoverTemplateListFragment multiCoverTemplateListFragment : this.f112978d) {
            multiCoverTemplateListFragment.f112985e = i7;
            FragmentExtKt.post(multiCoverTemplateListFragment, new t(multiCoverTemplateListFragment, 1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501560, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Iterator<MultiCoverTemplateListFragment> it = this.f112978d.iterator();
        while (it.hasNext()) {
            it.next().f112984d = null;
        }
        this.f112978d.clear();
        MultiCoverDataLoader multiCoverDataLoader = this.f112976b;
        multiCoverDataLoader.f112780b.clear();
        Iterator<MultiCoverDataLoader.DownloadTask> it2 = multiCoverDataLoader.f112781c.iterator();
        while (it2.hasNext()) {
            it2.next().f112785b = new c();
        }
        multiCoverDataLoader.f112781c.clear();
        Iterator<MultiCoverDataLoader.a> it3 = multiCoverDataLoader.f112782d.iterator();
        while (it3.hasNext()) {
            final int i7 = 0;
            it3.next().f112790a = new Function1(i7) { // from class: GH0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f7014a;

                {
                    this.f7014a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f7014a) {
                        case 0:
                            ((Boolean) obj).booleanValue();
                            return Unit.INSTANCE;
                        default:
                            return Boolean.valueOf(((Q) obj).a());
                    }
                }
            };
        }
        multiCoverDataLoader.f112782d.clear();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [GH0.e] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f112977c = new a(getChildFragmentManager());
        lf().f54929c.setAdapter(this.f112977c);
        lf().f54930d.setAllCaps(false);
        lf().f54930d.setViewPager(lf().f54929c);
        lf().f54928b.setOnClickListener(new b(this, 0));
        MultiCoverDataLoader multiCoverDataLoader = this.f112976b;
        QH0.c cVar = new QH0.c(this, 0);
        List<MultiCoverTemplateGroup> list = multiCoverDataLoader.f112779a;
        if (list != null) {
            MultiCoverDataLoader.b(list);
            cVar.invoke(list);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MultiCoverDataLoader.a aVar = new MultiCoverDataLoader.a(multiCoverDataLoader, new Function1(multiCoverDataLoader, cVar, objectRef) { // from class: GH0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverDataLoader f7015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final QH0.c f7016b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Ref.ObjectRef f7017c;

            {
                this.f7015a = multiCoverDataLoader;
                this.f7016b = cVar;
                this.f7017c = objectRef;
            }

            public final Object invoke(Object obj) {
                List<MultiCoverTemplateGroup> list2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MultiCoverDataLoader multiCoverDataLoader2 = this.f7015a;
                List<MultiCoverTemplateGroup> list3 = multiCoverDataLoader2.f112779a;
                QH0.c cVar2 = this.f7016b;
                if (!zBooleanValue || (list2 = list3) == null || list2.isEmpty()) {
                    cVar2.invoke(null);
                } else {
                    MultiCoverDataLoader.b(list3);
                    cVar2.invoke(list3);
                }
                TypeIntrinsics.asMutableCollection(multiCoverDataLoader2.f112782d).remove(this.f7017c.element);
                return Unit.INSTANCE;
            }
        });
        objectRef.element = aVar;
        multiCoverDataLoader.f112782d.add(aVar);
        MultiCoverDataLoader.a aVar2 = (MultiCoverDataLoader.a) objectRef.element;
        final MultiCoverDataLoader multiCoverDataLoader2 = aVar2.f112793d;
        multiCoverDataLoader2.getClass();
        Observable observableCreate = Observable.create(new ObservableOnSubscribe(multiCoverDataLoader2) { // from class: GH0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverDataLoader f7018a;

            {
                this.f7018a = multiCoverDataLoader2;
            }

            public final void subscribe(ObservableEmitter observableEmitter) {
                n nVar = this.f7018a.f112783e;
                g gVar = new g(observableEmitter, 0);
                ArrayList<MultiCoverTemplateGroup> arrayList = nVar.f7034a;
                if (arrayList != null && !arrayList.isEmpty()) {
                    gVar.invoke(nVar.f7034a);
                    return;
                }
                String strA = y.a();
                a aVar3 = (a) ServiceGenerator.createService(a.class);
                int i7 = KH0.e.f12733a;
                com.bilibili.studio.editor.timeline.d.f108285a.getClass();
                String auroraVersion = AuroraVersion.getAuroraVersion();
                String str = auroraVersion;
                if (auroraVersion == null) {
                    str = "";
                }
                aVar3.getTemplates(strA, 0, 0, 26, "mon", str, MontageVersion.getVersion()).enqueue(new m(gVar, nVar));
            }
        });
        HashMap<Integer, Integer> map = h.f8646a;
        int i7 = e.f12733a;
        Observable observableObserveOn = Observable.zip(observableCreate, h.a(), m.f112816a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MultiCoverDataLoader.b bVar = aVar2.f112791b;
        multiCoverDataLoader2.f112780b.add(observableObserveOn.subscribe(new n(multiCoverDataLoader2, bVar), new o(bVar)));
    }
}
