package com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.app.screen.adjust.widget.q;
import com.bilibili.playerbizcommonv2.danmaku.widget.A;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.playerbizcommonv2.videomentioned.InterfaceC5802a;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardState;
import com.bilibili.playerbizcommonv2.videomentioned.g;
import com.bilibili.playerbizcommonv2.videomentioned.y;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService.class */
@StabilityInferred(parameters = 0)
public final class VideoMentionedDialogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f97850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.videomentioned.b f97852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f97853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f97854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f97855f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final VideoMentionedDialogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoMentionedDialogService f97856a;

            public a(VideoMentionedDialogService videoMentionedDialogService) {
                this.f97856a = videoMentionedDialogService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((g) obj) instanceof g.d) {
                    VideoMentionedDialogService videoMentionedDialogService = this.f97856a;
                    PageReportService pageReportService = videoMentionedDialogService.f97854e;
                    List<MentionedCardItem<UIComponent.ViewEntry>> listB = videoMentionedDialogService.f97852c.b();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MentionedCardItem) it.next()).getType().getType());
                    }
                    PageReportService.i(pageReportService, "united.player-video-detail.video-mention-float.0.show", MapsKt.mapOf(TuplesKt.to("module_type", CollectionsKt.p(CollectionsKt.distinct(arrayList), ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62))), 4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoMentionedDialogService videoMentionedDialogService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = videoMentionedDialogService;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f97852c.f97848k);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowAsStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public VideoMentionedDialogService(@NotNull ComponentActivity componentActivity, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar, @NotNull d dVar, @NotNull PageReportService pageReportService, @NotNull PageAdRepository pageAdRepository) {
        this.f97850a = componentActivity;
        this.f97851b = coroutineScope;
        this.f97852c = bVar;
        this.f97853d = dVar;
        this.f97854e = pageReportService;
        this.f97855f = pageAdRepository;
        VideoMentionedDialogService$componentDelegate$1 videoMentionedDialogService$componentDelegate$1 = new VideoMentionedDialogService$componentDelegate$1(this);
        bVar.getClass();
        Iterator it = ((List) bVar.f97846i.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC5802a) it.next()).c(videoMentionedDialogService$componentDelegate$1);
        }
        BuildersKt.launch$default(this.f97851b, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    public final void a(List<MentionedCardItem<UIComponent.ViewEntry>> list, boolean z6) {
        Map linkedHashMap;
        com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar = this.f97852c;
        ?? arrayList = list;
        if (list == null) {
            List<MentionedCardItem<UIComponent.ViewEntry>> listC = bVar.c();
            arrayList = new ArrayList();
            for (Object obj : (ArrayList) listC) {
                if (((MentionedCardItem) obj).getDidHidden() != z6) {
                    arrayList.add(obj);
                }
            }
        }
        if (!((Collection) arrayList).isEmpty()) {
            if (arrayList.isEmpty()) {
                linkedHashMap = MapsKt.emptyMap();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (MentionedCardItem mentionedCardItem : (Iterable) arrayList) {
                    List list2 = (List) linkedHashMap2.get(mentionedCardItem.getType().getType());
                    if (list2 == null) {
                        linkedHashMap2.put(mentionedCardItem.getType().getType(), CollectionsKt.mutableListOf(new String[]{String.valueOf(mentionedCardItem.getId())}));
                    } else {
                        list2.add(String.valueOf(mentionedCardItem.getId()));
                    }
                }
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), CollectionsKt.p((Iterable) entry.getValue(), ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
                }
            }
            Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("action_type", z6 ? "hidden" : "unhidden"), TuplesKt.to("card_content", new JSONObject(linkedHashMap).toString())});
            BLog.d("VideoMentionedDialogService", "reportHiddenStateChange: " + mapMapOf);
            PageReportService.g(this.f97854e, "united.player-video-detail.up-tool-video-mention-float.hidden.click", mapMapOf, 4);
            bVar.getClass();
            for (MentionedCardItem mentionedCardItem2 : (Iterable) arrayList) {
                mentionedCardItem2.setDidHidden(z6);
                Object obj2 = z6 ? MentionedCardState.HIDDEN.INSTANCE : MentionedCardState.IDLE.INSTANCE;
                MutableStateFlow<MentionedCardState> stateFlow = mentionedCardItem2.getStateFlow();
                if (stateFlow != null) {
                    stateFlow.tryEmit(obj2);
                }
            }
            BLog.d("VideoMentionedRepository", "updateCardsState: selectedCards=" + arrayList + ", hidden=" + z6);
        }
        bVar.a(false);
    }

    public final void b() {
        BuildersKt.launch$default(this.f97851b, (CoroutineContext) null, (CoroutineStart) null, new VideoMentionedDialogService$showDialog$1(this, null), 3, (Object) null);
        com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar = this.f97852c;
        bVar.a(false);
        y yVar = new y(FlowKt.asStateFlow(bVar.f97848k), FlowKt.asStateFlow(bVar.f97849l), e.a(this.f97853d));
        ComposeView composeView = new ComposeView(this.f97850a, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1159973172, true, new Vp0.c(yVar, 2)));
        q qVar = new q(this.f97850a, composeView, G.b.a, (String) null, 0.0f, false, false, 0, (a.b) null, (MutableStateFlow) null, 0, 16376);
        BuildersKt.launch$default(this.f97851b, (CoroutineContext) null, (CoroutineStart) null, new VideoMentionedDialogService$showDialog$2(qVar, null), 3, (Object) null);
        BuildersKt.launch$default(this.f97851b, (CoroutineContext) null, (CoroutineStart) null, new VideoMentionedDialogService$showDialog$3(yVar, this, qVar, null), 3, (Object) null);
    }

    public final void c(final List<MentionedCardItem<UIComponent.ViewEntry>> list, final boolean z6) {
        boolean zIsEmpty = (list == null ? this.f97852c.c() : list).isEmpty();
        ComponentActivity componentActivity = this.f97850a;
        if (zIsEmpty) {
            BLog.d("VideoMentionedDialogService", "hiddenStateChange: no selected cards to change hidden state.");
            p.k(z6 ? componentActivity.getString(2131857395) : componentActivity.getString(2131857396));
        } else if (z6) {
            new A(componentActivity, componentActivity.getString(2131857397), componentActivity.getString(2131857398), null, null, 0, 0, 0, new Function0(this, list, z6) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoMentionedDialogService f97861a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f97862b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f97863c;

                {
                    this.f97861a = this;
                    this.f97862b = list;
                    this.f97863c = z6;
                }

                public final Object invoke() {
                    this.f97861a.a(this.f97862b, this.f97863c);
                    return Unit.INSTANCE;
                }
            }, null, 3064).show();
        } else {
            a(list, z6);
        }
    }
}
