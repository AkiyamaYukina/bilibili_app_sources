package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.service.PlaybackCaptureService;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6580q;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6581s;
import com.bilibili.studio.module.tuwen.common.PbMaterialType;
import com.bilibili.studio.module.tuwen.model.PbEngineType;
import com.bilibili.studio.module.tuwen.model.PbMaterialRequest;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import fD0.InterfaceC7041a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/s.class */
public final class C6581s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BiliTemplateEngineManager f107856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static final InterfaceC7041a f107857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f107858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f107859d;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.s$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/s$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Map<String, Long> f107860a = new LinkedHashMap();

        public static void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            long jCurrentTimeMillis = 0;
            if (Intrinsics.areEqual(str2, "start")) {
                f107860a.put(str, Long.valueOf(System.currentTimeMillis()));
            } else {
                Map<String, Long> map = f107860a;
                Long l7 = (Long) ((LinkedHashMap) map).get(str);
                if (l7 != null) {
                    jCurrentTimeMillis = System.currentTimeMillis() - l7.longValue();
                }
                map.remove(str);
            }
            LinkedHashMap linkedHashMapC = O4.c.c(PlaybackCaptureService.KEY_RESULT_CODE, str2, "error_code", str3);
            linkedHashMapC.put("error_message", str4);
            linkedHashMapC.put("cost_time", String.valueOf(jCurrentTimeMillis));
            Neurons.trackT(false, "creation.upper.ai-to-video.material-sdk.result", linkedHashMapC, 1, new Da0.x(8));
        }
    }

    static {
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(6);
        biliTemplateEngineManager.i(BiliContext.application());
        f107856a = biliTemplateEngineManager;
        InterfaceC7041a.f117734a.getClass();
        f107857b = InterfaceC7041a.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.bilibili.studio.editor.moudle.intelligence.vm.logic.q] */
    public static void a(@Nullable List list, @NotNull Function2 function2, @NotNull Function2 function22) {
        PbMaterialType pbMaterialType;
        String strA = C3751q.a(System.currentTimeMillis(), "materials-download_task-id: ");
        Map<String, Long> map = a.f107860a;
        a.a(strA, "start", "", "");
        if (list.isEmpty()) {
            BLog.d("MATERIAL_DOWNLOAD.IntelligenceDataSource", "children material list is empty.");
            a.a(strA, "fail", "1101", "children material list is empty.");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                BLog.d("MATERIAL_DOWNLOAD.IntelligenceDataSource", androidx.fragment.app.B.b(arrayList.size(), jCurrentTimeMillis, "download children materials [start]. size: ", ", downloadTaskId: "));
                final PbEngineType pbEngineType = PbEngineType.Montage;
                final ?? r02 = new Function2(strA, jCurrentTimeMillis, function2) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f107850a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f107851b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Function2 f107852c;

                    {
                        this.f107850a = jCurrentTimeMillis;
                        this.f107851b = strA;
                        this.f107852c = function2;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        vg.G.a(new StringBuilder("download children materials [success]. downloadTaskId: "), this.f107850a, "MATERIAL_DOWNLOAD.IntelligenceDataSource");
                        Map<String, Long> map2 = C6581s.a.f107860a;
                        C6581s.a.a(this.f107851b, "success", "", "");
                        this.f107852c.invoke((String) obj, (String) obj2);
                        return Unit.INSTANCE;
                    }
                };
                final r rVar = new r(strA, jCurrentTimeMillis, function22);
                final BiliTemplateEngineManager biliTemplateEngineManager = f107856a;
                biliTemplateEngineManager.getClass();
                biliTemplateEngineManager.e(false, true, new Function1(rVar, biliTemplateEngineManager, arrayList, pbEngineType, r02) { // from class: com.bilibili.studio.videoeditor.template.N

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.studio.editor.moudle.intelligence.vm.logic.r f109967a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliTemplateEngineManager f109968b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final List f109969c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final PbEngineType f109970d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final C6580q f109971e;

                    {
                        this.f109967a = rVar;
                        this.f109968b = biliTemplateEngineManager;
                        this.f109969c = arrayList;
                        this.f109970d = pbEngineType;
                        this.f109971e = r02;
                    }

                    public final Object invoke(Object obj) {
                        Unit unit;
                        List list2 = this.f109969c;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        com.bilibili.studio.editor.moudle.intelligence.vm.logic.r rVar2 = this.f109967a;
                        if (zBooleanValue) {
                            InterfaceC7041a interfaceC7041a = this.f109968b.f109914e;
                            if (interfaceC7041a != null) {
                                interfaceC7041a.o(list2, this.f109970d, this.f109971e, rVar2);
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            rVar2.invoke(CaptureSchema.OLD_INVALID_ID_STRING, "checkTribeInstalledState fail");
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    }
                });
                return;
            }
            C6583u c6583u = (C6583u) it.next();
            String str = c6583u.f107861a;
            String str2 = str;
            if (str.length() == 0) {
                str2 = c6583u.f107862b;
            }
            PbMaterialType[] pbMaterialTypeArrValues = PbMaterialType.values();
            int length = pbMaterialTypeArrValues.length;
            while (true) {
                if (i7 >= length) {
                    pbMaterialType = null;
                    break;
                }
                pbMaterialType = pbMaterialTypeArrValues[i7];
                if (pbMaterialType.getValue() == c6583u.f107863c) {
                    break;
                } else {
                    i7++;
                }
            }
            if (pbMaterialType == null) {
                pbMaterialType = PbMaterialType.None;
            }
            arrayList.add(new PbMaterialRequest(str2, c6583u.f107864d, null, pbMaterialType, 4, null));
        }
    }
}
