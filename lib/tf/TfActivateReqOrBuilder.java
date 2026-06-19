package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateReqOrBuilder.class */
public interface TfActivateReqOrBuilder extends MessageLiteOrBuilder {
    String getCaptcha();

    ByteString getCaptchaBytes();

    String getFakeId();

    ByteString getFakeIdBytes();

    boolean getIsAuto();

    String getPip();

    ByteString getPipBytes();

    TfProvider getProvider();

    int getProviderValue();

    TfTypeExt getTypeExt();

    int getTypeExtValue();

    String getUserMob();

    ByteString getUserMobBytes();
}
