package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.UpTool;
import com.bapis.bilibili.app.viewunite.common.UpVideoTool;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.tools.ToolsType;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/k.class */
public final /* synthetic */ class k implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploaderToolsService f97041a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Module module = mVar.f124400a;
        if (module.hasUpVideoTool()) {
            UpVideoTool upVideoTool = module.getUpVideoTool();
            String title = upVideoTool.getTitle();
            List<UpTool> toolsList = upVideoTool.getToolsList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(toolsList, 10));
            for (UpTool upTool : toolsList) {
                int i7 = com.bilibili.ship.theseus.ugc.intro.tools.h.f97225a[upTool.getType().ordinal()];
                arrayList.add(new com.bilibili.ship.theseus.ugc.intro.tools.b(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? ToolsType.Unknown : ToolsType.UPVideoMentions : ToolsType.UNIVERSAL : ToolsType.InteractiveSettings : ToolsType.CommandDanmaku, upTool.getText(), upTool.getIcon(), upTool.getUrl(), upTool.getBadge(), upTool.getReportMap()));
            }
            RunningUIComponent runningUIComponentA = this.f97041a.a(new com.bilibili.ship.theseus.ugc.intro.tools.g(title, arrayList));
            if (runningUIComponentA != null) {
                mVar.a(runningUIComponentA);
            }
        }
    }
}
