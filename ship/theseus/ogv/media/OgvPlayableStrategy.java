package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.ToastType;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayableStrategy.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayableStrategy implements com.bilibili.ship.theseus.united.player.mediaplay.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvEpStartToastService f93991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.f f93992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f93993c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayableStrategy$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f93994a;

        static {
            int[] iArr = new int[ToastType.values().length];
            try {
                iArr[ToastType.VIP_AI_FIX_DEFINITION_REMIND.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ToastType.VIP_DEFINITION_GUIDE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f93994a = iArr;
        }
    }

    @Inject
    public OgvPlayableStrategy(@NotNull OgvEpStartToastService ogvEpStartToastService, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f93991a = ogvEpStartToastService;
        this.f93992b = fVar;
        this.f93993c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c0  */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.Nullable ev0.i r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.Deferred<com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply> r10, @org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.WithVideoProgress r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.media.OgvPlayableStrategy.a(ev0.i, kotlinx.coroutines.Deferred, com.bilibili.player.tangram.basic.WithVideoProgress, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04c6  */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.media.resource.ExtraInfo b(@org.jetbrains.annotations.NotNull com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r13) {
        /*
            Method dump skipped, instruction units count: 2243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.media.OgvPlayableStrategy.b(com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply):com.bilibili.lib.media.resource.ExtraInfo");
    }
}
