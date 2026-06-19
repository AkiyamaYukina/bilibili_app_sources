package com.bilibili.upper.module.datacollect;

import G3.C1945r0;
import G3.C1947s0;
import G3.C1949t0;
import androidx.compose.runtime.internal.StabilityInferred;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.upper.module.datacollect.bean.MaterialUploadConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f113086a = LazyKt.lazy(new C1945r0(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113087b = LazyKt.lazy(new C1947s0(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f113088c = LazyKt.lazy(new C1949t0(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f113089d = new AtomicBoolean(false);

    public static final String a(e eVar, MaterialUploadConfig materialUploadConfig) {
        String absolutePath;
        Object obj;
        eVar.getClass();
        List<String> list = materialUploadConfig.filePaths;
        if (list == null || list.isEmpty()) {
            absolutePath = null;
        } else {
            List<String> list2 = materialUploadConfig.filePaths;
            if (list2 == null || list2.size() != 1) {
                File file = new File((String) eVar.f113088c.getValue(), "material.zip");
                if (file.exists()) {
                    file.delete();
                }
                List<String> list3 = materialUploadConfig.filePaths;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (m.b((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                try {
                    Result.Companion companion = Result.Companion;
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    ZipUtils.zip(file, (String[]) Arrays.copyOf(strArr, strArr.length));
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    BLog.i("UpperMaterialCollect", "zip failed,e=" + th2);
                }
                absolutePath = file.getAbsolutePath();
            } else {
                absolutePath = materialUploadConfig.filePaths.get(0);
            }
        }
        return absolutePath;
    }

    public static final void b(e eVar, List list, String str, boolean z6, String str2) {
        eVar.getClass();
        BLog.i("UpperMaterialCollect", "upload material result,uploadUri=" + str);
        HashMap map = new HashMap();
        map.put("file_paths", CollectionsKt.p(list, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        map.put("upload_uri", str3);
        map.put(ThirdPartyExtraBuilder.KEY_RESULT, z6 ? "1" : "0");
        map.put("error_msg", str2);
        Neurons.trackT(false, "creation.upload.material.track", map, 1, new AT0.c(8));
    }
}
