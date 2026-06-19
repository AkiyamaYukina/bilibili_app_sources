package com.bilibili.studio.editor.smarttitle.task;

import ZA0.a;
import android.text.TextUtils;
import bA0.C4936c;
import bA0.g;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.app.producers.ability.y;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitlePromptType;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult;
import com.bilibili.studio.editor.smarttitle.entity.net.SmartTitleEntity;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.b0;
import com.bilibili.studio.videoeditor.template.r;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTask.class */
public class SmartTitleTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f108238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SmartTitleType f108239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f108240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Zz0.e f108241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliTemplateEngineManager f108242e;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public g.a f108246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f108247k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f108243f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a.C0157a f108244g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public volatile AtomicBoolean f108245i = new AtomicBoolean(false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTask$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108248a;

        static {
            int[] iArr = new int[SmartTitleType.values().length];
            try {
                iArr[SmartTitleType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SmartTitleType.UNIVERSAL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SmartTitleType.STYLIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f108248a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [ZA0.a$a, java.lang.Object] */
    public SmartTitleTask(@NotNull String str, @NotNull SmartTitleType smartTitleType, @NotNull String str2, @NotNull Zz0.e eVar, @NotNull BiliTemplateEngineManager biliTemplateEngineManager) {
        this.f108238a = str;
        this.f108239b = smartTitleType;
        this.f108240c = str2;
        this.f108241d = eVar;
        this.f108242e = biliTemplateEngineManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [aA0.a, java.lang.Object] */
    public final void a(int i7, @NotNull String str, @NotNull String str2) {
        if (this.f108245i.get()) {
            return;
        }
        ?? obj = new Object();
        obj.f31088a = str;
        obj.f31089b = i7;
        obj.f31090c = str2;
        g.a aVar = this.f108246j;
        if (aVar != null) {
            String str3 = this.f108238a;
            BLog.e("SmartTitleTaskLogic", "智能标题任务 onTaskFail projectId=" + str3 + ",smartTitleType=" + aVar.f54466a + ",errorResult=" + ((Object) obj));
            C4936c c4936c = aVar.f54467b.f54462a;
            SmartTitleType smartTitleType = aVar.f54466a;
            String str4 = obj.f31088a;
            synchronized (c4936c) {
                Zz0.b bVar = c4936c.f54459a.get(str3);
                Zz0.b bVar2 = bVar;
                if (bVar == null) {
                    bVar2 = new Zz0.b();
                }
                bVar2.a(smartTitleType, str4);
                c4936c.f54459a.put(str3, bVar2);
            }
            C4936c c4936c2 = aVar.f54467b.f54462a;
            SmartTitleType smartTitleType2 = aVar.f54466a;
            synchronized (c4936c2) {
                Zz0.b bVar3 = c4936c2.f54459a.get(str3);
                Zz0.b bVar4 = bVar3;
                if (bVar3 == null) {
                    bVar4 = new Zz0.b();
                }
                synchronized (bVar4) {
                    try {
                        if (bVar4.f29850b.get(smartTitleType2) == null) {
                            bVar4.f29853e.put(smartTitleType2, Boolean.TRUE);
                        }
                    } finally {
                    }
                }
                c4936c2.f54459a.put(str3, bVar4);
            }
            aVar.f54467b.f54463b.a(false, str3, aVar.f54466a);
            aVar.f54467b.f54463b.b(false, str3, aVar.f54466a, obj.f31088a);
        }
    }

    public final void b() {
        g.a aVar = this.f108246j;
        if (aVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = this.f108247k;
            StringBuilder sb = new StringBuilder("智能标题任务 onTaskFinish projectId=");
            String str = this.f108238a;
            sb.append(str);
            sb.append(",smartTitleType=");
            sb.append(aVar.f54466a);
            sb.append(",costTime=");
            sb.append(jCurrentTimeMillis - j7);
            BLog.e("SmartTitleTaskLogic", sb.toString());
            aVar.f54467b.f54462a.f(aVar.f54468c, str);
        }
    }

    public final void c(@NotNull String str, boolean z6, @NotNull SmartTitleAITaskResult smartTitleAITaskResult) {
        ArrayList<SmartTitleTask> arrayList;
        ArrayList arrayList2;
        if (this.f108245i.get()) {
            BLog.e("SmartTitleTask", "该任务已经取消掉了～不再返回结果[onTaskSuccess]");
            return;
        }
        smartTitleAITaskResult.aiTaskCreateTime = this.f108243f;
        g.a aVar = this.f108246j;
        if (aVar != null) {
            String str2 = this.f108238a;
            BLog.e("SmartTitleTaskLogic", "智能标题任务 onTaskSuccess projectId=" + str2 + ",smartTitleType=" + aVar.f54466a + ",style=" + str + ",result=" + smartTitleAITaskResult);
            C4936c c4936c = aVar.f54467b.f54462a;
            SmartTitleType smartTitleType = aVar.f54466a;
            synchronized (c4936c) {
                Zz0.b bVar = c4936c.f54459a.get(str2);
                Zz0.b bVar2 = bVar;
                if (bVar == null) {
                    bVar2 = new Zz0.b();
                }
                bVar2.b(smartTitleType, str, smartTitleAITaskResult);
                c4936c.f54459a.put(str2, bVar2);
            }
            if (z6) {
                bA0.g gVar = aVar.f54467b;
                SmartTitleType smartTitleType2 = aVar.f54466a;
                long j7 = aVar.f54468c.f108243f;
                C4936c c4936c2 = gVar.f54462a;
                synchronized (c4936c2) {
                    Zz0.b bVar3 = c4936c2.f54459a.get(str2);
                    if (bVar3 != null) {
                        synchronized (bVar3) {
                            arrayList2 = new ArrayList(bVar3.f29851c);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            arrayList = arrayList3;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            SmartTitleTask smartTitleTask = (SmartTitleTask) next;
                            if (smartTitleTask.f108243f < j7 && smartTitleTask.f108239b == smartTitleType2) {
                                arrayList3.add(next);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                if (arrayList != null) {
                    for (SmartTitleTask smartTitleTask2 : arrayList) {
                        smartTitleTask2.d();
                        gVar.f54462a.f(smartTitleTask2, str2);
                    }
                }
            }
            aVar.f54467b.f54463b.b(true, str2, aVar.f54466a, str);
        }
    }

    public void d() {
        this.f108245i.set(true);
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        BiliTemplateEngineManager biliTemplateEngineManager = this.f108242e;
        biliTemplateEngineManager.e(false, false, new b0(0, biliTemplateEngineManager, this.h));
    }

    @NotNull
    public final JSONObject e(@NotNull String str, @NotNull String str2) {
        JSONObject jSONObjectA = y.a("scene", "ai_title_pink");
        Zz0.e eVar = this.f108241d;
        jSONObjectA.put("round", Integer.valueOf(eVar.f29864a));
        pl.h.a(eVar.f29865b, jSONObjectA, "current_round", "prompt", str);
        jSONObjectA.put("style_name", str2);
        jSONObjectA.put("resource", eVar.f29866c);
        jSONObjectA.put("prompt_type", Integer.valueOf(f().getValue()));
        jSONObjectA.put("task_id", this.f108239b == SmartTitleType.DEFAULT ? "" : this.f108240c);
        return jSONObjectA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final SmartTitlePromptType f() throws NoWhenBranchMatchedException {
        SmartTitlePromptType smartTitlePromptType;
        int i7 = a.f108248a[this.f108239b.ordinal()];
        if (i7 == 1) {
            smartTitlePromptType = SmartTitlePromptType.PROMPT_DEFAULT;
        } else if (i7 == 2) {
            smartTitlePromptType = SmartTitlePromptType.PROMPT_UNIVERSAL;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            smartTitlePromptType = SmartTitlePromptType.PROMPT_STYLE;
        }
        return smartTitlePromptType;
    }

    public void g(@NotNull SmartTitleEntity smartTitleEntity) {
        if (this.f108245i.get()) {
            BLog.e("SmartTitleTask", "startAiTask 该任务被取消了哟～");
            return;
        }
        if (smartTitleEntity.list.isEmpty()) {
            SmartTitleTaskError smartTitleTaskError = SmartTitleTaskError.ERROR_STYLE_DATA;
            a(smartTitleTaskError.getCode(), "", smartTitleTaskError.getMsg());
            b();
            return;
        }
        SmartTitleEntity.SmartTitleStyleEntity smartTitleStyleEntity = smartTitleEntity.list.get(0);
        String str = smartTitleStyleEntity.prompt;
        final String str2 = smartTitleStyleEntity.styleName;
        if (TextUtils.isEmpty(str)) {
            SmartTitleTaskError smartTitleTaskError2 = SmartTitleTaskError.ERROR_STYLE_DATA;
            a(smartTitleTaskError2.getCode(), str2, smartTitleTaskError2.getMsg());
            b();
            return;
        }
        if (this.f108245i.get()) {
            BLog.e("SmartTitleTask", "callbackPromptResult fail,current is isCanceled");
        } else {
            g.a aVar = this.f108246j;
            if (aVar != null) {
                String str3 = this.f108238a;
                StringBuilder sbA = l0.a("智能标题任务 onPromptResult projectId=", str3, ",smartTitleType=");
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
                        gVar.f54462a.a(str3, smartTitleTask.f108243f, smartTitleType3, smartTitleEntity.list);
                    } else {
                        gVar.f54462a.a(str3, smartTitleTask.f108243f, aVar.f54466a, CollectionsKt.mutableListOf(new SmartTitleEntity.SmartTitleStyleEntity[]{smartTitleEntity.list.get(0)}));
                    }
                }
                gVar.f54463b.a(true, str3, smartTitleType);
            }
        }
        if (zw0.b.b()) {
            Xz0.d.a0("start", null, null, null, this.f108239b);
        }
        JSONObject jSONObjectE = e(str, str2);
        BiliTemplateEngineManager biliTemplateEngineManager = this.f108242e;
        biliTemplateEngineManager.e(false, false, new r(new Function4(this, str2) { // from class: com.bilibili.studio.editor.smarttitle.task.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SmartTitleTask f108261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108262b;

            {
                this.f108261a = this;
                this.f108262b = str2;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj3).intValue();
                String str4 = (String) obj4;
                SmartTitleTask smartTitleTask2 = this.f108261a;
                BuildersKt.launch$default(smartTitleTask2.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleTask$startAiTask$4$1(smartTitleTask2, this.f108262b, iIntValue, str4, null), 2, (Object) null);
                if (zw0.b.b()) {
                    Xz0.d.a0("error", Long.valueOf(System.currentTimeMillis() - smartTitleTask2.f108247k), str4, smartTitleTask2.h, null);
                }
                return Unit.INSTANCE;
            }
        }, biliTemplateEngineManager, JSON.toJSONString(jSONObjectE), new AT0.d(this, 4), new Function2(this, str2) { // from class: com.bilibili.studio.editor.smarttitle.task.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SmartTitleTask f108257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108258b;

            {
                this.f108257a = this;
                this.f108258b = str2;
            }

            public final Object invoke(Object obj, Object obj2) {
                SmartTitleTask smartTitleTask2 = this.f108257a;
                BuildersKt.launch$default(smartTitleTask2.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleTask$startAiTask$2$1(smartTitleTask2, this.f108258b, (String) obj2, null), 2, (Object) null);
                return Unit.INSTANCE;
            }
        }, new Function4(this, str2) { // from class: com.bilibili.studio.editor.smarttitle.task.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SmartTitleTask f108259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108260b;

            {
                this.f108259a = this;
                this.f108260b = str2;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                SmartTitleTask smartTitleTask2 = this.f108259a;
                BuildersKt.launch$default(smartTitleTask2.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleTask$startAiTask$3$1((SmartTitleAITaskResult) obj4, smartTitleTask2, this.f108260b, null), 2, (Object) null);
                return Unit.INSTANCE;
            }
        }));
    }
}
