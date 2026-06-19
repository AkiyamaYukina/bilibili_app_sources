package com.bilibili.studio.editor.smarttitle.task;

import bA0.g;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import com.bilibili.studio.editor.smarttitle.entity.net.SmartTitleEntity;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.b0;
import com.bilibili.studio.videoeditor.util.V;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleStyleTask.class */
public final class SmartTitleStyleTask extends SmartTitleTask {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f108237l;

    public SmartTitleStyleTask(@NotNull String str, @NotNull SmartTitleType smartTitleType, @NotNull String str2, @NotNull Zz0.e eVar, @NotNull BiliTemplateEngineManager biliTemplateEngineManager) {
        super(str, smartTitleType, str2, eVar, biliTemplateEngineManager);
        this.f108237l = com.bilibili.app.dialogmanager2.c.a();
    }

    @Override // com.bilibili.studio.editor.smarttitle.task.SmartTitleTask
    public final void d() {
        this.f108245i.set(true);
        for (String str : this.f108237l) {
            BiliTemplateEngineManager biliTemplateEngineManager = this.f108242e;
            biliTemplateEngineManager.e(false, false, new b0(0, biliTemplateEngineManager, str));
        }
        this.f108237l.clear();
    }

    @Override // com.bilibili.studio.editor.smarttitle.task.SmartTitleTask
    public final void g(@NotNull SmartTitleEntity smartTitleEntity) {
        if (this.f108245i.get()) {
            BLog.e("SmartTitleStyleTask", "startAiTask fail isCanceled");
            return;
        }
        if (smartTitleEntity.list.isEmpty()) {
            SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_STYLE_DATA;
            a(smartTitleTaskError.getCode(), "", smartTitleTaskError.getMsg());
            b();
            return;
        }
        if (this.f108245i.get()) {
            BLog.e("SmartTitleTask", "callbackPromptResult fail,current is isCanceled");
        } else {
            g.a aVar = this.f108246j;
            if (aVar != null) {
                String str = this.f108238a;
                StringBuilder sbA = l0.a("智能标题任务 onPromptResult projectId=", str, ",smartTitleType=");
                SmartTitleType smartTitleType = aVar.f54466a;
                sbA.append(smartTitleType);
                sbA.append(",");
                sbA.append(smartTitleEntity);
                BLog.e("SmartTitleTaskLogic", sbA.toString());
                boolean zE = V.e(smartTitleEntity.list);
                bA0.g gVar = aVar.f54467b;
                if (!zE) {
                    SmartTitleType smartTitleType2 = SmartTitleType.STYLIZATION;
                    SmartTitleTask smartTitleTask = aVar.f54468c;
                    SmartTitleType smartTitleType3 = aVar.f54466a;
                    if (smartTitleType3 == smartTitleType2) {
                        gVar.f54462a.a(str, smartTitleTask.f108243f, smartTitleType3, smartTitleEntity.list);
                    } else {
                        gVar.f54462a.a(str, smartTitleTask.f108243f, aVar.f54466a, CollectionsKt.mutableListOf(new SmartTitleEntity.SmartTitleStyleEntity[]{smartTitleEntity.list.get(0)}));
                    }
                }
                gVar.f54463b.a(true, str, smartTitleType);
            }
        }
        BuildersKt.launch$default(this.f108244g, Dispatchers.getIO(), (CoroutineStart) null, new SmartTitleStyleTask$startAiTask$1(smartTitleEntity, this, new Ref.BooleanRef(), null), 2, (Object) null);
    }
}
