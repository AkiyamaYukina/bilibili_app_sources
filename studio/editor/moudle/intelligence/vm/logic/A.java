package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import android.text.TextUtils;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.editor.moudle.intelligence.vm.j;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.Collection;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/A.class */
public final class A extends C9270a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final xz0.a f107668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f107669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f107670f;

    public A(@Nullable EditVideoInfo editVideoInfo, @NotNull IntelligenceEnterResult intelligenceEnterResult) {
        super(editVideoInfo, intelligenceEnterResult);
        this.f107668d = new xz0.a();
    }

    public final void d(final String str, final List list, final j.c cVar) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Task.callInBackground(new com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.control.d(1, this, list)).continueWithTask(new Continuation(jCurrentTimeMillis, this, str, cVar, list) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f107876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final A f107877b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f107878c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final j.c f107879d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final List f107880e;

            {
                this.f107876a = jCurrentTimeMillis;
                this.f107877b = this;
                this.f107878c = str;
                this.f107879d = cVar;
                this.f107880e = list;
            }

            @Override // bolts.Continuation
            public final Object then(Task task) {
                List list2 = this.f107880e;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f107876a;
                Collection collection = (Collection) task.getResult();
                j.c cVar2 = this.f107879d;
                A a7 = this.f107877b;
                String str2 = this.f107878c;
                if (collection == null || collection.isEmpty()) {
                    C9270a.a(a7, str2, "image_recognition", jCurrentTimeMillis2, false, "image result is empty", null, null, 224);
                    cVar2.a(jCurrentTimeMillis2);
                    return null;
                }
                kz0.a.a((List) task.getResult(), list2);
                String str3 = (String) ((List) task.getResult()).get(0);
                if (TextUtils.isEmpty(str3)) {
                    C9270a.a(a7, str2, "image_recognition", jCurrentTimeMillis2, false, "image result str is empty", null, null, 224);
                    cVar2.a(jCurrentTimeMillis2);
                    return null;
                }
                C9270a.a(a7, str2, "image_recognition", jCurrentTimeMillis2, true, "", null, MapsKt.mapOf(TuplesKt.to("tag", str3)), 96);
                cVar2.b(jCurrentTimeMillis2, (String) StringsKt.R(str3, new String[]{":"}, 0, 6).get(0));
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }
}
