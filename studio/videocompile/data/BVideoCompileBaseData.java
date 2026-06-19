package com.bilibili.studio.videocompile.data;

import androidx.annotation.Keep;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.videocompile.data.d;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileBaseData.class */
@Keep
public class BVideoCompileBaseData {

    @NotNull
    private final String actionID;
    private final boolean isH265;
    private final boolean isHDR;

    @NotNull
    private final String policyName;

    @NotNull
    private final String scene;

    @NotNull
    private final String sdkType = "1";

    @NotNull
    private final String source;

    public BVideoCompileBaseData(@NotNull d.b bVar) {
        this.actionID = bVar.f108731a;
        this.scene = bVar.f108732b;
        this.source = bVar.f108733c;
        this.isH265 = bVar.f108734d;
        this.isHDR = bVar.f108735e;
        this.policyName = bVar.f108737g;
    }

    @NotNull
    public HashMap<String, String> createMapData() {
        HashMap<String, String> map = new HashMap<>();
        map.put("actionID", this.actionID);
        map.put("scene", this.scene);
        map.put(GameCardButton.extraParamSource, this.source);
        map.put("sdkType", this.sdkType);
        map.put("isH265", this.isH265 ? "1" : "0");
        map.put("isHDR", this.isHDR ? "1" : "0");
        map.put("policyName", this.policyName);
        map.put("buildconfig", "release");
        return map;
    }

    @NotNull
    public final String getActionID() {
        return this.actionID;
    }
}
