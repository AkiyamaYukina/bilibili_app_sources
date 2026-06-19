package com.bilibili.studio.editor.moudle.home.presenter;

import android.text.TextUtils;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.json.JSONException;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/g.class */
public final /* synthetic */ class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditVideoInfo f107241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f107242b;

    public /* synthetic */ g(j jVar, EditVideoInfo editVideoInfo) {
        this.f107241a = editVideoInfo;
        this.f107242b = jVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : (List) obj) {
            if (!TextUtils.isEmpty((String) obj4)) {
                arrayList.add(obj4);
            }
        }
        String strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
        M.b("【编辑器】startAiRecAndPartitionNew 存储commonUrl,zipUrlsStr=", strP, "SmartTitle");
        EditVideoInfo editVideoInfo = this.f107241a;
        editVideoInfo.setSmartTitleUrls(strP);
        editVideoInfo.setSmartTitleRound(iIntValue, iIntValue2);
        j jVar = this.f107242b;
        jVar.a(editVideoInfo);
        k.a(jVar.f107251c, editVideoInfo.getUploadId(), strP, iIntValue, iIntValue2);
        return Unit.INSTANCE;
    }
}
