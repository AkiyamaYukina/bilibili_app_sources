package com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.bapis.bilibili.app.viewunite.common.MentionCard;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.app.screen.adjust.widget.q;
import com.bilibili.playerbizcommonv2.videomentioned.IVideoMentionedComponentsDelegate;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.playerbizcommonv2.videomentioned.VideoMentionAdParams;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService$componentDelegate$1.class */
public final class VideoMentionedDialogService$componentDelegate$1 implements IVideoMentionedComponentsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f97857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoMentionedDialogService f97858b;

    public VideoMentionedDialogService$componentDelegate$1(VideoMentionedDialogService videoMentionedDialogService) {
        this.f97858b = videoMentionedDialogService;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    @Override // com.bilibili.playerbizcommonv2.videomentioned.IVideoMentionedComponentsDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMentionCardClick(com.bapis.bilibili.app.viewunite.common.MentionCard r6) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService$componentDelegate$1.onMentionCardClick(com.bapis.bilibili.app.viewunite.common.MentionCard):void");
    }

    @Override // com.bilibili.playerbizcommonv2.videomentioned.IVideoMentionedComponentsDelegate
    public final void onMentionCardMoreClick(MentionCard mentionCard) {
        Object obj;
        final VideoMentionedDialogService videoMentionedDialogService = this.f97858b;
        Iterator<T> it = videoMentionedDialogService.f97852c.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (((MentionedCardItem) next).getId() == mentionCard.getBase().getId()) {
                obj = next;
                break;
            }
        }
        final MentionedCardItem mentionedCardItem = (MentionedCardItem) obj;
        if (mentionedCardItem == null) {
            return;
        }
        ComposeView composeView = new ComposeView(videoMentionedDialogService.f97850a, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1801525735, true, new Function2(mentionedCardItem, this, videoMentionedDialogService) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MentionedCardItem f97864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoMentionedDialogService$componentDelegate$1 f97865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final VideoMentionedDialogService f97866c;

            {
                this.f97864a = mentionedCardItem;
                this.f97865b = this;
                this.f97866c = videoMentionedDialogService;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        this.f97857a = new q(videoMentionedDialogService.f97850a, composeView, G.b.a, (String) null, 0.0f, false, false, 0, (a.b) null, (MutableStateFlow) null, 0, 16376);
        BuildersKt.launch$default(videoMentionedDialogService.f97851b, (CoroutineContext) null, (CoroutineStart) null, new VideoMentionedDialogService$componentDelegate$1$onMentionCardMoreClick$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.playerbizcommonv2.videomentioned.IVideoMentionedComponentsDelegate
    public final VideoMentionAdParams provideAdParams() {
        PageAdRepository pageAdRepository = this.f97858b.f97855f;
        String str = pageAdRepository.f98944g;
        String str2 = pageAdRepository.f98946j;
        if (str.length() == 0 && (str2 == null || str2.length() == 0)) {
            return null;
        }
        return new VideoMentionAdParams(str2, str);
    }

    @Override // com.bilibili.playerbizcommonv2.videomentioned.IVideoMentionedComponentsDelegate
    public final Map<String, String> provideCommonReportParams() {
        return this.f97858b.f97854e.a(null);
    }
}
