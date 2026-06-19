package com.bilibili.ship.theseus.sail.immatureplay;

import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.mediaplay.q;
import javax.inject.Inject;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f96199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f96200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f96201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final wv0.a f96203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f96204g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/f$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96205a;

        static {
            int[] iArr = new int[BizType.values().length];
            try {
                iArr[BizType.BIZ_TYPE_PGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BizType.BIZ_TYPE_UGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PUGV.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f96205a = iArr;
        }
    }

    @Inject
    public f(@NotNull PageAdRepository pageAdRepository, @NotNull C8043a c8043a, @NotNull q qVar, @NotNull C8043a c8043a2, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f96198a = pageAdRepository;
        this.f96199b = c8043a;
        this.f96200c = qVar;
        this.f96201d = c8043a2;
        this.f96202e = pageBackgroundPlayRepository;
        this.f96203f = aVar;
        this.f96204g = pageReportService;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0505  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams a(@org.jetbrains.annotations.NotNull com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r9, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.bean.d r10, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.bean.b r11, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.bean.g r12, @org.jetbrains.annotations.NotNull ev0.j.a r13) {
        /*
            Method dump skipped, instruction units count: 1713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.immatureplay.f.a(com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, com.bilibili.ship.theseus.united.bean.d, com.bilibili.ship.theseus.united.bean.b, com.bilibili.ship.theseus.united.bean.g, ev0.j$a):com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams");
    }
}
