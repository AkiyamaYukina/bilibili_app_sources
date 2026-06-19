package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import BI0.f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bF0.A1;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.api.bean.Child;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import com.bilibili.upper.module.contribute.up.util.m;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBeanV5;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.RecommendTagGroup;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.SelectedTagGroup;
import eJ0.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sI0.AbstractC8579a;
import vI0.C8791b;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionTagFragment.class */
@StabilityInferred(parameters = 0)
public final class PartitionTagFragment extends BaseFragment implements f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecommendTagGroup f113785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Typeface f113786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public A1 f113787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AI0.f f113788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f113789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f113790g = "";

    public PartitionTagFragment() {
        final Function0 function0 = null;
        this.f113789f = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AI0.i.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment$special$$inlined$activityViewModels$default$1
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10674invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function0, this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment$special$$inlined$activityViewModels$default$2
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function0;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10675invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment$special$$inlined$activityViewModels$default$2.m10675invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionTagFragment$special$$inlined$activityViewModels$default$3
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m10676invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    @Override // BI0.f.a
    public final void U0(@NotNull String str) {
        RecTagResponse recTagResponse;
        List<UpperRcmdTagBean> data;
        TE0.b.f24088a.getClass();
        TE0.b.I(str);
        if (str == null || str.length() == 0 || jf()) {
            return;
        }
        AI0.f fVar = this.f113788e;
        if (fVar != null && fVar.L0(str)) {
            H.a(2131851370, getContext());
            return;
        }
        AI0.f fVar2 = this.f113788e;
        if (fVar2 != null && (recTagResponse = fVar2.f237c) != null && (data = recTagResponse.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(str, ((UpperRcmdTagBean) it.next()).tag)) {
                    AI0.f fVar3 = this.f113788e;
                    if (fVar3 != null) {
                        fVar3.J0(str);
                    }
                    kf();
                    RecommendTagGroup recommendTagGroup = this.f113785b;
                    if (recommendTagGroup != null) {
                        recommendTagGroup.e(str, true);
                        return;
                    }
                    return;
                }
            }
        }
        AI0.f fVar4 = this.f113788e;
        if (fVar4 != null) {
            fVar4.P0(str);
        }
    }

    public final boolean jf() {
        AI0.f fVar = this.f113788e;
        int i7 = 0;
        boolean z6 = true;
        if (fVar != null) {
            z6 = fVar.f245l.size() >= 10;
        }
        if (z6 && getContext() != null) {
            Context context = getContext();
            String quantityString = null;
            if (context != null) {
                Resources resources = context.getResources();
                quantityString = null;
                if (resources != null) {
                    AI0.f fVar2 = this.f113788e;
                    if (fVar2 != null) {
                        i7 = 10;
                    }
                    Integer num = null;
                    if (fVar2 != null) {
                        num = 10;
                    }
                    quantityString = resources.getQuantityString(2131689775, i7, num);
                }
            }
            ToastHelper.showToastShort(getContext(), quantityString);
        }
        return z6;
    }

    public final void kf() {
        ArrayList arrayList;
        CopyOnWriteArrayList<UpperTagBeanV5> copyOnWriteArrayList;
        if (getContext() == null) {
            return;
        }
        AI0.f fVar = this.f113788e;
        if (fVar == null || (copyOnWriteArrayList = fVar.f245l) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(copyOnWriteArrayList, 10));
            Iterator<UpperTagBeanV5> it = copyOnWriteArrayList.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList2.add(it.next().tagText);
                }
            }
        }
        List listEmptyList = arrayList;
        if (arrayList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        m.h(listEmptyList);
        ArrayList arrayList3 = new ArrayList(listEmptyList.size());
        List list = listEmptyList;
        if (list.isEmpty()) {
            A1 a12 = this.f113787d;
            if (a12 != null) {
                a12.f54600d.setVisibility(8);
            }
            A1 a13 = this.f113787d;
            if (a13 != null) {
                a13.f54601e.setVisibility(0);
            }
        } else {
            int size = ((this.f113788e == null ? 0 : 10) - listEmptyList.size()) - arrayList3.size();
            int i7 = size;
            if (size < 0) {
                i7 = 0;
            }
            A1 a14 = this.f113787d;
            if (a14 != null) {
                a14.f54600d.setText(getString(2131851454, Integer.valueOf(i7)));
            }
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList3.add(new SelectedTagGroup.a((String) listEmptyList.get(i8)));
            }
            A1 a15 = this.f113787d;
            if (a15 != null) {
                a15.f54600d.setVisibility(0);
            }
            A1 a16 = this.f113787d;
            if (a16 != null) {
                a16.f54601e.setVisibility(8);
            }
        }
        A1 a17 = this.f113787d;
        if (a17 != null) {
            a17.f54604i.c(arrayList3);
        }
    }

    public final void lf(@Nullable View view) {
        View viewFindViewById;
        if (view == null || (viewFindViewById = view.findViewById(2131299782)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new Hs.e(this, 2));
    }

    public final String mf() {
        ArrayList<TypeMeta> arrayList;
        UpperPartTagRequestParam upperPartTagRequestParam;
        AI0.f fVar = this.f113788e;
        long childTypeId = (fVar == null || (upperPartTagRequestParam = fVar.f246m) == null) ? 0L : upperPartTagRequestParam.getChildTypeId();
        AI0.f fVar2 = this.f113788e;
        if (fVar2 == null || (arrayList = fVar2.f242i) == null) {
            return "";
        }
        for (TypeMeta typeMeta : arrayList) {
            List<Child> list = typeMeta.children;
            if (list != null) {
                for (Child child : list) {
                    if (childTypeId == child.id) {
                        return B0.a.a(typeMeta.name, "-", child.name);
                    }
                }
            }
        }
        return "";
    }

    public final void nf() {
        TintTextView tintTextView;
        String string;
        ArrayList<TypeMeta> arrayList;
        UpperPartTagRequestParam upperPartTagRequestParam;
        AI0.f fVar = this.f113788e;
        long childTypeId = (fVar == null || (upperPartTagRequestParam = fVar.f246m) == null) ? 0L : upperPartTagRequestParam.getChildTypeId();
        A1 a12 = this.f113787d;
        if (a12 == null || (tintTextView = a12.f54605j) == null) {
            return;
        }
        if (getContext() == null) {
            string = null;
        } else {
            string = getString(2131851432);
            AI0.f fVar2 = this.f113788e;
            if (fVar2 != null && (arrayList = fVar2.f242i) != null) {
                Iterator<T> it = arrayList.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TypeMeta typeMeta = (TypeMeta) it.next();
                    List<Child> list = typeMeta.children;
                    if (list != null) {
                        for (Child child : list) {
                            if (childTypeId == child.id) {
                                string = B0.a.a(typeMeta.name, "-", child.name);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        String str = string;
        if (string == null) {
            str = "";
        }
        this.f113790g = str;
        tintTextView.setText(str);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            this.f113786c = Typeface.createFromAsset(context.getAssets(), "upper_medium.otf");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        A1 a1Inflate = A1.inflate(LayoutInflater.from(getContext()));
        this.f113787d = a1Inflate;
        return a1Inflate != null ? a1Inflate.f54597a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        UpperPartTagRequestParam upperPartTagRequestParam;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            this.f113788e = (AI0.f) R0.k.a(fragmentActivityP3, AI0.f.class);
        }
        final AI0.f fVar = this.f113788e;
        if (fVar != null) {
            fVar.f238d.observe(getViewLifecycleOwner(), new Observer(fVar, this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AI0.f f113805a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PartitionTagFragment f113806b;

                {
                    this.f113805a = fVar;
                    this.f113806b = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    AI0.f fVar2;
                    List listEmptyList;
                    AI0.f fVar3 = this.f113805a;
                    C8791b c8791b = fVar3.f236b;
                    PartitionTagFragment partitionTagFragment = this.f113806b;
                    if (c8791b == null) {
                        TE0.b bVar = TE0.b.f24088a;
                        String strMf = partitionTagFragment.mf();
                        UpperPartTagRequestParam upperPartTagRequestParam2 = fVar3.f246m;
                        List<UpperTagBeanV5> recTags = upperPartTagRequestParam2 != null ? upperPartTagRequestParam2.getRecTags() : null;
                        List<UpperTagBeanV5> listEmptyList2 = recTags;
                        if (recTags == null) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                        String strP = CollectionsKt.p(CollectionsKt.filterNotNull(listEmptyList2), ",", (CharSequence) null, (CharSequence) null, new com.bilibili.playerbizcommonv2.danmaku.input.panel.b(1), 30);
                        bVar.getClass();
                        TE0.b.S(strMf, strP);
                    }
                    C8791b c8791b2 = fVar3.f236b;
                    if (c8791b2 != null && (fVar2 = partitionTagFragment.f113788e) != null) {
                        ArrayList arrayList = new ArrayList();
                        boolean z6 = fVar2.f250q;
                        if (z6 && fVar2.f251r) {
                            for (UpperTagBeanV5 upperTagBeanV5 : fVar2.f245l) {
                                if (upperTagBeanV5.type == 0) {
                                    arrayList.add(upperTagBeanV5);
                                }
                            }
                            listEmptyList = c8791b2.f128172b.size() >= 3 ? CollectionsKt.take(c8791b2.f128172b, 10) : CollectionsKt.take(CollectionsKt.plus(c8791b2.f128172b, c8791b2.f128171a), 3);
                        } else if (fVar2.f251r) {
                            for (UpperTagBeanV5 upperTagBeanV52 : fVar2.f245l) {
                                if (upperTagBeanV52.type != 2) {
                                    arrayList.add(upperTagBeanV52);
                                }
                            }
                            listEmptyList = CollectionsKt.take(c8791b2.f128172b, 10);
                        } else if (z6) {
                            for (UpperTagBeanV5 upperTagBeanV53 : fVar2.f245l) {
                                if (upperTagBeanV53.type != 1) {
                                    arrayList.add(upperTagBeanV53);
                                }
                            }
                            listEmptyList = CollectionsKt.take(c8791b2.f128171a, 3);
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        TE0.b bVar2 = TE0.b.f24088a;
                        String strMf2 = partitionTagFragment.mf();
                        String strP2 = CollectionsKt.p(CollectionsKt.filterNotNull(listEmptyList), ",", (CharSequence) null, (CharSequence) null, new com.bilibili.lib.performance.d(1), 30);
                        bVar2.getClass();
                        TE0.b.S(strMf2, strP2);
                        List<UpperTagBeanV5> listPlus = CollectionsKt.plus(listEmptyList, arrayList);
                        if (listPlus.size() <= 10) {
                            fVar2.f245l.clear();
                            for (UpperTagBeanV5 upperTagBeanV54 : listPlus) {
                                if (!fVar2.L0(upperTagBeanV54.tagText)) {
                                    fVar2.I0(upperTagBeanV54);
                                    String str = m.a;
                                    String str2 = upperTagBeanV54.tagText;
                                    if (str2 != null) {
                                        m.a(str2, m.c);
                                    }
                                }
                            }
                        }
                        partitionTagFragment.kf();
                    }
                    RecTagResponse recTagResponse = fVar3.f237c;
                    if (recTagResponse != null) {
                        partitionTagFragment.getClass();
                        if (!recTagResponse.getSuccess()) {
                            A1 a12 = partitionTagFragment.f113787d;
                            if (a12 != null) {
                                a12.f54599c.b();
                            }
                            A1 a13 = partitionTagFragment.f113787d;
                            partitionTagFragment.lf(a13 != null ? a13.f54599c.getErrorView() : null);
                            return;
                        }
                        List<UpperRcmdTagBean> data = recTagResponse.getData();
                        ArrayList arrayList2 = new ArrayList();
                        if (data != null) {
                            Iterator<T> it = data.iterator();
                            while (it.hasNext()) {
                                String str3 = ((UpperRcmdTagBean) it.next()).tag;
                                AI0.f fVar4 = partitionTagFragment.f113788e;
                                arrayList2.add(new RecommendTagGroup.b(str3, fVar4 != null ? fVar4.L0(str3) : false));
                            }
                        }
                        String str4 = m.a;
                        ArrayList arrayList3 = null;
                        if (data != null) {
                            List<UpperRcmdTagBean> list = data;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                arrayList3 = arrayList4;
                                if (!it2.hasNext()) {
                                    break;
                                } else {
                                    arrayList4.add(((UpperRcmdTagBean) it2.next()).tag);
                                }
                            }
                        }
                        m.f(arrayList3);
                        arrayList2.add(new RecommendTagGroup.b("", false));
                        RecommendTagGroup recommendTagGroup = partitionTagFragment.f113785b;
                        if (recommendTagGroup != null) {
                            recommendTagGroup.c(arrayList2);
                        }
                        A1 a14 = partitionTagFragment.f113787d;
                        if (a14 != null) {
                            a14.f54599c.a();
                        }
                    }
                }
            });
        }
        A1 a12 = this.f113787d;
        this.f113785b = a12 != null ? (RecommendTagGroup) a12.f54599c.findViewById(2131309895) : null;
        A1 a13 = this.f113787d;
        if (a13 != null) {
            a13.f54606k.setTypeface(this.f113786c);
        }
        AI0.f fVar2 = this.f113788e;
        boolean z6 = true;
        int requestType = (fVar2 == null || (upperPartTagRequestParam = fVar2.f246m) == null) ? 1 : upperPartTagRequestParam.getRequestType();
        if ((requestType & 8) <= 0) {
            z6 = false;
        }
        if (z6) {
            A1 a14 = this.f113787d;
            if (a14 != null) {
                a14.f54602f.setAlpha(1.0f);
            }
            A1 a15 = this.f113787d;
            if (a15 != null) {
                a15.f54602f.setOnClickListener(new Hs.h(this, 2));
            }
        } else {
            A1 a16 = this.f113787d;
            if (a16 != null) {
                a16.f54602f.setAlpha(0.4f);
            }
            A1 a17 = this.f113787d;
            if (a17 != null) {
                a17.f54602f.setOnClickListener(new Hs.g(this, 4));
            }
        }
        A1 a18 = this.f113787d;
        if (a18 != null) {
            a18.f54598b.setOnClickListener(new Object());
        }
        if ((requestType & 2) <= 0) {
            A1 a19 = this.f113787d;
            if (a19 != null) {
                a19.f54603g.setAlpha(0.4f);
            }
            A1 a110 = this.f113787d;
            if (a110 != null) {
                a110.f54598b.setVisibility(0);
            }
        }
        A1 a111 = this.f113787d;
        if (a111 != null) {
            a111.h.setTypeface(this.f113786c);
        }
        A1 a112 = this.f113787d;
        if (a112 != null) {
            a112.f54599c.c();
        }
        A1 a113 = this.f113787d;
        lf(a113 != null ? a113.f54599c.getLoadingView() : null);
        A1 a114 = this.f113787d;
        if (a114 != null) {
            a114.f54599c.setOnRetryClickListener(new Yp0.a(this, 1));
        }
        A1 a115 = this.f113787d;
        if (a115 != null) {
            a115.f54604i.setListener(new AbstractC8579a.b(this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartitionTagFragment f113807a;

                {
                    this.f113807a = this;
                }

                @Override // sI0.AbstractC8579a.b
                public final void a(int i7, Object obj) {
                    PartitionTagFragment partitionTagFragment = this.f113807a;
                    if (partitionTagFragment.f113788e == null) {
                        return;
                    }
                    SelectedTagGroup.a aVar = (SelectedTagGroup.a) obj;
                    if (aVar.f113882c) {
                        return;
                    }
                    String str = aVar.f113880a;
                    TE0.b.T(i7, str, "0");
                    RecommendTagGroup recommendTagGroup = partitionTagFragment.f113785b;
                    if (recommendTagGroup != null) {
                        recommendTagGroup.e(str, false);
                    }
                    AI0.f fVar3 = partitionTagFragment.f113788e;
                    if (fVar3 != null) {
                        fVar3.N0(str);
                    }
                    partitionTagFragment.kf();
                }
            });
        }
        RecommendTagGroup recommendTagGroup = this.f113785b;
        if (recommendTagGroup != null) {
            recommendTagGroup.setListener(new AbstractC8579a.b(this) { // from class: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartitionTagFragment f113808a;

                {
                    this.f113808a = this;
                }

                @Override // sI0.AbstractC8579a.b
                public final void a(int i7, Object obj) {
                    boolean z7 = obj instanceof RecommendTagGroup.a;
                    PartitionTagFragment partitionTagFragment = this.f113808a;
                    if (z7) {
                        partitionTagFragment.getClass();
                        zG0.a.a.getClass();
                        a.a aVar = a.a.a;
                        zG0.h.c();
                        new BI0.f(partitionTagFragment).a();
                        return;
                    }
                    RecommendTagGroup.b bVar = (RecommendTagGroup.b) obj;
                    boolean z8 = bVar.f113879b;
                    String str = bVar.f113878a;
                    if (z8) {
                        TE0.b.T(i7, str, "0");
                        AI0.f fVar3 = partitionTagFragment.f113788e;
                        if (fVar3 != null) {
                            fVar3.N0(str);
                        }
                    } else {
                        if (partitionTagFragment.jf()) {
                            return;
                        }
                        TE0.b.T(i7, str, "1");
                        AI0.f fVar4 = partitionTagFragment.f113788e;
                        if (fVar4 != null) {
                            fVar4.J0(str);
                        }
                    }
                    bVar.f113879b = !bVar.f113879b;
                    RecommendTagGroup recommendTagGroup2 = partitionTagFragment.f113785b;
                    if (recommendTagGroup2 != null) {
                        recommendTagGroup2.d();
                    }
                    partitionTagFragment.kf();
                }
            });
        }
        nf();
        kf();
        A1 a116 = this.f113787d;
        if (a116 != null) {
            TintTextView tintTextView = a116.f54601e;
            Context context = getContext();
            String string = null;
            if (context != null) {
                int i7 = 0;
                if (this.f113788e != null) {
                    i7 = 10;
                }
                string = context.getString(2131851301, Integer.valueOf(i7));
            }
            tintTextView.setText(string);
        }
    }

    @Override // androidx.fragment.app.Fragment, BI0.f.a
    @Nullable
    public final Activity x() {
        return p3();
    }
}
