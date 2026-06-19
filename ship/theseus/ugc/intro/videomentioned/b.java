package com.bilibili.ship.theseus.ugc.intro.videomentioned;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.Mention;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.biligame.ui.minigame.more.n;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardState;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedSectionItem;
import com.bilibili.playerbizcommonv2.videomentioned.f;
import com.bilibili.playerbizcommonv2.videomentioned.g;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f97840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f97842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f97843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f97844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final yW0.b f97845g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<Mention> f97847j;

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f97846i = LazyKt.lazy(new n(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<g> f97848k = StateFlowKt.MutableStateFlow(g.b.f82015a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<f> f97849l = StateFlowKt.MutableStateFlow(f.b.f82013a);

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull d dVar, @NotNull C8043a c8043a, @NotNull PageAdRepository pageAdRepository, @NotNull yW0.b bVar) {
        this.f97839a = coroutineScope;
        this.f97840b = context;
        this.f97841c = aVar;
        this.f97842d = dVar;
        this.f97843e = c8043a;
        this.f97844f = pageAdRepository;
        this.f97845g = bVar;
    }

    public final void a(boolean z6) {
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            MentionedCardItem mentionedCardItem = (MentionedCardItem) it.next();
            Object bVar = z6 ? new MentionedCardState.b(mentionedCardItem.getDidHidden()) : mentionedCardItem.getDidHidden() ? MentionedCardState.HIDDEN.INSTANCE : MentionedCardState.IDLE.INSTANCE;
            MutableStateFlow<MentionedCardState> stateFlow = mentionedCardItem.getStateFlow();
            if (stateFlow != null) {
                stateFlow.tryEmit(bVar);
            }
        }
        MutableStateFlow<f> mutableStateFlow = this.f97849l;
        if (z6) {
            mutableStateFlow.tryEmit(new f.a(false));
        } else {
            mutableStateFlow.tryEmit(f.b.f82013a);
        }
    }

    @NotNull
    public final List<MentionedCardItem<UIComponent.ViewEntry>> b() {
        List<MentionedCardItem<UIComponent.ViewEntry>> listEmptyList;
        g gVar = (g) this.f97848k.getValue();
        if (gVar instanceof g.d) {
            Iterable iterable = ((g.d) gVar).f82017a.f81985b;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                listEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                CollectionsKt.addAll(arrayList, ((MentionedSectionItem) it.next()).getCards());
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @NotNull
    public final List<MentionedCardItem<UIComponent.ViewEntry>> c() {
        List<MentionedCardItem<UIComponent.ViewEntry>> listB = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            MutableStateFlow<MentionedCardState> stateFlow = ((MentionedCardItem) obj).getStateFlow();
            if ((stateFlow != null ? (MentionedCardState) stateFlow.getValue() : null) instanceof MentionedCardState.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.b.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
