package com.bilibili.ship.theseus.ugc.playercontainer;

import com.bilibili.app.gemini.player.widget.comment.GeminiPlayerLandscapeCommentWidget;
import com.bilibili.app.gemini.player.widget.like.GeminiPlayerLikeWidget;
import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import com.bilibili.app.gemini.player.widget.share.GeminiPlayerShareIconWidget;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerBgmWidget;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerChargeWidget;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerDislikeWidget;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerFavoriteWidget;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/m.class */
public final /* synthetic */ class m implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List listC = aVar.c();
        if (listC != null) {
            ((ArrayList) listC).add(0, GeminiPlayerOnlineWidget.class);
        }
        List listE = aVar.e();
        if (listE != null) {
            ((ArrayList) listE).add(0, GeminiPlayerBgmWidget.class);
        }
        List listG = aVar.g();
        if (listG != null) {
            ((ArrayList) listG).add(0, GeminiPlayerOnlineWidget.class);
        }
        List list = aVar.i;
        if (list != null) {
            list.add(list.indexOf(GeminiPlayerLikeWidget.class) + 1, GeminiPlayerDislikeWidget.class);
            int iIndexOf = list.indexOf(GeminiPlayerDislikeWidget.class);
            list.add(iIndexOf, GeminiPlayerFavoriteWidget.class);
            list.add(iIndexOf, GeminiPlayerLandscapeCommentWidget.class);
            list.add(list.indexOf(GeminiPlayerShareIconWidget.class), GeminiPlayerChargeWidget.class);
        }
    }
}
