package com.bilibili.lib.stagger.internal;

import kntr.base.stagger.StaggerDownloadConfig;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC7988c;
import mf0.InterfaceC7991f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/b.class */
public final class b extends StaggerDownloadConfig {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC7991f.c f64499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC7991f.c cVar, String str, boolean z6, boolean z7, boolean z8, long j7) {
        super(str, z6, z7, z8, j7);
        this.f64499f = cVar;
    }

    public final StaggerDownloadConfig.BeforeDownloadAction a(d41.g gVar) {
        String str = gVar.c;
        String str2 = gVar.g;
        String str3 = gVar.j;
        InterfaceC7988c.b bVar = new InterfaceC7988c.b(str, str2, str3);
        InterfaceC7991f.c cVar = this.f64499f;
        if (((Boolean) cVar.f123736g.invoke(bVar)).booleanValue()) {
            return StaggerDownloadConfig.BeforeDownloadAction.SKIP;
        }
        com.bilibili.gripper.mod.i iVar = cVar.h;
        if (iVar != null) {
            return iVar.a(str3) ? StaggerDownloadConfig.BeforeDownloadAction.MARK_COMPLETED : StaggerDownloadConfig.BeforeDownloadAction.SKIP;
        }
        return StaggerDownloadConfig.BeforeDownloadAction.DEFAULT;
    }

    public final String b(d41.g gVar) {
        String str = gVar.g;
        String str2 = gVar.j;
        String str3 = gVar.c;
        String str4 = (String) this.f64499f.f123735f.invoke(new InterfaceC7988c.b(str3, str, str2));
        if (Intrinsics.areEqual(str4, str3)) {
            str4 = null;
        }
        return str4;
    }
}
