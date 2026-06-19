package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/g0.class */
@StabilityInferred(parameters = 0)
public final class g0 extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75964k = "push_guidance_component";

    @NotNull
    public final String getComponentName() {
        return this.f75964k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        try {
            JSONObject object = JSON.parseObject(BLRemoteConfig.getInstance().getString("push_alert", (String) null));
            int intValue = object != null ? object.getIntValue("index_trgger_distance") : 0;
            Ref.IntRef intRef = new Ref.IntRef();
            if (intValue > 0) {
                recyclerView.addOnScrollListener(new f0(intRef, intValue, this));
            }
        } catch (Exception e7) {
        }
    }
}
