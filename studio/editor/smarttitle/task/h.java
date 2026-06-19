package com.bilibili.studio.editor.smarttitle.task;

import cA0.C5224b;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitlePromptType;
import com.bilibili.studio.editor.smarttitle.entity.net.SmartTitleEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/h.class */
public final class h extends BiliApiDataCallback<SmartTitleEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmartTitleTask f108263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f108264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SmartTitlePromptType f108265d;

    public h(SmartTitleTask smartTitleTask, long j7, SmartTitlePromptType smartTitlePromptType) {
        this.f108263b = smartTitleTask;
        this.f108264c = j7;
        this.f108265d = smartTitlePromptType;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(SmartTitleEntity smartTitleEntity) {
        ArrayList arrayList;
        SmartTitleEntity smartTitleEntity2 = smartTitleEntity;
        if (smartTitleEntity2 == null) {
            SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_STYLE_DATA;
            this.f108263b.a(smartTitleTaskError.getCode(), "", smartTitleTaskError.getMsg());
            this.f108263b.b();
            if (zw0.b.b()) {
                Xz0.d.c0("error", Long.valueOf(System.currentTimeMillis() - this.f108264c), smartTitleTaskError.getMsg(), null, this.f108263b.f108239b);
                return;
            }
            return;
        }
        List<SmartTitleEntity.SmartTitleStyleEntity> list = smartTitleEntity2.list;
        if (list != null && !list.isEmpty()) {
            SmartTitlePromptType smartTitlePromptType = this.f108265d;
            if (smartTitlePromptType == SmartTitlePromptType.PROMPT_DEFAULT) {
                C5224b.f58748a = smartTitleEntity2;
            } else if (smartTitlePromptType == SmartTitlePromptType.PROMPT_UNIVERSAL) {
                C5224b.f58749b = smartTitleEntity2;
            }
        }
        this.f108263b.g(smartTitleEntity2);
        if (zw0.b.b()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = this.f108264c;
            List<SmartTitleEntity.SmartTitleStyleEntity> list2 = smartTitleEntity2.list;
            if (list2 != null) {
                List<SmartTitleEntity.SmartTitleStyleEntity> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        arrayList2.add(((SmartTitleEntity.SmartTitleStyleEntity) it.next()).styleName);
                    }
                }
            } else {
                arrayList = null;
            }
            Xz0.d.c0("success", Long.valueOf(jCurrentTimeMillis - j7), null, arrayList, this.f108263b.f108239b);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_STYLE_NET;
        int code = smartTitleTaskError.getCode();
        String msg = smartTitleTaskError.getMsg();
        SmartTitleTask smartTitleTask = this.f108263b;
        smartTitleTask.a(code, "", msg);
        smartTitleTask.b();
        if (zw0.b.b()) {
            Xz0.d.c0("error", Long.valueOf(System.currentTimeMillis() - this.f108264c), smartTitleTaskError.getMsg(), null, smartTitleTask.f108239b);
        }
    }
}
