package com.bilibili.ship.theseus.united.page.preload;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ArcType;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.app.gemini.base.resolver.GeminiCommonResolver;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.lib.media.resource.MediaResource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/preload/c.class */
public final class c implements Function2<IResolveParams, Boolean, MediaResource> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<PlayViewUniteReply> f102468a;

    public c(Ref.ObjectRef<PlayViewUniteReply> objectRef) {
        this.f102468a = objectRef;
    }

    public final Object invoke(Object obj, Object obj2) {
        MediaResource mediaResourceC;
        GeminiCommonResolverParams geminiCommonResolverParams = (IResolveParams) obj;
        ((Boolean) obj2).getClass();
        Ref.ObjectRef<PlayViewUniteReply> objectRef = this.f102468a;
        GeminiCommonResolverParams geminiCommonResolverParams2 = geminiCommonResolverParams instanceof GeminiCommonResolverParams ? geminiCommonResolverParams : null;
        if (geminiCommonResolverParams2 == null) {
            mediaResourceC = null;
        } else {
            try {
                GeminiCommonResolver.Companion.getClass();
                PlayViewUniteReply playViewUniteReplyI = GeminiCommonResolver.a.i(geminiCommonResolverParams2, (Fragment) null, false);
                objectRef.element = playViewUniteReplyI;
                mediaResourceC = GeminiCommonResolver.a.c(playViewUniteReplyI, geminiCommonResolverParams2.getFrom(), false);
                mediaResourceC.setExtraInfo(GeminiCommonResolver.a.h((PlayViewUniteReply) objectRef.element));
                if (((PlayViewUniteReply) objectRef.element).hasPlayArc() && ((PlayViewUniteReply) objectRef.element).getPlayArc().getIsPreview()) {
                    BLog.i("PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke", "[theseus-united-PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke] charged/preview archive, not support preload");
                    mediaResourceC = null;
                } else if (((PlayViewUniteReply) objectRef.element).hasFragmentVideo() && ((PlayViewUniteReply) objectRef.element).getFragmentVideo().getVideosCount() > 0) {
                    BLog.i("PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke", "[theseus-united-PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke] fragments archive, not support preload");
                    mediaResourceC = null;
                } else if (((PlayViewUniteReply) objectRef.element).hasPlayArc() && ((PlayViewUniteReply) objectRef.element).getPlayArc().getArcType() == ArcType.ARC_TYPE_INTERACT) {
                    BLog.i("PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke", "[theseus-united-PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke] interact archive, not support preload");
                    mediaResourceC = null;
                }
            } catch (Exception e7) {
                e.a("[theseus-united-PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke] ", e7.getMessage(), "PreloadRepository$tryPreloadNextVideo$paramsMediaResourceCreator$1-invoke", (Throwable) null);
                mediaResourceC = null;
            }
        }
        return mediaResourceC;
    }
}
