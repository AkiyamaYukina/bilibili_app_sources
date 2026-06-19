package com.bilibili.ship.theseus.ugc.weblayer;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog;
import com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/q.class */
public final class q implements NoteEditTimeInfoDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteFloatLayerService f98699a;

    public q(NoteFloatLayerService noteFloatLayerService) {
        this.f98699a = noteFloatLayerService;
    }

    @Override // com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog.a
    public final void a(String str, String str2) {
        NoteFloatLayerService noteFloatLayerService = this.f98699a;
        NoteFloatLayerService.a aVar = noteFloatLayerService.f98618x;
        if (aVar != null) {
            Oq0.c cVar = noteFloatLayerService.f98619y;
            if (str == null || str.length() == 0 || cVar == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String str3 = cVar.f18016g;
            String str4 = str3;
            if (str3.length() == 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("millisecond", Integer.valueOf(cVar.f18010a));
                jSONObject2.put("cid", Long.valueOf(cVar.f18011b));
                jSONObject2.put("pageCount", Integer.valueOf(cVar.f18012c));
                jSONObject2.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, Integer.valueOf(cVar.f18013d));
                jSONObject2.put("title", cVar.f18014e);
                jSONObject2.put("pageTitle", cVar.f18015f);
                jSONObject2.put("desc", str2);
                jSONObject.put(TextSource.CFG_CONTENT, jSONObject2);
                str4 = "";
            }
            pl.h.a(0, jSONObject, "code", "message", str4);
            aVar.callbackToJs(new Object[]{str, jSONObject});
        }
    }
}
