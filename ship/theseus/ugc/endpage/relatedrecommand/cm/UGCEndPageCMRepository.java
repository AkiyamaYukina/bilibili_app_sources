package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.bilibili.biligame.ui.home.dialog.i;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.ship.theseus.united.page.intro.module.merchandise.c;
import com.bilibili.ship.theseus.united.page.intro.module.merchandise.d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kntr.common.ad.capability.adextra.AdExtraUgcEndPageQuery;
import kntr.common.ad.core.AdSlot;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRepository.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageCMRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewReply f96877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final d f96878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f96879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f96880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f96881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Set<AdExtraUgcEndPageQuery.CtxAd> f96882g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCEndPageCMRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageCMRepository uGCEndPageCMRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageCMRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List listBuild;
            Object objEmptyList;
            SourceContent sourceContent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCEndPageCMRepository uGCEndPageCMRepository = this.this$0;
                Set<AdExtraUgcEndPageQuery.CtxAd> set = uGCEndPageCMRepository.f96882g;
                ViewReply viewReply = uGCEndPageCMRepository.f96877b;
                if (viewReply.hasCm()) {
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(AdMossHelper.INSTANCE.createSourceContentList(viewReply.getCm().getSourceContentList()));
                    List list = listCreateListBuilder;
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        int iComponent1 = indexedValue.component1();
                        SourceContent sourceContent2 = (SourceContent) indexedValue.component2();
                        AdExtraUgcEndPageQuery.CtxAd ctxAdA = sourceContent2 != null ? UGCEndPageCMRepository.a(sourceContent2, iComponent1) : null;
                        if (ctxAdA != null) {
                            list.add(ctxAdA);
                        }
                    }
                    for (IndexedValue indexedValue2 : CollectionsKt.withIndex(AdMossHelper.INSTANCE.createSourceContentItemList(viewReply.getCm().getSourceContentItemList()))) {
                        int iComponent12 = indexedValue2.component1();
                        SourceContent sourceContent3 = (SourceContent) indexedValue2.component2();
                        AdExtraUgcEndPageQuery.CtxAd ctxAdA2 = sourceContent3 != null ? UGCEndPageCMRepository.a(sourceContent3, iComponent12) : null;
                        if (ctxAdA2 != null) {
                            list.add(ctxAdA2);
                        }
                    }
                    listBuild = CollectionsKt.build(listCreateListBuilder);
                } else {
                    listBuild = CollectionsKt.emptyList();
                }
                set.addAll(listBuild);
                UGCEndPageCMRepository uGCEndPageCMRepository2 = this.this$0;
                Set<AdExtraUgcEndPageQuery.CtxAd> set2 = uGCEndPageCMRepository2.f96882g;
                d dVar = uGCEndPageCMRepository2.f96878c;
                if (dVar != null) {
                    List<c> list2 = dVar.f100579c;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    int i8 = 0;
                    while (true) {
                        objEmptyList = arrayList;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        c cVar = (c) next;
                        AdExtraUgcEndPageQuery.CtxAd ctxAdA3 = (cVar == null || (sourceContent = cVar.f100576e) == null) ? null : UGCEndPageCMRepository.a(sourceContent, i8);
                        if (ctxAdA3 != null) {
                            arrayList.add(ctxAdA3);
                        }
                        i8++;
                    }
                } else {
                    objEmptyList = CollectionsKt.emptyList();
                }
                set2.addAll((Collection) objEmptyList);
                StateFlow<q0> stateFlow = this.this$0.f96879d.f100853c;
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UGCEndPageCMRepository uGCEndPageCMRepository3 = this.this$0;
            uGCEndPageCMRepository3.f96882g.addAll(SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.withIndex(CollectionsKt.asSequence(((q0) obj).f101364a)), new i(uGCEndPageCMRepository3, 2))));
            this.this$0.f96880e.setValue(GAdCoreKt.getGAdExtra().ugcEndPage(CollectionsKt.toList(this.this$0.f96882g)));
            return Unit.INSTANCE;
        }
    }

    @Inject
    public UGCEndPageCMRepository(@NotNull CoroutineScope coroutineScope, @NotNull ViewReply viewReply, @Nullable d dVar, @NotNull DetailRelateRepository detailRelateRepository) {
        this.f96876a = coroutineScope;
        this.f96877b = viewReply;
        this.f96878c = dVar;
        this.f96879d = detailRelateRepository;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(GAdCoreKt.getGAdExtra().get(AdSlot.DETAIL_ENDPAGE));
        this.f96880e = MutableStateFlow;
        this.f96881f = MutableStateFlow;
        this.f96882g = new LinkedHashSet();
        BuildersKt.launch$default(coroutineScope, Dispatchers.getDefault(), (CoroutineStart) null, new AnonymousClass1(this, null), 2, (Object) null);
    }

    public static AdExtraUgcEndPageQuery.CtxAd a(SourceContent sourceContent, int i7) {
        SourceContent.AdContent adContent = sourceContent.getAdContent();
        if (adContent == null) {
            return null;
        }
        return new AdExtraUgcEndPageQuery.CtxAd(sourceContent.getResourceId(), sourceContent.getSrcId(), adContent.getCreativeId(), i7 + 1);
    }
}
