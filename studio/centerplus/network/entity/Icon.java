package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Icon.class */
@Keep
public class Icon {
    public CameraCooperate camera_coo;
    public CameraInput camera_input;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Icon$CameraCooperate.class */
    @Keep
    public static class CameraCooperate {
        public String name;
        public boolean state;
        public String url;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Icon$CameraInput.class */
    @Keep
    public static class CameraInput {
        public String name;
        public boolean state;
    }
}
