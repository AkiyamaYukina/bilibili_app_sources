package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/m.class */
public final class m {
    @NotNull
    public static final RecyclerView a(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull List list) {
        RecyclerView.Adapter fVar = new com.bilibili.app.gemini.ui.f(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RunningUIComponent runningUIComponent = (RunningUIComponent) it.next();
            arrayList.add(new C5832a(runningUIComponent.a, BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new VideoSettingDialogKt$toSettingComponentListView$1$1(runningUIComponent, null), 3, (Object) null)));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C5832a) it2.next()).f83220a);
        }
        fVar.N(arrayList2);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setAdapter(fVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        return recyclerView;
    }
}
