package com.bilibili.ship.theseus.ugc.intro.videomentioned.module;

import UR0.V;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.Mention;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.playerbizcommonv2.videomentioned.A;
import com.bilibili.playerbizcommonv2.videomentioned.InterfaceC5802a;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f97907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.videomentioned.b f97908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final VideoMentionedDialogService f97909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f97910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final yW0.b f97912g;

    @NotNull
    public final Lazy h = LazyKt.lazy(new V(this, 6));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final m f97913i = new m(this);

    @Inject
    public n(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar, @NotNull VideoMentionedDialogService videoMentionedDialogService, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull yW0.b bVar2) {
        this.f97906a = coroutineScope;
        this.f97907b = dVar;
        this.f97908c = bVar;
        this.f97909d = videoMentionedDialogService;
        this.f97910e = pageReportService;
        this.f97911f = introContentSizeRepository;
        this.f97912g = bVar2;
    }

    @NotNull
    public final <E extends UIComponent.ViewEntry> RunningUIComponent a(@NotNull A<E> a7, @NotNull List<Mention> list) {
        Object next;
        MentionedCardItem mentionedCardItemG;
        if (list.isEmpty()) {
            return new RunningUIComponent(new com.bilibili.app.gemini.ui.e(StateFlowKt.MutableStateFlow(Float.valueOf(0.0f))), 0, (Function1) null, 6);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Mention mention = (Mention) obj;
            Iterator it = ((List) this.h.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5802a) next).b(mention)) {
                    break;
                }
            }
            InterfaceC5802a interfaceC5802a = (InterfaceC5802a) next;
            if (interfaceC5802a == null) {
                mentionedCardItemG = null;
            } else {
                interfaceC5802a.a(com.bilibili.ship.theseus.united.page.view.e.a(this.f97907b));
                mentionedCardItemG = interfaceC5802a.g(mention);
            }
            if (mentionedCardItemG != null) {
                arrayList.add(mentionedCardItemG);
            }
            i7++;
        }
        a7.f81982d = arrayList;
        com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar = this.f97908c;
        bVar.f97847j = list;
        bVar.h = a7.f81983e;
        return new RunningUIComponent(new VideoMentionedModuleComponent(a7, this.f97913i, this.f97911f.f100020a), 0, (Function1) null, 6);
    }
}
