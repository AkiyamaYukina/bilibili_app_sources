package com.bilibili.upper.module.datacollect;

import G3.C1944q0;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.upper.db.table.DraftBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f113083a = LazyKt.lazy(new EK0.d(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113084b = LazyKt.lazy(new C1944q0(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f113085c = LazyKt.lazy(new BK0.a(9));

    public static final String a(d dVar, List list) throws JSONException {
        Lazy lazy;
        Object obj;
        Object obj2;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            lazy = dVar.f113085c;
            if (!zHasNext) {
                break;
            }
            DraftBean draftBean = (DraftBean) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("draftId", draftBean.draftId);
            jSONObject.put("uploadId", draftBean.uploadId);
            jSONObject.put(EditCustomizeSticker.TAG_MID, draftBean.mid);
            jSONObject.put("filePath", draftBean.filePath);
            jSONObject.put("resultFile", draftBean.resultFile);
            jSONObject.put("json", draftBean.json);
            jSONObject.put("time", draftBean.time);
            jSONObject.put("current", draftBean.current);
            jSONObject.put("videoJson", draftBean.videoJson);
            jSONObject.put("sortTitle", draftBean.sortTitle);
            try {
                Result.Companion companion = Result.Companion;
                File file = new File((String) lazy.getValue(), draftBean.draftId + FileUtils.SUFFIX_JSON);
                if (file.exists()) {
                    file.delete();
                }
                com.bilibili.commons.io.FileUtils.write(file, jSONObject.toString());
                obj2 = Result.constructor-impl(Boolean.valueOf(arrayList.add(file)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                M.b("generate file fail，e=", th2.getLocalizedMessage(), "UpperDraftCollect");
            }
        }
        File file2 = new File((String) lazy.getValue(), "drafts.zip");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            Result.Companion companion3 = Result.Companion;
            File[] fileArr = (File[]) arrayList.toArray(new File[0]);
            ZipUtils.zip(file2, (File[]) Arrays.copyOf(fileArr, fileArr.length));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            M.b("zip fail，e=", th4.getLocalizedMessage(), "UpperDraftCollect");
        }
        return file2.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List b(com.bilibili.upper.module.datacollect.d r6) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.datacollect.d.b(com.bilibili.upper.module.datacollect.d):java.util.List");
    }

    public static final void c(d dVar, List list) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPrefX sharedPrefX = (SharedPrefX) dVar.f113084b.getValue();
        String string = sharedPrefX != null ? sharedPrefX.getString("upper_upload_drafts", "") : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((DraftBean) obj).draftId != -2233) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((DraftBean) it.next()).draftId));
        }
        String strA = B0.a.a(string, ",", CollectionsKt.p(arrayList2, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        SharedPrefX sharedPrefX2 = (SharedPrefX) dVar.f113084b.getValue();
        if (sharedPrefX2 == null || (editorEdit = sharedPrefX2.edit()) == null || (editorPutString = editorEdit.putString("upper_upload_drafts", strA)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public static final void d(d dVar, List list, String str) {
        dVar.getClass();
        BLog.i("UpperDraftCollect", "upload draft result，uploadUri=" + str);
        HashMap map = new HashMap();
        map.put("draft_count", String.valueOf(list.size()));
        map.put("upload_uri", str);
        Neurons.trackT(false, "creation.upload.draft.track", map, 1, new AT0.c(8));
    }
}
