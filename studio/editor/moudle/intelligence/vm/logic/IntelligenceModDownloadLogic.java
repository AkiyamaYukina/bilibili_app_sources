package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import SB0.b;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.studio.editor.moudle.intelligence.media.BiliIntelligenceMediaBasic;
import com.bilibili.studio.videoeditor.common.mod.Mod;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/IntelligenceModDownloadLogic.class */
public final class IntelligenceModDownloadLogic {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Mod f107711b = SB0.a.f22772k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f107712a = LazyKt.lazy(new H9.a(11));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/IntelligenceModDownloadLogic$a.class */
    public interface a {
        void a(long j7, @NotNull String str);

        void b(long j7, @NotNull String str, @NotNull String str2);
    }

    public static void e(long j7, String str, String str2, String str3, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zz0.b bVar = zz0.b.a;
        String str4 = z6 ? "success" : "error";
        Long lA = bVar.a(str2, str4, str);
        if (lA != null) {
            long jLongValue = lA.longValue();
            Xz0.d.f28458a.getClass();
            Xz0.d.h(str, str2, jLongValue, str4, str3, 0, null, null);
        }
    }

    public final Mod a() {
        return (Mod) this.f107712a.getValue();
    }

    @NotNull
    public final com.bilibili.studio.comm.manager.j b() {
        Mod modA = a();
        b.a aVar = SB0.b.f22776a;
        String strE = aVar.f22778b.e(SB0.a.h);
        String str = strE;
        if (strE == null) {
            str = "";
        }
        String strE2 = aVar.f22778b.e(modA);
        return new com.bilibili.studio.comm.manager.j(str, strE2 != null ? strE2 : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull Yv0.e r14, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.c(java.lang.String, Yv0.e, com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic$a):void");
    }

    public final void d(@NotNull Yv0.e eVar, @NotNull BiliIntelligenceMediaBasic.b bVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty("")) {
            zz0.b.a.b("", "smart_video_mod_download", (String) null, (Map) null);
        }
        b.a aVar = SB0.b.f22776a;
        SB0.b bVar2 = aVar.f22778b;
        Mod mod = f107711b;
        if (!bVar2.c(mod)) {
            BuildersKt.launch$default(eVar, (CoroutineContext) null, (CoroutineStart) null, new IntelligenceModDownloadLogic$initSmartVideoConfig$1(this, jCurrentTimeMillis, "", bVar, null), 3, (Object) null);
        }
        String strE = aVar.f22778b.e(mod);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (TextUtils.isEmpty(strE)) {
            e(jCurrentTimeMillis2, "", "smart_video_mod_download", "mod dir is empty", false);
            bVar.a(jCurrentTimeMillis2, "智能成片-Mod路径为空");
            return;
        }
        e(jCurrentTimeMillis2, "", "smart_video_mod_download", "", true);
        String modVersion = ModResourceClient.getInstance().get(BiliContext.application(), mod.getPool(), mod.getName()).getModVersion();
        String str = modVersion;
        if (modVersion == null) {
            str = "";
        }
        bVar.b(jCurrentTimeMillis2, strE, str);
    }
}
