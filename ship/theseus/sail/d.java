package com.bilibili.ship.theseus.sail;

import com.bapis.bilibili.dagw.component.avatar.common.BasicRenderSpec;
import com.bapis.bilibili.dagw.component.avatar.common.LayerGeneralSpec;
import com.bapis.bilibili.dagw.component.avatar.common.PositionSpec;
import com.bapis.bilibili.dagw.component.avatar.common.SizeSpec;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/d.class */
public final class d {
    public static final LayerGeneralSpec a() {
        return LayerGeneralSpec.newBuilder().setPosSpec(PositionSpec.newBuilder().setCoordinatePos(PositionSpec.CoordinatePos.CENTRAL_COORDINATE).setAxisX(0.9d).setAxisY(0.9d).build()).setSizeSpec(SizeSpec.newBuilder().setWidth(1.0d).setHeight(1.0d).build()).setRenderSpec(BasicRenderSpec.newBuilder().setOpacity(1.0d).build()).build();
    }
}
