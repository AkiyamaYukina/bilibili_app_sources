package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService;
import com.bilibili.ship.theseus.cheese.player.playselect.c;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6985d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/d.class */
public final class C6119d implements com.bilibili.ship.theseus.united.page.background.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseDirectorSerialOperationsService f90397a;

    public C6119d(CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService) {
        this.f90397a = cheeseDirectorSerialOperationsService;
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final long a(PlayViewUniteReply playViewUniteReply) {
        return com.bilibili.ship.theseus.cheese.player.playposition.b.a(playViewUniteReply);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final Object b(Continuation<? super GeminiCommonPlayableParams> continuation) throws NoWhenBranchMatchedException {
        C6985d c6985dA;
        GeminiCommonPlayableParams geminiCommonPlayableParamsA;
        CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService = this.f90397a;
        if (!cheeseDirectorSerialOperationsService.h.d() || (c6985dA = cheeseDirectorSerialOperationsService.f90349c.a()) == null) {
            return null;
        }
        com.bilibili.ship.theseus.cheese.player.playselect.c cVarD = cheeseDirectorSerialOperationsService.f90352f.d(new c.a(c6985dA), false);
        if (cVarD == null) {
            return null;
        }
        boolean z6 = cVarD instanceof c.a;
        PageReportService pageReportService = cheeseDirectorSerialOperationsService.f90357l;
        wv0.a aVar = cheeseDirectorSerialOperationsService.f90356k;
        PageBackgroundPlayRepository pageBackgroundPlayRepository = cheeseDirectorSerialOperationsService.h;
        if (z6) {
            C6985d c6985d = ((c.a) cVarD).f90747a;
            if (!c6985d.f117517m) {
                return null;
            }
            geminiCommonPlayableParamsA = CheeseSupplementService.a.a(c6985d.f117510e, c6985d.f117511f, (int) c6985d.f117508c, c6985d.f117512g, c6985d.f117524t, 99, pageBackgroundPlayRepository.g(), null, null, cheeseDirectorSerialOperationsService.f90355j, cheeseDirectorSerialOperationsService.f90354i, c6985d.f117521q, c6985d.f117523s, aVar.f129026b, pageReportService.f102492e, false, null);
        } else {
            if (!(cVarD instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Av0.a aVar2 = ((c.b) cVarD).f90748a;
            geminiCommonPlayableParamsA = CheeseSupplementService.a.a(aVar2.f590a, aVar2.f591b, aVar2.f592c, aVar2.f593d, aVar2.f599k, 99, pageBackgroundPlayRepository.g(), null, null, cheeseDirectorSerialOperationsService.f90355j, cheeseDirectorSerialOperationsService.f90354i, 0L, aVar2.f596g, aVar.f129026b, pageReportService.f102492e, false, null);
        }
        return geminiCommonPlayableParamsA;
    }
}
