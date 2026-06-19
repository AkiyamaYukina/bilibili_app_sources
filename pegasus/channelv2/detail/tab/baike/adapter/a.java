package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter;

import Z7.g;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeViewModel;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelBaikeTitleItem;
import do0.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Z7.a<FeedItem, Z7.c<FeedItem>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Fragment f75107g;

    @NotNull
    public final List<FeedItem> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f75108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f75109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75110k;

    public a() {
        throw null;
    }

    public a(int i7, final Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        b bVarC = b.c();
        super(arrayList);
        this.f75106f = i7;
        this.f75107g = fragment;
        this.h = arrayList;
        this.f75108i = bVarC;
        final Function0<Fragment> function0 = new Function0<Fragment>(fragment) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = fragment;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7915invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7916invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75109j = FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(ChannelBaikeViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7917invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m7918invoke() {
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
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$4.m7918invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(fragment, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = fragment;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m7919invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.BaikeDataAdapter$special$$inlined$viewModels$default$5.m7919invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f75110k = "BaikeDataAdapter";
    }

    @NotNull
    public final g N() {
        return this.f75108i;
    }

    @NotNull
    public final String O(int i7) {
        String str;
        BasicIndexItem basicIndexItem = (FeedItem) CollectionsKt.getOrNull(this.h, i7);
        if (basicIndexItem instanceof BasicIndexItem) {
            String str2 = basicIndexItem.cardType;
            str = str2;
            if (str2 == null) {
                str = EnvironmentCompat.MEDIA_UNKNOWN;
            }
        } else {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            if (basicIndexItem instanceof ChannelBaikeTitleItem) {
                String cardType = ((ChannelBaikeTitleItem) basicIndexItem).getCardType();
                str = cardType;
                if (cardType == null) {
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                }
            }
        }
        return str;
    }

    public final void P(@NotNull Z7.c<FeedItem> cVar, int i7, @NotNull List<Object> list) {
        throw null;
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        Z7.c cVar = (Z7.c) viewHolder;
        do0.b bVar = (do0.b) (cVar instanceof do0.b ? cVar : null);
        if (bVar != null) {
            bVar.f116538b = Integer.valueOf(this.f75106f);
        }
        Z7.c cVar2 = null;
        if (cVar instanceof h) {
            cVar2 = cVar;
        }
        h hVar = (h) cVar2;
        if (hVar != null) {
            hVar.f116549b = this.f75107g;
            hVar.f116550c = (ChannelBaikeViewModel) this.f75109j.getValue();
        }
        super.P(cVar, i7, list);
    }

    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Z7.c cVar = (Z7.c) viewHolder;
        cVar.performRecycled$recyclerviewExtension_release();
        ((Z7.a) this).d.remove(cVar);
        cVar.getData();
        if (!(cVar instanceof h)) {
            cVar = null;
        }
        h hVar = (h) cVar;
        if (hVar != null) {
            hVar.f116549b = null;
            hVar.f116550c = null;
        }
    }
}
