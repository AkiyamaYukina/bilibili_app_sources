package com.bilibili.ship.theseus.ugc.playercontainer;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService;
import com.bilibili.ship.theseus.ugc.play.UGCSupplementService;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.coroutines.Continuation;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/x.class */
public final class x implements com.bilibili.ship.theseus.united.page.background.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCDirectorSerialOperationsService f98362a;

    public x(UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService) {
        this.f98362a = uGCDirectorSerialOperationsService;
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final long a(PlayViewUniteReply playViewUniteReply) {
        return com.bilibili.ship.theseus.ugc.k.a(playViewUniteReply);
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final Object b(Continuation<? super GeminiCommonPlayableParams> continuation) {
        UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService = this.f98362a;
        GeminiCommonPlayableParams geminiCommonPlayableParamsA = null;
        if (uGCDirectorSerialOperationsService.f98272b.d()) {
            PageBackgroundPlayRepository pageBackgroundPlayRepository = uGCDirectorSerialOperationsService.f98272b;
            boolean zA = pageBackgroundPlayRepository.a();
            PageReportService pageReportService = uGCDirectorSerialOperationsService.f98280k;
            wv0.a aVar = uGCDirectorSerialOperationsService.f98279j;
            if (zA) {
                UGCBackgroundPlayService uGCBackgroundPlayService = uGCDirectorSerialOperationsService.f98273c;
                uGCBackgroundPlayService.getClass();
                boolean z6 = false;
                if (IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) == 4) {
                    z6 = true;
                }
                int iB = uGCBackgroundPlayService.b(z6);
                com.bilibili.ship.theseus.united.page.background.a aVarB = iB >= 0 ? uGCBackgroundPlayService.f96303b.b(iB, true, z6) : null;
                if (aVarB == null) {
                    return null;
                }
                geminiCommonPlayableParamsA = UGCSupplementService.a.a(aVarB.f99036a, aVarB.f99037b, 0, "", "", 99, pageBackgroundPlayRepository.g(), new VideoDimension(16, 9), null, null, aVar.f129026b, null, uGCDirectorSerialOperationsService.f98281l, pageReportService.f102492e, false, null);
            } else {
                com.bilibili.ship.theseus.ugc.play.schedule.e eVarA = uGCDirectorSerialOperationsService.f98277g.a();
                geminiCommonPlayableParamsA = null;
                if (eVarA != null) {
                    Av0.a aVar2 = eVarA.f98180a;
                    geminiCommonPlayableParamsA = aVar2 == null ? null : UGCSupplementService.a.a(aVar2.f590a, aVar2.f591b, 0, aVar2.f593d, aVar2.f599k, 99, pageBackgroundPlayRepository.g(), aVar2.f596g, null, null, aVar.f129026b, null, uGCDirectorSerialOperationsService.f98281l, pageReportService.f102492e, false, null);
                }
            }
        }
        return geminiCommonPlayableParamsA;
    }
}
