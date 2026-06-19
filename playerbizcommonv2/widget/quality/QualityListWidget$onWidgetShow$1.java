package com.bilibili.playerbizcommonv2.widget.quality;

import android.view.ViewGroup;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.VodIndex;
import com.bilibili.player.tangram.playercore.C5774b;
import com.bilibili.video.story.player.quality.StoryVipQualityTrialService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityListWidget$onWidgetShow$1.class */
public final class QualityListWidget$onWidgetShow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final QualityListWidget this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.QualityListWidget$onWidgetShow$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityListWidget$onWidgetShow$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final QualityListWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QualityListWidget qualityListWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = qualityListWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = (com.bilibili.player.tangram.basic.a) obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            com.bilibili.player.tangram.basic.a aVar;
            VodIndex vodIndex;
            ArrayList arrayList;
            Object next;
            PlayIndex playIndex;
            ViewGroup viewGroup;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            boolean z6 = true;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
                this.L$0 = aVar;
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.player.tangram.basic.a aVar2 = (com.bilibili.player.tangram.basic.a) this.L$0;
                ResultKt.throwOnFailure(obj);
                aVar = aVar2;
            }
            QualityListWidget qualityListWidget = this.this$0;
            MediaResource mediaResource = (MediaResource) qualityListWidget.f82723d.invoke();
            int iIntValue = ((Number) qualityListWidget.f82726g.invoke()).intValue();
            if (aVar == null || mediaResource == null || (vodIndex = mediaResource.mVodIndex) == null || (arrayList = vodIndex.mVodList) == null) {
                playIndex = null;
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(C5774b.a((PlayIndex) next), aVar)) {
                        break;
                    }
                }
                playIndex = (PlayIndex) next;
            }
            com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-QualityListWidget-updateData-w4IKBqk] ", "Actual quality: " + aVar + ", currentPlayIndex: " + playIndex, "QualityListWidget-updateData-w4IKBqk");
            i0 i0Var = qualityListWidget.f82731m;
            StoryVipQualityTrialService storyVipQualityTrialService = qualityListWidget.f82725f;
            if (i0Var != null) {
                ArrayList arrayList2 = null;
                if (mediaResource != null) {
                    VodIndex vodIndex2 = mediaResource.mVodIndex;
                    arrayList2 = null;
                    if (vodIndex2 != null) {
                        arrayList2 = vodIndex2.mVodList;
                    }
                }
                if (storyVipQualityTrialService == null || !storyVipQualityTrialService.b()) {
                    z6 = false;
                }
                i0Var.N(arrayList2, iIntValue, playIndex, z6);
            }
            i0 i0Var2 = qualityListWidget.f82731m;
            if (i0Var2 != null) {
                i0Var2.notifyDataSetChanged();
            }
            if (storyVipQualityTrialService != null && !storyVipQualityTrialService.b() && !storyVipQualityTrialService.d()) {
                vk.e eVarE = storyVipQualityTrialService.e();
                if (vk.f.a(eVarE != null ? eVarE.i : -1, 0) && (viewGroup = qualityListWidget.f82732n) != null) {
                    viewGroup.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityListWidget$onWidgetShow$1(QualityListWidget qualityListWidget, Continuation<? super QualityListWidget$onWidgetShow$1> continuation) {
        super(2, continuation);
        this.this$0 = qualityListWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityListWidget$onWidgetShow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            QualityListWidget qualityListWidget = this.this$0;
            StateFlow stateFlow = qualityListWidget.f82722c;
            if (stateFlow != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(qualityListWidget, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
