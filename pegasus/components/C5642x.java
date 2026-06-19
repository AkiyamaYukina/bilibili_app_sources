package com.bilibili.pegasus.components;

import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bus.Violet;
import com.bilibili.inline.biz.card.ICardFollowingStateArgsItem;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.relation.FollowStateEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/x.class */
@StabilityInferred(parameters = 0)
public final class C5642x extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77240k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f77241l = "FavStateComponent";

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.x$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/x$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5642x f77242a;

        public a(C5642x c5642x) {
            this.f77242a = c5642x;
        }

        public final Object invoke() {
            return this.f77242a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.x$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/x$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5642x f77243a;

        public b(C5642x c5642x) {
            this.f77243a = c5642x;
        }

        public final Object invoke() {
            return this.f77243a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.x$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/x$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5642x f77244a;

        public c(C5642x c5642x) {
            this.f77244a = c5642x;
        }

        public final Object invoke() {
            return this.f77244a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public final PegasusViewModel b() {
        return (PegasusViewModel) this.f77240k.getValue();
    }

    @NotNull
    public final String getComponentName() {
        return this.f77241l;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(Mq0.e.class).observeCachedInactive(getRequireViewLifecycleOwner(), new Observer(this) { // from class: com.bilibili.pegasus.components.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5642x f77164a;

            {
                this.f77164a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<Mq0.e> list = (List) obj;
                LongSparseArray longSparseArray = new LongSparseArray(list.size());
                for (Mq0.e eVar : list) {
                    longSparseArray.put(eVar.f16325a, eVar);
                }
                C5642x c5642x = this.f77164a;
                for (PegasusHolderData pegasusHolderData : SequencesKt.filter(CollectionsKt.asSequence(((C8028c) c5642x.b().f79020m.getValue()).f123831a.f123826a), C5641w.f77224a)) {
                    Mq0.e eVar2 = (Mq0.e) longSparseArray.get(pegasusHolderData.getAid());
                    if (eVar2 != null) {
                        pegasusHolderData.updateLikeState(eVar2.f16326b, eVar2.f16327c);
                        PegasusViewModel pegasusViewModelB = c5642x.b();
                        pegasusViewModelB.getClass();
                        pegasusViewModelB.z(pegasusViewModelB, new com.bilibili.pegasus.vm.k(pegasusHolderData, "like_update"));
                    }
                }
            }
        });
        violet.ofChannel(FollowStateEvent.class).observeCachedInactive(getRequireViewLifecycleOwner(), new Observer(this) { // from class: com.bilibili.pegasus.components.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5642x f77177a;

            {
                this.f77177a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SparseArray innerMids;
                List<FollowStateEvent> list = (List) obj;
                ArrayList<PegasusHolderData> arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray(list.size());
                for (FollowStateEvent followStateEvent : list) {
                    longSparseArray.put(followStateEvent.getUid(), followStateEvent);
                }
                C5642x c5642x = this.f77177a;
                for (ICardFollowingStateArgsItem iCardFollowingStateArgsItem : CollectionsKt.asSequence(((C8028c) c5642x.b().f79020m.getValue()).f123831a.f123826a)) {
                    ICardFollowingStateArgsItem iCardFollowingStateArgsItem2 = iCardFollowingStateArgsItem instanceof ICardFollowingStateArgsItem ? iCardFollowingStateArgsItem : null;
                    if (iCardFollowingStateArgsItem2 != null && (innerMids = iCardFollowingStateArgsItem2.getInnerMids()) != null) {
                        int size = innerMids.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            int iKeyAt = innerMids.keyAt(i7);
                            Long l7 = (Long) innerMids.valueAt(i7);
                            FollowStateEvent followStateEvent2 = (FollowStateEvent) longSparseArray.get(l7 != null ? l7.longValue() : -1L);
                            if (followStateEvent2 != null && iCardFollowingStateArgsItem2.getInnerFollowingState(iKeyAt) != followStateEvent2.isFollow()) {
                                iCardFollowingStateArgsItem2.setInnerFollowingState(iKeyAt, followStateEvent2.isFollow());
                                arrayList.add(iCardFollowingStateArgsItem);
                            }
                        }
                    }
                }
                for (PegasusHolderData pegasusHolderData : arrayList) {
                    PegasusViewModel pegasusViewModelB = c5642x.b();
                    pegasusViewModelB.getClass();
                    pegasusViewModelB.z(pegasusViewModelB, new com.bilibili.pegasus.vm.k(pegasusHolderData, "following_update"));
                }
            }
        });
        violet.ofChannel(VideoStatusMessage.class).observeCachedInactive(getRequireViewLifecycleOwner(), new C5640v(this));
    }
}
