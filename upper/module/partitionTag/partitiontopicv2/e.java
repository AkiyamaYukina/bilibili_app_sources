package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import DI0.q;
import QK.w;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import bF0.A2;
import bF0.G3;
import bF0.J3;
import com.bilibili.commons.tuple.ImmutablePair;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partition.model.UpperTagBeanV5;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicRequestParam;
import com.bilibili.upper.module.partitionTag.partitionTopic.widget.RecommendTagGroup;
import com.bilibili.upper.module.partitionTag.partitiontopicv2.a;
import com.bilibili.upper.module.partitionTag.partitiontopicv2.b;
import eJ0.C6930h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import vI0.C8791b;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AI0.i f113922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f113923b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f113925d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AI0.f f113927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ImmutablePair<Long, Integer> f113924c = new ImmutablePair<>(0L, -1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<a> f113926e = CollectionsKt.mutableListOf(new a[]{new a.C1231a(null, null), a.b.f113914a});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f113928g = new HashSet<>();

    @NotNull
    public final d h = new d(this);

    public e(@NotNull AI0.i iVar, @NotNull FragmentActivity fragmentActivity) {
        this.f113922a = iVar;
        this.f113923b = fragmentActivity;
        this.f113927f = (AI0.f) new ViewModelProvider(ContextUtilKt.requireFragmentActivity(fragmentActivity)).get(AI0.f.class);
    }

    public final void N(long j7) {
        if (j7 == 0) {
            return;
        }
        List listDrop = CollectionsKt.drop(this.f113926e, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
        Iterator it = listDrop.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.c) ((a) it.next())).f113915a);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            UpperPublishTopicBean.Topic topic = (UpperPublishTopicBean.Topic) arrayList.get(i7);
            int i8 = i7 + 2;
            if (topic.topicId == j7) {
                this.f113924c = new ImmutablePair<>(Long.valueOf(j7), Integer.valueOf(i8));
                notifyItemChanged(i8);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f113926e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        int i8 = 1;
        if (i7 != 0) {
            i8 = i7 != 1 ? 3 : 2;
        }
        return i8;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        ArrayList arrayList;
        boolean z6;
        View viewFindViewById;
        List listEmptyList;
        Integer num;
        int itemViewType = getItemViewType(i7);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                List<a> list = this.f113926e;
                ImmutablePair<Long, Integer> immutablePair = this.f113924c;
                DI0.i iVar = viewHolder instanceof DI0.i ? (DI0.i) viewHolder : null;
                if (iVar != null) {
                    UpperPublishTopicBean.Topic topic = ((a.c) list.get(i7)).f113915a;
                    String str = topic.topicName;
                    Long l7 = (Long) immutablePair.left;
                    long j7 = topic.topicId;
                    J3 j32 = iVar.f2709c;
                    if (l7 != null && l7.longValue() == j7 && (num = (Integer) immutablePair.right) != null && num.intValue() == i7) {
                        j32.f54876e.setSelected(true);
                        j32.f54875d.setSelected(true);
                        j32.f54873b.setTextColorById(2131104252);
                    } else {
                        j32.f54876e.setSelected(false);
                        j32.f54875d.setSelected(false);
                        j32.f54873b.setTextColorById(2131104283);
                    }
                    boolean z7 = iVar.f2707a;
                    boolean z8 = !z7 && topic.missionId > 0;
                    if (z7 && topic.showActivityIcon) {
                        z8 = true;
                    }
                    j32.f54875d.setVisibility(z8 ? 0 : 8);
                    j32.f54874c.setText(C6930h.b(topic.topicVideoVv));
                    j32.f54876e.setOnClickListener(new DI0.h(iVar, topic, i7, this.h));
                    j32.f54873b.setText(str);
                    return;
                }
                return;
            }
            DI0.g gVar = viewHolder instanceof DI0.g ? (DI0.g) viewHolder : null;
            if (gVar != null) {
                G3 g32 = gVar.f2700b;
                g32.f54791c.h.setVisibility(8);
                g32.f54792d.setVisibility(8);
                TintTextView tintTextView = g32.f54794f;
                ViewGroup.LayoutParams layoutParams = tintTextView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(Jf1.h.c(12));
                tintTextView.setLayoutParams(marginLayoutParams);
                AI0.i iVar2 = gVar.f2699a;
                UpperTopicRequestParam upperTopicRequestParam = iVar2.f260f;
                boolean z9 = upperTopicRequestParam != null && upperTopicRequestParam.getCanEditTopic();
                UpperTopicRequestParam upperTopicRequestParam2 = iVar2.f260f;
                boolean z10 = upperTopicRequestParam2 != null && upperTopicRequestParam2.getTopicOpt();
                int i8 = z9 ? 0 : 8;
                TintTextView tintTextView2 = g32.f54793e;
                tintTextView2.setVisibility(i8);
                if (z10) {
                    TintFrameLayout tintFrameLayout = g32.f54790b;
                    if (z9) {
                        tintFrameLayout.setAlpha(1.0f);
                    } else {
                        tintFrameLayout.setAlpha(0.4f);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = tintTextView2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(Jf1.h.c(12));
                tintTextView2.setLayoutParams(marginLayoutParams2);
                tintTextView2.setOnClickListener(new DI0.f(this.f113922a, 0));
                return;
            }
            return;
        }
        a.C1231a c1231a = (a.C1231a) this.f113926e.get(i7);
        q qVar = viewHolder instanceof q ? (q) viewHolder : null;
        if (qVar != null) {
            C8791b c8791b = c1231a.f113912a;
            AI0.i iVar3 = qVar.f2723e;
            AI0.f fVar = qVar.f2722d;
            if (c8791b != null && fVar != null) {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = fVar.f250q;
                if (z11 && fVar.f251r) {
                    for (UpperTagBeanV5 upperTagBeanV5 : fVar.f245l) {
                        if (upperTagBeanV5.type == 0) {
                            arrayList2.add(upperTagBeanV5);
                        }
                    }
                    listEmptyList = c8791b.f128172b.size() >= 3 ? CollectionsKt.take(c8791b.f128172b, 10) : CollectionsKt.take(CollectionsKt.plus(c8791b.f128172b, c8791b.f128171a), 3);
                } else if (fVar.f251r) {
                    for (UpperTagBeanV5 upperTagBeanV52 : fVar.f245l) {
                        if (upperTagBeanV52.type != 2) {
                            arrayList2.add(upperTagBeanV52);
                        }
                    }
                    listEmptyList = CollectionsKt.take(c8791b.f128172b, 10);
                } else if (z11) {
                    for (UpperTagBeanV5 upperTagBeanV53 : fVar.f245l) {
                        if (upperTagBeanV53.type != 1) {
                            arrayList2.add(upperTagBeanV53);
                        }
                    }
                    listEmptyList = CollectionsKt.take(c8791b.f128171a, 3);
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<UpperTagBeanV5> listPlus = CollectionsKt.plus(listEmptyList, arrayList2);
                UpperTopicRequestParam upperTopicRequestParam3 = iVar3.f260f;
                long topicId = upperTopicRequestParam3 != null ? upperTopicRequestParam3.getTopicId() : 0L;
                UpperTopicRequestParam upperTopicRequestParam4 = iVar3.f260f;
                String topicName = upperTopicRequestParam4 != null ? upperTopicRequestParam4.getTopicName() : null;
                String str2 = topicName;
                if (topicName == null) {
                    str2 = "";
                }
                boolean z12 = topicId > 0 && str2.length() > 0;
                if (listPlus.size() <= 10 && !z12) {
                    fVar.f245l.clear();
                    for (UpperTagBeanV5 upperTagBeanV54 : listPlus) {
                        if (!fVar.L0(upperTagBeanV54.tagText)) {
                            fVar.I0(upperTagBeanV54);
                            String str3 = com.bilibili.upper.module.contribute.up.util.m.a;
                            String str4 = upperTagBeanV54.tagText;
                            if (str4 != null) {
                                com.bilibili.upper.module.contribute.up.util.m.a(str4, com.bilibili.upper.module.contribute.up.util.m.c);
                            }
                        }
                    }
                }
            }
            qVar.r0();
            RecTagResponse recTagResponse = c1231a.f113913b;
            if (recTagResponse != null) {
                boolean success = recTagResponse.getSuccess();
                A2 a22 = qVar.f2719a;
                if (!success) {
                    a22.f54609c.b();
                    View errorView = a22.f54609c.getErrorView();
                    if (errorView == null || (viewFindViewById = errorView.findViewById(2131299782)) == null) {
                        return;
                    }
                    viewFindViewById.setOnClickListener(new DI0.j(qVar, 0));
                    return;
                }
                List<UpperRcmdTagBean> data = recTagResponse.getData();
                ArrayList arrayList3 = new ArrayList();
                if (data != null) {
                    Iterator<T> it = data.iterator();
                    while (it.hasNext()) {
                        String str5 = ((UpperRcmdTagBean) it.next()).tag;
                        CopyOnWriteArrayList<UpperTagBeanV5> copyOnWriteArrayList = fVar.f245l;
                        ArrayList arrayList4 = new ArrayList();
                        for (UpperTagBeanV5 upperTagBeanV55 : copyOnWriteArrayList) {
                            String str6 = upperTagBeanV55.tagText;
                            UpperTopicRequestParam upperTopicRequestParam5 = iVar3.f260f;
                            if (!TextUtils.equals(str6, upperTopicRequestParam5 != null ? upperTopicRequestParam5.getTitle() : null)) {
                                arrayList4.add(upperTagBeanV55);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            z6 = false;
                        } else {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                if (TextUtils.equals(((UpperTagBeanV5) it2.next()).tagText, str5)) {
                                    z6 = true;
                                    break;
                                }
                            }
                            z6 = false;
                        }
                        arrayList3.add(new RecommendTagGroup.b(str5, z6));
                    }
                }
                String str7 = com.bilibili.upper.module.contribute.up.util.m.a;
                if (data != null) {
                    List<UpperRcmdTagBean> list2 = data;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        arrayList = arrayList5;
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            arrayList5.add(((UpperRcmdTagBean) it3.next()).tag);
                        }
                    }
                } else {
                    arrayList = null;
                }
                com.bilibili.upper.module.contribute.up.util.m.f(arrayList);
                arrayList3.add(new RecommendTagGroup.b("", false));
                RecommendTagGroup recommendTagGroup = qVar.f2721c;
                if (recommendTagGroup != null) {
                    recommendTagGroup.c(arrayList3);
                }
                if (recommendTagGroup != null) {
                    q.q0(recommendTagGroup);
                }
                a22.f54609c.a();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7, @NotNull List<Object> list) throws NoWhenBranchMatchedException {
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i7, list);
            return;
        }
        if (getItemViewType(i7) != 1) {
            return;
        }
        Object orNull = CollectionsKt.getOrNull(list, 0);
        b bVar = orNull instanceof b ? (b) orNull : null;
        if (bVar == null) {
            return;
        }
        if (bVar instanceof b.a) {
            String str = ((b.a) bVar).f113916a;
            if (str.length() > 0) {
                q qVar = null;
                if (viewHolder instanceof q) {
                    qVar = (q) viewHolder;
                }
                if (qVar != null) {
                    zG0.a.a.getClass();
                    a.a aVar = a.a.a;
                    zG0.h.A(0, 0, str);
                    qVar.f2722d.J0(str);
                    qVar.r0();
                    return;
                }
                return;
            }
            return;
        }
        if (bVar instanceof b.C1232b) {
            q qVar2 = null;
            if (viewHolder instanceof q) {
                qVar2 = (q) viewHolder;
            }
            if (qVar2 != null) {
                qVar2.s0();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        q qVar3 = null;
        if (viewHolder instanceof q) {
            qVar3 = (q) viewHolder;
        }
        if (qVar3 != null) {
            qVar3.r0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder qVar;
        if (i7 != 1) {
            AI0.i iVar = this.f113922a;
            if (i7 != 2) {
                UpperTopicRequestParam upperTopicRequestParam = iVar.f260f;
                boolean topicOpt = false;
                boolean canEditTopic = upperTopicRequestParam != null ? upperTopicRequestParam.getCanEditTopic() : false;
                UpperTopicRequestParam upperTopicRequestParam2 = iVar.f260f;
                if (upperTopicRequestParam2 != null) {
                    topicOpt = upperTopicRequestParam2.getTopicOpt();
                }
                qVar = new DI0.i(topicOpt, canEditTopic, J3.inflate(LayoutInflater.from(viewGroup.getContext())));
            } else {
                qVar = new DI0.g(iVar, G3.inflate(LayoutInflater.from(viewGroup.getContext())));
            }
        } else {
            qVar = new q(A2.inflate(LayoutInflater.from(viewGroup.getContext())), new w(this, 4));
        }
        return qVar;
    }
}
