package com.bilibili.search2.utils;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.moduleservice.player.PlayerShareBundle;
import tv.danmaku.video.bilicardplayer.BiliCardPlayerManager;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/q.class */
public final class q {
    public static final Uri a(Fragment fragment, IInlineCardData iInlineCardData, String str, boolean z6, boolean z7) {
        Uri.Builder builderBuildUpon;
        Uri uri = ListExtentionsKt.toUri(str);
        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null) {
            return null;
        }
        if (z7) {
            builderBuildUpon.appendQueryParameter("is_inline_finish", "true");
        }
        if (iInlineCardData.getCardPlayProperty().getState().compareTo(CardPlayState.COMPLETE) > 0 || fragment == null) {
            return builderBuildUpon.build();
        }
        builderBuildUpon.appendQueryParameter(PlayerShareBundle.SHARE_PLAYER_ID, String.valueOf(BiliCardPlayerScene.prepareForShare$default(BiliCardPlayerManager.INSTANCE.with(fragment), false, 1, (Object) null)));
        builderBuildUpon.appendQueryParameter("fullscreen_mode", z6 ? "1" : "0");
        return builderBuildUpon.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri b(dt0.AbstractC6842e r9, dt0.AbstractC6841d r10, boolean r11, boolean r12, java.util.Map r13, boolean r14, java.lang.String r15, int r16) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.q.b(dt0.e, dt0.d, boolean, boolean, java.util.Map, boolean, java.lang.String, int):android.net.Uri");
    }
}
