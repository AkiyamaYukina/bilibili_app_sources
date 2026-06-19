package com.bilibili.studio.editor.question.manager;

import android.app.Application;
import android.text.TextUtils;
import androidx.room.m;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.studio.editor.question.bean.InvestigationConfig;
import com.bilibili.studio.editor.question.bean.InvestigationEvent;
import com.bilibili.studio.editor.question.bean.QuestionConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static Map<String, QuestionConfig> f108211a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f108212b = m.a(null, 1, null, Dispatchers.getDefault());

    public static void a(InvestigationConfig investigationConfig) {
        Map<String, InvestigationEvent> events;
        if (investigationConfig == null || (events = investigationConfig.getEvents()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(events.size()));
        Iterator<T> it = events.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new QuestionConfig((InvestigationEvent) entry.getValue(), null, 2, null));
        }
        Map<String, QuestionConfig> mutableMap = MapsKt.toMutableMap(linkedHashMap);
        if (mutableMap != null) {
            f108211a = mutableMap;
        }
    }

    public static void b(@Nullable String str, @NotNull Function1 function1) {
        Long longOrNull;
        if (f108211a.isEmpty() || TextUtils.isEmpty(str) || !d(str)) {
            function1.invoke((Object) null);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = function1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Lazy lazy = zw0.b.f130950a;
        String str2 = (String) Contract.get$default(ConfigManager.Companion.config(), "uper.enable_plus_question_timeout", (Object) null, 2, (Object) null);
        BuildersKt.launch$default(f108212b, (CoroutineContext) null, (CoroutineStart) null, new QuestionApiManager$getQuestionParamFromNet$1((str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) ? 1000L : longOrNull.longValue(), str, jCurrentTimeMillis, objectRef, null), 3, (Object) null);
    }

    public static void c() {
        Object obj;
        if (zw0.b.q()) {
            Application application = BiliContext.application();
            if (application != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    String strOptString = BiliGlobalPreferenceHelper.getInstance(application).optString("upper_investigation_events_key", "");
                    if (strOptString != null && strOptString.length() != 0) {
                        a((InvestigationConfig) JSON.parseObject(strOptString, InvestigationConfig.class));
                    }
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Result.box-impl(obj);
            }
            BuildersKt.launch$default(f108212b, (CoroutineContext) null, (CoroutineStart) null, new QuestionApiManager$getDataFromNet$1(null), 3, (Object) null);
        }
    }

    public static boolean d(@NotNull String str) {
        if (f108211a.isEmpty()) {
            return false;
        }
        return f108211a.containsKey(str);
    }
}
