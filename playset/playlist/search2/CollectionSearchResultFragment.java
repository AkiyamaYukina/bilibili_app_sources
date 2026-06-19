package com.bilibili.playset.playlist.search2;

import AL.s;
import Pa.J;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ListCardType;
import com.bilibili.app.comm.list.common.widget.bottomsheet.ListBottomSheetDialogV2;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.TranslateInfo;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.playlist.search2.n;
import com.bilibili.playset.playlist.search2.o;
import com.bilibili.playset.playlist.ui.LoadingErrorEmptyView;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.InterfaceC8258d;
import ps0.AbstractC8352b;
import tv.danmaku.android.log.BLog;
import ys0.C9083b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class CollectionSearchResultFragment extends Hilt_CollectionSearchResultFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public es0.q f85402g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.bilibili.playset.playlist.adapters.b f85403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f85404j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$a.class */
    public static final class a extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionSearchResultFragment f85405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85406b;

        public a(CollectionSearchResultFragment collectionSearchResultFragment, int i7) {
            this.f85405a = collectionSearchResultFragment;
            this.f85406b = i7;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            return this.f85405a.kf().getItemViewType(i7) == -1451220578 ? this.f85406b : 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$b.class */
    public static final class b extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionSearchResultFragment f85407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85408b;

        public b(CollectionSearchResultFragment collectionSearchResultFragment, int i7) {
            this.f85407a = collectionSearchResultFragment;
            this.f85408b = i7;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            return this.f85407a.kf().getItemViewType(i7) == -1451220578 ? this.f85408b : 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$c.class */
    public static final class c extends C9083b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$d.class */
    public static final class d extends AbstractC8352b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionSearchResultFragment f85409a;

        public d(CollectionSearchResultFragment collectionSearchResultFragment) {
            this.f85409a = collectionSearchResultFragment;
        }

        @Override // ps0.AbstractC8352b
        public final void a() {
            CollectionSearchResultFragment collectionSearchResultFragment = this.f85409a;
            h hVar = (h) collectionSearchResultFragment.mf().f85421c.getValue();
            if (hVar.f85450e) {
                collectionSearchResultFragment.mf().I0(new n.a(true, hVar.f85451f));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$e.class */
    public static final class e implements InterfaceC8258d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionSearchResultFragment f85410a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$e$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f85411a;

            static {
                int[] iArr = new int[CollectionTypeEnum.values().length];
                try {
                    iArr[CollectionTypeEnum.SEASON.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[CollectionTypeEnum.UGC.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[CollectionTypeEnum.UGC_SEASON.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f85411a = iArr;
            }
        }

        public e(CollectionSearchResultFragment collectionSearchResultFragment) {
            this.f85410a = collectionSearchResultFragment;
        }

        @Override // os0.InterfaceC8258d
        public final void a(final com.bilibili.playset.api.c cVar) {
            if (cVar.u() != null) {
                ListBottomSheetDialogV2 listBottomSheetDialogV2 = new ListBottomSheetDialogV2();
                final CollectionSearchResultFragment collectionSearchResultFragment = this.f85410a;
                FragmentManager childFragmentManager = collectionSearchResultFragment.getChildFragmentManager();
                Function0 function0 = new Function0(cVar, collectionSearchResultFragment) { // from class: com.bilibili.playset.playlist.search2.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.playset.api.c f85442a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CollectionSearchResultFragment f85443b;

                    {
                        this.f85442a = cVar;
                        this.f85443b = collectionSearchResultFragment;
                    }

                    public final Object invoke() {
                        com.bilibili.playset.api.c cVar2 = this.f85442a;
                        Neurons.reportClick(false, "main.my-fav.content-card.more-translate.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("action_type", com.bilibili.playset.api.e.a(cVar2) ? "original" : "translate"), TuplesKt.to("card_page", "search"), TuplesKt.to("oid", String.valueOf(cVar2.k())), TuplesKt.to("fav_type", String.valueOf(cVar2.l()))}));
                        CollectionSearchResultFragment collectionSearchResultFragment2 = this.f85443b;
                        collectionSearchResultFragment2.getClass();
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(collectionSearchResultFragment2), (CoroutineContext) null, (CoroutineStart) null, new CollectionSearchResultFragment$switchTranslate$1(collectionSearchResultFragment2, cVar2, null), 3, (Object) null);
                        return Unit.INSTANCE;
                    }
                };
                String translateText = null;
                if (com.bilibili.playset.api.e.a(cVar)) {
                    TranslateInfo translateInfoU = cVar.u();
                    if (translateInfoU != null) {
                        translateText = translateInfoU.getOriginText();
                    }
                } else {
                    TranslateInfo translateInfoU2 = cVar.u();
                    if (translateInfoU2 != null) {
                        translateText = translateInfoU2.getTranslateText();
                    }
                }
                ListBottomSheetDialogV2.hf(listBottomSheetDialogV2, childFragmentManager, (String) null, CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.l(translateText, (String) null, Integer.valueOf(com.bilibili.playset.api.e.a(cVar) ? 2131244384 : 2131244385), R$color.Text1, false, function0, 74)), (String) null, 24);
            }
        }

        @Override // os0.InterfaceC8258d
        public final void b(com.bilibili.playset.api.c cVar) {
            if (cVar.y()) {
                return;
            }
            MultitypeMedia multitypeMediaB = com.bilibili.playset.api.g.b(cVar);
            boolean zX = cVar.x();
            CollectionSearchResultFragment collectionSearchResultFragment = this.f85410a;
            if (zX) {
                com.bilibili.playset.utils.d.a(collectionSearchResultFragment.requireContext(), Uri.parse(cVar.i()), "");
                Neurons.reportClick(false, "playlist.playlist-search.PLdetail-search-resultlist.0.click", MapsKt.mapOf(new Pair("flow", "music_detail")));
            } else {
                com.bilibili.playset.utils.d.a(collectionSearchResultFragment.requireContext(), Uri.parse(cVar.i()), "playlist.playlist-detail.0.0");
                int i7 = a.f85411a[multitypeMediaB.getCardType().ordinal()];
                cf.p.b("flow", i7 != 1 ? i7 != 2 ? i7 != 3 ? EnvironmentCompat.MEDIA_UNKNOWN : "drama_ugcvideo_detail" : "ugcvideo_detail" : "drama", "playlist.playlist-search.PLdetail-search-resultlist.0.click", false);
            }
        }

        @Override // os0.InterfaceC8258d
        public final void c(com.bilibili.playset.api.c cVar) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CollectionSearchResultFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CollectionSearchResultFragment f85412a;

            public a(CollectionSearchResultFragment collectionSearchResultFragment) {
                this.f85412a = collectionSearchResultFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                h hVar = (h) obj;
                com.bilibili.playset.playlist.adapters.b bVarKf = this.f85412a.kf();
                com.bilibili.playset.api.d dVar = new com.bilibili.playset.api.d(hVar.f85452g, hVar.f85450e, hVar.f85448c, hVar.f85454j, hVar.f85455k, 96);
                ((ArrayList) bVarKf.f124955c).clear();
                List<com.bilibili.playset.api.c> listD = dVar.d();
                if (listD != null) {
                    List<com.bilibili.playset.api.a> list = bVarKf.f124955c;
                    ((ArrayList) list).addAll(listD);
                }
                os0.q qVar = bVarKf.f85198g;
                qVar.f124964b = 3;
                qVar.f124965c = bVarKf.h;
                ((ArrayList) bVarKf.f124955c).add(qVar);
                bVarKf.submitList(CollectionsKt.toList(bVarKf.f124955c));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CollectionSearchResultFragment collectionSearchResultFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = collectionSearchResultFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<h> stateFlow = this.this$0.mf().f85421c;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CollectionSearchResultFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CollectionSearchResultFragment f85413a;

            /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$2$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$2$a$a.class */
            public static final /* synthetic */ class C0570a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f85414a;

                static {
                    int[] iArr = new int[PageStatus.values().length];
                    try {
                        iArr[PageStatus.NO_DATA_THIS_PAGE.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[PageStatus.NO_DATA_AT_ALL.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[PageStatus.SUCCESS_OVER.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[PageStatus.SUCCESS_AND_HAS_MORE.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    try {
                        iArr[PageStatus.NET_ERROR.ordinal()] = 5;
                    } catch (NoSuchFieldError e11) {
                    }
                    try {
                        iArr[PageStatus.HAS_MORE_AND_FOOT_GONE.ordinal()] = 6;
                    } catch (NoSuchFieldError e12) {
                    }
                    f85414a = iArr;
                }
            }

            public a(CollectionSearchResultFragment collectionSearchResultFragment) {
                this.f85413a = collectionSearchResultFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                PageStatus pageStatus = (PageStatus) obj;
                BLog.d("CollectionSearchResultFragment", "status:" + pageStatus);
                int i7 = C0570a.f85414a[pageStatus.ordinal()];
                CollectionSearchResultFragment collectionSearchResultFragment = this.f85413a;
                switch (i7) {
                    case 1:
                        collectionSearchResultFragment.lf().f117464c.setVisibility(0);
                        LoadingErrorEmptyView loadingErrorEmptyView = collectionSearchResultFragment.lf().f117464c;
                        String str = ((h) collectionSearchResultFragment.mf().f85421c.getValue()).f85457m;
                        View.OnClickListener sVar = new s(collectionSearchResultFragment, 5);
                        Iterator it = ((ArrayList) loadingErrorEmptyView.f85513e).iterator();
                        while (it.hasNext()) {
                            ((LoadingErrorEmptyView.a) it.next()).d();
                        }
                        loadingErrorEmptyView.animate().cancel();
                        loadingErrorEmptyView.setAlpha(1.0f);
                        loadingErrorEmptyView.setVisibility(0);
                        loadingErrorEmptyView.f85509a.setVisibility(0);
                        loadingErrorEmptyView.f85509a.setVisibility(0);
                        loadingErrorEmptyView.f85509a.setImageResource(2131236937);
                        if (TextUtils.isEmpty(str)) {
                            loadingErrorEmptyView.f85510b.setVisibility(8);
                        } else {
                            loadingErrorEmptyView.f85510b.setVisibility(0);
                            loadingErrorEmptyView.f85510b.setText(str);
                        }
                        loadingErrorEmptyView.f85511c.setVisibility(8);
                        loadingErrorEmptyView.f85512d.setVisibility(0);
                        loadingErrorEmptyView.f85512d.setOnClickListener(sVar);
                        com.bilibili.playset.playlist.adapters.b bVarKf = collectionSearchResultFragment.kf();
                        bVarKf.f85198g.f124964b = 3;
                        bVarKf.P();
                        break;
                    case 2:
                        collectionSearchResultFragment.lf().f117464c.setVisibility(0);
                        LoadingErrorEmptyView loadingErrorEmptyView2 = collectionSearchResultFragment.lf().f117464c;
                        String str2 = ((h) collectionSearchResultFragment.mf().f85421c.getValue()).f85457m;
                        Iterator it2 = ((ArrayList) loadingErrorEmptyView2.f85513e).iterator();
                        while (it2.hasNext()) {
                            ((LoadingErrorEmptyView.a) it2.next()).d();
                        }
                        loadingErrorEmptyView2.animate().cancel();
                        loadingErrorEmptyView2.setAlpha(1.0f);
                        loadingErrorEmptyView2.setVisibility(0);
                        loadingErrorEmptyView2.f85509a.setVisibility(0);
                        loadingErrorEmptyView2.f85509a.setVisibility(0);
                        loadingErrorEmptyView2.f85509a.setImageResource(2131236937);
                        if (TextUtils.isEmpty(str2)) {
                            loadingErrorEmptyView2.f85510b.setVisibility(8);
                        } else {
                            loadingErrorEmptyView2.f85510b.setVisibility(0);
                            loadingErrorEmptyView2.f85510b.setText(str2);
                        }
                        if (TextUtils.isEmpty(null)) {
                            loadingErrorEmptyView2.f85511c.setVisibility(8);
                            loadingErrorEmptyView2.f85512d.setVisibility(8);
                        } else {
                            loadingErrorEmptyView2.f85511c.setVisibility(0);
                            loadingErrorEmptyView2.f85511c.setText((CharSequence) null);
                            loadingErrorEmptyView2.f85511c.setOnClickListener(null);
                            loadingErrorEmptyView2.f85512d.setVisibility(8);
                        }
                        com.bilibili.playset.playlist.adapters.b bVarKf2 = collectionSearchResultFragment.kf();
                        bVarKf2.f85198g.f124964b = 3;
                        bVarKf2.P();
                        break;
                    case 3:
                        ListExtentionsKt.gone(collectionSearchResultFragment.lf().f117464c);
                        com.bilibili.playset.playlist.adapters.b bVarKf3 = collectionSearchResultFragment.kf();
                        String str3 = ((h) collectionSearchResultFragment.mf().f85421c.getValue()).f85457m;
                        os0.q qVar = bVarKf3.f85198g;
                        qVar.f124964b = 1;
                        bVarKf3.h = str3;
                        qVar.f124965c = str3;
                        bVarKf3.P();
                        break;
                    case 4:
                        ListExtentionsKt.gone(collectionSearchResultFragment.lf().f117464c);
                        com.bilibili.playset.playlist.adapters.b bVarKf4 = collectionSearchResultFragment.kf();
                        String str4 = ((h) collectionSearchResultFragment.mf().f85421c.getValue()).f85457m;
                        os0.q qVar2 = bVarKf4.f85198g;
                        qVar2.f124964b = 5;
                        bVarKf4.h = str4;
                        qVar2.f124965c = str4;
                        bVarKf4.P();
                        break;
                    case 5:
                        ListExtentionsKt.visible(collectionSearchResultFragment.lf().f117464c);
                        collectionSearchResultFragment.lf().f117464c.m(new Rt.p(collectionSearchResultFragment, 2), null);
                        com.bilibili.playset.playlist.adapters.b bVarKf5 = collectionSearchResultFragment.kf();
                        bVarKf5.f85198g.f124964b = 3;
                        bVarKf5.P();
                        break;
                    case 6:
                        ListExtentionsKt.gone(collectionSearchResultFragment.lf().f117464c);
                        com.bilibili.playset.playlist.adapters.b bVarKf6 = collectionSearchResultFragment.kf();
                        bVarKf6.f85198g.f124964b = 3;
                        bVarKf6.P();
                        break;
                    default:
                        ListExtentionsKt.gone(collectionSearchResultFragment.lf().f117464c);
                        com.bilibili.playset.playlist.adapters.b bVarKf7 = collectionSearchResultFragment.kf();
                        bVarKf7.f85198g.f124964b = 3;
                        bVarKf7.P();
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CollectionSearchResultFragment collectionSearchResultFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = collectionSearchResultFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CollectionSearchViewModel$special$$inlined$map$1 collectionSearchViewModel$special$$inlined$map$1 = this.this$0.mf().f85423e;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (collectionSearchViewModel$special$$inlined$map$1.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CollectionSearchResultFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CollectionSearchResultFragment f85415a;

            public a(CollectionSearchResultFragment collectionSearchResultFragment) {
                this.f85415a = collectionSearchResultFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                com.bilibili.playset.playlist.adapters.b bVarKf = this.f85415a.kf();
                bVarKf.h = str;
                bVarKf.f85198g.f124965c = str;
                bVarKf.P();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CollectionSearchResultFragment collectionSearchResultFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = collectionSearchResultFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<String> flow = this.this$0.mf().f85424f;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CollectionSearchResultFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$onViewCreated$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchResultFragment$onViewCreated$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CollectionSearchResultFragment f85416a;

            public a(CollectionSearchResultFragment collectionSearchResultFragment) {
                this.f85416a = collectionSearchResultFragment;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                o oVar = (o) obj;
                if (!(oVar instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ToastHelper.showToastShort(this.f85416a.requireContext(), ((o.a) oVar).f85471a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CollectionSearchResultFragment collectionSearchResultFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = collectionSearchResultFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<o> sharedFlow = this.this$0.mf().f85422d;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public CollectionSearchResultFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8566invoke() {
                return this.$this_viewModels;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8567invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CollectionSearchViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8568invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8569invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$4.m8569invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m8570invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.CollectionSearchResultFragment$special$$inlined$viewModels$default$5.m8570invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f85404j = LazyKt.lazy(lazyThreadSafetyMode, new J(this, 6));
    }

    @NotNull
    public final com.bilibili.playset.playlist.adapters.b kf() {
        com.bilibili.playset.playlist.adapters.b bVar = this.f85403i;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final es0.q lf() {
        es0.q qVar = this.f85402g;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final CollectionSearchViewModel mf() {
        return (CollectionSearchViewModel) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        if (context == null) {
            return;
        }
        int i7 = mf().f85419a;
        mf().f85419a = configuration.screenWidthDp;
        ListCardType.a aVar = ListCardType.Companion;
        int i8 = mf().f85419a;
        aVar.getClass();
        if (ListCardType.a.e(i7, i8)) {
            int i9 = ListCardType.a.i(com.bilibili.playset.utils.b.a(context));
            RecyclerView.LayoutManager layoutManager = lf().f117463b.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.setSpanSizeLookup(new a(this, i9));
                gridLayoutManager.setSpanCount(i9);
                gridLayoutManager.requestLayout();
            }
            lf().f117463b.invalidateItemDecorations();
            kf().notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Resources resources;
        Configuration configuration;
        BLog.d("CollectionSearchResultFragment", "onCreateView");
        this.f85402g = es0.q.inflate(layoutInflater);
        CollectionSearchViewModel collectionSearchViewModelMf = mf();
        Context context = getContext();
        collectionSearchViewModelMf.f85419a = (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.screenWidthDp;
        ListCardType.a aVar = ListCardType.Companion;
        ListCardType listCardTypeA = com.bilibili.playset.utils.b.a(lf().f117462a.getContext());
        aVar.getClass();
        int i7 = ListCardType.a.i(listCardTypeA);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i7);
        gridLayoutManager.setSpanSizeLookup(new b(this, i7));
        lf().f117463b.setLayoutManager(gridLayoutManager);
        lf().f117463b.setItemAnimator(null);
        tv.danmaku.bili.widget.RecyclerView recyclerView = lf().f117463b;
        int i8 = R$color.Ga2;
        int px = ListExtentionsKt.toPx(0.5f);
        Context context2 = getContext();
        recyclerView.addItemDecoration(new C9083b(i8, px, context2 != null ? com.bilibili.playset.utils.b.c(context2, 6, false) : ListExtentionsKt.toPx(12), 80, true));
        lf().f117463b.addOnScrollListener(new d(this));
        lf().f117463b.addOnScrollListener((com.bilibili.playset.playlist.helper.a) this.f85404j.getValue());
        this.f85403i = new com.bilibili.playset.playlist.adapters.b(new e(this), new Nt0.c(this, 4));
        lf().f117463b.setAdapter(kf());
        return lf().f117462a;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        BLog.d("CollectionSearchResultFragment", "onFragmentShow");
        if (((h) mf().f85421c.getValue()).h == 0) {
            mf().I0(new n.a(true, false));
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        Boolean booleanStrictOrNull;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if ((arguments == null || (string = arguments.getString("isEmbedded")) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(string)) == null) ? false : booleanStrictOrNull.booleanValue()) {
            int curBottomTabHeight = GarbManager.getCurBottomTabHeight(requireContext().getApplicationContext());
            lf().f117463b.setClipToPadding(false);
            lf().f117463b.setPadding(lf().f117463b.getPaddingLeft(), lf().f117463b.getPaddingTop(), lf().f117463b.getPaddingRight(), curBottomTabHeight);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }
}
